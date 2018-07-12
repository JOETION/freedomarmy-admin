package com.snow.freedomarmy.admin.app.pojo;

/**
 * @Auther: Wei-Peng
 * @Date: 2018/7/10 18:43
 * @Description:
 *  商品类
 */
public class CommodityDto {
    private int id;
    private String commodityName;
    private String commodityPrice;
    private int browsingVolume;
    private int parent;
    private int grandpa;
    private int stock;
    private int integral;

    public CommodityDto() {
    }

    public CommodityDto(int id, String commodityName, String commodityPrice, int browsingVolume, int parent, int grandpa, int stock, int integral) {
        this.id = id;
        this.commodityName = commodityName;
        this.commodityPrice = commodityPrice;
        this.browsingVolume = browsingVolume;
        this.parent = parent;
        this.grandpa = grandpa;
        this.stock = stock;
        this.integral = integral;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(String commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public int getBrowsingVolume() {
        return browsingVolume;
    }

    public void setBrowsingVolume(int browsingVolume) {
        this.browsingVolume = browsingVolume;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public int getGrandpa() {
        return grandpa;
    }

    public void setGrandpa(int grandpa) {
        this.grandpa = grandpa;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    @Override
    public String toString() {
        return "CommodityDto{" +
                "id=" + id +
                ", commodityName='" + commodityName + '\'' +
                ", commodityPrice='" + commodityPrice + '\'' +
                ", browsingVolume=" + browsingVolume +
                ", parent=" + parent +
                ", grandpa=" + grandpa +
                ", stock=" + stock +
                ", integral=" + integral +
                '}';
    }
}
