package com.snow.freedomarmy.admin.app.dao.mapper;

import com.snow.freedomarmy.admin.app.core.model.CommodityComment;
import com.snow.freedomarmy.admin.app.core.model.CommodityCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    int countByExample(CommodityCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    int deleteByExample(CommodityCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    int insert(CommodityComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    int insertSelective(CommodityComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    List<CommodityComment> selectByExample(CommodityCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    CommodityComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CommodityComment record, @Param("example") CommodityCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CommodityComment record, @Param("example") CommodityCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CommodityComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CommodityComment record);
}