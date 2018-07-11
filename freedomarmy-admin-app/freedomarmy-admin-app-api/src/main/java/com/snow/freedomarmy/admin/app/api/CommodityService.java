package com.snow.freedomarmy.admin.app.api;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */

import com.snow.freedomarmy.admin.app.pojo.CommodityDto;

import java.util.List;

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


    /**
     * 取得商品信息
     *
     * @return
     */
    public List<CommodityDto> getCommodity(int pageNum, int pageSize, String sortColumn, String sortDir, String searchValue);


    /**
     * 取得商品所有的数量
     */

    public int count();


    /**
     * 更新商品的类型
     */
    public String updateCommodityType(int commodityId,int commodityTypeId);

}
