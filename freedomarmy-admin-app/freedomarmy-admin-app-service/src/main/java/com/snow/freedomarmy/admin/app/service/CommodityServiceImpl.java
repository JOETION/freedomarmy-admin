package com.snow.freedomarmy.admin.app.service;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.api.CommodityService;
import com.snow.freedomarmy.admin.app.api.CommodityTypeService;
import com.snow.freedomarmy.admin.app.core.model.Commodity;
import com.snow.freedomarmy.admin.app.core.model.CommodityExample;
import com.snow.freedomarmy.admin.app.dao.mapper.CommodityMapper;
import com.snow.freedomarmy.admin.app.dao.mapper.extend.CommodityExtendMapper;
import com.snow.freedomarmy.admin.app.pojo.CommodityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("commodityService")
@Transactional
public class CommodityServiceImpl implements CommodityService {


    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    CommodityExtendMapper commodityExtendMapper;

    @Autowired
    CommodityTypeService commodityTypeService;

    @Override
    public int addCommodity(CommodityDto commodityDto) {
        Commodity commodity = new Commodity();
        commodity.setBrowsingVolume(0);
        commodity.setCommodityName(commodityDto.getCommodityName());
        commodity.setCommodityPrice(commodityDto.getCommodityPrice());
        int commodityType = commodityDto.getCommodityType();
        commodity.setParent(commodityType);
        commodity.setGrandpa(commodityTypeService.getGrapaById(commodityType));
        int id = commodityMapper.insertSelective(commodity);
        return id;
    }

    @Override
    public String deleteCommodityById(int id) {
        commodityMapper.deleteByPrimaryKey(id);
        return "success";
    }

    @Override
    public String updateCommodity(CommodityDto commodityDto) {

        Commodity commodity = new Commodity();
        commodity.setId(commodityDto.getCommodityId());
        commodity.setCommodityName(commodityDto.getCommodityName());
        commodity.setCommodityPrice(commodityDto.getCommodityPrice());
        int commodityType = commodityDto.getCommodityType();
        commodity.setParent(commodityType);
        commodity.setGrandpa(commodityTypeService.getGrapaById(commodityType));
        CommodityExample commodityExample = new CommodityExample();
        commodityExample.createCriteria().andIdEqualTo(commodityDto.getCommodityId());
        commodityMapper.updateByExampleSelective(commodity, commodityExample);
        return "success";

    }

    @Override
    public List<CommodityDto> getCommodity(int pageNum, int pageSize, String sortColumn, String sortDir, String searchValue) {
        List<CommodityDto> list = new ArrayList<>();
        List<Commodity> commodities = commodityExtendMapper.selectByLimit(pageNum, pageSize, sortColumn, sortDir, searchValue);
        for (Commodity commodity : commodities) {
            CommodityDto commodityDto = new CommodityDto.Builder()
                    .setCommodityId(commodity.getId())
                    .setCommodityName(commodity.getCommodityName())
                    .setCommodityPrice(commodity.getCommodityPrice())
                    .setCommodityType(commodity.getParent())
                    .build();
            list.add(commodityDto);
        }
        return list;
    }

    @Override
    public int count() {
        CommodityExample commodityExample = new CommodityExample();
        commodityExample.createCriteria();
        return commodityMapper.countByExample(commodityExample);
    }

    @Override
    public String updateCommodityType(int commodityId, int commodityTypeId, int grapaType) {
        //查询数据库时失败记得抛出异常
        Commodity commodity = new Commodity();
        commodity.setId(commodityId);
        commodity.setParent(commodityTypeId);
        commodity.setGrandpa(grapaType);
        commodityMapper.updateByPrimaryKeySelective(commodity);
        return "success";
    }

    @Override
    public List<CommodityDto> getAllCommodity() {
        CommodityExample commodityExample = new CommodityExample();
        commodityExample.setOrderByClause("id asc");
        commodityExample.createCriteria();
        List<Commodity> list = commodityMapper.selectByExample(commodityExample);
        List<CommodityDto> commodityDtos = new ArrayList<>();
        for (Commodity commodity : list) {
            CommodityDto commodityDto = new CommodityDto.Builder()
                    .setCommodityId(commodity.getId())
                    .setCommodityName(commodity.getCommodityName())
                    .setCommodityPrice(commodity.getCommodityPrice())
                    .setCommodityType(commodity.getParent())
                    .setCommodityStock(commodity.getStock())
                    .setCommodityImage(commodity.getCommodityName())
                    .setCommodityIntegral(commodity.getIntegral()==null ? 0 : commodity.getIntegral())
                    .build();
            commodityDtos.add(commodityDto);
        }
        return commodityDtos;
    }
}
