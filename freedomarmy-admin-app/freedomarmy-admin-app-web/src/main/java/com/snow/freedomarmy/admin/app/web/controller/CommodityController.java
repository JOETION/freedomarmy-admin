package com.snow.freedomarmy.admin.app.web.controller;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/9          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.api.CommodityService;
import com.snow.freedomarmy.admin.app.pojo.CommodityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/freedomarmy/admin/commodity")
public class CommodityController {


    @Autowired
    CommodityService commodityService;


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addCommodity(@RequestBody CommodityDto commodityDto) {
        return commodityService.addCommodity(commodityDto);
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

}
