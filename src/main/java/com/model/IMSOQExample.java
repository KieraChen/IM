package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IMSOQExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IMSOQExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andLRetailStoreIDIsNull() {
            addCriterion("lRetailStoreID is null");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDIsNotNull() {
            addCriterion("lRetailStoreID is not null");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDEqualTo(Integer value) {
            addCriterion("lRetailStoreID =", value, "lRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDNotEqualTo(Integer value) {
            addCriterion("lRetailStoreID <>", value, "lRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDGreaterThan(Integer value) {
            addCriterion("lRetailStoreID >", value, "lRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lRetailStoreID >=", value, "lRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDLessThan(Integer value) {
            addCriterion("lRetailStoreID <", value, "lRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDLessThanOrEqualTo(Integer value) {
            addCriterion("lRetailStoreID <=", value, "lRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDIn(List<Integer> values) {
            addCriterion("lRetailStoreID in", values, "lRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDNotIn(List<Integer> values) {
            addCriterion("lRetailStoreID not in", values, "lRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDBetween(Integer value1, Integer value2) {
            addCriterion("lRetailStoreID between", value1, value2, "lRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lRetailStoreID not between", value1, value2, "lRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andSzDateIsNull() {
            addCriterion("szDate is null");
            return (Criteria) this;
        }

        public Criteria andSzDateIsNotNull() {
            addCriterion("szDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzDateEqualTo(String value) {
            addCriterion("szDate =", value, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzDateNotEqualTo(String value) {
            addCriterion("szDate <>", value, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzDateGreaterThan(String value) {
            addCriterion("szDate >", value, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzDateGreaterThanOrEqualTo(String value) {
            addCriterion("szDate >=", value, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzDateLessThan(String value) {
            addCriterion("szDate <", value, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzDateLessThanOrEqualTo(String value) {
            addCriterion("szDate <=", value, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzDateLike(String value) {
            addCriterion("szDate like", value, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzDateNotLike(String value) {
            addCriterion("szDate not like", value, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzDateIn(List<String> values) {
            addCriterion("szDate in", values, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzDateNotIn(List<String> values) {
            addCriterion("szDate not in", values, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzDateBetween(String value1, String value2) {
            addCriterion("szDate between", value1, value2, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzDateNotBetween(String value1, String value2) {
            addCriterion("szDate not between", value1, value2, "szDate");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDIsNull() {
            addCriterion("szPOSItemID is null");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDIsNotNull() {
            addCriterion("szPOSItemID is not null");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDEqualTo(String value) {
            addCriterion("szPOSItemID =", value, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDNotEqualTo(String value) {
            addCriterion("szPOSItemID <>", value, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDGreaterThan(String value) {
            addCriterion("szPOSItemID >", value, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDGreaterThanOrEqualTo(String value) {
            addCriterion("szPOSItemID >=", value, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDLessThan(String value) {
            addCriterion("szPOSItemID <", value, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDLessThanOrEqualTo(String value) {
            addCriterion("szPOSItemID <=", value, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDLike(String value) {
            addCriterion("szPOSItemID like", value, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDNotLike(String value) {
            addCriterion("szPOSItemID not like", value, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDIn(List<String> values) {
            addCriterion("szPOSItemID in", values, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDNotIn(List<String> values) {
            addCriterion("szPOSItemID not in", values, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDBetween(String value1, String value2) {
            addCriterion("szPOSItemID between", value1, value2, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzPOSItemIDNotBetween(String value1, String value2) {
            addCriterion("szPOSItemID not between", value1, value2, "szPOSItemID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDIsNull() {
            addCriterion("szRetailStoreExternalID is null");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDIsNotNull() {
            addCriterion("szRetailStoreExternalID is not null");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDEqualTo(String value) {
            addCriterion("szRetailStoreExternalID =", value, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDNotEqualTo(String value) {
            addCriterion("szRetailStoreExternalID <>", value, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDGreaterThan(String value) {
            addCriterion("szRetailStoreExternalID >", value, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDGreaterThanOrEqualTo(String value) {
            addCriterion("szRetailStoreExternalID >=", value, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDLessThan(String value) {
            addCriterion("szRetailStoreExternalID <", value, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDLessThanOrEqualTo(String value) {
            addCriterion("szRetailStoreExternalID <=", value, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDLike(String value) {
            addCriterion("szRetailStoreExternalID like", value, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDNotLike(String value) {
            addCriterion("szRetailStoreExternalID not like", value, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDIn(List<String> values) {
            addCriterion("szRetailStoreExternalID in", values, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDNotIn(List<String> values) {
            addCriterion("szRetailStoreExternalID not in", values, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDBetween(String value1, String value2) {
            addCriterion("szRetailStoreExternalID between", value1, value2, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDNotBetween(String value1, String value2) {
            addCriterion("szRetailStoreExternalID not between", value1, value2, "szRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrIsNull() {
            addCriterion("lWorkstationNmbr is null");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrIsNotNull() {
            addCriterion("lWorkstationNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrEqualTo(Integer value) {
            addCriterion("lWorkstationNmbr =", value, "lWorkstationNmbr");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrNotEqualTo(Integer value) {
            addCriterion("lWorkstationNmbr <>", value, "lWorkstationNmbr");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrGreaterThan(Integer value) {
            addCriterion("lWorkstationNmbr >", value, "lWorkstationNmbr");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrGreaterThanOrEqualTo(Integer value) {
            addCriterion("lWorkstationNmbr >=", value, "lWorkstationNmbr");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrLessThan(Integer value) {
            addCriterion("lWorkstationNmbr <", value, "lWorkstationNmbr");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrLessThanOrEqualTo(Integer value) {
            addCriterion("lWorkstationNmbr <=", value, "lWorkstationNmbr");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrIn(List<Integer> values) {
            addCriterion("lWorkstationNmbr in", values, "lWorkstationNmbr");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrNotIn(List<Integer> values) {
            addCriterion("lWorkstationNmbr not in", values, "lWorkstationNmbr");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrBetween(Integer value1, Integer value2) {
            addCriterion("lWorkstationNmbr between", value1, value2, "lWorkstationNmbr");
            return (Criteria) this;
        }

        public Criteria andLWorkstationNmbrNotBetween(Integer value1, Integer value2) {
            addCriterion("lWorkstationNmbr not between", value1, value2, "lWorkstationNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionIsNull() {
            addCriterion("szDescription is null");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionIsNotNull() {
            addCriterion("szDescription is not null");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionEqualTo(String value) {
            addCriterion("szDescription =", value, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionNotEqualTo(String value) {
            addCriterion("szDescription <>", value, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionGreaterThan(String value) {
            addCriterion("szDescription >", value, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("szDescription >=", value, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionLessThan(String value) {
            addCriterion("szDescription <", value, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionLessThanOrEqualTo(String value) {
            addCriterion("szDescription <=", value, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionLike(String value) {
            addCriterion("szDescription like", value, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionNotLike(String value) {
            addCriterion("szDescription not like", value, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionIn(List<String> values) {
            addCriterion("szDescription in", values, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionNotIn(List<String> values) {
            addCriterion("szDescription not in", values, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionBetween(String value1, String value2) {
            addCriterion("szDescription between", value1, value2, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzDescriptionNotBetween(String value1, String value2) {
            addCriterion("szDescription not between", value1, value2, "szDescription");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupIsNull() {
            addCriterion("szPurchasingGroup is null");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupIsNotNull() {
            addCriterion("szPurchasingGroup is not null");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupEqualTo(String value) {
            addCriterion("szPurchasingGroup =", value, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupNotEqualTo(String value) {
            addCriterion("szPurchasingGroup <>", value, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupGreaterThan(String value) {
            addCriterion("szPurchasingGroup >", value, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupGreaterThanOrEqualTo(String value) {
            addCriterion("szPurchasingGroup >=", value, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupLessThan(String value) {
            addCriterion("szPurchasingGroup <", value, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupLessThanOrEqualTo(String value) {
            addCriterion("szPurchasingGroup <=", value, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupLike(String value) {
            addCriterion("szPurchasingGroup like", value, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupNotLike(String value) {
            addCriterion("szPurchasingGroup not like", value, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupIn(List<String> values) {
            addCriterion("szPurchasingGroup in", values, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupNotIn(List<String> values) {
            addCriterion("szPurchasingGroup not in", values, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupBetween(String value1, String value2) {
            addCriterion("szPurchasingGroup between", value1, value2, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchasingGroupNotBetween(String value1, String value2) {
            addCriterion("szPurchasingGroup not between", value1, value2, "szPurchasingGroup");
            return (Criteria) this;
        }

        public Criteria andDWk4IsNull() {
            addCriterion("dWk4 is null");
            return (Criteria) this;
        }

        public Criteria andDWk4IsNotNull() {
            addCriterion("dWk4 is not null");
            return (Criteria) this;
        }

        public Criteria andDWk4EqualTo(BigDecimal value) {
            addCriterion("dWk4 =", value, "dWk4");
            return (Criteria) this;
        }

        public Criteria andDWk4NotEqualTo(BigDecimal value) {
            addCriterion("dWk4 <>", value, "dWk4");
            return (Criteria) this;
        }

        public Criteria andDWk4GreaterThan(BigDecimal value) {
            addCriterion("dWk4 >", value, "dWk4");
            return (Criteria) this;
        }

        public Criteria andDWk4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dWk4 >=", value, "dWk4");
            return (Criteria) this;
        }

        public Criteria andDWk4LessThan(BigDecimal value) {
            addCriterion("dWk4 <", value, "dWk4");
            return (Criteria) this;
        }

        public Criteria andDWk4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("dWk4 <=", value, "dWk4");
            return (Criteria) this;
        }

        public Criteria andDWk4In(List<BigDecimal> values) {
            addCriterion("dWk4 in", values, "dWk4");
            return (Criteria) this;
        }

        public Criteria andDWk4NotIn(List<BigDecimal> values) {
            addCriterion("dWk4 not in", values, "dWk4");
            return (Criteria) this;
        }

        public Criteria andDWk4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("dWk4 between", value1, value2, "dWk4");
            return (Criteria) this;
        }

        public Criteria andDWk4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dWk4 not between", value1, value2, "dWk4");
            return (Criteria) this;
        }

        public Criteria andDWk3IsNull() {
            addCriterion("dWk3 is null");
            return (Criteria) this;
        }

        public Criteria andDWk3IsNotNull() {
            addCriterion("dWk3 is not null");
            return (Criteria) this;
        }

        public Criteria andDWk3EqualTo(BigDecimal value) {
            addCriterion("dWk3 =", value, "dWk3");
            return (Criteria) this;
        }

        public Criteria andDWk3NotEqualTo(BigDecimal value) {
            addCriterion("dWk3 <>", value, "dWk3");
            return (Criteria) this;
        }

        public Criteria andDWk3GreaterThan(BigDecimal value) {
            addCriterion("dWk3 >", value, "dWk3");
            return (Criteria) this;
        }

        public Criteria andDWk3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dWk3 >=", value, "dWk3");
            return (Criteria) this;
        }

        public Criteria andDWk3LessThan(BigDecimal value) {
            addCriterion("dWk3 <", value, "dWk3");
            return (Criteria) this;
        }

        public Criteria andDWk3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("dWk3 <=", value, "dWk3");
            return (Criteria) this;
        }

        public Criteria andDWk3In(List<BigDecimal> values) {
            addCriterion("dWk3 in", values, "dWk3");
            return (Criteria) this;
        }

        public Criteria andDWk3NotIn(List<BigDecimal> values) {
            addCriterion("dWk3 not in", values, "dWk3");
            return (Criteria) this;
        }

        public Criteria andDWk3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("dWk3 between", value1, value2, "dWk3");
            return (Criteria) this;
        }

        public Criteria andDWk3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dWk3 not between", value1, value2, "dWk3");
            return (Criteria) this;
        }

        public Criteria andDWk2IsNull() {
            addCriterion("dWk2 is null");
            return (Criteria) this;
        }

        public Criteria andDWk2IsNotNull() {
            addCriterion("dWk2 is not null");
            return (Criteria) this;
        }

        public Criteria andDWk2EqualTo(BigDecimal value) {
            addCriterion("dWk2 =", value, "dWk2");
            return (Criteria) this;
        }

        public Criteria andDWk2NotEqualTo(BigDecimal value) {
            addCriterion("dWk2 <>", value, "dWk2");
            return (Criteria) this;
        }

        public Criteria andDWk2GreaterThan(BigDecimal value) {
            addCriterion("dWk2 >", value, "dWk2");
            return (Criteria) this;
        }

        public Criteria andDWk2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dWk2 >=", value, "dWk2");
            return (Criteria) this;
        }

        public Criteria andDWk2LessThan(BigDecimal value) {
            addCriterion("dWk2 <", value, "dWk2");
            return (Criteria) this;
        }

        public Criteria andDWk2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("dWk2 <=", value, "dWk2");
            return (Criteria) this;
        }

        public Criteria andDWk2In(List<BigDecimal> values) {
            addCriterion("dWk2 in", values, "dWk2");
            return (Criteria) this;
        }

        public Criteria andDWk2NotIn(List<BigDecimal> values) {
            addCriterion("dWk2 not in", values, "dWk2");
            return (Criteria) this;
        }

        public Criteria andDWk2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("dWk2 between", value1, value2, "dWk2");
            return (Criteria) this;
        }

        public Criteria andDWk2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dWk2 not between", value1, value2, "dWk2");
            return (Criteria) this;
        }

        public Criteria andDWk1IsNull() {
            addCriterion("dWk1 is null");
            return (Criteria) this;
        }

        public Criteria andDWk1IsNotNull() {
            addCriterion("dWk1 is not null");
            return (Criteria) this;
        }

        public Criteria andDWk1EqualTo(BigDecimal value) {
            addCriterion("dWk1 =", value, "dWk1");
            return (Criteria) this;
        }

        public Criteria andDWk1NotEqualTo(BigDecimal value) {
            addCriterion("dWk1 <>", value, "dWk1");
            return (Criteria) this;
        }

        public Criteria andDWk1GreaterThan(BigDecimal value) {
            addCriterion("dWk1 >", value, "dWk1");
            return (Criteria) this;
        }

        public Criteria andDWk1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dWk1 >=", value, "dWk1");
            return (Criteria) this;
        }

        public Criteria andDWk1LessThan(BigDecimal value) {
            addCriterion("dWk1 <", value, "dWk1");
            return (Criteria) this;
        }

        public Criteria andDWk1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("dWk1 <=", value, "dWk1");
            return (Criteria) this;
        }

        public Criteria andDWk1In(List<BigDecimal> values) {
            addCriterion("dWk1 in", values, "dWk1");
            return (Criteria) this;
        }

        public Criteria andDWk1NotIn(List<BigDecimal> values) {
            addCriterion("dWk1 not in", values, "dWk1");
            return (Criteria) this;
        }

        public Criteria andDWk1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("dWk1 between", value1, value2, "dWk1");
            return (Criteria) this;
        }

        public Criteria andDWk1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dWk1 not between", value1, value2, "dWk1");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekIsNull() {
            addCriterion("dForecastPerWeek is null");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekIsNotNull() {
            addCriterion("dForecastPerWeek is not null");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekEqualTo(BigDecimal value) {
            addCriterion("dForecastPerWeek =", value, "dForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekNotEqualTo(BigDecimal value) {
            addCriterion("dForecastPerWeek <>", value, "dForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekGreaterThan(BigDecimal value) {
            addCriterion("dForecastPerWeek >", value, "dForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dForecastPerWeek >=", value, "dForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekLessThan(BigDecimal value) {
            addCriterion("dForecastPerWeek <", value, "dForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dForecastPerWeek <=", value, "dForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekIn(List<BigDecimal> values) {
            addCriterion("dForecastPerWeek in", values, "dForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekNotIn(List<BigDecimal> values) {
            addCriterion("dForecastPerWeek not in", values, "dForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dForecastPerWeek between", value1, value2, "dForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDForecastPerWeekNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dForecastPerWeek not between", value1, value2, "dForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekIsNull() {
            addCriterion("dRevisedForecastPerWeek is null");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekIsNotNull() {
            addCriterion("dRevisedForecastPerWeek is not null");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekEqualTo(BigDecimal value) {
            addCriterion("dRevisedForecastPerWeek =", value, "dRevisedForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekNotEqualTo(BigDecimal value) {
            addCriterion("dRevisedForecastPerWeek <>", value, "dRevisedForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekGreaterThan(BigDecimal value) {
            addCriterion("dRevisedForecastPerWeek >", value, "dRevisedForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dRevisedForecastPerWeek >=", value, "dRevisedForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekLessThan(BigDecimal value) {
            addCriterion("dRevisedForecastPerWeek <", value, "dRevisedForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dRevisedForecastPerWeek <=", value, "dRevisedForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekIn(List<BigDecimal> values) {
            addCriterion("dRevisedForecastPerWeek in", values, "dRevisedForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekNotIn(List<BigDecimal> values) {
            addCriterion("dRevisedForecastPerWeek not in", values, "dRevisedForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dRevisedForecastPerWeek between", value1, value2, "dRevisedForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDRevisedForecastPerWeekNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dRevisedForecastPerWeek not between", value1, value2, "dRevisedForecastPerWeek");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyIsNull() {
            addCriterion("dSafetyMinQty is null");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyIsNotNull() {
            addCriterion("dSafetyMinQty is not null");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyEqualTo(BigDecimal value) {
            addCriterion("dSafetyMinQty =", value, "dSafetyMinQty");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyNotEqualTo(BigDecimal value) {
            addCriterion("dSafetyMinQty <>", value, "dSafetyMinQty");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyGreaterThan(BigDecimal value) {
            addCriterion("dSafetyMinQty >", value, "dSafetyMinQty");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dSafetyMinQty >=", value, "dSafetyMinQty");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyLessThan(BigDecimal value) {
            addCriterion("dSafetyMinQty <", value, "dSafetyMinQty");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dSafetyMinQty <=", value, "dSafetyMinQty");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyIn(List<BigDecimal> values) {
            addCriterion("dSafetyMinQty in", values, "dSafetyMinQty");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyNotIn(List<BigDecimal> values) {
            addCriterion("dSafetyMinQty not in", values, "dSafetyMinQty");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dSafetyMinQty between", value1, value2, "dSafetyMinQty");
            return (Criteria) this;
        }

        public Criteria andDSafetyMinQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dSafetyMinQty not between", value1, value2, "dSafetyMinQty");
            return (Criteria) this;
        }

        public Criteria andDMaximumIsNull() {
            addCriterion("dMaximum is null");
            return (Criteria) this;
        }

        public Criteria andDMaximumIsNotNull() {
            addCriterion("dMaximum is not null");
            return (Criteria) this;
        }

        public Criteria andDMaximumEqualTo(BigDecimal value) {
            addCriterion("dMaximum =", value, "dMaximum");
            return (Criteria) this;
        }

        public Criteria andDMaximumNotEqualTo(BigDecimal value) {
            addCriterion("dMaximum <>", value, "dMaximum");
            return (Criteria) this;
        }

        public Criteria andDMaximumGreaterThan(BigDecimal value) {
            addCriterion("dMaximum >", value, "dMaximum");
            return (Criteria) this;
        }

        public Criteria andDMaximumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dMaximum >=", value, "dMaximum");
            return (Criteria) this;
        }

        public Criteria andDMaximumLessThan(BigDecimal value) {
            addCriterion("dMaximum <", value, "dMaximum");
            return (Criteria) this;
        }

        public Criteria andDMaximumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dMaximum <=", value, "dMaximum");
            return (Criteria) this;
        }

        public Criteria andDMaximumIn(List<BigDecimal> values) {
            addCriterion("dMaximum in", values, "dMaximum");
            return (Criteria) this;
        }

        public Criteria andDMaximumNotIn(List<BigDecimal> values) {
            addCriterion("dMaximum not in", values, "dMaximum");
            return (Criteria) this;
        }

        public Criteria andDMaximumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMaximum between", value1, value2, "dMaximum");
            return (Criteria) this;
        }

        public Criteria andDMaximumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMaximum not between", value1, value2, "dMaximum");
            return (Criteria) this;
        }

        public Criteria andDInventoryIsNull() {
            addCriterion("dInventory is null");
            return (Criteria) this;
        }

        public Criteria andDInventoryIsNotNull() {
            addCriterion("dInventory is not null");
            return (Criteria) this;
        }

        public Criteria andDInventoryEqualTo(BigDecimal value) {
            addCriterion("dInventory =", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryNotEqualTo(BigDecimal value) {
            addCriterion("dInventory <>", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryGreaterThan(BigDecimal value) {
            addCriterion("dInventory >", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dInventory >=", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryLessThan(BigDecimal value) {
            addCriterion("dInventory <", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dInventory <=", value, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryIn(List<BigDecimal> values) {
            addCriterion("dInventory in", values, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryNotIn(List<BigDecimal> values) {
            addCriterion("dInventory not in", values, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dInventory between", value1, value2, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDInventoryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dInventory not between", value1, value2, "dInventory");
            return (Criteria) this;
        }

        public Criteria andDSOQIsNull() {
            addCriterion("dSOQ is null");
            return (Criteria) this;
        }

        public Criteria andDSOQIsNotNull() {
            addCriterion("dSOQ is not null");
            return (Criteria) this;
        }

        public Criteria andDSOQEqualTo(BigDecimal value) {
            addCriterion("dSOQ =", value, "dSOQ");
            return (Criteria) this;
        }

        public Criteria andDSOQNotEqualTo(BigDecimal value) {
            addCriterion("dSOQ <>", value, "dSOQ");
            return (Criteria) this;
        }

        public Criteria andDSOQGreaterThan(BigDecimal value) {
            addCriterion("dSOQ >", value, "dSOQ");
            return (Criteria) this;
        }

        public Criteria andDSOQGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dSOQ >=", value, "dSOQ");
            return (Criteria) this;
        }

        public Criteria andDSOQLessThan(BigDecimal value) {
            addCriterion("dSOQ <", value, "dSOQ");
            return (Criteria) this;
        }

        public Criteria andDSOQLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dSOQ <=", value, "dSOQ");
            return (Criteria) this;
        }

        public Criteria andDSOQIn(List<BigDecimal> values) {
            addCriterion("dSOQ in", values, "dSOQ");
            return (Criteria) this;
        }

        public Criteria andDSOQNotIn(List<BigDecimal> values) {
            addCriterion("dSOQ not in", values, "dSOQ");
            return (Criteria) this;
        }

        public Criteria andDSOQBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dSOQ between", value1, value2, "dSOQ");
            return (Criteria) this;
        }

        public Criteria andDSOQNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dSOQ not between", value1, value2, "dSOQ");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysIsNull() {
            addCriterion("dForecastDays is null");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysIsNotNull() {
            addCriterion("dForecastDays is not null");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysEqualTo(BigDecimal value) {
            addCriterion("dForecastDays =", value, "dForecastDays");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysNotEqualTo(BigDecimal value) {
            addCriterion("dForecastDays <>", value, "dForecastDays");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysGreaterThan(BigDecimal value) {
            addCriterion("dForecastDays >", value, "dForecastDays");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dForecastDays >=", value, "dForecastDays");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysLessThan(BigDecimal value) {
            addCriterion("dForecastDays <", value, "dForecastDays");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dForecastDays <=", value, "dForecastDays");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysIn(List<BigDecimal> values) {
            addCriterion("dForecastDays in", values, "dForecastDays");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysNotIn(List<BigDecimal> values) {
            addCriterion("dForecastDays not in", values, "dForecastDays");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dForecastDays between", value1, value2, "dForecastDays");
            return (Criteria) this;
        }

        public Criteria andDForecastDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dForecastDays not between", value1, value2, "dForecastDays");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQIsNull() {
            addCriterion("dRevisedSOQ is null");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQIsNotNull() {
            addCriterion("dRevisedSOQ is not null");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQEqualTo(BigDecimal value) {
            addCriterion("dRevisedSOQ =", value, "dRevisedSOQ");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQNotEqualTo(BigDecimal value) {
            addCriterion("dRevisedSOQ <>", value, "dRevisedSOQ");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQGreaterThan(BigDecimal value) {
            addCriterion("dRevisedSOQ >", value, "dRevisedSOQ");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dRevisedSOQ >=", value, "dRevisedSOQ");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQLessThan(BigDecimal value) {
            addCriterion("dRevisedSOQ <", value, "dRevisedSOQ");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dRevisedSOQ <=", value, "dRevisedSOQ");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQIn(List<BigDecimal> values) {
            addCriterion("dRevisedSOQ in", values, "dRevisedSOQ");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQNotIn(List<BigDecimal> values) {
            addCriterion("dRevisedSOQ not in", values, "dRevisedSOQ");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dRevisedSOQ between", value1, value2, "dRevisedSOQ");
            return (Criteria) this;
        }

        public Criteria andDRevisedSOQNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dRevisedSOQ not between", value1, value2, "dRevisedSOQ");
            return (Criteria) this;
        }

        public Criteria andDItemMOQIsNull() {
            addCriterion("dItemMOQ is null");
            return (Criteria) this;
        }

        public Criteria andDItemMOQIsNotNull() {
            addCriterion("dItemMOQ is not null");
            return (Criteria) this;
        }

        public Criteria andDItemMOQEqualTo(BigDecimal value) {
            addCriterion("dItemMOQ =", value, "dItemMOQ");
            return (Criteria) this;
        }

        public Criteria andDItemMOQNotEqualTo(BigDecimal value) {
            addCriterion("dItemMOQ <>", value, "dItemMOQ");
            return (Criteria) this;
        }

        public Criteria andDItemMOQGreaterThan(BigDecimal value) {
            addCriterion("dItemMOQ >", value, "dItemMOQ");
            return (Criteria) this;
        }

        public Criteria andDItemMOQGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dItemMOQ >=", value, "dItemMOQ");
            return (Criteria) this;
        }

        public Criteria andDItemMOQLessThan(BigDecimal value) {
            addCriterion("dItemMOQ <", value, "dItemMOQ");
            return (Criteria) this;
        }

        public Criteria andDItemMOQLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dItemMOQ <=", value, "dItemMOQ");
            return (Criteria) this;
        }

        public Criteria andDItemMOQIn(List<BigDecimal> values) {
            addCriterion("dItemMOQ in", values, "dItemMOQ");
            return (Criteria) this;
        }

        public Criteria andDItemMOQNotIn(List<BigDecimal> values) {
            addCriterion("dItemMOQ not in", values, "dItemMOQ");
            return (Criteria) this;
        }

        public Criteria andDItemMOQBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dItemMOQ between", value1, value2, "dItemMOQ");
            return (Criteria) this;
        }

        public Criteria andDItemMOQNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dItemMOQ not between", value1, value2, "dItemMOQ");
            return (Criteria) this;
        }

        public Criteria andDItemLDUIsNull() {
            addCriterion("dItemLDU is null");
            return (Criteria) this;
        }

        public Criteria andDItemLDUIsNotNull() {
            addCriterion("dItemLDU is not null");
            return (Criteria) this;
        }

        public Criteria andDItemLDUEqualTo(BigDecimal value) {
            addCriterion("dItemLDU =", value, "dItemLDU");
            return (Criteria) this;
        }

        public Criteria andDItemLDUNotEqualTo(BigDecimal value) {
            addCriterion("dItemLDU <>", value, "dItemLDU");
            return (Criteria) this;
        }

        public Criteria andDItemLDUGreaterThan(BigDecimal value) {
            addCriterion("dItemLDU >", value, "dItemLDU");
            return (Criteria) this;
        }

        public Criteria andDItemLDUGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dItemLDU >=", value, "dItemLDU");
            return (Criteria) this;
        }

        public Criteria andDItemLDULessThan(BigDecimal value) {
            addCriterion("dItemLDU <", value, "dItemLDU");
            return (Criteria) this;
        }

        public Criteria andDItemLDULessThanOrEqualTo(BigDecimal value) {
            addCriterion("dItemLDU <=", value, "dItemLDU");
            return (Criteria) this;
        }

        public Criteria andDItemLDUIn(List<BigDecimal> values) {
            addCriterion("dItemLDU in", values, "dItemLDU");
            return (Criteria) this;
        }

        public Criteria andDItemLDUNotIn(List<BigDecimal> values) {
            addCriterion("dItemLDU not in", values, "dItemLDU");
            return (Criteria) this;
        }

        public Criteria andDItemLDUBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dItemLDU between", value1, value2, "dItemLDU");
            return (Criteria) this;
        }

        public Criteria andDItemLDUNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dItemLDU not between", value1, value2, "dItemLDU");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberIsNull() {
            addCriterion("lExternalItemSequenceNumber is null");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberIsNotNull() {
            addCriterion("lExternalItemSequenceNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberEqualTo(Integer value) {
            addCriterion("lExternalItemSequenceNumber =", value, "lExternalItemSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberNotEqualTo(Integer value) {
            addCriterion("lExternalItemSequenceNumber <>", value, "lExternalItemSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberGreaterThan(Integer value) {
            addCriterion("lExternalItemSequenceNumber >", value, "lExternalItemSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("lExternalItemSequenceNumber >=", value, "lExternalItemSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberLessThan(Integer value) {
            addCriterion("lExternalItemSequenceNumber <", value, "lExternalItemSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberLessThanOrEqualTo(Integer value) {
            addCriterion("lExternalItemSequenceNumber <=", value, "lExternalItemSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberIn(List<Integer> values) {
            addCriterion("lExternalItemSequenceNumber in", values, "lExternalItemSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberNotIn(List<Integer> values) {
            addCriterion("lExternalItemSequenceNumber not in", values, "lExternalItemSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberBetween(Integer value1, Integer value2) {
            addCriterion("lExternalItemSequenceNumber between", value1, value2, "lExternalItemSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLExternalItemSequenceNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("lExternalItemSequenceNumber not between", value1, value2, "lExternalItemSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserIsNull() {
            addCriterion("bConfirmedByUser is null");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserIsNotNull() {
            addCriterion("bConfirmedByUser is not null");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserEqualTo(Integer value) {
            addCriterion("bConfirmedByUser =", value, "bConfirmedByUser");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserNotEqualTo(Integer value) {
            addCriterion("bConfirmedByUser <>", value, "bConfirmedByUser");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserGreaterThan(Integer value) {
            addCriterion("bConfirmedByUser >", value, "bConfirmedByUser");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("bConfirmedByUser >=", value, "bConfirmedByUser");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserLessThan(Integer value) {
            addCriterion("bConfirmedByUser <", value, "bConfirmedByUser");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserLessThanOrEqualTo(Integer value) {
            addCriterion("bConfirmedByUser <=", value, "bConfirmedByUser");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserIn(List<Integer> values) {
            addCriterion("bConfirmedByUser in", values, "bConfirmedByUser");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserNotIn(List<Integer> values) {
            addCriterion("bConfirmedByUser not in", values, "bConfirmedByUser");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserBetween(Integer value1, Integer value2) {
            addCriterion("bConfirmedByUser between", value1, value2, "bConfirmedByUser");
            return (Criteria) this;
        }

        public Criteria andBConfirmedByUserNotBetween(Integer value1, Integer value2) {
            addCriterion("bConfirmedByUser not between", value1, value2, "bConfirmedByUser");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedIsNull() {
            addCriterion("bForecastRevised is null");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedIsNotNull() {
            addCriterion("bForecastRevised is not null");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedEqualTo(Integer value) {
            addCriterion("bForecastRevised =", value, "bForecastRevised");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedNotEqualTo(Integer value) {
            addCriterion("bForecastRevised <>", value, "bForecastRevised");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedGreaterThan(Integer value) {
            addCriterion("bForecastRevised >", value, "bForecastRevised");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedGreaterThanOrEqualTo(Integer value) {
            addCriterion("bForecastRevised >=", value, "bForecastRevised");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedLessThan(Integer value) {
            addCriterion("bForecastRevised <", value, "bForecastRevised");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedLessThanOrEqualTo(Integer value) {
            addCriterion("bForecastRevised <=", value, "bForecastRevised");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedIn(List<Integer> values) {
            addCriterion("bForecastRevised in", values, "bForecastRevised");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedNotIn(List<Integer> values) {
            addCriterion("bForecastRevised not in", values, "bForecastRevised");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedBetween(Integer value1, Integer value2) {
            addCriterion("bForecastRevised between", value1, value2, "bForecastRevised");
            return (Criteria) this;
        }

        public Criteria andBForecastRevisedNotBetween(Integer value1, Integer value2) {
            addCriterion("bForecastRevised not between", value1, value2, "bForecastRevised");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingIsNull() {
            addCriterion("lItemABCRanking is null");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingIsNotNull() {
            addCriterion("lItemABCRanking is not null");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingEqualTo(Integer value) {
            addCriterion("lItemABCRanking =", value, "lItemABCRanking");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingNotEqualTo(Integer value) {
            addCriterion("lItemABCRanking <>", value, "lItemABCRanking");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingGreaterThan(Integer value) {
            addCriterion("lItemABCRanking >", value, "lItemABCRanking");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("lItemABCRanking >=", value, "lItemABCRanking");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingLessThan(Integer value) {
            addCriterion("lItemABCRanking <", value, "lItemABCRanking");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingLessThanOrEqualTo(Integer value) {
            addCriterion("lItemABCRanking <=", value, "lItemABCRanking");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingIn(List<Integer> values) {
            addCriterion("lItemABCRanking in", values, "lItemABCRanking");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingNotIn(List<Integer> values) {
            addCriterion("lItemABCRanking not in", values, "lItemABCRanking");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingBetween(Integer value1, Integer value2) {
            addCriterion("lItemABCRanking between", value1, value2, "lItemABCRanking");
            return (Criteria) this;
        }

        public Criteria andLItemABCRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("lItemABCRanking not between", value1, value2, "lItemABCRanking");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDIsNull() {
            addCriterion("lChangedOperatorID is null");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDIsNotNull() {
            addCriterion("lChangedOperatorID is not null");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDEqualTo(Integer value) {
            addCriterion("lChangedOperatorID =", value, "lChangedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDNotEqualTo(Integer value) {
            addCriterion("lChangedOperatorID <>", value, "lChangedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDGreaterThan(Integer value) {
            addCriterion("lChangedOperatorID >", value, "lChangedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lChangedOperatorID >=", value, "lChangedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDLessThan(Integer value) {
            addCriterion("lChangedOperatorID <", value, "lChangedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDLessThanOrEqualTo(Integer value) {
            addCriterion("lChangedOperatorID <=", value, "lChangedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDIn(List<Integer> values) {
            addCriterion("lChangedOperatorID in", values, "lChangedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDNotIn(List<Integer> values) {
            addCriterion("lChangedOperatorID not in", values, "lChangedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDBetween(Integer value1, Integer value2) {
            addCriterion("lChangedOperatorID between", value1, value2, "lChangedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedOperatorIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lChangedOperatorID not between", value1, value2, "lChangedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1IsNull() {
            addCriterion("lHostInterfaceID1 is null");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1IsNotNull() {
            addCriterion("lHostInterfaceID1 is not null");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1EqualTo(Integer value) {
            addCriterion("lHostInterfaceID1 =", value, "lHostInterfaceID1");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1NotEqualTo(Integer value) {
            addCriterion("lHostInterfaceID1 <>", value, "lHostInterfaceID1");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1GreaterThan(Integer value) {
            addCriterion("lHostInterfaceID1 >", value, "lHostInterfaceID1");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1GreaterThanOrEqualTo(Integer value) {
            addCriterion("lHostInterfaceID1 >=", value, "lHostInterfaceID1");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1LessThan(Integer value) {
            addCriterion("lHostInterfaceID1 <", value, "lHostInterfaceID1");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1LessThanOrEqualTo(Integer value) {
            addCriterion("lHostInterfaceID1 <=", value, "lHostInterfaceID1");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1In(List<Integer> values) {
            addCriterion("lHostInterfaceID1 in", values, "lHostInterfaceID1");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1NotIn(List<Integer> values) {
            addCriterion("lHostInterfaceID1 not in", values, "lHostInterfaceID1");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1Between(Integer value1, Integer value2) {
            addCriterion("lHostInterfaceID1 between", value1, value2, "lHostInterfaceID1");
            return (Criteria) this;
        }

        public Criteria andLHostInterfaceID1NotBetween(Integer value1, Integer value2) {
            addCriterion("lHostInterfaceID1 not between", value1, value2, "lHostInterfaceID1");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrIsNull() {
            addCriterion("szExternalDocumentNmbr is null");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrIsNotNull() {
            addCriterion("szExternalDocumentNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrEqualTo(String value) {
            addCriterion("szExternalDocumentNmbr =", value, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrNotEqualTo(String value) {
            addCriterion("szExternalDocumentNmbr <>", value, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrGreaterThan(String value) {
            addCriterion("szExternalDocumentNmbr >", value, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrGreaterThanOrEqualTo(String value) {
            addCriterion("szExternalDocumentNmbr >=", value, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrLessThan(String value) {
            addCriterion("szExternalDocumentNmbr <", value, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrLessThanOrEqualTo(String value) {
            addCriterion("szExternalDocumentNmbr <=", value, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrLike(String value) {
            addCriterion("szExternalDocumentNmbr like", value, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrNotLike(String value) {
            addCriterion("szExternalDocumentNmbr not like", value, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrIn(List<String> values) {
            addCriterion("szExternalDocumentNmbr in", values, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrNotIn(List<String> values) {
            addCriterion("szExternalDocumentNmbr not in", values, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrBetween(String value1, String value2) {
            addCriterion("szExternalDocumentNmbr between", value1, value2, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentNmbrNotBetween(String value1, String value2) {
            addCriterion("szExternalDocumentNmbr not between", value1, value2, "szExternalDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzItemNameIsNull() {
            addCriterion("szItemName is null");
            return (Criteria) this;
        }

        public Criteria andSzItemNameIsNotNull() {
            addCriterion("szItemName is not null");
            return (Criteria) this;
        }

        public Criteria andSzItemNameEqualTo(String value) {
            addCriterion("szItemName =", value, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemNameNotEqualTo(String value) {
            addCriterion("szItemName <>", value, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemNameGreaterThan(String value) {
            addCriterion("szItemName >", value, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("szItemName >=", value, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemNameLessThan(String value) {
            addCriterion("szItemName <", value, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemNameLessThanOrEqualTo(String value) {
            addCriterion("szItemName <=", value, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemNameLike(String value) {
            addCriterion("szItemName like", value, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemNameNotLike(String value) {
            addCriterion("szItemName not like", value, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemNameIn(List<String> values) {
            addCriterion("szItemName in", values, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemNameNotIn(List<String> values) {
            addCriterion("szItemName not in", values, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemNameBetween(String value1, String value2) {
            addCriterion("szItemName between", value1, value2, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemNameNotBetween(String value1, String value2) {
            addCriterion("szItemName not between", value1, value2, "szItemName");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocIsNull() {
            addCriterion("szItemShelfLoc is null");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocIsNotNull() {
            addCriterion("szItemShelfLoc is not null");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocEqualTo(String value) {
            addCriterion("szItemShelfLoc =", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocNotEqualTo(String value) {
            addCriterion("szItemShelfLoc <>", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocGreaterThan(String value) {
            addCriterion("szItemShelfLoc >", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocGreaterThanOrEqualTo(String value) {
            addCriterion("szItemShelfLoc >=", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocLessThan(String value) {
            addCriterion("szItemShelfLoc <", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocLessThanOrEqualTo(String value) {
            addCriterion("szItemShelfLoc <=", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocLike(String value) {
            addCriterion("szItemShelfLoc like", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocNotLike(String value) {
            addCriterion("szItemShelfLoc not like", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocIn(List<String> values) {
            addCriterion("szItemShelfLoc in", values, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocNotIn(List<String> values) {
            addCriterion("szItemShelfLoc not in", values, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocBetween(String value1, String value2) {
            addCriterion("szItemShelfLoc between", value1, value2, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocNotBetween(String value1, String value2) {
            addCriterion("szItemShelfLoc not between", value1, value2, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDIsNull() {
            addCriterion("lTechLayerAccessID is null");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDIsNotNull() {
            addCriterion("lTechLayerAccessID is not null");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDEqualTo(Integer value) {
            addCriterion("lTechLayerAccessID =", value, "lTechLayerAccessID");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDNotEqualTo(Integer value) {
            addCriterion("lTechLayerAccessID <>", value, "lTechLayerAccessID");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDGreaterThan(Integer value) {
            addCriterion("lTechLayerAccessID >", value, "lTechLayerAccessID");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lTechLayerAccessID >=", value, "lTechLayerAccessID");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDLessThan(Integer value) {
            addCriterion("lTechLayerAccessID <", value, "lTechLayerAccessID");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDLessThanOrEqualTo(Integer value) {
            addCriterion("lTechLayerAccessID <=", value, "lTechLayerAccessID");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDIn(List<Integer> values) {
            addCriterion("lTechLayerAccessID in", values, "lTechLayerAccessID");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDNotIn(List<Integer> values) {
            addCriterion("lTechLayerAccessID not in", values, "lTechLayerAccessID");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDBetween(Integer value1, Integer value2) {
            addCriterion("lTechLayerAccessID between", value1, value2, "lTechLayerAccessID");
            return (Criteria) this;
        }

        public Criteria andLTechLayerAccessIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lTechLayerAccessID not between", value1, value2, "lTechLayerAccessID");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalIsNull() {
            addCriterion("szLastUpdLocal is null");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalIsNotNull() {
            addCriterion("szLastUpdLocal is not null");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalEqualTo(String value) {
            addCriterion("szLastUpdLocal =", value, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalNotEqualTo(String value) {
            addCriterion("szLastUpdLocal <>", value, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalGreaterThan(String value) {
            addCriterion("szLastUpdLocal >", value, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalGreaterThanOrEqualTo(String value) {
            addCriterion("szLastUpdLocal >=", value, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalLessThan(String value) {
            addCriterion("szLastUpdLocal <", value, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalLessThanOrEqualTo(String value) {
            addCriterion("szLastUpdLocal <=", value, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalLike(String value) {
            addCriterion("szLastUpdLocal like", value, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalNotLike(String value) {
            addCriterion("szLastUpdLocal not like", value, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalIn(List<String> values) {
            addCriterion("szLastUpdLocal in", values, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalNotIn(List<String> values) {
            addCriterion("szLastUpdLocal not in", values, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalBetween(String value1, String value2) {
            addCriterion("szLastUpdLocal between", value1, value2, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andSzLastUpdLocalNotBetween(String value1, String value2) {
            addCriterion("szLastUpdLocal not between", value1, value2, "szLastUpdLocal");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailIsNull() {
            addCriterion("dUnitRetail is null");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailIsNotNull() {
            addCriterion("dUnitRetail is not null");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailEqualTo(BigDecimal value) {
            addCriterion("dUnitRetail =", value, "dUnitRetail");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailNotEqualTo(BigDecimal value) {
            addCriterion("dUnitRetail <>", value, "dUnitRetail");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailGreaterThan(BigDecimal value) {
            addCriterion("dUnitRetail >", value, "dUnitRetail");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dUnitRetail >=", value, "dUnitRetail");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailLessThan(BigDecimal value) {
            addCriterion("dUnitRetail <", value, "dUnitRetail");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dUnitRetail <=", value, "dUnitRetail");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailIn(List<BigDecimal> values) {
            addCriterion("dUnitRetail in", values, "dUnitRetail");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailNotIn(List<BigDecimal> values) {
            addCriterion("dUnitRetail not in", values, "dUnitRetail");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dUnitRetail between", value1, value2, "dUnitRetail");
            return (Criteria) this;
        }

        public Criteria andDUnitRetailNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dUnitRetail not between", value1, value2, "dUnitRetail");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrIsNull() {
            addCriterion("szGondolaNmbr is null");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrIsNotNull() {
            addCriterion("szGondolaNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrEqualTo(String value) {
            addCriterion("szGondolaNmbr =", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrNotEqualTo(String value) {
            addCriterion("szGondolaNmbr <>", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrGreaterThan(String value) {
            addCriterion("szGondolaNmbr >", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrGreaterThanOrEqualTo(String value) {
            addCriterion("szGondolaNmbr >=", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrLessThan(String value) {
            addCriterion("szGondolaNmbr <", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrLessThanOrEqualTo(String value) {
            addCriterion("szGondolaNmbr <=", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrLike(String value) {
            addCriterion("szGondolaNmbr like", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrNotLike(String value) {
            addCriterion("szGondolaNmbr not like", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrIn(List<String> values) {
            addCriterion("szGondolaNmbr in", values, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrNotIn(List<String> values) {
            addCriterion("szGondolaNmbr not in", values, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrBetween(String value1, String value2) {
            addCriterion("szGondolaNmbr between", value1, value2, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrNotBetween(String value1, String value2) {
            addCriterion("szGondolaNmbr not between", value1, value2, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrIsNull() {
            addCriterion("lShelfNmbr is null");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrIsNotNull() {
            addCriterion("lShelfNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrEqualTo(Integer value) {
            addCriterion("lShelfNmbr =", value, "lShelfNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrNotEqualTo(Integer value) {
            addCriterion("lShelfNmbr <>", value, "lShelfNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrGreaterThan(Integer value) {
            addCriterion("lShelfNmbr >", value, "lShelfNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrGreaterThanOrEqualTo(Integer value) {
            addCriterion("lShelfNmbr >=", value, "lShelfNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrLessThan(Integer value) {
            addCriterion("lShelfNmbr <", value, "lShelfNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrLessThanOrEqualTo(Integer value) {
            addCriterion("lShelfNmbr <=", value, "lShelfNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrIn(List<Integer> values) {
            addCriterion("lShelfNmbr in", values, "lShelfNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrNotIn(List<Integer> values) {
            addCriterion("lShelfNmbr not in", values, "lShelfNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrBetween(Integer value1, Integer value2) {
            addCriterion("lShelfNmbr between", value1, value2, "lShelfNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfNmbrNotBetween(Integer value1, Integer value2) {
            addCriterion("lShelfNmbr not between", value1, value2, "lShelfNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrIsNull() {
            addCriterion("lShelfSeqNmbr is null");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrIsNotNull() {
            addCriterion("lShelfSeqNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrEqualTo(Integer value) {
            addCriterion("lShelfSeqNmbr =", value, "lShelfSeqNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrNotEqualTo(Integer value) {
            addCriterion("lShelfSeqNmbr <>", value, "lShelfSeqNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrGreaterThan(Integer value) {
            addCriterion("lShelfSeqNmbr >", value, "lShelfSeqNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrGreaterThanOrEqualTo(Integer value) {
            addCriterion("lShelfSeqNmbr >=", value, "lShelfSeqNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrLessThan(Integer value) {
            addCriterion("lShelfSeqNmbr <", value, "lShelfSeqNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrLessThanOrEqualTo(Integer value) {
            addCriterion("lShelfSeqNmbr <=", value, "lShelfSeqNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrIn(List<Integer> values) {
            addCriterion("lShelfSeqNmbr in", values, "lShelfSeqNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrNotIn(List<Integer> values) {
            addCriterion("lShelfSeqNmbr not in", values, "lShelfSeqNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrBetween(Integer value1, Integer value2) {
            addCriterion("lShelfSeqNmbr between", value1, value2, "lShelfSeqNmbr");
            return (Criteria) this;
        }

        public Criteria andLShelfSeqNmbrNotBetween(Integer value1, Integer value2) {
            addCriterion("lShelfSeqNmbr not between", value1, value2, "lShelfSeqNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryIsNull() {
            addCriterion("szSubCategory is null");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryIsNotNull() {
            addCriterion("szSubCategory is not null");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryEqualTo(String value) {
            addCriterion("szSubCategory =", value, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryNotEqualTo(String value) {
            addCriterion("szSubCategory <>", value, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryGreaterThan(String value) {
            addCriterion("szSubCategory >", value, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("szSubCategory >=", value, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryLessThan(String value) {
            addCriterion("szSubCategory <", value, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryLessThanOrEqualTo(String value) {
            addCriterion("szSubCategory <=", value, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryLike(String value) {
            addCriterion("szSubCategory like", value, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryNotLike(String value) {
            addCriterion("szSubCategory not like", value, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryIn(List<String> values) {
            addCriterion("szSubCategory in", values, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryNotIn(List<String> values) {
            addCriterion("szSubCategory not in", values, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryBetween(String value1, String value2) {
            addCriterion("szSubCategory between", value1, value2, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andSzSubCategoryNotBetween(String value1, String value2) {
            addCriterion("szSubCategory not between", value1, value2, "szSubCategory");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDUIsNull() {
            addCriterion("dOriginalSOQPerLDU is null");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDUIsNotNull() {
            addCriterion("dOriginalSOQPerLDU is not null");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDUEqualTo(BigDecimal value) {
            addCriterion("dOriginalSOQPerLDU =", value, "dOriginalSOQPerLDU");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDUNotEqualTo(BigDecimal value) {
            addCriterion("dOriginalSOQPerLDU <>", value, "dOriginalSOQPerLDU");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDUGreaterThan(BigDecimal value) {
            addCriterion("dOriginalSOQPerLDU >", value, "dOriginalSOQPerLDU");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDUGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dOriginalSOQPerLDU >=", value, "dOriginalSOQPerLDU");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDULessThan(BigDecimal value) {
            addCriterion("dOriginalSOQPerLDU <", value, "dOriginalSOQPerLDU");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDULessThanOrEqualTo(BigDecimal value) {
            addCriterion("dOriginalSOQPerLDU <=", value, "dOriginalSOQPerLDU");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDUIn(List<BigDecimal> values) {
            addCriterion("dOriginalSOQPerLDU in", values, "dOriginalSOQPerLDU");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDUNotIn(List<BigDecimal> values) {
            addCriterion("dOriginalSOQPerLDU not in", values, "dOriginalSOQPerLDU");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDUBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dOriginalSOQPerLDU between", value1, value2, "dOriginalSOQPerLDU");
            return (Criteria) this;
        }

        public Criteria andDOriginalSOQPerLDUNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dOriginalSOQPerLDU not between", value1, value2, "dOriginalSOQPerLDU");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusIsNull() {
            addCriterion("szUploadFTPStatus is null");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusIsNotNull() {
            addCriterion("szUploadFTPStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusEqualTo(String value) {
            addCriterion("szUploadFTPStatus =", value, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusNotEqualTo(String value) {
            addCriterion("szUploadFTPStatus <>", value, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusGreaterThan(String value) {
            addCriterion("szUploadFTPStatus >", value, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusGreaterThanOrEqualTo(String value) {
            addCriterion("szUploadFTPStatus >=", value, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusLessThan(String value) {
            addCriterion("szUploadFTPStatus <", value, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusLessThanOrEqualTo(String value) {
            addCriterion("szUploadFTPStatus <=", value, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusLike(String value) {
            addCriterion("szUploadFTPStatus like", value, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusNotLike(String value) {
            addCriterion("szUploadFTPStatus not like", value, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusIn(List<String> values) {
            addCriterion("szUploadFTPStatus in", values, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusNotIn(List<String> values) {
            addCriterion("szUploadFTPStatus not in", values, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusBetween(String value1, String value2) {
            addCriterion("szUploadFTPStatus between", value1, value2, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzUploadFTPStatusNotBetween(String value1, String value2) {
            addCriterion("szUploadFTPStatus not between", value1, value2, "szUploadFTPStatus");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorIsNull() {
            addCriterion("szABCIndicator is null");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorIsNotNull() {
            addCriterion("szABCIndicator is not null");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorEqualTo(String value) {
            addCriterion("szABCIndicator =", value, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorNotEqualTo(String value) {
            addCriterion("szABCIndicator <>", value, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorGreaterThan(String value) {
            addCriterion("szABCIndicator >", value, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorGreaterThanOrEqualTo(String value) {
            addCriterion("szABCIndicator >=", value, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorLessThan(String value) {
            addCriterion("szABCIndicator <", value, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorLessThanOrEqualTo(String value) {
            addCriterion("szABCIndicator <=", value, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorLike(String value) {
            addCriterion("szABCIndicator like", value, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorNotLike(String value) {
            addCriterion("szABCIndicator not like", value, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorIn(List<String> values) {
            addCriterion("szABCIndicator in", values, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorNotIn(List<String> values) {
            addCriterion("szABCIndicator not in", values, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorBetween(String value1, String value2) {
            addCriterion("szABCIndicator between", value1, value2, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorNotBetween(String value1, String value2) {
            addCriterion("szABCIndicator not between", value1, value2, "szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseIsNull() {
            addCriterion("bZeroRise is null");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseIsNotNull() {
            addCriterion("bZeroRise is not null");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseEqualTo(Integer value) {
            addCriterion("bZeroRise =", value, "bZeroRise");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseNotEqualTo(Integer value) {
            addCriterion("bZeroRise <>", value, "bZeroRise");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseGreaterThan(Integer value) {
            addCriterion("bZeroRise >", value, "bZeroRise");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("bZeroRise >=", value, "bZeroRise");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseLessThan(Integer value) {
            addCriterion("bZeroRise <", value, "bZeroRise");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseLessThanOrEqualTo(Integer value) {
            addCriterion("bZeroRise <=", value, "bZeroRise");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseIn(List<Integer> values) {
            addCriterion("bZeroRise in", values, "bZeroRise");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseNotIn(List<Integer> values) {
            addCriterion("bZeroRise not in", values, "bZeroRise");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseBetween(Integer value1, Integer value2) {
            addCriterion("bZeroRise between", value1, value2, "bZeroRise");
            return (Criteria) this;
        }

        public Criteria andBZeroRiseNotBetween(Integer value1, Integer value2) {
            addCriterion("bZeroRise not between", value1, value2, "bZeroRise");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionIsNull() {
            addCriterion("dTestDescription is null");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionIsNotNull() {
            addCriterion("dTestDescription is not null");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionEqualTo(String value) {
            addCriterion("dTestDescription =", value, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionNotEqualTo(String value) {
            addCriterion("dTestDescription <>", value, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionGreaterThan(String value) {
            addCriterion("dTestDescription >", value, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("dTestDescription >=", value, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionLessThan(String value) {
            addCriterion("dTestDescription <", value, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionLessThanOrEqualTo(String value) {
            addCriterion("dTestDescription <=", value, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionLike(String value) {
            addCriterion("dTestDescription like", value, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionNotLike(String value) {
            addCriterion("dTestDescription not like", value, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionIn(List<String> values) {
            addCriterion("dTestDescription in", values, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionNotIn(List<String> values) {
            addCriterion("dTestDescription not in", values, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionBetween(String value1, String value2) {
            addCriterion("dTestDescription between", value1, value2, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andDTestDescriptionNotBetween(String value1, String value2) {
            addCriterion("dTestDescription not between", value1, value2, "dTestDescription");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrIsNull() {
            addCriterion("szSerialNmbr is null");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrIsNotNull() {
            addCriterion("szSerialNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrEqualTo(String value) {
            addCriterion("szSerialNmbr =", value, "szSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrNotEqualTo(String value) {
            addCriterion("szSerialNmbr <>", value, "szSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrGreaterThan(String value) {
            addCriterion("szSerialNmbr >", value, "szSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrGreaterThanOrEqualTo(String value) {
            addCriterion("szSerialNmbr >=", value, "szSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrLessThan(String value) {
            addCriterion("szSerialNmbr <", value, "szSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrLessThanOrEqualTo(String value) {
            addCriterion("szSerialNmbr <=", value, "szSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrLike(String value) {
            addCriterion("szSerialNmbr like", value, "szSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrNotLike(String value) {
            addCriterion("szSerialNmbr not like", value, "szSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrIn(List<String> values) {
            addCriterion("szSerialNmbr in", values, "szSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrNotIn(List<String> values) {
            addCriterion("szSerialNmbr not in", values, "szSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrBetween(String value1, String value2) {
            addCriterion("szSerialNmbr between", value1, value2, "szSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSerialNmbrNotBetween(String value1, String value2) {
            addCriterion("szSerialNmbr not between", value1, value2, "szSerialNmbr");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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