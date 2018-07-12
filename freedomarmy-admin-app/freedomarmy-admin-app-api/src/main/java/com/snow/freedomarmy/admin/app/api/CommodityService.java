package com.snow.freedomarmy.admin.app.api;

import com.snow.freedomarmy.admin.app.exception.RemarkException;
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
     * @param commodityDto
     * @return 主键
     * @throws RemarkException
     */
    public int addCommodity(CommodityDto commodityDto) throws RemarkException;

    /**
     * 通姑商品编号删除商品
     *
     * @param commodityId
     */
    public boolean deleteCommodityById(int commodityId) throws RemarkException;


    /**
     * 通过商品编号移除商品信息
     *
     * @param commodityId
     * @return
     */
    public boolean removeCommodityById(int commodityId) throws RemarkException;


    /**
     * 通过商品编号恢复商品
     *
     * @param commodityId
     * @return
     */
    public boolean recycleCommodityById(int commodityId) throws RemarkException;


    /**
     * 通过订单编号获取商品信息
     *
     * @param ids
     * @return
     */
    List<CommodityDto> getCommodityByOrderIds(List<Integer> ids);

    /**
     * 更新商品信息
     *
     * @param commodityDto
     * @return
     */
    public boolean updateCommodity(CommodityDto commodityDto) throws RemarkException;

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
    public boolean updateCommodityType(int commodityId, int commodityTypeId, int grapaType) throws RemarkException;

    /**
     * 得到所有商品信息
     */
    public List<CommodityDto> getAllCommodity();

}
