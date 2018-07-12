package com.snow.freedomarmy.admin.app.web.controller;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/9          FXY        Created
 **********************************************
 */

import com.google.common.base.Preconditions;
import com.snow.freedomarmy.admin.app.api.CommodityService;
import com.snow.freedomarmy.admin.app.api.CommodityTypeService;
import com.snow.freedomarmy.admin.app.dao.mapper.CommodityMapper;
import com.snow.freedomarmy.admin.app.exception.RemarkException;
import com.snow.freedomarmy.admin.app.pojo.CommodityDto;
import com.snow.freedomarmy.admin.app.pojo.CommodityPagingDto;
import com.snow.freedomarmy.admin.app.pojo.CommodityTypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/freedomarmy/admin/commodityType")
public class CommodityTypeController {

    private static int PAGE_SIZE = 10;

    @Autowired
    CommodityTypeService commodityTypeService;

    @Autowired
    CommodityService commodityService;


    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("commodity_type_add");
        modelAndView.addObject("type", commodityTypeService.getAllParentType());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String addCommodityType(@RequestParam("name") String typeName, @RequestParam("type") int type) {
        int isSuccess = -1;
        try {
            isSuccess = commodityTypeService.addCommodityType(typeName, type);
            if (isSuccess > 0) {
                return "success";
            } else {
                return "failed";
            }
        } catch (RemarkException e) {
            e.printStackTrace();
        }
        return "failed";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public String deleteCommodityById(@RequestParam("id") int commodityId) {
        boolean isSuccess = false;
        try {
            isSuccess = commodityTypeService.deleteCommodityTypeById(commodityId);
            if (isSuccess) {
                return "success";
            } else {
                return "failed";
            }
        } catch (RemarkException e) {
            e.printStackTrace();
        }
        return "failed";

    }


    @RequestMapping(value = "/match", method = RequestMethod.GET)
    public ModelAndView match() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("commodity_type_match");
        modelAndView.addObject("type", commodityTypeService.getAllType());
        return modelAndView;
    }


    @RequestMapping("/get")
    @ResponseBody
    public CommodityPagingDto get(@RequestParam("start") int pageNum, @RequestParam("length") int length, @RequestParam("order[0][column]") String sortColumn, @RequestParam("order[0][dir]") String sortDir, @RequestParam("search[value]") String searchValue, @RequestParam("draw") int draw) {
        //价格为string类型，没必要排序了
        if (sortColumn.equals("0")) {
            sortColumn = "id";
        } else if (sortColumn.equals("1")) {
            sortColumn = "commodity_name";
        }
        CommodityPagingDto commodityPagingDto = new CommodityPagingDto();
        commodityPagingDto.setDraw(draw + 1);
        commodityPagingDto.setRecordsTotal(commodityService.count());
        commodityPagingDto.setRecordsFiltered(commodityService.count());
        List<CommodityDto> commodity = commodityService.getCommodity(pageNum, length, sortColumn, sortDir, searchValue);
        List<CommodityPagingDto.CommodityBodyPagingDto> list = new ArrayList<>();
        for (CommodityDto commodityDto : commodity) {
            CommodityPagingDto.CommodityBodyPagingDto commodityPagingDto1 = new CommodityPagingDto.CommodityBodyPagingDto();
            commodityPagingDto1.setId(commodityDto.getCommodityId());
            commodityPagingDto1.setCommodityName(commodityDto.getCommodityName());
            commodityPagingDto1.setCommodityPrice(commodityDto.getCommodityPrice());
            commodityPagingDto1.setCommodityTypeName(commodityTypeService.getTypeById(commodityDto.getCommodityType()).getTypeName());
            list.add(commodityPagingDto1);
        }
        commodityPagingDto.setData(list);
        return commodityPagingDto;

    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    @ResponseBody
    public String updateCommodityType(@RequestParam("id") int commodityId, @RequestParam("name") String typeName, @RequestParam("type") int type) {
        boolean isSuccess = false;
        try {
            isSuccess = commodityTypeService.updateCommodityTypeById(commodityId, typeName, type);
            if (isSuccess) {
                return "success";
            } else {
                return "failed";
            }
        } catch (RemarkException e) {
            e.printStackTrace();
        }

        return "failed";
    }

}
