package com.snow.freedomarmy.admin.app.api;


import com.snow.freedomarmy.admin.app.pojo.OrdersDto;

import java.util.List;

/**
 * @Auther: Wei-Peng
 * @Date: 2018/7/10 11:29
 * @Description:
 */
public interface OrdersService {
    /**
     * 更新订单的订单信息信息
     */

    String updateOrder(OrdersDto ordersDto);

    /**
     * 订单编号查询订单
     * Id
     *
     */
    OrdersDto findOrderId(int ordersId);



    //查找所有订单
    List<OrdersDto> getOrdersAll();

    //根据用户查询订--模糊查询
    List<OrdersDto> getCheckOrders(String username);

    /**
     * 是否发货
     * update
     */
    String  updateIsSendGood( int ordersid, int isSendGoods);

    /**
     * isReturnGoods;//退货
     * update
     */
    String  updateisReturnGoods( int ordersid, int isReturnGoods);
    /**
     * isExchangeGoods;//换货
     * update
     */
    String  updateisExchangeGoods( int ordersid, int isExchangeGoods);

    /**
     * 退款isRefund
     * update
     */
    String  updateisRefund( int ordersid, int isRefund);

}

