package com.snow.freedomarmy.admin.app.api;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */

import com.snow.freedomarmy.admin.app.pojo.CommodityDto;

/**
 * 商品服务
 */
public interface CommodityService {


    /**
     * 添加商品
     *
     * @param commodityDto
     */
    public String addCommodity(CommodityDto commodityDto);


    /**
     * 通姑商品编号删除商品
     *
     * @param commodityId
     */
    public String deleteCommodityById(int commodityId);


    /**
     * 更新商品信息
     *
     * @param commodityDto
     */
    public String updateCommodity(CommodityDto commodityDto);

}
