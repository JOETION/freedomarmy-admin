package com.snow.freedomarmy.admin.app.service;

import com.snow.freedomarmy.admin.app.api.OrdersService;

import com.snow.freedomarmy.admin.app.core.model.Orders;
import com.snow.freedomarmy.admin.app.core.model.OrdersExample;
import com.snow.freedomarmy.admin.app.dao.mapper.OrdersMapper;
import com.snow.freedomarmy.admin.app.pojo.OrdersDto;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Wei-Peng
 * @Date: 2018/7/10 11:34
 * @Description:
 */
@Service("OrdersService")
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersMapper ordersMapper;

    @Override
    public String updateOrder(OrdersDto ordersDto) {
        Orders orders = new Orders();

        orders.setId(ordersDto.getId());
        orders.setUsername(ordersDto.getUsername());
        orders.setCommodityId(ordersDto.getCommodityId());
        orders.setCommodityNumber(ordersDto.getCommodityNumber());
        orders.setOrdersPrice(ordersDto.getOrdersPrice());
        orders.setIsPayment(ordersDto.getIsPayment());
        orders.setIsSendGoods(ordersDto.getIsSendGoods());
        orders.setIsCollectGoods(ordersDto.getIsCollectGoods());
        orders.setIsCollectMoney(ordersDto.getIsCollectMoney());
        orders.setIsReturnGoods(ordersDto.getIsReturnGoods());
        orders.setIsExchangeGoods(ordersDto.getIsExchangeGoods());
        orders.setIsRefund(ordersDto.getIsRefund());

        ordersMapper.updateByPrimaryKey(orders);

        return "success";

    }

    /**
     *
     * @param ordersId
     * @return
     */

    @Override
    public OrdersDto findOrderId(int ordersId) {

        Orders orders =ordersMapper.selectByPrimaryKey(ordersId);
        OrdersDto ordersDto =new OrdersDto();
        //
        ordersDto.setId(orders.getId());
        ordersDto.setUsername(orders.getUsername());
        ordersDto.setCommodityId(orders.getCommodityId());
        ordersDto.setCommodityNumber(orders.getCommodityNumber());
        ordersDto.setOrdersPrice(orders.getOrdersPrice());
        ordersDto.setIsPayment(orders.getIsPayment());
        ordersDto.setIsSendGoods(orders.getIsSendGoods());
        ordersDto.setIsCollectGoods(orders.getIsCollectGoods());
        ordersDto.setIsCollectMoney(orders.getIsCollectMoney());
        ordersDto.setIsReturnGoods(orders.getIsReturnGoods());
        ordersDto.setIsExchangeGoods(orders.getIsExchangeGoods());
        ordersDto.setIsRefund(orders.getIsRefund());
        return ordersDto;

    }


    @Override

    public List<OrdersDto> getOrdersAll() {
        OrdersExample ordersExample = new OrdersExample();
        ordersExample.createCriteria();
        List<Orders> orderss = ordersMapper.selectByExample(ordersExample);
        List<OrdersDto> list = new ArrayList<>();
        for (Orders orders1 : orderss) {
            OrdersDto ordersDto = new OrdersDto();
            ordersDto.setId(orders1.getId());
            ordersDto.setUsername(orders1.getUsername());
            ordersDto.setCommodityId(orders1.getCommodityId());
            ordersDto.setCommodityNumber(orders1.getCommodityNumber());
            ordersDto.setOrdersPrice(orders1.getOrdersPrice());
            ordersDto.setIsPayment(orders1.getIsPayment());
            ordersDto.setIsSendGoods(orders1.getIsSendGoods());
            ordersDto.setIsCollectGoods(orders1.getIsCollectGoods());
            ordersDto.setIsCollectMoney(orders1.getIsCollectMoney());
            ordersDto.setIsReturnGoods(orders1.getIsReturnGoods());
            ordersDto.setIsExchangeGoods(orders1.getIsExchangeGoods());
            ordersDto.setIsRefund(orders1.getIsRefund());
            list.add(ordersDto);


        }

        return list;
    }

    @Override
    public List<OrdersDto> getOrdersOther(String username) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        //判断字符串是否为空，如果为nul或者""则返回true，否则返回false
        if (!(StringUtils.isEmpty(username))) {
            criteria.andUsernameLike("%" + username + "%");

        }
        List<Orders> orderss = ordersMapper.selectByExample(ordersExample);
        List<OrdersDto> list = new ArrayList<>();
        for (Orders orders : orderss) {
            OrdersDto ordersDto = new OrdersDto();
            ordersDto.setId(orders.getId());
            ordersDto.setUsername(orders.getUsername());
            ordersDto.setCommodityId(orders.getCommodityId());
            ordersDto.setCommodityNumber(orders.getCommodityNumber());
            ordersDto.setOrdersPrice(orders.getOrdersPrice());
            ordersDto.setIsPayment(orders.getIsPayment());
            ordersDto.setIsSendGoods(orders.getIsSendGoods());
            ordersDto.setIsCollectGoods(orders.getIsCollectGoods());
            ordersDto.setIsCollectMoney(orders.getIsCollectMoney());
            ordersDto.setIsReturnGoods(orders.getIsReturnGoods());
            ordersDto.setIsExchangeGoods(orders.getIsExchangeGoods());
            ordersDto.setIsRefund(orders.getIsRefund());
            list.add(ordersDto);

        }

        return list;
    }

    /**
     *
     *
     * @param ordersid
     * @param isSendGood
     * @return
     * 发货
     */

    @Override
    public String updateIsSendGood(int ordersid, int isSendGood) {
        Orders orders=new Orders();
        orders.setIsSendGoods(isSendGood);
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.createCriteria().andIdEqualTo(ordersid);
        ordersMapper.updateByExampleSelective(orders,ordersExample);
        return "success";
    }
    /**
     * isReturnGoods;//退货
     * update
     */

    @Override
    public String updateisReturnGoods(int ordersid, int isReturnGoods) {
        Orders orders=new Orders();
        orders.setIsReturnGoods(isReturnGoods);
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.createCriteria().andIdEqualTo(ordersid);
        ordersMapper.updateByExampleSelective(orders,ordersExample);
        return "success";
    }
    /**
     * isExchangeGoods;//换货
     * update
     */

    @Override
    public String updateisExchangeGoods(int ordersid, int isExchangeGoods) {
        Orders orders=new Orders();
        orders.setIsExchangeGoods(isExchangeGoods);
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.createCriteria().andIdEqualTo(ordersid);
        ordersMapper.updateByExampleSelective(orders,ordersExample);
        return "success";
    }

   // 退款isRefund

    @Override
    public String updateisRefund(int ordersid, int isRefund) {
        Orders orders=new Orders();
        orders.setIsRefund(isRefund);
        OrdersExample ordersExample=new OrdersExample();
        ordersExample.createCriteria().andIdEqualTo(ordersid);
        ordersMapper.updateByExampleSelective(orders,ordersExample);
        return "success";
    }

}

