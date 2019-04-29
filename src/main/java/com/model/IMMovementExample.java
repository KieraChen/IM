package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IMMovementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IMMovementExample() {
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

        public Criteria andLDocTypeIsNull() {
            addCriterion("lDocType is null");
            return (Criteria) this;
        }

        public Criteria andLDocTypeIsNotNull() {
            addCriterion("lDocType is not null");
            return (Criteria) this;
        }

        public Criteria andLDocTypeEqualTo(Integer value) {
            addCriterion("lDocType =", value, "lDocType");
            return (Criteria) this;
        }

        public Criteria andLDocTypeNotEqualTo(Integer value) {
            addCriterion("lDocType <>", value, "lDocType");
            return (Criteria) this;
        }

        public Criteria andLDocTypeGreaterThan(Integer value) {
            addCriterion("lDocType >", value, "lDocType");
            return (Criteria) this;
        }

        public Criteria andLDocTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lDocType >=", value, "lDocType");
            return (Criteria) this;
        }

        public Criteria andLDocTypeLessThan(Integer value) {
            addCriterion("lDocType <", value, "lDocType");
            return (Criteria) this;
        }

        public Criteria andLDocTypeLessThanOrEqualTo(Integer value) {
            addCriterion("lDocType <=", value, "lDocType");
            return (Criteria) this;
        }

        public Criteria andLDocTypeIn(List<Integer> values) {
            addCriterion("lDocType in", values, "lDocType");
            return (Criteria) this;
        }

        public Criteria andLDocTypeNotIn(List<Integer> values) {
            addCriterion("lDocType not in", values, "lDocType");
            return (Criteria) this;
        }

        public Criteria andLDocTypeBetween(Integer value1, Integer value2) {
            addCriterion("lDocType between", value1, value2, "lDocType");
            return (Criteria) this;
        }

        public Criteria andLDocTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("lDocType not between", value1, value2, "lDocType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrIsNull() {
            addCriterion("szDocumentNmbr is null");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrIsNotNull() {
            addCriterion("szDocumentNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrEqualTo(String value) {
            addCriterion("szDocumentNmbr =", value, "szDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrNotEqualTo(String value) {
            addCriterion("szDocumentNmbr <>", value, "szDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrGreaterThan(String value) {
            addCriterion("szDocumentNmbr >", value, "szDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrGreaterThanOrEqualTo(String value) {
            addCriterion("szDocumentNmbr >=", value, "szDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrLessThan(String value) {
            addCriterion("szDocumentNmbr <", value, "szDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrLessThanOrEqualTo(String value) {
            addCriterion("szDocumentNmbr <=", value, "szDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrLike(String value) {
            addCriterion("szDocumentNmbr like", value, "szDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrNotLike(String value) {
            addCriterion("szDocumentNmbr not like", value, "szDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrIn(List<String> values) {
            addCriterion("szDocumentNmbr in", values, "szDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrNotIn(List<String> values) {
            addCriterion("szDocumentNmbr not in", values, "szDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrBetween(String value1, String value2) {
            addCriterion("szDocumentNmbr between", value1, value2, "szDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDocumentNmbrNotBetween(String value1, String value2) {
            addCriterion("szDocumentNmbr not between", value1, value2, "szDocumentNmbr");
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

        public Criteria andSzTimeIsNull() {
            addCriterion("szTime is null");
            return (Criteria) this;
        }

        public Criteria andSzTimeIsNotNull() {
            addCriterion("szTime is not null");
            return (Criteria) this;
        }

        public Criteria andSzTimeEqualTo(String value) {
            addCriterion("szTime =", value, "szTime");
            return (Criteria) this;
        }

        public Criteria andSzTimeNotEqualTo(String value) {
            addCriterion("szTime <>", value, "szTime");
            return (Criteria) this;
        }

        public Criteria andSzTimeGreaterThan(String value) {
            addCriterion("szTime >", value, "szTime");
            return (Criteria) this;
        }

        public Criteria andSzTimeGreaterThanOrEqualTo(String value) {
            addCriterion("szTime >=", value, "szTime");
            return (Criteria) this;
        }

        public Criteria andSzTimeLessThan(String value) {
            addCriterion("szTime <", value, "szTime");
            return (Criteria) this;
        }

        public Criteria andSzTimeLessThanOrEqualTo(String value) {
            addCriterion("szTime <=", value, "szTime");
            return (Criteria) this;
        }

        public Criteria andSzTimeLike(String value) {
            addCriterion("szTime like", value, "szTime");
            return (Criteria) this;
        }

        public Criteria andSzTimeNotLike(String value) {
            addCriterion("szTime not like", value, "szTime");
            return (Criteria) this;
        }

        public Criteria andSzTimeIn(List<String> values) {
            addCriterion("szTime in", values, "szTime");
            return (Criteria) this;
        }

        public Criteria andSzTimeNotIn(List<String> values) {
            addCriterion("szTime not in", values, "szTime");
            return (Criteria) this;
        }

        public Criteria andSzTimeBetween(String value1, String value2) {
            addCriterion("szTime between", value1, value2, "szTime");
            return (Criteria) this;
        }

        public Criteria andSzTimeNotBetween(String value1, String value2) {
            addCriterion("szTime not between", value1, value2, "szTime");
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

        public Criteria andLCreatedOperatorIDIsNull() {
            addCriterion("lCreatedOperatorID is null");
            return (Criteria) this;
        }

        public Criteria andLCreatedOperatorIDIsNotNull() {
            addCriterion("lCreatedOperatorID is not null");
            return (Criteria) this;
        }

        public Criteria andLCreatedOperatorIDEqualTo(Integer value) {
            addCriterion("lCreatedOperatorID =", value, "lCreatedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLCreatedOperatorIDNotEqualTo(Integer value) {
            addCriterion("lCreatedOperatorID <>", value, "lCreatedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLCreatedOperatorIDGreaterThan(Integer value) {
            addCriterion("lCreatedOperatorID >", value, "lCreatedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLCreatedOperatorIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lCreatedOperatorID >=", value, "lCreatedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLCreatedOperatorIDLessThan(Integer value) {
            addCriterion("lCreatedOperatorID <", value, "lCreatedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLCreatedOperatorIDLessThanOrEqualTo(Integer value) {
            addCriterion("lCreatedOperatorID <=", value, "lCreatedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLCreatedOperatorIDIn(List<Integer> values) {
            addCriterion("lCreatedOperatorID in", values, "lCreatedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLCreatedOperatorIDNotIn(List<Integer> values) {
            addCriterion("lCreatedOperatorID not in", values, "lCreatedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLCreatedOperatorIDBetween(Integer value1, Integer value2) {
            addCriterion("lCreatedOperatorID between", value1, value2, "lCreatedOperatorID");
            return (Criteria) this;
        }

        public Criteria andLCreatedOperatorIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lCreatedOperatorID not between", value1, value2, "lCreatedOperatorID");
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

        public Criteria andSzExternalDocumentDateIsNull() {
            addCriterion("szExternalDocumentDate is null");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateIsNotNull() {
            addCriterion("szExternalDocumentDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateEqualTo(String value) {
            addCriterion("szExternalDocumentDate =", value, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateNotEqualTo(String value) {
            addCriterion("szExternalDocumentDate <>", value, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateGreaterThan(String value) {
            addCriterion("szExternalDocumentDate >", value, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateGreaterThanOrEqualTo(String value) {
            addCriterion("szExternalDocumentDate >=", value, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateLessThan(String value) {
            addCriterion("szExternalDocumentDate <", value, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateLessThanOrEqualTo(String value) {
            addCriterion("szExternalDocumentDate <=", value, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateLike(String value) {
            addCriterion("szExternalDocumentDate like", value, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateNotLike(String value) {
            addCriterion("szExternalDocumentDate not like", value, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateIn(List<String> values) {
            addCriterion("szExternalDocumentDate in", values, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateNotIn(List<String> values) {
            addCriterion("szExternalDocumentDate not in", values, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateBetween(String value1, String value2) {
            addCriterion("szExternalDocumentDate between", value1, value2, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzExternalDocumentDateNotBetween(String value1, String value2) {
            addCriterion("szExternalDocumentDate not between", value1, value2, "szExternalDocumentDate");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDIsNull() {
            addCriterion("szVendorID is null");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDIsNotNull() {
            addCriterion("szVendorID is not null");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDEqualTo(String value) {
            addCriterion("szVendorID =", value, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDNotEqualTo(String value) {
            addCriterion("szVendorID <>", value, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDGreaterThan(String value) {
            addCriterion("szVendorID >", value, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDGreaterThanOrEqualTo(String value) {
            addCriterion("szVendorID >=", value, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDLessThan(String value) {
            addCriterion("szVendorID <", value, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDLessThanOrEqualTo(String value) {
            addCriterion("szVendorID <=", value, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDLike(String value) {
            addCriterion("szVendorID like", value, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDNotLike(String value) {
            addCriterion("szVendorID not like", value, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDIn(List<String> values) {
            addCriterion("szVendorID in", values, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDNotIn(List<String> values) {
            addCriterion("szVendorID not in", values, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDBetween(String value1, String value2) {
            addCriterion("szVendorID between", value1, value2, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDNotBetween(String value1, String value2) {
            addCriterion("szVendorID not between", value1, value2, "szVendorID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromIsNull() {
            addCriterion("lRetailStoreIDFrom is null");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromIsNotNull() {
            addCriterion("lRetailStoreIDFrom is not null");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromEqualTo(Integer value) {
            addCriterion("lRetailStoreIDFrom =", value, "lRetailStoreIDFrom");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromNotEqualTo(Integer value) {
            addCriterion("lRetailStoreIDFrom <>", value, "lRetailStoreIDFrom");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromGreaterThan(Integer value) {
            addCriterion("lRetailStoreIDFrom >", value, "lRetailStoreIDFrom");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("lRetailStoreIDFrom >=", value, "lRetailStoreIDFrom");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromLessThan(Integer value) {
            addCriterion("lRetailStoreIDFrom <", value, "lRetailStoreIDFrom");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromLessThanOrEqualTo(Integer value) {
            addCriterion("lRetailStoreIDFrom <=", value, "lRetailStoreIDFrom");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromIn(List<Integer> values) {
            addCriterion("lRetailStoreIDFrom in", values, "lRetailStoreIDFrom");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromNotIn(List<Integer> values) {
            addCriterion("lRetailStoreIDFrom not in", values, "lRetailStoreIDFrom");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromBetween(Integer value1, Integer value2) {
            addCriterion("lRetailStoreIDFrom between", value1, value2, "lRetailStoreIDFrom");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDFromNotBetween(Integer value1, Integer value2) {
            addCriterion("lRetailStoreIDFrom not between", value1, value2, "lRetailStoreIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromIsNull() {
            addCriterion("szRetailStoreExternalIDFrom is null");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromIsNotNull() {
            addCriterion("szRetailStoreExternalIDFrom is not null");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromEqualTo(String value) {
            addCriterion("szRetailStoreExternalIDFrom =", value, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromNotEqualTo(String value) {
            addCriterion("szRetailStoreExternalIDFrom <>", value, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromGreaterThan(String value) {
            addCriterion("szRetailStoreExternalIDFrom >", value, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromGreaterThanOrEqualTo(String value) {
            addCriterion("szRetailStoreExternalIDFrom >=", value, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromLessThan(String value) {
            addCriterion("szRetailStoreExternalIDFrom <", value, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromLessThanOrEqualTo(String value) {
            addCriterion("szRetailStoreExternalIDFrom <=", value, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromLike(String value) {
            addCriterion("szRetailStoreExternalIDFrom like", value, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromNotLike(String value) {
            addCriterion("szRetailStoreExternalIDFrom not like", value, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromIn(List<String> values) {
            addCriterion("szRetailStoreExternalIDFrom in", values, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromNotIn(List<String> values) {
            addCriterion("szRetailStoreExternalIDFrom not in", values, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromBetween(String value1, String value2) {
            addCriterion("szRetailStoreExternalIDFrom between", value1, value2, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDFromNotBetween(String value1, String value2) {
            addCriterion("szRetailStoreExternalIDFrom not between", value1, value2, "szRetailStoreExternalIDFrom");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToIsNull() {
            addCriterion("lRetailStoreIDTo is null");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToIsNotNull() {
            addCriterion("lRetailStoreIDTo is not null");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToEqualTo(Integer value) {
            addCriterion("lRetailStoreIDTo =", value, "lRetailStoreIDTo");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToNotEqualTo(Integer value) {
            addCriterion("lRetailStoreIDTo <>", value, "lRetailStoreIDTo");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToGreaterThan(Integer value) {
            addCriterion("lRetailStoreIDTo >", value, "lRetailStoreIDTo");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToGreaterThanOrEqualTo(Integer value) {
            addCriterion("lRetailStoreIDTo >=", value, "lRetailStoreIDTo");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToLessThan(Integer value) {
            addCriterion("lRetailStoreIDTo <", value, "lRetailStoreIDTo");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToLessThanOrEqualTo(Integer value) {
            addCriterion("lRetailStoreIDTo <=", value, "lRetailStoreIDTo");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToIn(List<Integer> values) {
            addCriterion("lRetailStoreIDTo in", values, "lRetailStoreIDTo");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToNotIn(List<Integer> values) {
            addCriterion("lRetailStoreIDTo not in", values, "lRetailStoreIDTo");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToBetween(Integer value1, Integer value2) {
            addCriterion("lRetailStoreIDTo between", value1, value2, "lRetailStoreIDTo");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreIDToNotBetween(Integer value1, Integer value2) {
            addCriterion("lRetailStoreIDTo not between", value1, value2, "lRetailStoreIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToIsNull() {
            addCriterion("szRetailStoreExternalIDTo is null");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToIsNotNull() {
            addCriterion("szRetailStoreExternalIDTo is not null");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToEqualTo(String value) {
            addCriterion("szRetailStoreExternalIDTo =", value, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToNotEqualTo(String value) {
            addCriterion("szRetailStoreExternalIDTo <>", value, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToGreaterThan(String value) {
            addCriterion("szRetailStoreExternalIDTo >", value, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToGreaterThanOrEqualTo(String value) {
            addCriterion("szRetailStoreExternalIDTo >=", value, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToLessThan(String value) {
            addCriterion("szRetailStoreExternalIDTo <", value, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToLessThanOrEqualTo(String value) {
            addCriterion("szRetailStoreExternalIDTo <=", value, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToLike(String value) {
            addCriterion("szRetailStoreExternalIDTo like", value, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToNotLike(String value) {
            addCriterion("szRetailStoreExternalIDTo not like", value, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToIn(List<String> values) {
            addCriterion("szRetailStoreExternalIDTo in", values, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToNotIn(List<String> values) {
            addCriterion("szRetailStoreExternalIDTo not in", values, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToBetween(String value1, String value2) {
            addCriterion("szRetailStoreExternalIDTo between", value1, value2, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzRetailStoreExternalIDToNotBetween(String value1, String value2) {
            addCriterion("szRetailStoreExternalIDTo not between", value1, value2, "szRetailStoreExternalIDTo");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameIsNull() {
            addCriterion("szVendorOrStoreName is null");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameIsNotNull() {
            addCriterion("szVendorOrStoreName is not null");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameEqualTo(String value) {
            addCriterion("szVendorOrStoreName =", value, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameNotEqualTo(String value) {
            addCriterion("szVendorOrStoreName <>", value, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameGreaterThan(String value) {
            addCriterion("szVendorOrStoreName >", value, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("szVendorOrStoreName >=", value, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameLessThan(String value) {
            addCriterion("szVendorOrStoreName <", value, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameLessThanOrEqualTo(String value) {
            addCriterion("szVendorOrStoreName <=", value, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameLike(String value) {
            addCriterion("szVendorOrStoreName like", value, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameNotLike(String value) {
            addCriterion("szVendorOrStoreName not like", value, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameIn(List<String> values) {
            addCriterion("szVendorOrStoreName in", values, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameNotIn(List<String> values) {
            addCriterion("szVendorOrStoreName not in", values, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameBetween(String value1, String value2) {
            addCriterion("szVendorOrStoreName between", value1, value2, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzVendorOrStoreNameNotBetween(String value1, String value2) {
            addCriterion("szVendorOrStoreName not between", value1, value2, "szVendorOrStoreName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromIsNull() {
            addCriterion("szStorageLocationIDFrom is null");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromIsNotNull() {
            addCriterion("szStorageLocationIDFrom is not null");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromEqualTo(String value) {
            addCriterion("szStorageLocationIDFrom =", value, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromNotEqualTo(String value) {
            addCriterion("szStorageLocationIDFrom <>", value, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromGreaterThan(String value) {
            addCriterion("szStorageLocationIDFrom >", value, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromGreaterThanOrEqualTo(String value) {
            addCriterion("szStorageLocationIDFrom >=", value, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromLessThan(String value) {
            addCriterion("szStorageLocationIDFrom <", value, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromLessThanOrEqualTo(String value) {
            addCriterion("szStorageLocationIDFrom <=", value, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromLike(String value) {
            addCriterion("szStorageLocationIDFrom like", value, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromNotLike(String value) {
            addCriterion("szStorageLocationIDFrom not like", value, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromIn(List<String> values) {
            addCriterion("szStorageLocationIDFrom in", values, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromNotIn(List<String> values) {
            addCriterion("szStorageLocationIDFrom not in", values, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromBetween(String value1, String value2) {
            addCriterion("szStorageLocationIDFrom between", value1, value2, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDFromNotBetween(String value1, String value2) {
            addCriterion("szStorageLocationIDFrom not between", value1, value2, "szStorageLocationIDFrom");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToIsNull() {
            addCriterion("szStorageLocationIDTo is null");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToIsNotNull() {
            addCriterion("szStorageLocationIDTo is not null");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToEqualTo(String value) {
            addCriterion("szStorageLocationIDTo =", value, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToNotEqualTo(String value) {
            addCriterion("szStorageLocationIDTo <>", value, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToGreaterThan(String value) {
            addCriterion("szStorageLocationIDTo >", value, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToGreaterThanOrEqualTo(String value) {
            addCriterion("szStorageLocationIDTo >=", value, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToLessThan(String value) {
            addCriterion("szStorageLocationIDTo <", value, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToLessThanOrEqualTo(String value) {
            addCriterion("szStorageLocationIDTo <=", value, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToLike(String value) {
            addCriterion("szStorageLocationIDTo like", value, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToNotLike(String value) {
            addCriterion("szStorageLocationIDTo not like", value, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToIn(List<String> values) {
            addCriterion("szStorageLocationIDTo in", values, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToNotIn(List<String> values) {
            addCriterion("szStorageLocationIDTo not in", values, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToBetween(String value1, String value2) {
            addCriterion("szStorageLocationIDTo between", value1, value2, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDToNotBetween(String value1, String value2) {
            addCriterion("szStorageLocationIDTo not between", value1, value2, "szStorageLocationIDTo");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateIsNull() {
            addCriterion("szExpectedDeliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateIsNotNull() {
            addCriterion("szExpectedDeliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateEqualTo(String value) {
            addCriterion("szExpectedDeliveryDate =", value, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateNotEqualTo(String value) {
            addCriterion("szExpectedDeliveryDate <>", value, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateGreaterThan(String value) {
            addCriterion("szExpectedDeliveryDate >", value, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateGreaterThanOrEqualTo(String value) {
            addCriterion("szExpectedDeliveryDate >=", value, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateLessThan(String value) {
            addCriterion("szExpectedDeliveryDate <", value, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateLessThanOrEqualTo(String value) {
            addCriterion("szExpectedDeliveryDate <=", value, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateLike(String value) {
            addCriterion("szExpectedDeliveryDate like", value, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateNotLike(String value) {
            addCriterion("szExpectedDeliveryDate not like", value, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateIn(List<String> values) {
            addCriterion("szExpectedDeliveryDate in", values, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateNotIn(List<String> values) {
            addCriterion("szExpectedDeliveryDate not in", values, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateBetween(String value1, String value2) {
            addCriterion("szExpectedDeliveryDate between", value1, value2, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzExpectedDeliveryDateNotBetween(String value1, String value2) {
            addCriterion("szExpectedDeliveryDate not between", value1, value2, "szExpectedDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrIsNull() {
            addCriterion("szInvoiceNmbr is null");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrIsNotNull() {
            addCriterion("szInvoiceNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrEqualTo(String value) {
            addCriterion("szInvoiceNmbr =", value, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrNotEqualTo(String value) {
            addCriterion("szInvoiceNmbr <>", value, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrGreaterThan(String value) {
            addCriterion("szInvoiceNmbr >", value, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrGreaterThanOrEqualTo(String value) {
            addCriterion("szInvoiceNmbr >=", value, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrLessThan(String value) {
            addCriterion("szInvoiceNmbr <", value, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrLessThanOrEqualTo(String value) {
            addCriterion("szInvoiceNmbr <=", value, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrLike(String value) {
            addCriterion("szInvoiceNmbr like", value, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrNotLike(String value) {
            addCriterion("szInvoiceNmbr not like", value, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrIn(List<String> values) {
            addCriterion("szInvoiceNmbr in", values, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrNotIn(List<String> values) {
            addCriterion("szInvoiceNmbr not in", values, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrBetween(String value1, String value2) {
            addCriterion("szInvoiceNmbr between", value1, value2, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceNmbrNotBetween(String value1, String value2) {
            addCriterion("szInvoiceNmbr not between", value1, value2, "szInvoiceNmbr");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateIsNull() {
            addCriterion("szInvoiceDate is null");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateIsNotNull() {
            addCriterion("szInvoiceDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateEqualTo(String value) {
            addCriterion("szInvoiceDate =", value, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateNotEqualTo(String value) {
            addCriterion("szInvoiceDate <>", value, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateGreaterThan(String value) {
            addCriterion("szInvoiceDate >", value, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateGreaterThanOrEqualTo(String value) {
            addCriterion("szInvoiceDate >=", value, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateLessThan(String value) {
            addCriterion("szInvoiceDate <", value, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateLessThanOrEqualTo(String value) {
            addCriterion("szInvoiceDate <=", value, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateLike(String value) {
            addCriterion("szInvoiceDate like", value, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateNotLike(String value) {
            addCriterion("szInvoiceDate not like", value, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateIn(List<String> values) {
            addCriterion("szInvoiceDate in", values, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateNotIn(List<String> values) {
            addCriterion("szInvoiceDate not in", values, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateBetween(String value1, String value2) {
            addCriterion("szInvoiceDate between", value1, value2, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andSzInvoiceDateNotBetween(String value1, String value2) {
            addCriterion("szInvoiceDate not between", value1, value2, "szInvoiceDate");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountIsNull() {
            addCriterion("dInvoiceAmount is null");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountIsNotNull() {
            addCriterion("dInvoiceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountEqualTo(BigDecimal value) {
            addCriterion("dInvoiceAmount =", value, "dInvoiceAmount");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountNotEqualTo(BigDecimal value) {
            addCriterion("dInvoiceAmount <>", value, "dInvoiceAmount");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountGreaterThan(BigDecimal value) {
            addCriterion("dInvoiceAmount >", value, "dInvoiceAmount");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dInvoiceAmount >=", value, "dInvoiceAmount");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountLessThan(BigDecimal value) {
            addCriterion("dInvoiceAmount <", value, "dInvoiceAmount");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dInvoiceAmount <=", value, "dInvoiceAmount");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountIn(List<BigDecimal> values) {
            addCriterion("dInvoiceAmount in", values, "dInvoiceAmount");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountNotIn(List<BigDecimal> values) {
            addCriterion("dInvoiceAmount not in", values, "dInvoiceAmount");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dInvoiceAmount between", value1, value2, "dInvoiceAmount");
            return (Criteria) this;
        }

        public Criteria andDInvoiceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dInvoiceAmount not between", value1, value2, "dInvoiceAmount");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrIsNull() {
            addCriterion("szDSDReceiptNmbr is null");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrIsNotNull() {
            addCriterion("szDSDReceiptNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrEqualTo(String value) {
            addCriterion("szDSDReceiptNmbr =", value, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrNotEqualTo(String value) {
            addCriterion("szDSDReceiptNmbr <>", value, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrGreaterThan(String value) {
            addCriterion("szDSDReceiptNmbr >", value, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrGreaterThanOrEqualTo(String value) {
            addCriterion("szDSDReceiptNmbr >=", value, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrLessThan(String value) {
            addCriterion("szDSDReceiptNmbr <", value, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrLessThanOrEqualTo(String value) {
            addCriterion("szDSDReceiptNmbr <=", value, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrLike(String value) {
            addCriterion("szDSDReceiptNmbr like", value, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrNotLike(String value) {
            addCriterion("szDSDReceiptNmbr not like", value, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrIn(List<String> values) {
            addCriterion("szDSDReceiptNmbr in", values, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrNotIn(List<String> values) {
            addCriterion("szDSDReceiptNmbr not in", values, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrBetween(String value1, String value2) {
            addCriterion("szDSDReceiptNmbr between", value1, value2, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzDSDReceiptNmbrNotBetween(String value1, String value2) {
            addCriterion("szDSDReceiptNmbr not between", value1, value2, "szDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeIsNull() {
            addCriterion("szReasonCode is null");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeIsNotNull() {
            addCriterion("szReasonCode is not null");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeEqualTo(String value) {
            addCriterion("szReasonCode =", value, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeNotEqualTo(String value) {
            addCriterion("szReasonCode <>", value, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeGreaterThan(String value) {
            addCriterion("szReasonCode >", value, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("szReasonCode >=", value, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeLessThan(String value) {
            addCriterion("szReasonCode <", value, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeLessThanOrEqualTo(String value) {
            addCriterion("szReasonCode <=", value, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeLike(String value) {
            addCriterion("szReasonCode like", value, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeNotLike(String value) {
            addCriterion("szReasonCode not like", value, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeIn(List<String> values) {
            addCriterion("szReasonCode in", values, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeNotIn(List<String> values) {
            addCriterion("szReasonCode not in", values, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeBetween(String value1, String value2) {
            addCriterion("szReasonCode between", value1, value2, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReasonCodeNotBetween(String value1, String value2) {
            addCriterion("szReasonCode not between", value1, value2, "szReasonCode");
            return (Criteria) this;
        }

        public Criteria andSzReferenceIsNull() {
            addCriterion("szReference is null");
            return (Criteria) this;
        }

        public Criteria andSzReferenceIsNotNull() {
            addCriterion("szReference is not null");
            return (Criteria) this;
        }

        public Criteria andSzReferenceEqualTo(String value) {
            addCriterion("szReference =", value, "szReference");
            return (Criteria) this;
        }

        public Criteria andSzReferenceNotEqualTo(String value) {
            addCriterion("szReference <>", value, "szReference");
            return (Criteria) this;
        }

        public Criteria andSzReferenceGreaterThan(String value) {
            addCriterion("szReference >", value, "szReference");
            return (Criteria) this;
        }

        public Criteria andSzReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("szReference >=", value, "szReference");
            return (Criteria) this;
        }

        public Criteria andSzReferenceLessThan(String value) {
            addCriterion("szReference <", value, "szReference");
            return (Criteria) this;
        }

        public Criteria andSzReferenceLessThanOrEqualTo(String value) {
            addCriterion("szReference <=", value, "szReference");
            return (Criteria) this;
        }

        public Criteria andSzReferenceLike(String value) {
            addCriterion("szReference like", value, "szReference");
            return (Criteria) this;
        }

        public Criteria andSzReferenceNotLike(String value) {
            addCriterion("szReference not like", value, "szReference");
            return (Criteria) this;
        }

        public Criteria andSzReferenceIn(List<String> values) {
            addCriterion("szReference in", values, "szReference");
            return (Criteria) this;
        }

        public Criteria andSzReferenceNotIn(List<String> values) {
            addCriterion("szReference not in", values, "szReference");
            return (Criteria) this;
        }

        public Criteria andSzReferenceBetween(String value1, String value2) {
            addCriterion("szReference between", value1, value2, "szReference");
            return (Criteria) this;
        }

        public Criteria andSzReferenceNotBetween(String value1, String value2) {
            addCriterion("szReference not between", value1, value2, "szReference");
            return (Criteria) this;
        }

        public Criteria andBConfirmedIsNull() {
            addCriterion("bConfirmed is null");
            return (Criteria) this;
        }

        public Criteria andBConfirmedIsNotNull() {
            addCriterion("bConfirmed is not null");
            return (Criteria) this;
        }

        public Criteria andBConfirmedEqualTo(Integer value) {
            addCriterion("bConfirmed =", value, "bConfirmed");
            return (Criteria) this;
        }

        public Criteria andBConfirmedNotEqualTo(Integer value) {
            addCriterion("bConfirmed <>", value, "bConfirmed");
            return (Criteria) this;
        }

        public Criteria andBConfirmedGreaterThan(Integer value) {
            addCriterion("bConfirmed >", value, "bConfirmed");
            return (Criteria) this;
        }

        public Criteria andBConfirmedGreaterThanOrEqualTo(Integer value) {
            addCriterion("bConfirmed >=", value, "bConfirmed");
            return (Criteria) this;
        }

        public Criteria andBConfirmedLessThan(Integer value) {
            addCriterion("bConfirmed <", value, "bConfirmed");
            return (Criteria) this;
        }

        public Criteria andBConfirmedLessThanOrEqualTo(Integer value) {
            addCriterion("bConfirmed <=", value, "bConfirmed");
            return (Criteria) this;
        }

        public Criteria andBConfirmedIn(List<Integer> values) {
            addCriterion("bConfirmed in", values, "bConfirmed");
            return (Criteria) this;
        }

        public Criteria andBConfirmedNotIn(List<Integer> values) {
            addCriterion("bConfirmed not in", values, "bConfirmed");
            return (Criteria) this;
        }

        public Criteria andBConfirmedBetween(Integer value1, Integer value2) {
            addCriterion("bConfirmed between", value1, value2, "bConfirmed");
            return (Criteria) this;
        }

        public Criteria andBConfirmedNotBetween(Integer value1, Integer value2) {
            addCriterion("bConfirmed not between", value1, value2, "bConfirmed");
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

        public Criteria andSzDocTypeNameIsNull() {
            addCriterion("szDocTypeName is null");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameIsNotNull() {
            addCriterion("szDocTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameEqualTo(String value) {
            addCriterion("szDocTypeName =", value, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameNotEqualTo(String value) {
            addCriterion("szDocTypeName <>", value, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameGreaterThan(String value) {
            addCriterion("szDocTypeName >", value, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("szDocTypeName >=", value, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameLessThan(String value) {
            addCriterion("szDocTypeName <", value, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameLessThanOrEqualTo(String value) {
            addCriterion("szDocTypeName <=", value, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameLike(String value) {
            addCriterion("szDocTypeName like", value, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameNotLike(String value) {
            addCriterion("szDocTypeName not like", value, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameIn(List<String> values) {
            addCriterion("szDocTypeName in", values, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameNotIn(List<String> values) {
            addCriterion("szDocTypeName not in", values, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameBetween(String value1, String value2) {
            addCriterion("szDocTypeName between", value1, value2, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andSzDocTypeNameNotBetween(String value1, String value2) {
            addCriterion("szDocTypeName not between", value1, value2, "szDocTypeName");
            return (Criteria) this;
        }

        public Criteria andBIsCDCIsNull() {
            addCriterion("bIsCDC is null");
            return (Criteria) this;
        }

        public Criteria andBIsCDCIsNotNull() {
            addCriterion("bIsCDC is not null");
            return (Criteria) this;
        }

        public Criteria andBIsCDCEqualTo(Integer value) {
            addCriterion("bIsCDC =", value, "bIsCDC");
            return (Criteria) this;
        }

        public Criteria andBIsCDCNotEqualTo(Integer value) {
            addCriterion("bIsCDC <>", value, "bIsCDC");
            return (Criteria) this;
        }

        public Criteria andBIsCDCGreaterThan(Integer value) {
            addCriterion("bIsCDC >", value, "bIsCDC");
            return (Criteria) this;
        }

        public Criteria andBIsCDCGreaterThanOrEqualTo(Integer value) {
            addCriterion("bIsCDC >=", value, "bIsCDC");
            return (Criteria) this;
        }

        public Criteria andBIsCDCLessThan(Integer value) {
            addCriterion("bIsCDC <", value, "bIsCDC");
            return (Criteria) this;
        }

        public Criteria andBIsCDCLessThanOrEqualTo(Integer value) {
            addCriterion("bIsCDC <=", value, "bIsCDC");
            return (Criteria) this;
        }

        public Criteria andBIsCDCIn(List<Integer> values) {
            addCriterion("bIsCDC in", values, "bIsCDC");
            return (Criteria) this;
        }

        public Criteria andBIsCDCNotIn(List<Integer> values) {
            addCriterion("bIsCDC not in", values, "bIsCDC");
            return (Criteria) this;
        }

        public Criteria andBIsCDCBetween(Integer value1, Integer value2) {
            addCriterion("bIsCDC between", value1, value2, "bIsCDC");
            return (Criteria) this;
        }

        public Criteria andBIsCDCNotBetween(Integer value1, Integer value2) {
            addCriterion("bIsCDC not between", value1, value2, "bIsCDC");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeIsNull() {
            addCriterion("lStockTakeType is null");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeIsNotNull() {
            addCriterion("lStockTakeType is not null");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeEqualTo(Integer value) {
            addCriterion("lStockTakeType =", value, "lStockTakeType");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeNotEqualTo(Integer value) {
            addCriterion("lStockTakeType <>", value, "lStockTakeType");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeGreaterThan(Integer value) {
            addCriterion("lStockTakeType >", value, "lStockTakeType");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lStockTakeType >=", value, "lStockTakeType");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeLessThan(Integer value) {
            addCriterion("lStockTakeType <", value, "lStockTakeType");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("lStockTakeType <=", value, "lStockTakeType");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeIn(List<Integer> values) {
            addCriterion("lStockTakeType in", values, "lStockTakeType");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeNotIn(List<Integer> values) {
            addCriterion("lStockTakeType not in", values, "lStockTakeType");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeBetween(Integer value1, Integer value2) {
            addCriterion("lStockTakeType between", value1, value2, "lStockTakeType");
            return (Criteria) this;
        }

        public Criteria andLStockTakeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("lStockTakeType not between", value1, value2, "lStockTakeType");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupIsNull() {
            addCriterion("szExternalPurchaseGroup is null");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupIsNotNull() {
            addCriterion("szExternalPurchaseGroup is not null");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupEqualTo(String value) {
            addCriterion("szExternalPurchaseGroup =", value, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupNotEqualTo(String value) {
            addCriterion("szExternalPurchaseGroup <>", value, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupGreaterThan(String value) {
            addCriterion("szExternalPurchaseGroup >", value, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupGreaterThanOrEqualTo(String value) {
            addCriterion("szExternalPurchaseGroup >=", value, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupLessThan(String value) {
            addCriterion("szExternalPurchaseGroup <", value, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupLessThanOrEqualTo(String value) {
            addCriterion("szExternalPurchaseGroup <=", value, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupLike(String value) {
            addCriterion("szExternalPurchaseGroup like", value, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupNotLike(String value) {
            addCriterion("szExternalPurchaseGroup not like", value, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupIn(List<String> values) {
            addCriterion("szExternalPurchaseGroup in", values, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupNotIn(List<String> values) {
            addCriterion("szExternalPurchaseGroup not in", values, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupBetween(String value1, String value2) {
            addCriterion("szExternalPurchaseGroup between", value1, value2, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzExternalPurchaseGroupNotBetween(String value1, String value2) {
            addCriterion("szExternalPurchaseGroup not between", value1, value2, "szExternalPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzRDODateIsNull() {
            addCriterion("szRDODate is null");
            return (Criteria) this;
        }

        public Criteria andSzRDODateIsNotNull() {
            addCriterion("szRDODate is not null");
            return (Criteria) this;
        }

        public Criteria andSzRDODateEqualTo(String value) {
            addCriterion("szRDODate =", value, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDODateNotEqualTo(String value) {
            addCriterion("szRDODate <>", value, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDODateGreaterThan(String value) {
            addCriterion("szRDODate >", value, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDODateGreaterThanOrEqualTo(String value) {
            addCriterion("szRDODate >=", value, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDODateLessThan(String value) {
            addCriterion("szRDODate <", value, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDODateLessThanOrEqualTo(String value) {
            addCriterion("szRDODate <=", value, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDODateLike(String value) {
            addCriterion("szRDODate like", value, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDODateNotLike(String value) {
            addCriterion("szRDODate not like", value, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDODateIn(List<String> values) {
            addCriterion("szRDODate in", values, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDODateNotIn(List<String> values) {
            addCriterion("szRDODate not in", values, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDODateBetween(String value1, String value2) {
            addCriterion("szRDODate between", value1, value2, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDODateNotBetween(String value1, String value2) {
            addCriterion("szRDODate not between", value1, value2, "szRDODate");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeIsNull() {
            addCriterion("szRDOTime is null");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeIsNotNull() {
            addCriterion("szRDOTime is not null");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeEqualTo(String value) {
            addCriterion("szRDOTime =", value, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeNotEqualTo(String value) {
            addCriterion("szRDOTime <>", value, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeGreaterThan(String value) {
            addCriterion("szRDOTime >", value, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeGreaterThanOrEqualTo(String value) {
            addCriterion("szRDOTime >=", value, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeLessThan(String value) {
            addCriterion("szRDOTime <", value, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeLessThanOrEqualTo(String value) {
            addCriterion("szRDOTime <=", value, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeLike(String value) {
            addCriterion("szRDOTime like", value, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeNotLike(String value) {
            addCriterion("szRDOTime not like", value, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeIn(List<String> values) {
            addCriterion("szRDOTime in", values, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeNotIn(List<String> values) {
            addCriterion("szRDOTime not in", values, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeBetween(String value1, String value2) {
            addCriterion("szRDOTime between", value1, value2, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzRDOTimeNotBetween(String value1, String value2) {
            addCriterion("szRDOTime not between", value1, value2, "szRDOTime");
            return (Criteria) this;
        }

        public Criteria andSzStatusPOIsNull() {
            addCriterion("szStatusPO is null");
            return (Criteria) this;
        }

        public Criteria andSzStatusPOIsNotNull() {
            addCriterion("szStatusPO is not null");
            return (Criteria) this;
        }

        public Criteria andSzStatusPOEqualTo(String value) {
            addCriterion("szStatusPO =", value, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzStatusPONotEqualTo(String value) {
            addCriterion("szStatusPO <>", value, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzStatusPOGreaterThan(String value) {
            addCriterion("szStatusPO >", value, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzStatusPOGreaterThanOrEqualTo(String value) {
            addCriterion("szStatusPO >=", value, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzStatusPOLessThan(String value) {
            addCriterion("szStatusPO <", value, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzStatusPOLessThanOrEqualTo(String value) {
            addCriterion("szStatusPO <=", value, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzStatusPOLike(String value) {
            addCriterion("szStatusPO like", value, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzStatusPONotLike(String value) {
            addCriterion("szStatusPO not like", value, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzStatusPOIn(List<String> values) {
            addCriterion("szStatusPO in", values, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzStatusPONotIn(List<String> values) {
            addCriterion("szStatusPO not in", values, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzStatusPOBetween(String value1, String value2) {
            addCriterion("szStatusPO between", value1, value2, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzStatusPONotBetween(String value1, String value2) {
            addCriterion("szStatusPO not between", value1, value2, "szStatusPO");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrIsNull() {
            addCriterion("szSaveDSDReceiptNmbr is null");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrIsNotNull() {
            addCriterion("szSaveDSDReceiptNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrEqualTo(String value) {
            addCriterion("szSaveDSDReceiptNmbr =", value, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrNotEqualTo(String value) {
            addCriterion("szSaveDSDReceiptNmbr <>", value, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrGreaterThan(String value) {
            addCriterion("szSaveDSDReceiptNmbr >", value, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrGreaterThanOrEqualTo(String value) {
            addCriterion("szSaveDSDReceiptNmbr >=", value, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrLessThan(String value) {
            addCriterion("szSaveDSDReceiptNmbr <", value, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrLessThanOrEqualTo(String value) {
            addCriterion("szSaveDSDReceiptNmbr <=", value, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrLike(String value) {
            addCriterion("szSaveDSDReceiptNmbr like", value, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrNotLike(String value) {
            addCriterion("szSaveDSDReceiptNmbr not like", value, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrIn(List<String> values) {
            addCriterion("szSaveDSDReceiptNmbr in", values, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrNotIn(List<String> values) {
            addCriterion("szSaveDSDReceiptNmbr not in", values, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrBetween(String value1, String value2) {
            addCriterion("szSaveDSDReceiptNmbr between", value1, value2, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzSaveDSDReceiptNmbrNotBetween(String value1, String value2) {
            addCriterion("szSaveDSDReceiptNmbr not between", value1, value2, "szSaveDSDReceiptNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrIsNull() {
            addCriterion("szReceiptDocumentNmbr is null");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrIsNotNull() {
            addCriterion("szReceiptDocumentNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrEqualTo(String value) {
            addCriterion("szReceiptDocumentNmbr =", value, "szReceiptDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrNotEqualTo(String value) {
            addCriterion("szReceiptDocumentNmbr <>", value, "szReceiptDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrGreaterThan(String value) {
            addCriterion("szReceiptDocumentNmbr >", value, "szReceiptDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrGreaterThanOrEqualTo(String value) {
            addCriterion("szReceiptDocumentNmbr >=", value, "szReceiptDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrLessThan(String value) {
            addCriterion("szReceiptDocumentNmbr <", value, "szReceiptDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrLessThanOrEqualTo(String value) {
            addCriterion("szReceiptDocumentNmbr <=", value, "szReceiptDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrLike(String value) {
            addCriterion("szReceiptDocumentNmbr like", value, "szReceiptDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrNotLike(String value) {
            addCriterion("szReceiptDocumentNmbr not like", value, "szReceiptDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrIn(List<String> values) {
            addCriterion("szReceiptDocumentNmbr in", values, "szReceiptDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrNotIn(List<String> values) {
            addCriterion("szReceiptDocumentNmbr not in", values, "szReceiptDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrBetween(String value1, String value2) {
            addCriterion("szReceiptDocumentNmbr between", value1, value2, "szReceiptDocumentNmbr");
            return (Criteria) this;
        }

        public Criteria andSzReceiptDocumentNmbrNotBetween(String value1, String value2) {
            addCriterion("szReceiptDocumentNmbr not between", value1, value2, "szReceiptDocumentNmbr");
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

        public Criteria andBNoObjectIsNull() {
            addCriterion("bNoObject is null");
            return (Criteria) this;
        }

        public Criteria andBNoObjectIsNotNull() {
            addCriterion("bNoObject is not null");
            return (Criteria) this;
        }

        public Criteria andBNoObjectEqualTo(Integer value) {
            addCriterion("bNoObject =", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectNotEqualTo(Integer value) {
            addCriterion("bNoObject <>", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectGreaterThan(Integer value) {
            addCriterion("bNoObject >", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("bNoObject >=", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectLessThan(Integer value) {
            addCriterion("bNoObject <", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectLessThanOrEqualTo(Integer value) {
            addCriterion("bNoObject <=", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectIn(List<Integer> values) {
            addCriterion("bNoObject in", values, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectNotIn(List<Integer> values) {
            addCriterion("bNoObject not in", values, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectBetween(Integer value1, Integer value2) {
            addCriterion("bNoObject between", value1, value2, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectNotBetween(Integer value1, Integer value2) {
            addCriterion("bNoObject not between", value1, value2, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrIsNull() {
            addCriterion("szRVRSerialNmbr is null");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrIsNotNull() {
            addCriterion("szRVRSerialNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrEqualTo(String value) {
            addCriterion("szRVRSerialNmbr =", value, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrNotEqualTo(String value) {
            addCriterion("szRVRSerialNmbr <>", value, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrGreaterThan(String value) {
            addCriterion("szRVRSerialNmbr >", value, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrGreaterThanOrEqualTo(String value) {
            addCriterion("szRVRSerialNmbr >=", value, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrLessThan(String value) {
            addCriterion("szRVRSerialNmbr <", value, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrLessThanOrEqualTo(String value) {
            addCriterion("szRVRSerialNmbr <=", value, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrLike(String value) {
            addCriterion("szRVRSerialNmbr like", value, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrNotLike(String value) {
            addCriterion("szRVRSerialNmbr not like", value, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrIn(List<String> values) {
            addCriterion("szRVRSerialNmbr in", values, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrNotIn(List<String> values) {
            addCriterion("szRVRSerialNmbr not in", values, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrBetween(String value1, String value2) {
            addCriterion("szRVRSerialNmbr between", value1, value2, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzRVRSerialNmbrNotBetween(String value1, String value2) {
            addCriterion("szRVRSerialNmbr not between", value1, value2, "szRVRSerialNmbr");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberIsNull() {
            addCriterion("szPoDocumentNmber is null");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberIsNotNull() {
            addCriterion("szPoDocumentNmber is not null");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberEqualTo(String value) {
            addCriterion("szPoDocumentNmber =", value, "szPoDocumentNmber");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberNotEqualTo(String value) {
            addCriterion("szPoDocumentNmber <>", value, "szPoDocumentNmber");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberGreaterThan(String value) {
            addCriterion("szPoDocumentNmber >", value, "szPoDocumentNmber");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberGreaterThanOrEqualTo(String value) {
            addCriterion("szPoDocumentNmber >=", value, "szPoDocumentNmber");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberLessThan(String value) {
            addCriterion("szPoDocumentNmber <", value, "szPoDocumentNmber");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberLessThanOrEqualTo(String value) {
            addCriterion("szPoDocumentNmber <=", value, "szPoDocumentNmber");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberLike(String value) {
            addCriterion("szPoDocumentNmber like", value, "szPoDocumentNmber");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberNotLike(String value) {
            addCriterion("szPoDocumentNmber not like", value, "szPoDocumentNmber");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberIn(List<String> values) {
            addCriterion("szPoDocumentNmber in", values, "szPoDocumentNmber");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberNotIn(List<String> values) {
            addCriterion("szPoDocumentNmber not in", values, "szPoDocumentNmber");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberBetween(String value1, String value2) {
            addCriterion("szPoDocumentNmber between", value1, value2, "szPoDocumentNmber");
            return (Criteria) this;
        }

        public Criteria andSzPoDocumentNmberNotBetween(String value1, String value2) {
            addCriterion("szPoDocumentNmber not between", value1, value2, "szPoDocumentNmber");
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