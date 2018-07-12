package com.snow.freedomarmy.admin.app.pojo;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/10          FXY        Created
 **********************************************
 */


import java.io.Serializable;
import java.util.List;

public class CommodityPagingDto implements Serializable {

    private int draw; // Client request times
    private int recordsTotal; // Total records number without conditions
    private int recordsFiltered; // Total records number with conditions


    private List<CommodityBodyPagingDto> data;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<CommodityBodyPagingDto> getData() {
        return data;
    }

    public void setData(List<CommodityBodyPagingDto> data) {
        this.data = data;
    }

    public static class CommodityBodyPagingDto {
        private int id;
        private String commodityName;
        private String commodityPrice;
        private String commodityTypeName;

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

        public String getCommodityTypeName() {
            return commodityTypeName;
        }

        public void setCommodityTypeName(String commodityTypeName) {
            this.commodityTypeName = commodityTypeName;
        }
    }
}
