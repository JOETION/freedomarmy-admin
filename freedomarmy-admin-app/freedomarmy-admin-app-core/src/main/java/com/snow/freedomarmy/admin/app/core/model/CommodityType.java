package com.snow.freedomarmy.admin.app.core.model;

public class CommodityType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_type.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_type.type_name
     *
     * @mbggenerated
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_type.parent
     *
     * @mbggenerated
     */
    private Integer parent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_type.id
     *
     * @return the value of commodity_type.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_type.id
     *
     * @param id the value for commodity_type.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_type.type_name
     *
     * @return the value of commodity_type.type_name
     *
     * @mbggenerated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_type.type_name
     *
     * @param typeName the value for commodity_type.type_name
     *
     * @mbggenerated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_type.parent
     *
     * @return the value of commodity_type.parent
     *
     * @mbggenerated
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_type.parent
     *
     * @param parent the value for commodity_type.parent
     *
     * @mbggenerated
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }
}