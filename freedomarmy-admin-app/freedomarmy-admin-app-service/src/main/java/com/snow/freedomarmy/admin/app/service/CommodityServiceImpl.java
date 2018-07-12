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
import com.snow.freedomarmy.admin.app.pojo.OrdersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {


    @Autowired
    CommodityMapper commodityMapper;


    @Override
    public List<CommodityDto> OrdersToCommodityLsit(List<OrdersDto> ordersDtos) {

        CommodityExample commodityExample=new CommodityExample();

        List<Integer> list=new ArrayList<>();
        for (OrdersDto ordersDto:ordersDtos){
            list.add(ordersDto.getCommodityId());
        }
        commodityExample.createCriteria().andIdIn(list);
        List<Commodity> commodities =commodityMapper.selectByExample(commodityExample);
        List<CommodityDto> commodityDtoList=new ArrayList<>();
        for(Commodity commodity:commodities){
            CommodityDto commodityDto =new CommodityDto();
            //-----------------------------------
            commodityDto.setId(commodity.getId());
            commodityDto.setCommodityName(commodity.getCommodityName());
            commodityDto.setCommodityPrice(commodity.getCommodityPrice());
            commodityDto.setBrowsingVolume(commodity.getBrowsingVolume());
            commodityDto.setParent(commodity.getParent());
            commodityDto.setGrandpa( commodity.getGrandpa());
            commodityDto.setStock(commodity.getStock());
            commodityDto.setIntegral(commodity.getIntegral());
            commodityDtoList.add(commodityDto);
        }

        return commodityDtoList;
    }
}
