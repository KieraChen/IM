package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OperatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperatorExample() {
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

        public Criteria andLOperatorIDIsNull() {
            addCriterion("lOperatorID is null");
            return (Criteria) this;
        }

        public Criteria andLOperatorIDIsNotNull() {
            addCriterion("lOperatorID is not null");
            return (Criteria) this;
        }

        public Criteria andLOperatorIDEqualTo(Integer value) {
            addCriterion("lOperatorID =", value, "lOperatorID");
            return (Criteria) this;
        }

        public Criteria andLOperatorIDNotEqualTo(Integer value) {
            addCriterion("lOperatorID <>", value, "lOperatorID");
            return (Criteria) this;
        }

        public Criteria andLOperatorIDGreaterThan(Integer value) {
            addCriterion("lOperatorID >", value, "lOperatorID");
            return (Criteria) this;
        }

        public Criteria andLOperatorIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lOperatorID >=", value, "lOperatorID");
            return (Criteria) this;
        }

        public Criteria andLOperatorIDLessThan(Integer value) {
            addCriterion("lOperatorID <", value, "lOperatorID");
            return (Criteria) this;
        }

        public Criteria andLOperatorIDLessThanOrEqualTo(Integer value) {
            addCriterion("lOperatorID <=", value, "lOperatorID");
            return (Criteria) this;
        }

        public Criteria andLOperatorIDIn(List<Integer> values) {
            addCriterion("lOperatorID in", values, "lOperatorID");
            return (Criteria) this;
        }

        public Criteria andLOperatorIDNotIn(List<Integer> values) {
            addCriterion("lOperatorID not in", values, "lOperatorID");
            return (Criteria) this;
        }

        public Criteria andLOperatorIDBetween(Integer value1, Integer value2) {
            addCriterion("lOperatorID between", value1, value2, "lOperatorID");
            return (Criteria) this;
        }

        public Criteria andLOperatorIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lOperatorID not between", value1, value2, "lOperatorID");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDIsNull() {
            addCriterion("lEmployeeID is null");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDIsNotNull() {
            addCriterion("lEmployeeID is not null");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDEqualTo(Integer value) {
            addCriterion("lEmployeeID =", value, "lEmployeeID");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDNotEqualTo(Integer value) {
            addCriterion("lEmployeeID <>", value, "lEmployeeID");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDGreaterThan(Integer value) {
            addCriterion("lEmployeeID >", value, "lEmployeeID");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lEmployeeID >=", value, "lEmployeeID");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDLessThan(Integer value) {
            addCriterion("lEmployeeID <", value, "lEmployeeID");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDLessThanOrEqualTo(Integer value) {
            addCriterion("lEmployeeID <=", value, "lEmployeeID");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDIn(List<Integer> values) {
            addCriterion("lEmployeeID in", values, "lEmployeeID");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDNotIn(List<Integer> values) {
            addCriterion("lEmployeeID not in", values, "lEmployeeID");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDBetween(Integer value1, Integer value2) {
            addCriterion("lEmployeeID between", value1, value2, "lEmployeeID");
            return (Criteria) this;
        }

        public Criteria andLEmployeeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lEmployeeID not between", value1, value2, "lEmployeeID");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameIsNull() {
            addCriterion("szSignOnName is null");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameIsNotNull() {
            addCriterion("szSignOnName is not null");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameEqualTo(String value) {
            addCriterion("szSignOnName =", value, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameNotEqualTo(String value) {
            addCriterion("szSignOnName <>", value, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameGreaterThan(String value) {
            addCriterion("szSignOnName >", value, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameGreaterThanOrEqualTo(String value) {
            addCriterion("szSignOnName >=", value, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameLessThan(String value) {
            addCriterion("szSignOnName <", value, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameLessThanOrEqualTo(String value) {
            addCriterion("szSignOnName <=", value, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameLike(String value) {
            addCriterion("szSignOnName like", value, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameNotLike(String value) {
            addCriterion("szSignOnName not like", value, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameIn(List<String> values) {
            addCriterion("szSignOnName in", values, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameNotIn(List<String> values) {
            addCriterion("szSignOnName not in", values, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameBetween(String value1, String value2) {
            addCriterion("szSignOnName between", value1, value2, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnNameNotBetween(String value1, String value2) {
            addCriterion("szSignOnName not between", value1, value2, "szSignOnName");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordIsNull() {
            addCriterion("szSignOnPassword is null");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordIsNotNull() {
            addCriterion("szSignOnPassword is not null");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordEqualTo(String value) {
            addCriterion("szSignOnPassword =", value, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordNotEqualTo(String value) {
            addCriterion("szSignOnPassword <>", value, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordGreaterThan(String value) {
            addCriterion("szSignOnPassword >", value, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("szSignOnPassword >=", value, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordLessThan(String value) {
            addCriterion("szSignOnPassword <", value, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordLessThanOrEqualTo(String value) {
            addCriterion("szSignOnPassword <=", value, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordLike(String value) {
            addCriterion("szSignOnPassword like", value, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordNotLike(String value) {
            addCriterion("szSignOnPassword not like", value, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordIn(List<String> values) {
            addCriterion("szSignOnPassword in", values, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordNotIn(List<String> values) {
            addCriterion("szSignOnPassword not in", values, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordBetween(String value1, String value2) {
            addCriterion("szSignOnPassword between", value1, value2, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzSignOnPasswordNotBetween(String value1, String value2) {
            addCriterion("szSignOnPassword not between", value1, value2, "szSignOnPassword");
            return (Criteria) this;
        }

        public Criteria andSzPowerIsNull() {
            addCriterion("szPower is null");
            return (Criteria) this;
        }

        public Criteria andSzPowerIsNotNull() {
            addCriterion("szPower is not null");
            return (Criteria) this;
        }

        public Criteria andSzPowerEqualTo(Integer value) {
            addCriterion("szPower =", value, "szPower");
            return (Criteria) this;
        }

        public Criteria andSzPowerNotEqualTo(Integer value) {
            addCriterion("szPower <>", value, "szPower");
            return (Criteria) this;
        }

        public Criteria andSzPowerGreaterThan(Integer value) {
            addCriterion("szPower >", value, "szPower");
            return (Criteria) this;
        }

        public Criteria andSzPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("szPower >=", value, "szPower");
            return (Criteria) this;
        }

        public Criteria andSzPowerLessThan(Integer value) {
            addCriterion("szPower <", value, "szPower");
            return (Criteria) this;
        }

        public Criteria andSzPowerLessThanOrEqualTo(Integer value) {
            addCriterion("szPower <=", value, "szPower");
            return (Criteria) this;
        }

        public Criteria andSzPowerIn(List<Integer> values) {
            addCriterion("szPower in", values, "szPower");
            return (Criteria) this;
        }

        public Criteria andSzPowerNotIn(List<Integer> values) {
            addCriterion("szPower not in", values, "szPower");
            return (Criteria) this;
        }

        public Criteria andSzPowerBetween(Integer value1, Integer value2) {
            addCriterion("szPower between", value1, value2, "szPower");
            return (Criteria) this;
        }

        public Criteria andSzPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("szPower not between", value1, value2, "szPower");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateIsNull() {
            addCriterion("szEffectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateIsNotNull() {
            addCriterion("szEffectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateEqualTo(String value) {
            addCriterion("szEffectiveDate =", value, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateNotEqualTo(String value) {
            addCriterion("szEffectiveDate <>", value, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateGreaterThan(String value) {
            addCriterion("szEffectiveDate >", value, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateGreaterThanOrEqualTo(String value) {
            addCriterion("szEffectiveDate >=", value, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateLessThan(String value) {
            addCriterion("szEffectiveDate <", value, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateLessThanOrEqualTo(String value) {
            addCriterion("szEffectiveDate <=", value, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateLike(String value) {
            addCriterion("szEffectiveDate like", value, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateNotLike(String value) {
            addCriterion("szEffectiveDate not like", value, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateIn(List<String> values) {
            addCriterion("szEffectiveDate in", values, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateNotIn(List<String> values) {
            addCriterion("szEffectiveDate not in", values, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateBetween(String value1, String value2) {
            addCriterion("szEffectiveDate between", value1, value2, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzEffectiveDateNotBetween(String value1, String value2) {
            addCriterion("szEffectiveDate not between", value1, value2, "szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateIsNull() {
            addCriterion("szExpirationDate is null");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateIsNotNull() {
            addCriterion("szExpirationDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateEqualTo(String value) {
            addCriterion("szExpirationDate =", value, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateNotEqualTo(String value) {
            addCriterion("szExpirationDate <>", value, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateGreaterThan(String value) {
            addCriterion("szExpirationDate >", value, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateGreaterThanOrEqualTo(String value) {
            addCriterion("szExpirationDate >=", value, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateLessThan(String value) {
            addCriterion("szExpirationDate <", value, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateLessThanOrEqualTo(String value) {
            addCriterion("szExpirationDate <=", value, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateLike(String value) {
            addCriterion("szExpirationDate like", value, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateNotLike(String value) {
            addCriterion("szExpirationDate not like", value, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateIn(List<String> values) {
            addCriterion("szExpirationDate in", values, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateNotIn(List<String> values) {
            addCriterion("szExpirationDate not in", values, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateBetween(String value1, String value2) {
            addCriterion("szExpirationDate between", value1, value2, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzExpirationDateNotBetween(String value1, String value2) {
            addCriterion("szExpirationDate not between", value1, value2, "szExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateIsNull() {
            addCriterion("szPasswordEffectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateIsNotNull() {
            addCriterion("szPasswordEffectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateEqualTo(String value) {
            addCriterion("szPasswordEffectiveDate =", value, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateNotEqualTo(String value) {
            addCriterion("szPasswordEffectiveDate <>", value, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateGreaterThan(String value) {
            addCriterion("szPasswordEffectiveDate >", value, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateGreaterThanOrEqualTo(String value) {
            addCriterion("szPasswordEffectiveDate >=", value, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateLessThan(String value) {
            addCriterion("szPasswordEffectiveDate <", value, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateLessThanOrEqualTo(String value) {
            addCriterion("szPasswordEffectiveDate <=", value, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateLike(String value) {
            addCriterion("szPasswordEffectiveDate like", value, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateNotLike(String value) {
            addCriterion("szPasswordEffectiveDate not like", value, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateIn(List<String> values) {
            addCriterion("szPasswordEffectiveDate in", values, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateNotIn(List<String> values) {
            addCriterion("szPasswordEffectiveDate not in", values, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateBetween(String value1, String value2) {
            addCriterion("szPasswordEffectiveDate between", value1, value2, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordEffectiveDateNotBetween(String value1, String value2) {
            addCriterion("szPasswordEffectiveDate not between", value1, value2, "szPasswordEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateIsNull() {
            addCriterion("szPasswordExpirationDate is null");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateIsNotNull() {
            addCriterion("szPasswordExpirationDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateEqualTo(String value) {
            addCriterion("szPasswordExpirationDate =", value, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateNotEqualTo(String value) {
            addCriterion("szPasswordExpirationDate <>", value, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateGreaterThan(String value) {
            addCriterion("szPasswordExpirationDate >", value, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateGreaterThanOrEqualTo(String value) {
            addCriterion("szPasswordExpirationDate >=", value, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateLessThan(String value) {
            addCriterion("szPasswordExpirationDate <", value, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateLessThanOrEqualTo(String value) {
            addCriterion("szPasswordExpirationDate <=", value, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateLike(String value) {
            addCriterion("szPasswordExpirationDate like", value, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateNotLike(String value) {
            addCriterion("szPasswordExpirationDate not like", value, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateIn(List<String> values) {
            addCriterion("szPasswordExpirationDate in", values, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateNotIn(List<String> values) {
            addCriterion("szPasswordExpirationDate not in", values, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateBetween(String value1, String value2) {
            addCriterion("szPasswordExpirationDate between", value1, value2, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationDateNotBetween(String value1, String value2) {
            addCriterion("szPasswordExpirationDate not between", value1, value2, "szPasswordExpirationDate");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeIsNull() {
            addCriterion("szPasswordExpirationRange is null");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeIsNotNull() {
            addCriterion("szPasswordExpirationRange is not null");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeEqualTo(Integer value) {
            addCriterion("szPasswordExpirationRange =", value, "szPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeNotEqualTo(Integer value) {
            addCriterion("szPasswordExpirationRange <>", value, "szPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeGreaterThan(Integer value) {
            addCriterion("szPasswordExpirationRange >", value, "szPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("szPasswordExpirationRange >=", value, "szPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeLessThan(Integer value) {
            addCriterion("szPasswordExpirationRange <", value, "szPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeLessThanOrEqualTo(Integer value) {
            addCriterion("szPasswordExpirationRange <=", value, "szPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeIn(List<Integer> values) {
            addCriterion("szPasswordExpirationRange in", values, "szPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeNotIn(List<Integer> values) {
            addCriterion("szPasswordExpirationRange not in", values, "szPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeBetween(Integer value1, Integer value2) {
            addCriterion("szPasswordExpirationRange between", value1, value2, "szPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andSzPasswordExpirationRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("szPasswordExpirationRange not between", value1, value2, "szPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeIsNull() {
            addCriterion("lPasswordExpirationRange is null");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeIsNotNull() {
            addCriterion("lPasswordExpirationRange is not null");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeEqualTo(Integer value) {
            addCriterion("lPasswordExpirationRange =", value, "lPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeNotEqualTo(Integer value) {
            addCriterion("lPasswordExpirationRange <>", value, "lPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeGreaterThan(Integer value) {
            addCriterion("lPasswordExpirationRange >", value, "lPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lPasswordExpirationRange >=", value, "lPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeLessThan(Integer value) {
            addCriterion("lPasswordExpirationRange <", value, "lPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeLessThanOrEqualTo(Integer value) {
            addCriterion("lPasswordExpirationRange <=", value, "lPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeIn(List<Integer> values) {
            addCriterion("lPasswordExpirationRange in", values, "lPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeNotIn(List<Integer> values) {
            addCriterion("lPasswordExpirationRange not in", values, "lPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeBetween(Integer value1, Integer value2) {
            addCriterion("lPasswordExpirationRange between", value1, value2, "lPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andLPasswordExpirationRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("lPasswordExpirationRange not between", value1, value2, "lPasswordExpirationRange");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagIsNull() {
            addCriterion("bPasswordResetFlag is null");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagIsNotNull() {
            addCriterion("bPasswordResetFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagEqualTo(Short value) {
            addCriterion("bPasswordResetFlag =", value, "bPasswordResetFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagNotEqualTo(Short value) {
            addCriterion("bPasswordResetFlag <>", value, "bPasswordResetFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagGreaterThan(Short value) {
            addCriterion("bPasswordResetFlag >", value, "bPasswordResetFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bPasswordResetFlag >=", value, "bPasswordResetFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagLessThan(Short value) {
            addCriterion("bPasswordResetFlag <", value, "bPasswordResetFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagLessThanOrEqualTo(Short value) {
            addCriterion("bPasswordResetFlag <=", value, "bPasswordResetFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagIn(List<Short> values) {
            addCriterion("bPasswordResetFlag in", values, "bPasswordResetFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagNotIn(List<Short> values) {
            addCriterion("bPasswordResetFlag not in", values, "bPasswordResetFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagBetween(Short value1, Short value2) {
            addCriterion("bPasswordResetFlag between", value1, value2, "bPasswordResetFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordResetFlagNotBetween(Short value1, Short value2) {
            addCriterion("bPasswordResetFlag not between", value1, value2, "bPasswordResetFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagIsNull() {
            addCriterion("bPasswordChangeFlag is null");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagIsNotNull() {
            addCriterion("bPasswordChangeFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagEqualTo(Short value) {
            addCriterion("bPasswordChangeFlag =", value, "bPasswordChangeFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagNotEqualTo(Short value) {
            addCriterion("bPasswordChangeFlag <>", value, "bPasswordChangeFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagGreaterThan(Short value) {
            addCriterion("bPasswordChangeFlag >", value, "bPasswordChangeFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bPasswordChangeFlag >=", value, "bPasswordChangeFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagLessThan(Short value) {
            addCriterion("bPasswordChangeFlag <", value, "bPasswordChangeFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagLessThanOrEqualTo(Short value) {
            addCriterion("bPasswordChangeFlag <=", value, "bPasswordChangeFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagIn(List<Short> values) {
            addCriterion("bPasswordChangeFlag in", values, "bPasswordChangeFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagNotIn(List<Short> values) {
            addCriterion("bPasswordChangeFlag not in", values, "bPasswordChangeFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagBetween(Short value1, Short value2) {
            addCriterion("bPasswordChangeFlag between", value1, value2, "bPasswordChangeFlag");
            return (Criteria) this;
        }

        public Criteria andBPasswordChangeFlagNotBetween(Short value1, Short value2) {
            addCriterion("bPasswordChangeFlag not between", value1, value2, "bPasswordChangeFlag");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountIsNull() {
            addCriterion("lPasswordEntryErrorCount is null");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountIsNotNull() {
            addCriterion("lPasswordEntryErrorCount is not null");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountEqualTo(Integer value) {
            addCriterion("lPasswordEntryErrorCount =", value, "lPasswordEntryErrorCount");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountNotEqualTo(Integer value) {
            addCriterion("lPasswordEntryErrorCount <>", value, "lPasswordEntryErrorCount");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountGreaterThan(Integer value) {
            addCriterion("lPasswordEntryErrorCount >", value, "lPasswordEntryErrorCount");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lPasswordEntryErrorCount >=", value, "lPasswordEntryErrorCount");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountLessThan(Integer value) {
            addCriterion("lPasswordEntryErrorCount <", value, "lPasswordEntryErrorCount");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountLessThanOrEqualTo(Integer value) {
            addCriterion("lPasswordEntryErrorCount <=", value, "lPasswordEntryErrorCount");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountIn(List<Integer> values) {
            addCriterion("lPasswordEntryErrorCount in", values, "lPasswordEntryErrorCount");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountNotIn(List<Integer> values) {
            addCriterion("lPasswordEntryErrorCount not in", values, "lPasswordEntryErrorCount");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountBetween(Integer value1, Integer value2) {
            addCriterion("lPasswordEntryErrorCount between", value1, value2, "lPasswordEntryErrorCount");
            return (Criteria) this;
        }

        public Criteria andLPasswordEntryErrorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("lPasswordEntryErrorCount not between", value1, value2, "lPasswordEntryErrorCount");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagIsNull() {
            addCriterion("bLeftHandedFlag is null");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagIsNotNull() {
            addCriterion("bLeftHandedFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagEqualTo(Short value) {
            addCriterion("bLeftHandedFlag =", value, "bLeftHandedFlag");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagNotEqualTo(Short value) {
            addCriterion("bLeftHandedFlag <>", value, "bLeftHandedFlag");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagGreaterThan(Short value) {
            addCriterion("bLeftHandedFlag >", value, "bLeftHandedFlag");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bLeftHandedFlag >=", value, "bLeftHandedFlag");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagLessThan(Short value) {
            addCriterion("bLeftHandedFlag <", value, "bLeftHandedFlag");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagLessThanOrEqualTo(Short value) {
            addCriterion("bLeftHandedFlag <=", value, "bLeftHandedFlag");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagIn(List<Short> values) {
            addCriterion("bLeftHandedFlag in", values, "bLeftHandedFlag");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagNotIn(List<Short> values) {
            addCriterion("bLeftHandedFlag not in", values, "bLeftHandedFlag");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagBetween(Short value1, Short value2) {
            addCriterion("bLeftHandedFlag between", value1, value2, "bLeftHandedFlag");
            return (Criteria) this;
        }

        public Criteria andBLeftHandedFlagNotBetween(Short value1, Short value2) {
            addCriterion("bLeftHandedFlag not between", value1, value2, "bLeftHandedFlag");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDIsNull() {
            addCriterion("szExternalID is null");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDIsNotNull() {
            addCriterion("szExternalID is not null");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDEqualTo(String value) {
            addCriterion("szExternalID =", value, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDNotEqualTo(String value) {
            addCriterion("szExternalID <>", value, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDGreaterThan(String value) {
            addCriterion("szExternalID >", value, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDGreaterThanOrEqualTo(String value) {
            addCriterion("szExternalID >=", value, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDLessThan(String value) {
            addCriterion("szExternalID <", value, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDLessThanOrEqualTo(String value) {
            addCriterion("szExternalID <=", value, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDLike(String value) {
            addCriterion("szExternalID like", value, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDNotLike(String value) {
            addCriterion("szExternalID not like", value, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDIn(List<String> values) {
            addCriterion("szExternalID in", values, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDNotIn(List<String> values) {
            addCriterion("szExternalID not in", values, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDBetween(String value1, String value2) {
            addCriterion("szExternalID between", value1, value2, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzExternalIDNotBetween(String value1, String value2) {
            addCriterion("szExternalID not between", value1, value2, "szExternalID");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeIsNull() {
            addCriterion("szPrintCode is null");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeIsNotNull() {
            addCriterion("szPrintCode is not null");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeEqualTo(String value) {
            addCriterion("szPrintCode =", value, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeNotEqualTo(String value) {
            addCriterion("szPrintCode <>", value, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeGreaterThan(String value) {
            addCriterion("szPrintCode >", value, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeGreaterThanOrEqualTo(String value) {
            addCriterion("szPrintCode >=", value, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeLessThan(String value) {
            addCriterion("szPrintCode <", value, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeLessThanOrEqualTo(String value) {
            addCriterion("szPrintCode <=", value, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeLike(String value) {
            addCriterion("szPrintCode like", value, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeNotLike(String value) {
            addCriterion("szPrintCode not like", value, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeIn(List<String> values) {
            addCriterion("szPrintCode in", values, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeNotIn(List<String> values) {
            addCriterion("szPrintCode not in", values, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeBetween(String value1, String value2) {
            addCriterion("szPrintCode between", value1, value2, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzPrintCodeNotBetween(String value1, String value2) {
            addCriterion("szPrintCode not between", value1, value2, "szPrintCode");
            return (Criteria) this;
        }

        public Criteria andSzCommentIsNull() {
            addCriterion("szComment is null");
            return (Criteria) this;
        }

        public Criteria andSzCommentIsNotNull() {
            addCriterion("szComment is not null");
            return (Criteria) this;
        }

        public Criteria andSzCommentEqualTo(String value) {
            addCriterion("szComment =", value, "szComment");
            return (Criteria) this;
        }

        public Criteria andSzCommentNotEqualTo(String value) {
            addCriterion("szComment <>", value, "szComment");
            return (Criteria) this;
        }

        public Criteria andSzCommentGreaterThan(String value) {
            addCriterion("szComment >", value, "szComment");
            return (Criteria) this;
        }

        public Criteria andSzCommentGreaterThanOrEqualTo(String value) {
            addCriterion("szComment >=", value, "szComment");
            return (Criteria) this;
        }

        public Criteria andSzCommentLessThan(String value) {
            addCriterion("szComment <", value, "szComment");
            return (Criteria) this;
        }

        public Criteria andSzCommentLessThanOrEqualTo(String value) {
            addCriterion("szComment <=", value, "szComment");
            return (Criteria) this;
        }

        public Criteria andSzCommentLike(String value) {
            addCriterion("szComment like", value, "szComment");
            return (Criteria) this;
        }

        public Criteria andSzCommentNotLike(String value) {
            addCriterion("szComment not like", value, "szComment");
            return (Criteria) this;
        }

        public Criteria andSzCommentIn(List<String> values) {
            addCriterion("szComment in", values, "szComment");
            return (Criteria) this;
        }

        public Criteria andSzCommentNotIn(List<String> values) {
            addCriterion("szComment not in", values, "szComment");
            return (Criteria) this;
        }

        public Criteria andSzCommentBetween(String value1, String value2) {
            addCriterion("szComment between", value1, value2, "szComment");
            return (Criteria) this;
        }

        public Criteria andSzCommentNotBetween(String value1, String value2) {
            addCriterion("szComment not between", value1, value2, "szComment");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceIsNull() {
            addCriterion("dLowArtDiscPrice is null");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceIsNotNull() {
            addCriterion("dLowArtDiscPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceEqualTo(BigDecimal value) {
            addCriterion("dLowArtDiscPrice =", value, "dLowArtDiscPrice");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceNotEqualTo(BigDecimal value) {
            addCriterion("dLowArtDiscPrice <>", value, "dLowArtDiscPrice");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceGreaterThan(BigDecimal value) {
            addCriterion("dLowArtDiscPrice >", value, "dLowArtDiscPrice");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dLowArtDiscPrice >=", value, "dLowArtDiscPrice");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceLessThan(BigDecimal value) {
            addCriterion("dLowArtDiscPrice <", value, "dLowArtDiscPrice");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dLowArtDiscPrice <=", value, "dLowArtDiscPrice");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceIn(List<BigDecimal> values) {
            addCriterion("dLowArtDiscPrice in", values, "dLowArtDiscPrice");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceNotIn(List<BigDecimal> values) {
            addCriterion("dLowArtDiscPrice not in", values, "dLowArtDiscPrice");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dLowArtDiscPrice between", value1, value2, "dLowArtDiscPrice");
            return (Criteria) this;
        }

        public Criteria andDLowArtDiscPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dLowArtDiscPrice not between", value1, value2, "dLowArtDiscPrice");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiIsNull() {
            addCriterion("szPreferedGui is null");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiIsNotNull() {
            addCriterion("szPreferedGui is not null");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiEqualTo(String value) {
            addCriterion("szPreferedGui =", value, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiNotEqualTo(String value) {
            addCriterion("szPreferedGui <>", value, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiGreaterThan(String value) {
            addCriterion("szPreferedGui >", value, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiGreaterThanOrEqualTo(String value) {
            addCriterion("szPreferedGui >=", value, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiLessThan(String value) {
            addCriterion("szPreferedGui <", value, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiLessThanOrEqualTo(String value) {
            addCriterion("szPreferedGui <=", value, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiLike(String value) {
            addCriterion("szPreferedGui like", value, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiNotLike(String value) {
            addCriterion("szPreferedGui not like", value, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiIn(List<String> values) {
            addCriterion("szPreferedGui in", values, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiNotIn(List<String> values) {
            addCriterion("szPreferedGui not in", values, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiBetween(String value1, String value2) {
            addCriterion("szPreferedGui between", value1, value2, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzPreferedGuiNotBetween(String value1, String value2) {
            addCriterion("szPreferedGui not between", value1, value2, "szPreferedGui");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDIsNull() {
            addCriterion("szDallasKeyID is null");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDIsNotNull() {
            addCriterion("szDallasKeyID is not null");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDEqualTo(String value) {
            addCriterion("szDallasKeyID =", value, "szDallasKeyID");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDNotEqualTo(String value) {
            addCriterion("szDallasKeyID <>", value, "szDallasKeyID");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDGreaterThan(String value) {
            addCriterion("szDallasKeyID >", value, "szDallasKeyID");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDGreaterThanOrEqualTo(String value) {
            addCriterion("szDallasKeyID >=", value, "szDallasKeyID");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDLessThan(String value) {
            addCriterion("szDallasKeyID <", value, "szDallasKeyID");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDLessThanOrEqualTo(String value) {
            addCriterion("szDallasKeyID <=", value, "szDallasKeyID");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDLike(String value) {
            addCriterion("szDallasKeyID like", value, "szDallasKeyID");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDNotLike(String value) {
            addCriterion("szDallasKeyID not like", value, "szDallasKeyID");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDIn(List<String> values) {
            addCriterion("szDallasKeyID in", values, "szDallasKeyID");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDNotIn(List<String> values) {
            addCriterion("szDallasKeyID not in", values, "szDallasKeyID");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDBetween(String value1, String value2) {
            addCriterion("szDallasKeyID between", value1, value2, "szDallasKeyID");
            return (Criteria) this;
        }

        public Criteria andSzDallasKeyIDNotBetween(String value1, String value2) {
            addCriterion("szDallasKeyID not between", value1, value2, "szDallasKeyID");
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

        public Criteria andBExternalCashierIsNull() {
            addCriterion("bExternalCashier is null");
            return (Criteria) this;
        }

        public Criteria andBExternalCashierIsNotNull() {
            addCriterion("bExternalCashier is not null");
            return (Criteria) this;
        }

        public Criteria andBExternalCashierEqualTo(Short value) {
            addCriterion("bExternalCashier =", value, "bExternalCashier");
            return (Criteria) this;
        }

        public Criteria andBExternalCashierNotEqualTo(Short value) {
            addCriterion("bExternalCashier <>", value, "bExternalCashier");
            return (Criteria) this;
        }

        public Criteria andBExternalCashierGreaterThan(Short value) {
            addCriterion("bExternalCashier >", value, "bExternalCashier");
            return (Criteria) this;
        }

        public Criteria andBExternalCashierGreaterThanOrEqualTo(Short value) {
            addCriterion("bExternalCashier >=", value, "bExternalCashier");
            return (Criteria) this;
        }

        public Criteria andBExternalCashierLessThan(Short value) {
            addCriterion("bExternalCashier <", value, "bExternalCashier");
            return (Criteria) this;
        }

        public Criteria andBExternalCashierLessThanOrEqualTo(Short value) {
            addCriterion("bExternalCashier <=", value, "bExternalCashier");
            return (Criteria) this;
        }

        public Criteria andBExternalCashierIn(List<Short> values) {
            addCriterion("bExternalCashier in", values, "bExternalCashier");
            return (Criteria) this;
        }

        public Criteria andBExternalCashierNotIn(List<Short> values) {
            addCriterion("bExternalCashier not in", values, "bExternalCashier");
            return (Criteria) this;
        }

        public Criteria andBExternalCashierBetween(Short value1, Short value2) {
            addCriterion("bExternalCashier between", value1, value2, "bExternalCashier");
            return (Criteria) this;
        }

        public Criteria andBExternalCashierNotBetween(Short value1, Short value2) {
            addCriterion("bExternalCashier not between", value1, value2, "bExternalCashier");
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