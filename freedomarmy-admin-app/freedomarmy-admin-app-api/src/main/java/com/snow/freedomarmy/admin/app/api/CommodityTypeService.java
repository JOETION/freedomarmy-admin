package com.snow.freedomarmy.admin.app.api;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


/**
 * 商品类型服务
 */
public interface CommodityTypeService {

    /**
     * 添加商品类型
     */
    public String addCommodityType(String typeName,int type);

    /**
     * 通过商品类型编号删除商品类型
     * @param commodityId
     */
    public String deleteCommodityTypeById(int commodityId);

    /**
     * 通过商品类型编号更新商品类型
     * @param commodityId
     */
    public String updateCommodityTypeById(int commodityId,String typeName,int type);
}
