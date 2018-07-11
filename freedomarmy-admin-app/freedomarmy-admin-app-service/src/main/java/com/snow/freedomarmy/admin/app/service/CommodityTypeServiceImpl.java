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
import com.snow.freedomarmy.admin.app.pojo.CommodityDto;
import com.snow.freedomarmy.admin.app.pojo.CommodityTypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<CommodityTypeDto> getAllType() {
        CommodityTypeExample commodityTypeExample = new CommodityTypeExample();
        commodityTypeExample.createCriteria();
        List<CommodityType> commodityTypes = commodityTypeMapper.selectByExample(commodityTypeExample);
        List<CommodityTypeDto> commodityTypeDtos = new ArrayList<>();
        for (CommodityType commodityType : commodityTypes) {
            CommodityTypeDto commodityTypeDto = new CommodityTypeDto();
            commodityTypeDto.setId(commodityType.getId());
            commodityTypeDto.setType(commodityType.getParent());
            commodityTypeDto.setTypeName(commodityType.getTypeName());
            commodityTypeDtos.add(commodityTypeDto);
        }
        return commodityTypeDtos;
    }

    /**
     * 可能有重复的，故不用list查询
     * @param id
     * @return
     */
    @Override
    public CommodityTypeDto getTypeById(int id) {
        CommodityType commodityType = commodityTypeMapper.selectByPrimaryKey(id);
        CommodityTypeDto commodityTypeDto = new CommodityTypeDto();
        commodityTypeDto.setId(commodityType.getId());
        commodityTypeDto.setType(commodityType.getParent());
        commodityTypeDto.setTypeName(commodityType.getTypeName());
        return commodityTypeDto;
    }

}
