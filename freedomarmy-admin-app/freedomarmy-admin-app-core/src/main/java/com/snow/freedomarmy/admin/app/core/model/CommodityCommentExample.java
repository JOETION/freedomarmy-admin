package com.snow.freedomarmy.admin.app.core.model;

import java.util.ArrayList;
import java.util.List;

public class CommodityCommentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    public CommodityCommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
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
     * This method corresponds to the database table commodity_comment
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
     * This method corresponds to the database table commodity_comment
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity_comment
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
     * This class corresponds to the database table commodity_comment
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

        public Criteria andCommenttextIsNull() {
            addCriterion("commenttext is null");
            return (Criteria) this;
        }

        public Criteria andCommenttextIsNotNull() {
            addCriterion("commenttext is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttextEqualTo(String value) {
            addCriterion("commenttext =", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotEqualTo(String value) {
            addCriterion("commenttext <>", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextGreaterThan(String value) {
            addCriterion("commenttext >", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextGreaterThanOrEqualTo(String value) {
            addCriterion("commenttext >=", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextLessThan(String value) {
            addCriterion("commenttext <", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextLessThanOrEqualTo(String value) {
            addCriterion("commenttext <=", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextLike(String value) {
            addCriterion("commenttext like", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotLike(String value) {
            addCriterion("commenttext not like", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextIn(List<String> values) {
            addCriterion("commenttext in", values, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotIn(List<String> values) {
            addCriterion("commenttext not in", values, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextBetween(String value1, String value2) {
            addCriterion("commenttext between", value1, value2, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotBetween(String value1, String value2) {
            addCriterion("commenttext not between", value1, value2, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommentimageIsNull() {
            addCriterion("commentimage is null");
            return (Criteria) this;
        }

        public Criteria andCommentimageIsNotNull() {
            addCriterion("commentimage is not null");
            return (Criteria) this;
        }

        public Criteria andCommentimageEqualTo(String value) {
            addCriterion("commentimage =", value, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommentimageNotEqualTo(String value) {
            addCriterion("commentimage <>", value, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommentimageGreaterThan(String value) {
            addCriterion("commentimage >", value, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommentimageGreaterThanOrEqualTo(String value) {
            addCriterion("commentimage >=", value, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommentimageLessThan(String value) {
            addCriterion("commentimage <", value, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommentimageLessThanOrEqualTo(String value) {
            addCriterion("commentimage <=", value, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommentimageLike(String value) {
            addCriterion("commentimage like", value, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommentimageNotLike(String value) {
            addCriterion("commentimage not like", value, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommentimageIn(List<String> values) {
            addCriterion("commentimage in", values, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommentimageNotIn(List<String> values) {
            addCriterion("commentimage not in", values, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommentimageBetween(String value1, String value2) {
            addCriterion("commentimage between", value1, value2, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommentimageNotBetween(String value1, String value2) {
            addCriterion("commentimage not between", value1, value2, "commentimage");
            return (Criteria) this;
        }

        public Criteria andCommodityparentIsNull() {
            addCriterion("commodityparent is null");
            return (Criteria) this;
        }

        public Criteria andCommodityparentIsNotNull() {
            addCriterion("commodityparent is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityparentEqualTo(Integer value) {
            addCriterion("commodityparent =", value, "commodityparent");
            return (Criteria) this;
        }

        public Criteria andCommodityparentNotEqualTo(Integer value) {
            addCriterion("commodityparent <>", value, "commodityparent");
            return (Criteria) this;
        }

        public Criteria andCommodityparentGreaterThan(Integer value) {
            addCriterion("commodityparent >", value, "commodityparent");
            return (Criteria) this;
        }

        public Criteria andCommodityparentGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodityparent >=", value, "commodityparent");
            return (Criteria) this;
        }

        public Criteria andCommodityparentLessThan(Integer value) {
            addCriterion("commodityparent <", value, "commodityparent");
            return (Criteria) this;
        }

        public Criteria andCommodityparentLessThanOrEqualTo(Integer value) {
            addCriterion("commodityparent <=", value, "commodityparent");
            return (Criteria) this;
        }

        public Criteria andCommodityparentIn(List<Integer> values) {
            addCriterion("commodityparent in", values, "commodityparent");
            return (Criteria) this;
        }

        public Criteria andCommodityparentNotIn(List<Integer> values) {
            addCriterion("commodityparent not in", values, "commodityparent");
            return (Criteria) this;
        }

        public Criteria andCommodityparentBetween(Integer value1, Integer value2) {
            addCriterion("commodityparent between", value1, value2, "commodityparent");
            return (Criteria) this;
        }

        public Criteria andCommodityparentNotBetween(Integer value1, Integer value2) {
            addCriterion("commodityparent not between", value1, value2, "commodityparent");
            return (Criteria) this;
        }

        public Criteria andUserparentIsNull() {
            addCriterion("userparent is null");
            return (Criteria) this;
        }

        public Criteria andUserparentIsNotNull() {
            addCriterion("userparent is not null");
            return (Criteria) this;
        }

        public Criteria andUserparentEqualTo(Integer value) {
            addCriterion("userparent =", value, "userparent");
            return (Criteria) this;
        }

        public Criteria andUserparentNotEqualTo(Integer value) {
            addCriterion("userparent <>", value, "userparent");
            return (Criteria) this;
        }

        public Criteria andUserparentGreaterThan(Integer value) {
            addCriterion("userparent >", value, "userparent");
            return (Criteria) this;
        }

        public Criteria andUserparentGreaterThanOrEqualTo(Integer value) {
            addCriterion("userparent >=", value, "userparent");
            return (Criteria) this;
        }

        public Criteria andUserparentLessThan(Integer value) {
            addCriterion("userparent <", value, "userparent");
            return (Criteria) this;
        }

        public Criteria andUserparentLessThanOrEqualTo(Integer value) {
            addCriterion("userparent <=", value, "userparent");
            return (Criteria) this;
        }

        public Criteria andUserparentIn(List<Integer> values) {
            addCriterion("userparent in", values, "userparent");
            return (Criteria) this;
        }

        public Criteria andUserparentNotIn(List<Integer> values) {
            addCriterion("userparent not in", values, "userparent");
            return (Criteria) this;
        }

        public Criteria andUserparentBetween(Integer value1, Integer value2) {
            addCriterion("userparent between", value1, value2, "userparent");
            return (Criteria) this;
        }

        public Criteria andUserparentNotBetween(Integer value1, Integer value2) {
            addCriterion("userparent not between", value1, value2, "userparent");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table commodity_comment
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
     * This class corresponds to the database table commodity_comment
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