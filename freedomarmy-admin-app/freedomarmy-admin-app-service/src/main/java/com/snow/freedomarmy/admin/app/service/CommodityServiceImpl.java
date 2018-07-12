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
import com.snow.freedomarmy.admin.app.exception.RemarkException;
import com.snow.freedomarmy.admin.app.pojo.CommodityDto;
import com.snow.freedomarmy.admin.app.pojo.OrdersDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 * 日志打的不完善
 */
@Service("commodityService")
@Transactional
public class CommodityServiceImpl implements CommodityService {


    @Autowired
    CommodityMapper commodityMapper;

    @Autowired
    CommodityExtendMapper commodityExtendMapper;

    @Autowired
    CommodityTypeService commodityTypeService;

    private static final Logger LOGGER = Logger.getLogger(CommodityService.class);

    @Override
    public List<CommodityDto> getCommodityByOrderIds(List<Integer> ids) {
        try {
            CommodityExample commodityExample = new CommodityExample();
            commodityExample.createCriteria().andIdIn(ids);
            List<Commodity> commodities = commodityMapper.selectByExample(commodityExample);
            List<CommodityDto> commodityDtoList = new ArrayList<>();
            for (Commodity commodity : commodities) {
                CommodityDto commodityDto = new CommodityDto.Builder()
                        .setCommodityId(commodity.getId())
                        .setCommodityName(commodity.getCommodityName())
                        .build();
                commodityDtoList.add(commodityDto);
            }
            return commodityDtoList;
        } catch (Exception e) {
            LOGGER.info(e);
            return null;
        }

    }

    @Override
    public int addCommodity(CommodityDto commodityDto) throws RemarkException {
        try {
            Commodity commodity = new Commodity();
            commodity.setBrowsingVolume(0);
            commodity.setCommodityName(commodityDto.getCommodityName());
            commodity.setCommodityPrice(commodityDto.getCommodityPrice());
            int commodityType = commodityDto.getCommodityType();
            commodity.setParent(commodityType);
            commodity.setGrandpa(commodityTypeService.getGrapaById(commodityType));
            commodity.setDeleted(commodityDto.getState());
            int id = commodityMapper.insertSelective(commodity);
            return id;
        } catch (Exception e) {
            LOGGER.info(e);
            throw new RemarkException(1001, "插入商品信息失败", e.getMessage());
        }

    }

    @Override
    public boolean deleteCommodityById(int id) throws RemarkException {
        try {
            int row = commodityMapper.deleteByPrimaryKey(id);
            if (row > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            LOGGER.info(e);
            throw new RemarkException(1003, "删除商品信息失败", e.getMessage());
        }

    }

    @Override
    public boolean removeCommodityById(int commodityId) throws RemarkException {
        try {
            Commodity commodity = new Commodity();
            commodity.setId(commodityId);
            commodity.setDeleted(1);
            int row = commodityMapper.updateByPrimaryKeySelective(commodity);
            if (row > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            LOGGER.info(e);
            throw new RemarkException(1002, "商品下架失败", e.getMessage());
        }

    }

    @Override
    public boolean recycleCommodityById(int commodityId) throws RemarkException {
        try {
            Commodity commodity = new Commodity();
            commodity.setId(commodityId);
            commodity.setDeleted(0);
            int row = commodityMapper.updateByPrimaryKeySelective(commodity);
            if (row > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            LOGGER.info(e);
            throw new RemarkException(1002, "商品上架失败", e.getMessage());
        }

    }

    @Override
    public boolean updateCommodity(CommodityDto commodityDto) throws RemarkException {
        try {
            Commodity commodity = new Commodity();
            commodity.setId(commodityDto.getCommodityId());
            commodity.setCommodityName(commodityDto.getCommodityName());
            commodity.setCommodityPrice(commodityDto.getCommodityPrice());
            int commodityType = commodityDto.getCommodityType();
            commodity.setParent(commodityType);
            commodity.setGrandpa(commodityTypeService.getGrapaById(commodityType));
            commodity.setDeleted(commodityDto.getState());
            CommodityExample commodityExample = new CommodityExample();
            commodityExample.createCriteria().andIdEqualTo(commodityDto.getCommodityId());
            int row = commodityMapper.updateByExampleSelective(commodity, commodityExample);
            if (row > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            LOGGER.info(e);
            throw new RemarkException(1002, "更新商品信息失败", e.getMessage());
        }

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
                    .setState(commodity.getDeleted())
                    .build();
            list.add(commodityDto);
        }
        return list;
    }

    @Override
    public int count() {
        try {
            CommodityExample commodityExample = new CommodityExample();
            commodityExample.createCriteria();
            return commodityMapper.countByExample(commodityExample);
        } catch (Exception e) {
            LOGGER.info(e);
            return -1;
        }
    }

    @Override
    public boolean updateCommodityType(int commodityId, int commodityTypeId, int grapaType) throws RemarkException {
        //查询数据库时失败记得抛出异常
        try {
            Commodity commodity = new Commodity();
            commodity.setId(commodityId);
            commodity.setParent(commodityTypeId);
            commodity.setGrandpa(grapaType);
            int row = commodityMapper.updateByPrimaryKeySelective(commodity);
            if (row > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            LOGGER.info(e);
            throw new RemarkException(1002, "更新商品类型失败", e.getMessage());
        }

    }

    @Override
    public List<CommodityDto> getAllCommodity() {
        try {
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
                        .setCommodityIntegral(commodity.getIntegral() == null ? 0 : commodity.getIntegral())
                        .setState(commodity.getDeleted())
                        .build();
                commodityDtos.add(commodityDto);
            }
            return commodityDtos;
        } catch (Exception e) {
            LOGGER.info(e);
            return null;
        }
    }

}
