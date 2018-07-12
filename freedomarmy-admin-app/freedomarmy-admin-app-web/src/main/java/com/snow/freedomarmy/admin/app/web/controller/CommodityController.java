package com.snow.freedomarmy.admin.app.web.controller;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/9          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.api.CommodityService;
import com.snow.freedomarmy.admin.app.api.CommodityTypeService;
import com.snow.freedomarmy.admin.app.pojo.CommodityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

@Controller
@RequestMapping("/freedomarmy/admin/commodity")
public class CommodityController {

    private static final String FILE_TYPE_JPG = ".jpg";


    @Value("#{upload['path']}")
    private String savePath;

    @Autowired
    CommodityService commodityService;

    @Autowired
    CommodityTypeService commodityTypeService;

    @RequestMapping("/manage/show")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("commodity_list");
        modelAndView.addObject("commodity", commodityService.getAllCommodity());
        return modelAndView;
    }

    /**
     * 新增商品信息时，是原子操作，插入数据库成功时，附件也保存成功
     *
     * @param commodityDto 商品信息
     * @return 成功标志
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addCommodity(@RequestBody CommodityDto commodityDto) {
        int id = commodityService.addCommodity(commodityDto);
        return id + "";
    }

    @RequestMapping(value = "/add/show", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView addCommodityShow() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("commodity_add");
        modelAndView.addObject("type", commodityTypeService.getAllType());
        return modelAndView;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public String deleteCommodityById(@RequestParam("commodityId") int commodityId) {
        return commodityService.deleteCommodityById(commodityId);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String updateCommodity(@RequestBody CommodityDto commodityDto) {
        return commodityService.updateCommodity(commodityDto);
    }


    @RequestMapping(value = "/updateType", method = RequestMethod.GET)
    @ResponseBody
    public String updateCommodityType(@RequestParam("commodityId") int commodityId, @RequestParam("commodityTypeId") int commodityTypeId) {
        return commodityService.updateCommodityType(commodityId, commodityTypeId, commodityTypeService.getGrapaById(commodityTypeId));

    }

  /*  private boolean saveAttaches(int id, MultipartFile[] topPic, MultipartFile[] contentPic, MultipartFile[] video) {
        // 判断文件是否为空
        if (!topPic.isEmpty() && topPic.getOriginalFilename().toLowerCase().endsWith(FILE_TYPE_JPG)) {
            try {
                File upload = new File(savePath +);
                if (upload.exists()) {
                    upload.delete();
                } else {
                    upload.createNewFile();
                }
            } catch (Exception e) {
                System.out.println("保存文件失败!");
            }
        }
    }

*/

}
