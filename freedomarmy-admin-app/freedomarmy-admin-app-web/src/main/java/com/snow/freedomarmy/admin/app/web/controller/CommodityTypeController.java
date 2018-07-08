package com.snow.freedomarmy.admin.app.web.controller;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/9          FXY        Created
 **********************************************
 */

import com.snow.freedomarmy.admin.app.api.CommodityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/freedomarmy/admin/commodityType")
public class CommodityTypeController {

    @Autowired
    CommodityTypeService commodityTypeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String addCommodityType(@RequestParam("name") String typeName, @RequestParam("type") int type) {
        return commodityTypeService.addCommodityType(typeName, type);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public String deleteCommodityById(@RequestParam("id") int commodityId) {
        return commodityTypeService.deleteCommodityTypeById(commodityId);
    }


    @RequestMapping(value = "/update", method = RequestMethod.GET)
    @ResponseBody
    public String updateCommodityType(@RequestParam("id") int commodityId, @RequestParam("name") String typeName, @RequestParam("type") int type) {
        return commodityTypeService.updateCommodityTypeById(commodityId, typeName, type);
    }
}
