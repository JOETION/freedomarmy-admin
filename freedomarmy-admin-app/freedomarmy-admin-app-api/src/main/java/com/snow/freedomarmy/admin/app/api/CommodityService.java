package com.snow.freedomarmy.admin.app.api;

import com.snow.freedomarmy.admin.app.pojo.CommodityDto;
import com.snow.freedomarmy.admin.app.pojo.OrdersDto;

import java.util.List;

import java.util.List;

/**
 * @Auther: Wei-Peng
 * @Date: 2018/7/10 18:46
 * @Description:
 */
public interface CommodityService {

    /**
     * 添加商品
     *
     * @param commodityDto
     */
    public int addCommodity(CommodityDto commodityDto);

    /**
     * 通姑商品编号删除商品
     *
     * @param commodityId
     */
    public String deleteCommodityById(int commodityId);

    /**
     * @param ordersDtos
     * @return 通过Orders 获取id
     */
    List<CommodityDto> OrdersToCommodityLsit(List<OrdersDto> ordersDtos);

    /**
     * 更新商品信息
     *
     * @param commodityDto
     * @return
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
    public String updateCommodityType(int commodityId, int commodityTypeId, int grapaType);

    /**
     * 得到所有商品信息
     */
    public List<CommodityDto> getAllCommodity();

}
