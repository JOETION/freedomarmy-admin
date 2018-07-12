package com.snow.freedomarmy.admin.app.core.model;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated
     */
    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Integer value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Integer value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Integer value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Integer value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Integer> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Integer> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberIsNull() {
            addCriterion("commodity_number is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberIsNotNull() {
            addCriterion("commodity_number is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberEqualTo(Integer value) {
            addCriterion("commodity_number =", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberNotEqualTo(Integer value) {
            addCriterion("commodity_number <>", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberGreaterThan(Integer value) {
            addCriterion("commodity_number >", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_number >=", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberLessThan(Integer value) {
            addCriterion("commodity_number <", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_number <=", value, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberIn(List<Integer> values) {
            addCriterion("commodity_number in", values, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberNotIn(List<Integer> values) {
            addCriterion("commodity_number not in", values, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberBetween(Integer value1, Integer value2) {
            addCriterion("commodity_number between", value1, value2, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andCommodityNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_number not between", value1, value2, "commodityNumber");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceIsNull() {
            addCriterion("orders_price is null");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceIsNotNull() {
            addCriterion("orders_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceEqualTo(String value) {
            addCriterion("orders_price =", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceNotEqualTo(String value) {
            addCriterion("orders_price <>", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceGreaterThan(String value) {
            addCriterion("orders_price >", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceGreaterThanOrEqualTo(String value) {
            addCriterion("orders_price >=", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceLessThan(String value) {
            addCriterion("orders_price <", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceLessThanOrEqualTo(String value) {
            addCriterion("orders_price <=", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceLike(String value) {
            addCriterion("orders_price like", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceNotLike(String value) {
            addCriterion("orders_price not like", value, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceIn(List<String> values) {
            addCriterion("orders_price in", values, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceNotIn(List<String> values) {
            addCriterion("orders_price not in", values, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceBetween(String value1, String value2) {
            addCriterion("orders_price between", value1, value2, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andOrdersPriceNotBetween(String value1, String value2) {
            addCriterion("orders_price not between", value1, value2, "ordersPrice");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIsNull() {
            addCriterion("is_payment is null");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIsNotNull() {
            addCriterion("is_payment is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaymentEqualTo(Integer value) {
            addCriterion("is_payment =", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotEqualTo(Integer value) {
            addCriterion("is_payment <>", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentGreaterThan(Integer value) {
            addCriterion("is_payment >", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_payment >=", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentLessThan(Integer value) {
            addCriterion("is_payment <", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("is_payment <=", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIn(List<Integer> values) {
            addCriterion("is_payment in", values, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotIn(List<Integer> values) {
            addCriterion("is_payment not in", values, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentBetween(Integer value1, Integer value2) {
            addCriterion("is_payment between", value1, value2, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("is_payment not between", value1, value2, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsIsNull() {
            addCriterion("is_send_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsIsNotNull() {
            addCriterion("is_send_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsEqualTo(Integer value) {
            addCriterion("is_send_goods =", value, "isSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsNotEqualTo(Integer value) {
            addCriterion("is_send_goods <>", value, "isSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsGreaterThan(Integer value) {
            addCriterion("is_send_goods >", value, "isSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_send_goods >=", value, "isSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsLessThan(Integer value) {
            addCriterion("is_send_goods <", value, "isSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("is_send_goods <=", value, "isSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsIn(List<Integer> values) {
            addCriterion("is_send_goods in", values, "isSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsNotIn(List<Integer> values) {
            addCriterion("is_send_goods not in", values, "isSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsBetween(Integer value1, Integer value2) {
            addCriterion("is_send_goods between", value1, value2, "isSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsSendGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_send_goods not between", value1, value2, "isSendGoods");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsIsNull() {
            addCriterion("is_collect_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsIsNotNull() {
            addCriterion("is_collect_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsEqualTo(Integer value) {
            addCriterion("is_collect_goods =", value, "isCollectGoods");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsNotEqualTo(Integer value) {
            addCriterion("is_collect_goods <>", value, "isCollectGoods");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsGreaterThan(Integer value) {
            addCriterion("is_collect_goods >", value, "isCollectGoods");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_collect_goods >=", value, "isCollectGoods");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsLessThan(Integer value) {
            addCriterion("is_collect_goods <", value, "isCollectGoods");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("is_collect_goods <=", value, "isCollectGoods");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsIn(List<Integer> values) {
            addCriterion("is_collect_goods in", values, "isCollectGoods");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsNotIn(List<Integer> values) {
            addCriterion("is_collect_goods not in", values, "isCollectGoods");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsBetween(Integer value1, Integer value2) {
            addCriterion("is_collect_goods between", value1, value2, "isCollectGoods");
            return (Criteria) this;
        }

        public Criteria andIsCollectGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_collect_goods not between", value1, value2, "isCollectGoods");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyIsNull() {
            addCriterion("is_collect_money is null");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyIsNotNull() {
            addCriterion("is_collect_money is not null");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyEqualTo(Integer value) {
            addCriterion("is_collect_money =", value, "isCollectMoney");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyNotEqualTo(Integer value) {
            addCriterion("is_collect_money <>", value, "isCollectMoney");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyGreaterThan(Integer value) {
            addCriterion("is_collect_money >", value, "isCollectMoney");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_collect_money >=", value, "isCollectMoney");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyLessThan(Integer value) {
            addCriterion("is_collect_money <", value, "isCollectMoney");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("is_collect_money <=", value, "isCollectMoney");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyIn(List<Integer> values) {
            addCriterion("is_collect_money in", values, "isCollectMoney");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyNotIn(List<Integer> values) {
            addCriterion("is_collect_money not in", values, "isCollectMoney");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyBetween(Integer value1, Integer value2) {
            addCriterion("is_collect_money between", value1, value2, "isCollectMoney");
            return (Criteria) this;
        }

        public Criteria andIsCollectMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_collect_money not between", value1, value2, "isCollectMoney");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsIsNull() {
            addCriterion("is_return_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsIsNotNull() {
            addCriterion("is_return_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsEqualTo(Integer value) {
            addCriterion("is_return_goods =", value, "isReturnGoods");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsNotEqualTo(Integer value) {
            addCriterion("is_return_goods <>", value, "isReturnGoods");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsGreaterThan(Integer value) {
            addCriterion("is_return_goods >", value, "isReturnGoods");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_return_goods >=", value, "isReturnGoods");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsLessThan(Integer value) {
            addCriterion("is_return_goods <", value, "isReturnGoods");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("is_return_goods <=", value, "isReturnGoods");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsIn(List<Integer> values) {
            addCriterion("is_return_goods in", values, "isReturnGoods");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsNotIn(List<Integer> values) {
            addCriterion("is_return_goods not in", values, "isReturnGoods");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsBetween(Integer value1, Integer value2) {
            addCriterion("is_return_goods between", value1, value2, "isReturnGoods");
            return (Criteria) this;
        }

        public Criteria andIsReturnGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_return_goods not between", value1, value2, "isReturnGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsIsNull() {
            addCriterion("is_exchange_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsIsNotNull() {
            addCriterion("is_exchange_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsEqualTo(Integer value) {
            addCriterion("is_exchange_goods =", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsNotEqualTo(Integer value) {
            addCriterion("is_exchange_goods <>", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsGreaterThan(Integer value) {
            addCriterion("is_exchange_goods >", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_exchange_goods >=", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsLessThan(Integer value) {
            addCriterion("is_exchange_goods <", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("is_exchange_goods <=", value, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsIn(List<Integer> values) {
            addCriterion("is_exchange_goods in", values, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsNotIn(List<Integer> values) {
            addCriterion("is_exchange_goods not in", values, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsBetween(Integer value1, Integer value2) {
            addCriterion("is_exchange_goods between", value1, value2, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("is_exchange_goods not between", value1, value2, "isExchangeGoods");
            return (Criteria) this;
        }

        public Criteria andIsRefundIsNull() {
            addCriterion("is_refund is null");
            return (Criteria) this;
        }

        public Criteria andIsRefundIsNotNull() {
            addCriterion("is_refund is not null");
            return (Criteria) this;
        }

        public Criteria andIsRefundEqualTo(Integer value) {
            addCriterion("is_refund =", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundNotEqualTo(Integer value) {
            addCriterion("is_refund <>", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundGreaterThan(Integer value) {
            addCriterion("is_refund >", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_refund >=", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundLessThan(Integer value) {
            addCriterion("is_refund <", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundLessThanOrEqualTo(Integer value) {
            addCriterion("is_refund <=", value, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundIn(List<Integer> values) {
            addCriterion("is_refund in", values, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundNotIn(List<Integer> values) {
            addCriterion("is_refund not in", values, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundBetween(Integer value1, Integer value2) {
            addCriterion("is_refund between", value1, value2, "isRefund");
            return (Criteria) this;
        }

        public Criteria andIsRefundNotBetween(Integer value1, Integer value2) {
            addCriterion("is_refund not between", value1, value2, "isRefund");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}