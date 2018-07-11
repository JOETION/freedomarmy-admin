package com.snow.freedomarmy.admin.app.service;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.api.CommodityService;
import com.snow.freedomarmy.admin.app.core.model.Commodity;
import com.snow.freedomarmy.admin.app.core.model.CommodityExample;
import com.snow.freedomarmy.admin.app.dao.mapper.CommodityMapper;
import com.snow.freedomarmy.admin.app.pojo.CommodityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {


    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public String addCommodity(CommodityDto commodityDto) {
        Commodity commodity = new Commodity();
        commodity.setBrowsingVolume(0);
        commodity.setCommodityName(commodityDto.getCommodityName());
        commodity.setCommodityPrice(commodityDto.getCommodityPrice());
        commodity.setCommodityTypeParent(commodityDto.getCommodityType());
        commodityMapper.insertSelective(commodity);
        return "success";
    }

    @Override
    public String deleteCommodityById(int commodityId) {
        commodityMapper.deleteByPrimaryKey(commodityId);
        return "success";
    }

    @Override
    public String updateCommodity(CommodityDto commodityDto) {

        Commodity commodity = new Commodity();
        commodity.setId(commodityDto.getCommodityId());
        commodity.setCommodityName(commodityDto.getCommodityName());
        commodity.setCommodityPrice(commodityDto.getCommodityPrice());
        commodity.setCommodityTypeParent(commodityDto.getCommodityType());
        CommodityExample commodityExample = new CommodityExample();
        commodityExample.createCriteria().andIdEqualTo(commodityDto.getCommodityId());
        commodityMapper.updateByExampleSelective(commodity, commodityExample);
        return "success";

    }

    @Override
    public List<CommodityDto> getCommodity(int pageNum, int pageSize, String sortColumn, String sortDir, String searchValue) {
        List<CommodityDto> list = new ArrayList<>();
        List<Commodity> commodities = commodityMapper.selectByLimit(pageNum, pageSize, sortColumn, sortDir, searchValue);
        for (Commodity commodity : commodities) {
            CommodityDto commodityDto = new CommodityDto.Builder()
                    .setCommodityId(commodity.getId())
                    .setCommodityName(commodity.getCommodityName())
                    .setCommodityPrice(commodity.getCommodityPrice())
                    .setCommodityType(commodity.getCommodityTypeParent())
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
    public String updateCommodityType(int commodityId, int commodityTypeId) {
        //查询数据库时失败记得抛出异常
        Commodity commodity = new Commodity();
        commodity.setId(commodityId);
        commodity.setCommodityTypeParent(commodityTypeId);
        commodityMapper.updateByPrimaryKeySelective(commodity);
        return "success";
    }
}
