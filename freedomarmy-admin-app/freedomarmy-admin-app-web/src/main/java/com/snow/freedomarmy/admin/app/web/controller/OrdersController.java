package com.snow.freedomarmy.admin.app.web.controller;

import com.snow.freedomarmy.admin.app.api.CommodityService;
import com.snow.freedomarmy.admin.app.api.OrdersService;
import com.snow.freedomarmy.admin.app.pojo.CommodityDto;
import com.snow.freedomarmy.admin.app.pojo.OrdersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Wei-Peng
 * @Date: 2018/7/10 11:37
 * @Description: 控制类
 */
@Controller
@RequestMapping("/freedomarmy/admin/order")
public class OrdersController {
    //传输数据到JSP
    @Autowired
    OrdersService ordersService;
    @Autowired
    CommodityService commodityService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    //向前台传数据
    public ModelAndView getOrdersList() {
        //将数据放到request中
        ModelAndView modelAndView = new ModelAndView();
        List<OrdersDto> ordersList = ordersService.getOrdersAll();
        List<Integer> list = new ArrayList<>();
        for (OrdersDto ordersDto : ordersList) {
            list.add(ordersDto.getCommodityId());
        }
        List<CommodityDto> commodityDtoList = commodityService.getCommodityByOrderIds(list);

        modelAndView.addObject("ordersList", ordersList);
        modelAndView.addObject("commodityDtoList", commodityDtoList);
        modelAndView.setViewName("order_list");

        return modelAndView;
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public ModelAndView getOrdersCheck(@RequestParam(value = "username") String username) {
        ModelAndView modelAndView = new ModelAndView();
        List<OrdersDto> ordersList = ordersService.getCheckOrders(username);
        if (ordersList.isEmpty()) {
            modelAndView.addObject("error");
            modelAndView.setViewName("redirect:/freedomarmy/admin/order/list");
            return modelAndView;

        } else {
            List<Integer> list = new ArrayList<>();
            for (OrdersDto ordersDto : ordersList) {
                list.add(ordersDto.getCommodityId());
            }
            List<CommodityDto> commodityDtoList = commodityService.getCommodityByOrderIds(list);
            modelAndView.addObject("ordersList", ordersList);
            modelAndView.addObject("commodityDtoList", commodityDtoList);
            modelAndView.setViewName("order_list");
            return modelAndView;
        }
    }

    @RequestMapping(value = "/upadate", method = RequestMethod.GET)
    public ModelAndView getOrdersId(@RequestParam(value = "id") int ordersid) {
        ModelAndView modelAndView = new ModelAndView();
        int id = Integer.valueOf(ordersid).intValue();
        System.out.println("s输出" + id);
        OrdersDto ordersDto = ordersService.findOrderId(id);
        modelAndView.addObject("ordersDto", ordersDto);
        modelAndView.setViewName("order_update");
        return modelAndView;
    }


    /**
     * @param ordersid
     * @param issendgood
     * @return 更新
     */
    //换货
    @RequestMapping(value = "/upadataSendGood", method = RequestMethod.POST)
    public ModelAndView updateSendGood(@RequestParam("id") int ordersid, @RequestParam("sendGood") int issendgood) {
        ModelAndView modelAndView = new ModelAndView();
        int id = Integer.valueOf(ordersid).intValue();
        int issend = Integer.valueOf(issendgood).intValue();
        ordersService.updateIsSendGood(id, issend);
        modelAndView = getOrdersList();
        return modelAndView;

    }

    @RequestMapping(value = "/upadataExchangeGoods", method = RequestMethod.POST)
    public ModelAndView updateiExchangeGoods(@RequestParam("id") int ordersid, @RequestParam("isExchangeGoods") int isExchangeGoods) {
        ModelAndView modelAndView = new ModelAndView();
        int id = Integer.valueOf(ordersid).intValue();
        int isExchange = Integer.valueOf(isExchangeGoods).intValue();
        ordersService.updateisExchangeGoods(id, isExchange);
        modelAndView = getOrdersList();
        return modelAndView;
    }

    @RequestMapping(value = "/upadataisReturnGoods", method = RequestMethod.POST)
    public ModelAndView updateisReturnGoods(@RequestParam("id") int ordersid, @RequestParam("isReturnGoods") int isReturnGoods) {
        ModelAndView modelAndView = new ModelAndView();
        int id = Integer.valueOf(ordersid).intValue();
        int isReturn = Integer.valueOf(isReturnGoods).intValue();
        ordersService.updateisReturnGoods(id, isReturn);
        modelAndView = getOrdersList();
        return modelAndView;

    }

    @RequestMapping(value = "/upadataisRefund", method = RequestMethod.POST)
    public ModelAndView updateisRefund(@RequestParam("id") int ordersid, @RequestParam("isRefund") int isRefund) {
        ModelAndView modelAndView = new ModelAndView();
        int id = Integer.valueOf(ordersid).intValue();
        int isrefund = Integer.valueOf(isRefund).intValue();
        ordersService.updateisRefund(id, isrefund);
        modelAndView = getOrdersList();
        return modelAndView;

    }


}
