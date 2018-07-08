package com.snow.freedomarmy.admin.app.service;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.api.CommodityTypeService;
import com.snow.freedomarmy.admin.app.core.model.CommodityType;
import com.snow.freedomarmy.admin.app.core.model.CommodityTypeExample;
import com.snow.freedomarmy.admin.app.dao.mapper.CommodityTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("commodityTypeService")
public class CommodityTypeServiceImpl implements CommodityTypeService {

    @Autowired
    CommodityTypeMapper commodityTypeMapper;

    @Override
    public String addCommodityType(String typeName, int type) {

        CommodityType commodityType = new CommodityType();
        commodityType.setParent(type);
        commodityType.setTypeName(typeName);
        commodityTypeMapper.insertSelective(commodityType);
        return "success";
    }

    @Override
    public String deleteCommodityTypeById(int commodityId) {
        commodityTypeMapper.deleteByPrimaryKey(commodityId);
        return "success";
    }

    @Override
    public String updateCommodityTypeById(int commodityId, String typeName, int type) {
        CommodityType commodityType = new CommodityType();
        commodityType.setId(commodityId);
        commodityType.setParent(type);
        commodityType.setTypeName(typeName);
        CommodityTypeExample commodityExample = new CommodityTypeExample();
        commodityExample.createCriteria().andIdEqualTo(commodityId);
        commodityTypeMapper.updateByExampleSelective(commodityType, commodityExample);
        return "success";

    }
}
