package com.snow.freedomarmy.admin.app.dao.mapper.extend;

import com.snow.freedomarmy.admin.app.core.model.Commodity;
import com.snow.freedomarmy.admin.app.core.model.CommodityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommodityExtendMapper {
    /**
     * 根据查询返回查询
     *
     * @param offset
     * @param limit
     * @return
     */
    List<Commodity> selectByLimit(@Param("offset") int offset, @Param("limit") int limit, @Param("sortColumn") String sortColumn, @Param("sortDir") String sortDir, @Param("searchValue") String searchValue);
}