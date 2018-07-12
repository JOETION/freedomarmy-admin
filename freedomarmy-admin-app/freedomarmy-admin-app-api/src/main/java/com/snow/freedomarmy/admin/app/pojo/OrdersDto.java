package com.snow.freedomarmy.admin.app.pojo;

/**
 * @Auther: Wei-Peng
 * @Date: 2018/7/10 11:27
 * @Description:
 */
public class OrdersDto {
    private int id;
    private  String username;//订单用户
    private int commodityId; //商品ID
    private int commodityNumber;//商品数量

    private String ordersPrice; //价格
    private Integer isPayment; //支付
    private Integer isSendGoods; //发货
    private Integer isCollectGoods;// 收货


    private int isReturnGoods;//退货
    private int isExchangeGoods;//换货
    private Integer isCollectMoney;//收款
    private int isRefund;//退款

    public OrdersDto() {
    }

    public OrdersDto(int id, String username, int commodityId, int commodityNumber, String ordersPrice, Integer isPayment, Integer isSendGoods, Integer isCollectGoods, int isReturnGoods, int isExchangeGoods, Integer isCollectMoney, int isRefund) {
        this.id = id;
        this.username = username;
        this.commodityId = commodityId;
        this.commodityNumber = commodityNumber;
        this.ordersPrice = ordersPrice;
        this.isPayment = isPayment;
        this.isSendGoods = isSendGoods;
        this.isCollectGoods = isCollectGoods;
        this.isReturnGoods = isReturnGoods;
        this.isExchangeGoods = isExchangeGoods;
        this.isCollectMoney = isCollectMoney;
        this.isRefund = isRefund;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public int getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(int commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public String getOrdersPrice() {
        return ordersPrice;
    }

    public void setOrdersPrice(String ordersPrice) {
        this.ordersPrice = ordersPrice;
    }

    public Integer getIsPayment() {
        return isPayment;
    }

    public void setIsPayment(Integer isPayment) {
        this.isPayment = isPayment;
    }

    public Integer getIsSendGoods() {
        return isSendGoods;
    }

    public void setIsSendGoods(Integer isSendGoods) {
        this.isSendGoods = isSendGoods;
    }

    public Integer getIsCollectGoods() {
        return isCollectGoods;
    }

    public void setIsCollectGoods(Integer isCollectGoods) {
        this.isCollectGoods = isCollectGoods;
    }

    public int getIsReturnGoods() {
        return isReturnGoods;
    }

    public void setIsReturnGoods(int isReturnGoods) {
        this.isReturnGoods = isReturnGoods;
    }

    public int getIsExchangeGoods() {
        return isExchangeGoods;
    }

    public void setIsExchangeGoods(int isExchangeGoods) {
        this.isExchangeGoods = isExchangeGoods;
    }

    public Integer getIsCollectMoney() {
        return isCollectMoney;
    }

    public void setIsCollectMoney(Integer isCollectMoney) {
        this.isCollectMoney = isCollectMoney;
    }

    public int getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(int isRefund) {
        this.isRefund = isRefund;
    }

    @Override
    public String toString() {
        return "OrdersDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", commodityId=" + commodityId +
                ", commodityNumber=" + commodityNumber +
                ", ordersPrice='" + ordersPrice + '\'' +
                ", isPayment=" + isPayment +
                ", isSendGoods=" + isSendGoods +
                ", isCollectGoods=" + isCollectGoods +
                ", isReturnGoods=" + isReturnGoods +
                ", isExchangeGoods=" + isExchangeGoods +
                ", isCollectMoney=" + isCollectMoney +
                ", isRefund=" + isRefund +
                '}';
    }
}
