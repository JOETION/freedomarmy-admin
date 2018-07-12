package com.snow.freedomarmy.admin.app.api;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.exception.RemarkException;
import com.snow.freedomarmy.admin.app.pojo.CommodityTypeDto;

import java.util.List;

/**
 * 商品类型服务
 */
public interface CommodityTypeService {

    /**
     *
     * @param typeName
     * @param type
     * @return 主键
     * @throws RemarkException
     */
    public int addCommodityType(String typeName, int type) throws RemarkException;

    /**
     * 通过商品类型编号删除商品类型
     *
     * @param id
     */
    public boolean deleteCommodityTypeById(int id) throws RemarkException;

    /**
     * 通过商品类型编号更新商品类型
     *
     * @param commodityId
     */
    public boolean updateCommodityTypeById(int commodityId, String typeName, int type) throws RemarkException;

    /**
     * 得到所有的商品类型信息
     *
     * @return
     */
    public List<CommodityTypeDto> getAllParentType();

    /**
     * 得到某些商品的类型信息
     */
    public CommodityTypeDto getTypeById(int id);

    /**
     * 得到所有类型
     */
    public List<CommodityTypeDto> getAllType();

    /**
     * 通过类型编号得到超类型编号
     */
    public int getGrapaById(int id);
}
