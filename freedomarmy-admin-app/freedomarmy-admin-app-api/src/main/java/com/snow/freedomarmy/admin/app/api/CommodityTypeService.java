package com.snow.freedomarmy.admin.app.api;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.pojo.CommodityTypeDto;

import java.util.List;

/**
 * 商品类型服务
 */
public interface CommodityTypeService {

    /**
     * 添加商品类型
     */
    public String addCommodityType(String typeName, int type);

    /**
     * 通过商品类型编号删除商品类型
     *
     * @param commodityId
     */
    public String deleteCommodityTypeById(int commodityId);

    /**
     * 通过商品类型编号更新商品类型
     *
     * @param commodityId
     */
    public String updateCommodityTypeById(int commodityId, String typeName, int type);

    /**
     * 得到所有的商品类型信息
     *
     * @return
     */
    public List<CommodityTypeDto> getAllType();

    /**
     * 得到某些商品的类型信息
     */
    public CommodityTypeDto getTypeById(int id);
}
