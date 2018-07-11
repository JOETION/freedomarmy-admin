package com.snow.freedomarmy.admin.app.pojo;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/8          FXY        Created
 **********************************************
 */


import java.io.Serializable;

/**
 * 商品实体类
 */
public class CommodityDto implements Serializable {

    private int commodityId;
    private String commodityName;
    private String commodityPrice;
    private int commodityType;
    private String commodityImage;


    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public void setCommodityPrice(String commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public void setCommodityType(int commodityType) {
        this.commodityType = commodityType;
    }

    public void setCommodityImage(String commodityImage) {
        this.commodityImage = commodityImage;
    }

    private CommodityDto(Builder builder) {
        this.commodityImage = builder.commodityImage;
        this.commodityName = builder.commodityName;
        this.commodityPrice = builder.commodityPrice;
        this.commodityType = builder.commodityType;
        this.commodityId = builder.commodityId;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }


    public String getCommodityPrice() {
        return commodityPrice;
    }


    public int getCommodityType() {
        return commodityType;
    }


    public String getCommodityImage() {
        return commodityImage;
    }

    //自动生成
    public static class Builder {

        private String commodityName;
        private String commodityPrice;
        private int commodityType;
        private String commodityImage;
        private int commodityId;

        public CommodityDto build() {
            return new CommodityDto(this);
        }

        public Builder setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }


        public Builder setCommodityPrice(String commodityPrice) {
            this.commodityPrice = commodityPrice;
            return this;
        }


        public Builder setCommodityType(int commodityType) {
            this.commodityType = commodityType;
            return this;
        }

        public Builder setCommodityImage(String commodityImage) {
            this.commodityImage = commodityImage;
            return this;
        }

        public Builder setCommodityId(int commodityId) {
            this.commodityId = commodityId;
            return this;
        }
    }


}
