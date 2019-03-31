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

        public Criteria andLoperatoridIsNull() {
            addCriterion("lOperatorID is null");
            return (Criteria) this;
        }

        public Criteria andLoperatoridIsNotNull() {
            addCriterion("lOperatorID is not null");
            return (Criteria) this;
        }

        public Criteria andLoperatoridEqualTo(Integer value) {
            addCriterion("lOperatorID =", value, "loperatorid");
            return (Criteria) this;
        }

        public Criteria andLoperatoridNotEqualTo(Integer value) {
            addCriterion("lOperatorID <>", value, "loperatorid");
            return (Criteria) this;
        }

        public Criteria andLoperatoridGreaterThan(Integer value) {
            addCriterion("lOperatorID >", value, "loperatorid");
            return (Criteria) this;
        }

        public Criteria andLoperatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("lOperatorID >=", value, "loperatorid");
            return (Criteria) this;
        }

        public Criteria andLoperatoridLessThan(Integer value) {
            addCriterion("lOperatorID <", value, "loperatorid");
            return (Criteria) this;
        }

        public Criteria andLoperatoridLessThanOrEqualTo(Integer value) {
            addCriterion("lOperatorID <=", value, "loperatorid");
            return (Criteria) this;
        }

        public Criteria andLoperatoridIn(List<Integer> values) {
            addCriterion("lOperatorID in", values, "loperatorid");
            return (Criteria) this;
        }

        public Criteria andLoperatoridNotIn(List<Integer> values) {
            addCriterion("lOperatorID not in", values, "loperatorid");
            return (Criteria) this;
        }

        public Criteria andLoperatoridBetween(Integer value1, Integer value2) {
            addCriterion("lOperatorID between", value1, value2, "loperatorid");
            return (Criteria) this;
        }

        public Criteria andLoperatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("lOperatorID not between", value1, value2, "loperatorid");
            return (Criteria) this;
        }

        public Criteria andLemployeeidIsNull() {
            addCriterion("lEmployeeID is null");
            return (Criteria) this;
        }

        public Criteria andLemployeeidIsNotNull() {
            addCriterion("lEmployeeID is not null");
            return (Criteria) this;
        }

        public Criteria andLemployeeidEqualTo(Integer value) {
            addCriterion("lEmployeeID =", value, "lemployeeid");
            return (Criteria) this;
        }

        public Criteria andLemployeeidNotEqualTo(Integer value) {
            addCriterion("lEmployeeID <>", value, "lemployeeid");
            return (Criteria) this;
        }

        public Criteria andLemployeeidGreaterThan(Integer value) {
            addCriterion("lEmployeeID >", value, "lemployeeid");
            return (Criteria) this;
        }

        public Criteria andLemployeeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lEmployeeID >=", value, "lemployeeid");
            return (Criteria) this;
        }

        public Criteria andLemployeeidLessThan(Integer value) {
            addCriterion("lEmployeeID <", value, "lemployeeid");
            return (Criteria) this;
        }

        public Criteria andLemployeeidLessThanOrEqualTo(Integer value) {
            addCriterion("lEmployeeID <=", value, "lemployeeid");
            return (Criteria) this;
        }

        public Criteria andLemployeeidIn(List<Integer> values) {
            addCriterion("lEmployeeID in", values, "lemployeeid");
            return (Criteria) this;
        }

        public Criteria andLemployeeidNotIn(List<Integer> values) {
            addCriterion("lEmployeeID not in", values, "lemployeeid");
            return (Criteria) this;
        }

        public Criteria andLemployeeidBetween(Integer value1, Integer value2) {
            addCriterion("lEmployeeID between", value1, value2, "lemployeeid");
            return (Criteria) this;
        }

        public Criteria andLemployeeidNotBetween(Integer value1, Integer value2) {
            addCriterion("lEmployeeID not between", value1, value2, "lemployeeid");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameIsNull() {
            addCriterion("szSignOnName is null");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameIsNotNull() {
            addCriterion("szSignOnName is not null");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameEqualTo(String value) {
            addCriterion("szSignOnName =", value, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameNotEqualTo(String value) {
            addCriterion("szSignOnName <>", value, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameGreaterThan(String value) {
            addCriterion("szSignOnName >", value, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameGreaterThanOrEqualTo(String value) {
            addCriterion("szSignOnName >=", value, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameLessThan(String value) {
            addCriterion("szSignOnName <", value, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameLessThanOrEqualTo(String value) {
            addCriterion("szSignOnName <=", value, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameLike(String value) {
            addCriterion("szSignOnName like", value, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameNotLike(String value) {
            addCriterion("szSignOnName not like", value, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameIn(List<String> values) {
            addCriterion("szSignOnName in", values, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameNotIn(List<String> values) {
            addCriterion("szSignOnName not in", values, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameBetween(String value1, String value2) {
            addCriterion("szSignOnName between", value1, value2, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonnameNotBetween(String value1, String value2) {
            addCriterion("szSignOnName not between", value1, value2, "szsignonname");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordIsNull() {
            addCriterion("szSignOnPassword is null");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordIsNotNull() {
            addCriterion("szSignOnPassword is not null");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordEqualTo(String value) {
            addCriterion("szSignOnPassword =", value, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordNotEqualTo(String value) {
            addCriterion("szSignOnPassword <>", value, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordGreaterThan(String value) {
            addCriterion("szSignOnPassword >", value, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("szSignOnPassword >=", value, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordLessThan(String value) {
            addCriterion("szSignOnPassword <", value, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordLessThanOrEqualTo(String value) {
            addCriterion("szSignOnPassword <=", value, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordLike(String value) {
            addCriterion("szSignOnPassword like", value, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordNotLike(String value) {
            addCriterion("szSignOnPassword not like", value, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordIn(List<String> values) {
            addCriterion("szSignOnPassword in", values, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordNotIn(List<String> values) {
            addCriterion("szSignOnPassword not in", values, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordBetween(String value1, String value2) {
            addCriterion("szSignOnPassword between", value1, value2, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzsignonpasswordNotBetween(String value1, String value2) {
            addCriterion("szSignOnPassword not between", value1, value2, "szsignonpassword");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateIsNull() {
            addCriterion("szEffectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateIsNotNull() {
            addCriterion("szEffectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateEqualTo(String value) {
            addCriterion("szEffectiveDate =", value, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateNotEqualTo(String value) {
            addCriterion("szEffectiveDate <>", value, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateGreaterThan(String value) {
            addCriterion("szEffectiveDate >", value, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateGreaterThanOrEqualTo(String value) {
            addCriterion("szEffectiveDate >=", value, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateLessThan(String value) {
            addCriterion("szEffectiveDate <", value, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateLessThanOrEqualTo(String value) {
            addCriterion("szEffectiveDate <=", value, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateLike(String value) {
            addCriterion("szEffectiveDate like", value, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateNotLike(String value) {
            addCriterion("szEffectiveDate not like", value, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateIn(List<String> values) {
            addCriterion("szEffectiveDate in", values, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateNotIn(List<String> values) {
            addCriterion("szEffectiveDate not in", values, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateBetween(String value1, String value2) {
            addCriterion("szEffectiveDate between", value1, value2, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzeffectivedateNotBetween(String value1, String value2) {
            addCriterion("szEffectiveDate not between", value1, value2, "szeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateIsNull() {
            addCriterion("szExpirationDate is null");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateIsNotNull() {
            addCriterion("szExpirationDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateEqualTo(String value) {
            addCriterion("szExpirationDate =", value, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateNotEqualTo(String value) {
            addCriterion("szExpirationDate <>", value, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateGreaterThan(String value) {
            addCriterion("szExpirationDate >", value, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateGreaterThanOrEqualTo(String value) {
            addCriterion("szExpirationDate >=", value, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateLessThan(String value) {
            addCriterion("szExpirationDate <", value, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateLessThanOrEqualTo(String value) {
            addCriterion("szExpirationDate <=", value, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateLike(String value) {
            addCriterion("szExpirationDate like", value, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateNotLike(String value) {
            addCriterion("szExpirationDate not like", value, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateIn(List<String> values) {
            addCriterion("szExpirationDate in", values, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateNotIn(List<String> values) {
            addCriterion("szExpirationDate not in", values, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateBetween(String value1, String value2) {
            addCriterion("szExpirationDate between", value1, value2, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzexpirationdateNotBetween(String value1, String value2) {
            addCriterion("szExpirationDate not between", value1, value2, "szexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateIsNull() {
            addCriterion("szPasswordEffectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateIsNotNull() {
            addCriterion("szPasswordEffectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateEqualTo(String value) {
            addCriterion("szPasswordEffectiveDate =", value, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateNotEqualTo(String value) {
            addCriterion("szPasswordEffectiveDate <>", value, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateGreaterThan(String value) {
            addCriterion("szPasswordEffectiveDate >", value, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateGreaterThanOrEqualTo(String value) {
            addCriterion("szPasswordEffectiveDate >=", value, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateLessThan(String value) {
            addCriterion("szPasswordEffectiveDate <", value, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateLessThanOrEqualTo(String value) {
            addCriterion("szPasswordEffectiveDate <=", value, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateLike(String value) {
            addCriterion("szPasswordEffectiveDate like", value, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateNotLike(String value) {
            addCriterion("szPasswordEffectiveDate not like", value, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateIn(List<String> values) {
            addCriterion("szPasswordEffectiveDate in", values, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateNotIn(List<String> values) {
            addCriterion("szPasswordEffectiveDate not in", values, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateBetween(String value1, String value2) {
            addCriterion("szPasswordEffectiveDate between", value1, value2, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordeffectivedateNotBetween(String value1, String value2) {
            addCriterion("szPasswordEffectiveDate not between", value1, value2, "szpasswordeffectivedate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateIsNull() {
            addCriterion("szPasswordExpirationDate is null");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateIsNotNull() {
            addCriterion("szPasswordExpirationDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateEqualTo(String value) {
            addCriterion("szPasswordExpirationDate =", value, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateNotEqualTo(String value) {
            addCriterion("szPasswordExpirationDate <>", value, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateGreaterThan(String value) {
            addCriterion("szPasswordExpirationDate >", value, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateGreaterThanOrEqualTo(String value) {
            addCriterion("szPasswordExpirationDate >=", value, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateLessThan(String value) {
            addCriterion("szPasswordExpirationDate <", value, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateLessThanOrEqualTo(String value) {
            addCriterion("szPasswordExpirationDate <=", value, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateLike(String value) {
            addCriterion("szPasswordExpirationDate like", value, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateNotLike(String value) {
            addCriterion("szPasswordExpirationDate not like", value, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateIn(List<String> values) {
            addCriterion("szPasswordExpirationDate in", values, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateNotIn(List<String> values) {
            addCriterion("szPasswordExpirationDate not in", values, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateBetween(String value1, String value2) {
            addCriterion("szPasswordExpirationDate between", value1, value2, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationdateNotBetween(String value1, String value2) {
            addCriterion("szPasswordExpirationDate not between", value1, value2, "szpasswordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeIsNull() {
            addCriterion("szPasswordExpirationRange is null");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeIsNotNull() {
            addCriterion("szPasswordExpirationRange is not null");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeEqualTo(Integer value) {
            addCriterion("szPasswordExpirationRange =", value, "szpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeNotEqualTo(Integer value) {
            addCriterion("szPasswordExpirationRange <>", value, "szpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeGreaterThan(Integer value) {
            addCriterion("szPasswordExpirationRange >", value, "szpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("szPasswordExpirationRange >=", value, "szpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeLessThan(Integer value) {
            addCriterion("szPasswordExpirationRange <", value, "szpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeLessThanOrEqualTo(Integer value) {
            addCriterion("szPasswordExpirationRange <=", value, "szpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeIn(List<Integer> values) {
            addCriterion("szPasswordExpirationRange in", values, "szpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeNotIn(List<Integer> values) {
            addCriterion("szPasswordExpirationRange not in", values, "szpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeBetween(Integer value1, Integer value2) {
            addCriterion("szPasswordExpirationRange between", value1, value2, "szpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andSzpasswordexpirationrangeNotBetween(Integer value1, Integer value2) {
            addCriterion("szPasswordExpirationRange not between", value1, value2, "szpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeIsNull() {
            addCriterion("lPasswordExpirationRange is null");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeIsNotNull() {
            addCriterion("lPasswordExpirationRange is not null");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeEqualTo(Integer value) {
            addCriterion("lPasswordExpirationRange =", value, "lpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeNotEqualTo(Integer value) {
            addCriterion("lPasswordExpirationRange <>", value, "lpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeGreaterThan(Integer value) {
            addCriterion("lPasswordExpirationRange >", value, "lpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lPasswordExpirationRange >=", value, "lpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeLessThan(Integer value) {
            addCriterion("lPasswordExpirationRange <", value, "lpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeLessThanOrEqualTo(Integer value) {
            addCriterion("lPasswordExpirationRange <=", value, "lpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeIn(List<Integer> values) {
            addCriterion("lPasswordExpirationRange in", values, "lpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeNotIn(List<Integer> values) {
            addCriterion("lPasswordExpirationRange not in", values, "lpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeBetween(Integer value1, Integer value2) {
            addCriterion("lPasswordExpirationRange between", value1, value2, "lpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andLpasswordexpirationrangeNotBetween(Integer value1, Integer value2) {
            addCriterion("lPasswordExpirationRange not between", value1, value2, "lpasswordexpirationrange");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagIsNull() {
            addCriterion("bPasswordResetFlag is null");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagIsNotNull() {
            addCriterion("bPasswordResetFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagEqualTo(Short value) {
            addCriterion("bPasswordResetFlag =", value, "bpasswordresetflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagNotEqualTo(Short value) {
            addCriterion("bPasswordResetFlag <>", value, "bpasswordresetflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagGreaterThan(Short value) {
            addCriterion("bPasswordResetFlag >", value, "bpasswordresetflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagGreaterThanOrEqualTo(Short value) {
            addCriterion("bPasswordResetFlag >=", value, "bpasswordresetflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagLessThan(Short value) {
            addCriterion("bPasswordResetFlag <", value, "bpasswordresetflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagLessThanOrEqualTo(Short value) {
            addCriterion("bPasswordResetFlag <=", value, "bpasswordresetflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagIn(List<Short> values) {
            addCriterion("bPasswordResetFlag in", values, "bpasswordresetflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagNotIn(List<Short> values) {
            addCriterion("bPasswordResetFlag not in", values, "bpasswordresetflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagBetween(Short value1, Short value2) {
            addCriterion("bPasswordResetFlag between", value1, value2, "bpasswordresetflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordresetflagNotBetween(Short value1, Short value2) {
            addCriterion("bPasswordResetFlag not between", value1, value2, "bpasswordresetflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagIsNull() {
            addCriterion("bPasswordChangeFlag is null");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagIsNotNull() {
            addCriterion("bPasswordChangeFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagEqualTo(Short value) {
            addCriterion("bPasswordChangeFlag =", value, "bpasswordchangeflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagNotEqualTo(Short value) {
            addCriterion("bPasswordChangeFlag <>", value, "bpasswordchangeflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagGreaterThan(Short value) {
            addCriterion("bPasswordChangeFlag >", value, "bpasswordchangeflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagGreaterThanOrEqualTo(Short value) {
            addCriterion("bPasswordChangeFlag >=", value, "bpasswordchangeflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagLessThan(Short value) {
            addCriterion("bPasswordChangeFlag <", value, "bpasswordchangeflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagLessThanOrEqualTo(Short value) {
            addCriterion("bPasswordChangeFlag <=", value, "bpasswordchangeflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagIn(List<Short> values) {
            addCriterion("bPasswordChangeFlag in", values, "bpasswordchangeflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagNotIn(List<Short> values) {
            addCriterion("bPasswordChangeFlag not in", values, "bpasswordchangeflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagBetween(Short value1, Short value2) {
            addCriterion("bPasswordChangeFlag between", value1, value2, "bpasswordchangeflag");
            return (Criteria) this;
        }

        public Criteria andBpasswordchangeflagNotBetween(Short value1, Short value2) {
            addCriterion("bPasswordChangeFlag not between", value1, value2, "bpasswordchangeflag");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountIsNull() {
            addCriterion("lPasswordEntryErrorCount is null");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountIsNotNull() {
            addCriterion("lPasswordEntryErrorCount is not null");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountEqualTo(Integer value) {
            addCriterion("lPasswordEntryErrorCount =", value, "lpasswordentryerrorcount");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountNotEqualTo(Integer value) {
            addCriterion("lPasswordEntryErrorCount <>", value, "lpasswordentryerrorcount");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountGreaterThan(Integer value) {
            addCriterion("lPasswordEntryErrorCount >", value, "lpasswordentryerrorcount");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lPasswordEntryErrorCount >=", value, "lpasswordentryerrorcount");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountLessThan(Integer value) {
            addCriterion("lPasswordEntryErrorCount <", value, "lpasswordentryerrorcount");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountLessThanOrEqualTo(Integer value) {
            addCriterion("lPasswordEntryErrorCount <=", value, "lpasswordentryerrorcount");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountIn(List<Integer> values) {
            addCriterion("lPasswordEntryErrorCount in", values, "lpasswordentryerrorcount");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountNotIn(List<Integer> values) {
            addCriterion("lPasswordEntryErrorCount not in", values, "lpasswordentryerrorcount");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountBetween(Integer value1, Integer value2) {
            addCriterion("lPasswordEntryErrorCount between", value1, value2, "lpasswordentryerrorcount");
            return (Criteria) this;
        }

        public Criteria andLpasswordentryerrorcountNotBetween(Integer value1, Integer value2) {
            addCriterion("lPasswordEntryErrorCount not between", value1, value2, "lpasswordentryerrorcount");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagIsNull() {
            addCriterion("bLeftHandedFlag is null");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagIsNotNull() {
            addCriterion("bLeftHandedFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagEqualTo(Short value) {
            addCriterion("bLeftHandedFlag =", value, "blefthandedflag");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagNotEqualTo(Short value) {
            addCriterion("bLeftHandedFlag <>", value, "blefthandedflag");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagGreaterThan(Short value) {
            addCriterion("bLeftHandedFlag >", value, "blefthandedflag");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagGreaterThanOrEqualTo(Short value) {
            addCriterion("bLeftHandedFlag >=", value, "blefthandedflag");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagLessThan(Short value) {
            addCriterion("bLeftHandedFlag <", value, "blefthandedflag");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagLessThanOrEqualTo(Short value) {
            addCriterion("bLeftHandedFlag <=", value, "blefthandedflag");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagIn(List<Short> values) {
            addCriterion("bLeftHandedFlag in", values, "blefthandedflag");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagNotIn(List<Short> values) {
            addCriterion("bLeftHandedFlag not in", values, "blefthandedflag");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagBetween(Short value1, Short value2) {
            addCriterion("bLeftHandedFlag between", value1, value2, "blefthandedflag");
            return (Criteria) this;
        }

        public Criteria andBlefthandedflagNotBetween(Short value1, Short value2) {
            addCriterion("bLeftHandedFlag not between", value1, value2, "blefthandedflag");
            return (Criteria) this;
        }

        public Criteria andSzexternalidIsNull() {
            addCriterion("szExternalID is null");
            return (Criteria) this;
        }

        public Criteria andSzexternalidIsNotNull() {
            addCriterion("szExternalID is not null");
            return (Criteria) this;
        }

        public Criteria andSzexternalidEqualTo(String value) {
            addCriterion("szExternalID =", value, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzexternalidNotEqualTo(String value) {
            addCriterion("szExternalID <>", value, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzexternalidGreaterThan(String value) {
            addCriterion("szExternalID >", value, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzexternalidGreaterThanOrEqualTo(String value) {
            addCriterion("szExternalID >=", value, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzexternalidLessThan(String value) {
            addCriterion("szExternalID <", value, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzexternalidLessThanOrEqualTo(String value) {
            addCriterion("szExternalID <=", value, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzexternalidLike(String value) {
            addCriterion("szExternalID like", value, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzexternalidNotLike(String value) {
            addCriterion("szExternalID not like", value, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzexternalidIn(List<String> values) {
            addCriterion("szExternalID in", values, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzexternalidNotIn(List<String> values) {
            addCriterion("szExternalID not in", values, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzexternalidBetween(String value1, String value2) {
            addCriterion("szExternalID between", value1, value2, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzexternalidNotBetween(String value1, String value2) {
            addCriterion("szExternalID not between", value1, value2, "szexternalid");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeIsNull() {
            addCriterion("szPrintCode is null");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeIsNotNull() {
            addCriterion("szPrintCode is not null");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeEqualTo(String value) {
            addCriterion("szPrintCode =", value, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeNotEqualTo(String value) {
            addCriterion("szPrintCode <>", value, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeGreaterThan(String value) {
            addCriterion("szPrintCode >", value, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeGreaterThanOrEqualTo(String value) {
            addCriterion("szPrintCode >=", value, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeLessThan(String value) {
            addCriterion("szPrintCode <", value, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeLessThanOrEqualTo(String value) {
            addCriterion("szPrintCode <=", value, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeLike(String value) {
            addCriterion("szPrintCode like", value, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeNotLike(String value) {
            addCriterion("szPrintCode not like", value, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeIn(List<String> values) {
            addCriterion("szPrintCode in", values, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeNotIn(List<String> values) {
            addCriterion("szPrintCode not in", values, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeBetween(String value1, String value2) {
            addCriterion("szPrintCode between", value1, value2, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzprintcodeNotBetween(String value1, String value2) {
            addCriterion("szPrintCode not between", value1, value2, "szprintcode");
            return (Criteria) this;
        }

        public Criteria andSzcommentIsNull() {
            addCriterion("szComment is null");
            return (Criteria) this;
        }

        public Criteria andSzcommentIsNotNull() {
            addCriterion("szComment is not null");
            return (Criteria) this;
        }

        public Criteria andSzcommentEqualTo(String value) {
            addCriterion("szComment =", value, "szcomment");
            return (Criteria) this;
        }

        public Criteria andSzcommentNotEqualTo(String value) {
            addCriterion("szComment <>", value, "szcomment");
            return (Criteria) this;
        }

        public Criteria andSzcommentGreaterThan(String value) {
            addCriterion("szComment >", value, "szcomment");
            return (Criteria) this;
        }

        public Criteria andSzcommentGreaterThanOrEqualTo(String value) {
            addCriterion("szComment >=", value, "szcomment");
            return (Criteria) this;
        }

        public Criteria andSzcommentLessThan(String value) {
            addCriterion("szComment <", value, "szcomment");
            return (Criteria) this;
        }

        public Criteria andSzcommentLessThanOrEqualTo(String value) {
            addCriterion("szComment <=", value, "szcomment");
            return (Criteria) this;
        }

        public Criteria andSzcommentLike(String value) {
            addCriterion("szComment like", value, "szcomment");
            return (Criteria) this;
        }

        public Criteria andSzcommentNotLike(String value) {
            addCriterion("szComment not like", value, "szcomment");
            return (Criteria) this;
        }

        public Criteria andSzcommentIn(List<String> values) {
            addCriterion("szComment in", values, "szcomment");
            return (Criteria) this;
        }

        public Criteria andSzcommentNotIn(List<String> values) {
            addCriterion("szComment not in", values, "szcomment");
            return (Criteria) this;
        }

        public Criteria andSzcommentBetween(String value1, String value2) {
            addCriterion("szComment between", value1, value2, "szcomment");
            return (Criteria) this;
        }

        public Criteria andSzcommentNotBetween(String value1, String value2) {
            addCriterion("szComment not between", value1, value2, "szcomment");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceIsNull() {
            addCriterion("dLowArtDiscPrice is null");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceIsNotNull() {
            addCriterion("dLowArtDiscPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceEqualTo(BigDecimal value) {
            addCriterion("dLowArtDiscPrice =", value, "dlowartdiscprice");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceNotEqualTo(BigDecimal value) {
            addCriterion("dLowArtDiscPrice <>", value, "dlowartdiscprice");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceGreaterThan(BigDecimal value) {
            addCriterion("dLowArtDiscPrice >", value, "dlowartdiscprice");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dLowArtDiscPrice >=", value, "dlowartdiscprice");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceLessThan(BigDecimal value) {
            addCriterion("dLowArtDiscPrice <", value, "dlowartdiscprice");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dLowArtDiscPrice <=", value, "dlowartdiscprice");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceIn(List<BigDecimal> values) {
            addCriterion("dLowArtDiscPrice in", values, "dlowartdiscprice");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceNotIn(List<BigDecimal> values) {
            addCriterion("dLowArtDiscPrice not in", values, "dlowartdiscprice");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dLowArtDiscPrice between", value1, value2, "dlowartdiscprice");
            return (Criteria) this;
        }

        public Criteria andDlowartdiscpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dLowArtDiscPrice not between", value1, value2, "dlowartdiscprice");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiIsNull() {
            addCriterion("szPreferedGui is null");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiIsNotNull() {
            addCriterion("szPreferedGui is not null");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiEqualTo(String value) {
            addCriterion("szPreferedGui =", value, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiNotEqualTo(String value) {
            addCriterion("szPreferedGui <>", value, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiGreaterThan(String value) {
            addCriterion("szPreferedGui >", value, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiGreaterThanOrEqualTo(String value) {
            addCriterion("szPreferedGui >=", value, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiLessThan(String value) {
            addCriterion("szPreferedGui <", value, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiLessThanOrEqualTo(String value) {
            addCriterion("szPreferedGui <=", value, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiLike(String value) {
            addCriterion("szPreferedGui like", value, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiNotLike(String value) {
            addCriterion("szPreferedGui not like", value, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiIn(List<String> values) {
            addCriterion("szPreferedGui in", values, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiNotIn(List<String> values) {
            addCriterion("szPreferedGui not in", values, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiBetween(String value1, String value2) {
            addCriterion("szPreferedGui between", value1, value2, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzpreferedguiNotBetween(String value1, String value2) {
            addCriterion("szPreferedGui not between", value1, value2, "szpreferedgui");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidIsNull() {
            addCriterion("szDallasKeyID is null");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidIsNotNull() {
            addCriterion("szDallasKeyID is not null");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidEqualTo(String value) {
            addCriterion("szDallasKeyID =", value, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidNotEqualTo(String value) {
            addCriterion("szDallasKeyID <>", value, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidGreaterThan(String value) {
            addCriterion("szDallasKeyID >", value, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidGreaterThanOrEqualTo(String value) {
            addCriterion("szDallasKeyID >=", value, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidLessThan(String value) {
            addCriterion("szDallasKeyID <", value, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidLessThanOrEqualTo(String value) {
            addCriterion("szDallasKeyID <=", value, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidLike(String value) {
            addCriterion("szDallasKeyID like", value, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidNotLike(String value) {
            addCriterion("szDallasKeyID not like", value, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidIn(List<String> values) {
            addCriterion("szDallasKeyID in", values, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidNotIn(List<String> values) {
            addCriterion("szDallasKeyID not in", values, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidBetween(String value1, String value2) {
            addCriterion("szDallasKeyID between", value1, value2, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andSzdallaskeyidNotBetween(String value1, String value2) {
            addCriterion("szDallasKeyID not between", value1, value2, "szdallaskeyid");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidIsNull() {
            addCriterion("lTechLayerAccessID is null");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidIsNotNull() {
            addCriterion("lTechLayerAccessID is not null");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidEqualTo(Integer value) {
            addCriterion("lTechLayerAccessID =", value, "ltechlayeraccessid");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidNotEqualTo(Integer value) {
            addCriterion("lTechLayerAccessID <>", value, "ltechlayeraccessid");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidGreaterThan(Integer value) {
            addCriterion("lTechLayerAccessID >", value, "ltechlayeraccessid");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lTechLayerAccessID >=", value, "ltechlayeraccessid");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidLessThan(Integer value) {
            addCriterion("lTechLayerAccessID <", value, "ltechlayeraccessid");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidLessThanOrEqualTo(Integer value) {
            addCriterion("lTechLayerAccessID <=", value, "ltechlayeraccessid");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidIn(List<Integer> values) {
            addCriterion("lTechLayerAccessID in", values, "ltechlayeraccessid");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidNotIn(List<Integer> values) {
            addCriterion("lTechLayerAccessID not in", values, "ltechlayeraccessid");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidBetween(Integer value1, Integer value2) {
            addCriterion("lTechLayerAccessID between", value1, value2, "ltechlayeraccessid");
            return (Criteria) this;
        }

        public Criteria andLtechlayeraccessidNotBetween(Integer value1, Integer value2) {
            addCriterion("lTechLayerAccessID not between", value1, value2, "ltechlayeraccessid");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalIsNull() {
            addCriterion("szLastUpdLocal is null");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalIsNotNull() {
            addCriterion("szLastUpdLocal is not null");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalEqualTo(String value) {
            addCriterion("szLastUpdLocal =", value, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalNotEqualTo(String value) {
            addCriterion("szLastUpdLocal <>", value, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalGreaterThan(String value) {
            addCriterion("szLastUpdLocal >", value, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalGreaterThanOrEqualTo(String value) {
            addCriterion("szLastUpdLocal >=", value, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalLessThan(String value) {
            addCriterion("szLastUpdLocal <", value, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalLessThanOrEqualTo(String value) {
            addCriterion("szLastUpdLocal <=", value, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalLike(String value) {
            addCriterion("szLastUpdLocal like", value, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalNotLike(String value) {
            addCriterion("szLastUpdLocal not like", value, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalIn(List<String> values) {
            addCriterion("szLastUpdLocal in", values, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalNotIn(List<String> values) {
            addCriterion("szLastUpdLocal not in", values, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalBetween(String value1, String value2) {
            addCriterion("szLastUpdLocal between", value1, value2, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andSzlastupdlocalNotBetween(String value1, String value2) {
            addCriterion("szLastUpdLocal not between", value1, value2, "szlastupdlocal");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierIsNull() {
            addCriterion("bExternalCashier is null");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierIsNotNull() {
            addCriterion("bExternalCashier is not null");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierEqualTo(Short value) {
            addCriterion("bExternalCashier =", value, "bexternalcashier");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierNotEqualTo(Short value) {
            addCriterion("bExternalCashier <>", value, "bexternalcashier");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierGreaterThan(Short value) {
            addCriterion("bExternalCashier >", value, "bexternalcashier");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierGreaterThanOrEqualTo(Short value) {
            addCriterion("bExternalCashier >=", value, "bexternalcashier");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierLessThan(Short value) {
            addCriterion("bExternalCashier <", value, "bexternalcashier");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierLessThanOrEqualTo(Short value) {
            addCriterion("bExternalCashier <=", value, "bexternalcashier");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierIn(List<Short> values) {
            addCriterion("bExternalCashier in", values, "bexternalcashier");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierNotIn(List<Short> values) {
            addCriterion("bExternalCashier not in", values, "bexternalcashier");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierBetween(Short value1, Short value2) {
            addCriterion("bExternalCashier between", value1, value2, "bexternalcashier");
            return (Criteria) this;
        }

        public Criteria andBexternalcashierNotBetween(Short value1, Short value2) {
            addCriterion("bExternalCashier not between", value1, value2, "bexternalcashier");
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