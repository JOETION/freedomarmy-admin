package com.snow.freedomarmy.admin.app.pojo;

/**
 * @Auther: Wei-Peng
 * @Date: 2018/7/10 18:43
 * @Description: 商品类
 */
public class CommodityDto {
    private int commodityId;
    private String commodityName;
    private String commodityPrice;
    private int commodityType;
    private int commodityStock;
    private int commodityIntegral;
    private String commodityImage;
    private int state;

    private CommodityDto(Builder builder) {
        this.commodityImage = builder.commodityImage;
        this.commodityName = builder.commodityName;
        this.commodityPrice = builder.commodityPrice;
        this.commodityType = builder.commodityType;
        this.commodityId = builder.commodityId;
        this.commodityStock = builder.commodityStock;
        this.commodityIntegral = builder.commodityIntegral;
        this.state = builder.state;
    }

    public int getState() {
        return state;
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

    public int getCommodityStock() {
        return commodityStock;
    }

    public int getCommodityIntegral() {
        return commodityIntegral;
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
        private int commodityStock;
        private int commodityIntegral;
        private int state;

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

        public Builder setState(int state) {
            this.state = state;
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

        public Builder setCommodityStock(int commodityStock) {
            this.commodityStock = commodityStock;
            return this;
        }

        public Builder setCommodityIntegral(int commodityIntegral) {
            this.commodityIntegral = commodityIntegral;
            return this;
        }
    }

}
