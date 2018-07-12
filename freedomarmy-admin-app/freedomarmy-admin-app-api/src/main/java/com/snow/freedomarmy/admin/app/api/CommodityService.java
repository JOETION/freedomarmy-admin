package com.snow.freedomarmy.admin.app.api;

import com.snow.freedomarmy.admin.app.pojo.CommodityDto;
import com.snow.freedomarmy.admin.app.pojo.OrdersDto;

import java.util.List;

/**
 * @Auther: Wei-Peng
 * @Date: 2018/7/10 18:46
 * @Description:
 */
public interface CommodityService
{
    /**
     *
     * @param ordersDtos
     * @return
     * 通过Orders 获取id
     */
    List<CommodityDto> OrdersToCommodityLsit(List<OrdersDto> ordersDtos);
}
