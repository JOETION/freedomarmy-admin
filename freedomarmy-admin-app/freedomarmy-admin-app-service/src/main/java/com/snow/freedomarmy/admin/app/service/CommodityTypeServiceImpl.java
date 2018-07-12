package com.snow.freedomarmy.admin.app.service;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import com.snow.freedomarmy.admin.app.api.CommodityService;
import com.snow.freedomarmy.admin.app.api.CommodityTypeService;
import com.snow.freedomarmy.admin.app.core.model.CommodityType;
import com.snow.freedomarmy.admin.app.core.model.CommodityTypeExample;
import com.snow.freedomarmy.admin.app.dao.mapper.CommodityTypeMapper;
import com.snow.freedomarmy.admin.app.exception.RemarkException;
import com.snow.freedomarmy.admin.app.pojo.CommodityDto;
import com.snow.freedomarmy.admin.app.pojo.CommodityTypeDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("commodityTypeService")
@Transactional
public class CommodityTypeServiceImpl implements CommodityTypeService {

    @Autowired
    CommodityTypeMapper commodityTypeMapper;

    private static final Logger LOGGER = Logger.getLogger(CommodityService.class);

    @Override
    public int addCommodityType(String typeName, int type) throws RemarkException {
        try {
            CommodityType commodityType = new CommodityType();
            commodityType.setParent(type);
            commodityType.setTypeName(typeName);
            int id = commodityTypeMapper.insertSelective(commodityType);
            return id;
        } catch (Exception e) {
            LOGGER.info(e);
            throw new RemarkException(1001, "插入商品类型信息失败", e.getMessage());
        }

    }

    @Override
    public boolean deleteCommodityTypeById(int commodityId) throws RemarkException {
        try {
            int row = commodityTypeMapper.deleteByPrimaryKey(commodityId);
            if (row > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            LOGGER.info(e);
            throw new RemarkException(1003, "删除商品类型信息失败，id=" + commodityId, e.getMessage());
        }

    }

    @Override
    public boolean updateCommodityTypeById(int commodityId, String typeName, int type) throws RemarkException {
        try {
            CommodityType commodityType = new CommodityType();
            commodityType.setId(commodityId);
            commodityType.setParent(type);
            commodityType.setTypeName(typeName);
            CommodityTypeExample commodityExample = new CommodityTypeExample();
            commodityExample.createCriteria().andIdEqualTo(commodityId);
            int row = commodityTypeMapper.updateByExampleSelective(commodityType, commodityExample);
            if (row > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            LOGGER.info(e);
            throw new RemarkException(1002, "更新商品类型信息失败，id=" + commodityId, e.getMessage());
        }


    }

    @Override
    public List<CommodityTypeDto> getAllParentType() {
        try {
            CommodityTypeExample commodityTypeExample = new CommodityTypeExample();
            commodityTypeExample.setOrderByClause("id asc");
            commodityTypeExample.createCriteria();
            List<CommodityType> commodityTypes = commodityTypeMapper.selectByExample(commodityTypeExample);
            List<CommodityTypeDto> commodityTypeDtos = new ArrayList<>();
            for (CommodityType commodityType : commodityTypes) {
                if (commodityType.getParent() == 0) {
                    CommodityTypeDto commodityTypeDto = new CommodityTypeDto();
                    commodityTypeDto.setId(commodityType.getId());
                    commodityTypeDto.setType(commodityType.getParent());
                    commodityTypeDto.setTypeName(commodityType.getTypeName());
                    commodityTypeDtos.add(commodityTypeDto);
                }
            }
            return commodityTypeDtos;
        } catch (Exception e) {
            LOGGER.info(e);
            return null;
        }

    }

    /**
     * 可能有重复的，故不用list查询
     *
     * @param id
     * @return
     */
    @Override
    public CommodityTypeDto getTypeById(int id) {
        try {
            CommodityType commodityType = commodityTypeMapper.selectByPrimaryKey(id);
            CommodityTypeDto commodityTypeDto = new CommodityTypeDto();
            commodityTypeDto.setId(commodityType.getId());
            commodityTypeDto.setType(commodityType.getParent());
            commodityTypeDto.setTypeName(commodityType.getTypeName());
            return commodityTypeDto;
        } catch (Exception e) {
            LOGGER.info(e);
            return null;
        }

    }

    @Override
    public List<CommodityTypeDto> getAllType() {
        try {
            CommodityTypeExample commodityTypeExample = new CommodityTypeExample();
            commodityTypeExample.setOrderByClause("id asc");
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
        } catch (Exception e) {
            LOGGER.info(e);
            return null;
        }

    }

    @Override
    public int getGrapaById(int id) {
        try {
            CommodityTypeExample commodityTypeExample = new CommodityTypeExample();
            commodityTypeExample.createCriteria().andIdEqualTo(id);
            List<CommodityType> commodityTypes = commodityTypeMapper.selectByExample(commodityTypeExample);
            if (commodityTypes != null && commodityTypes.size() >= 1) {
                return commodityTypes.get(0).getParent();
            }
            return -1;
        } catch (Exception e) {
            LOGGER.info(e);
            return -1;
        }

    }

}
