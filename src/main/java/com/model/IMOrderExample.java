package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IMOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IMOrderExample() {
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

        public Criteria andSzDocumentTypeIsNull() {
            addCriterion("szDocumentType is null");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeIsNotNull() {
            addCriterion("szDocumentType is not null");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeEqualTo(String value) {
            addCriterion("szDocumentType =", value, "szDocumentType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeNotEqualTo(String value) {
            addCriterion("szDocumentType <>", value, "szDocumentType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeGreaterThan(String value) {
            addCriterion("szDocumentType >", value, "szDocumentType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("szDocumentType >=", value, "szDocumentType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeLessThan(String value) {
            addCriterion("szDocumentType <", value, "szDocumentType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeLessThanOrEqualTo(String value) {
            addCriterion("szDocumentType <=", value, "szDocumentType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeLike(String value) {
            addCriterion("szDocumentType like", value, "szDocumentType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeNotLike(String value) {
            addCriterion("szDocumentType not like", value, "szDocumentType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeIn(List<String> values) {
            addCriterion("szDocumentType in", values, "szDocumentType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeNotIn(List<String> values) {
            addCriterion("szDocumentType not in", values, "szDocumentType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeBetween(String value1, String value2) {
            addCriterion("szDocumentType between", value1, value2, "szDocumentType");
            return (Criteria) this;
        }

        public Criteria andSzDocumentTypeNotBetween(String value1, String value2) {
            addCriterion("szDocumentType not between", value1, value2, "szDocumentType");
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

        public Criteria andSzStorageLocationIDIsNull() {
            addCriterion("szStorageLocationID is null");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDIsNotNull() {
            addCriterion("szStorageLocationID is not null");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDEqualTo(String value) {
            addCriterion("szStorageLocationID =", value, "szStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDNotEqualTo(String value) {
            addCriterion("szStorageLocationID <>", value, "szStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDGreaterThan(String value) {
            addCriterion("szStorageLocationID >", value, "szStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDGreaterThanOrEqualTo(String value) {
            addCriterion("szStorageLocationID >=", value, "szStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDLessThan(String value) {
            addCriterion("szStorageLocationID <", value, "szStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDLessThanOrEqualTo(String value) {
            addCriterion("szStorageLocationID <=", value, "szStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDLike(String value) {
            addCriterion("szStorageLocationID like", value, "szStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDNotLike(String value) {
            addCriterion("szStorageLocationID not like", value, "szStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDIn(List<String> values) {
            addCriterion("szStorageLocationID in", values, "szStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDNotIn(List<String> values) {
            addCriterion("szStorageLocationID not in", values, "szStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDBetween(String value1, String value2) {
            addCriterion("szStorageLocationID between", value1, value2, "szStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationIDNotBetween(String value1, String value2) {
            addCriterion("szStorageLocationID not between", value1, value2, "szStorageLocationID");
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

        public Criteria andSzPriceUnitOfMeasureNameIsNull() {
            addCriterion("szPriceUnitOfMeasureName is null");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameIsNotNull() {
            addCriterion("szPriceUnitOfMeasureName is not null");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameEqualTo(String value) {
            addCriterion("szPriceUnitOfMeasureName =", value, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameNotEqualTo(String value) {
            addCriterion("szPriceUnitOfMeasureName <>", value, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameGreaterThan(String value) {
            addCriterion("szPriceUnitOfMeasureName >", value, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameGreaterThanOrEqualTo(String value) {
            addCriterion("szPriceUnitOfMeasureName >=", value, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameLessThan(String value) {
            addCriterion("szPriceUnitOfMeasureName <", value, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameLessThanOrEqualTo(String value) {
            addCriterion("szPriceUnitOfMeasureName <=", value, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameLike(String value) {
            addCriterion("szPriceUnitOfMeasureName like", value, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameNotLike(String value) {
            addCriterion("szPriceUnitOfMeasureName not like", value, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameIn(List<String> values) {
            addCriterion("szPriceUnitOfMeasureName in", values, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameNotIn(List<String> values) {
            addCriterion("szPriceUnitOfMeasureName not in", values, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameBetween(String value1, String value2) {
            addCriterion("szPriceUnitOfMeasureName between", value1, value2, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzPriceUnitOfMeasureNameNotBetween(String value1, String value2) {
            addCriterion("szPriceUnitOfMeasureName not between", value1, value2, "szPriceUnitOfMeasureName");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationIsNull() {
            addCriterion("szItemClassification is null");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationIsNotNull() {
            addCriterion("szItemClassification is not null");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationEqualTo(String value) {
            addCriterion("szItemClassification =", value, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationNotEqualTo(String value) {
            addCriterion("szItemClassification <>", value, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationGreaterThan(String value) {
            addCriterion("szItemClassification >", value, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("szItemClassification >=", value, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationLessThan(String value) {
            addCriterion("szItemClassification <", value, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationLessThanOrEqualTo(String value) {
            addCriterion("szItemClassification <=", value, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationLike(String value) {
            addCriterion("szItemClassification like", value, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationNotLike(String value) {
            addCriterion("szItemClassification not like", value, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationIn(List<String> values) {
            addCriterion("szItemClassification in", values, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationNotIn(List<String> values) {
            addCriterion("szItemClassification not in", values, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationBetween(String value1, String value2) {
            addCriterion("szItemClassification between", value1, value2, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andSzItemClassificationNotBetween(String value1, String value2) {
            addCriterion("szItemClassification not between", value1, value2, "szItemClassification");
            return (Criteria) this;
        }

        public Criteria andDQtyIsNull() {
            addCriterion("dQty is null");
            return (Criteria) this;
        }

        public Criteria andDQtyIsNotNull() {
            addCriterion("dQty is not null");
            return (Criteria) this;
        }

        public Criteria andDQtyEqualTo(BigDecimal value) {
            addCriterion("dQty =", value, "dQty");
            return (Criteria) this;
        }

        public Criteria andDQtyNotEqualTo(BigDecimal value) {
            addCriterion("dQty <>", value, "dQty");
            return (Criteria) this;
        }

        public Criteria andDQtyGreaterThan(BigDecimal value) {
            addCriterion("dQty >", value, "dQty");
            return (Criteria) this;
        }

        public Criteria andDQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dQty >=", value, "dQty");
            return (Criteria) this;
        }

        public Criteria andDQtyLessThan(BigDecimal value) {
            addCriterion("dQty <", value, "dQty");
            return (Criteria) this;
        }

        public Criteria andDQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dQty <=", value, "dQty");
            return (Criteria) this;
        }

        public Criteria andDQtyIn(List<BigDecimal> values) {
            addCriterion("dQty in", values, "dQty");
            return (Criteria) this;
        }

        public Criteria andDQtyNotIn(List<BigDecimal> values) {
            addCriterion("dQty not in", values, "dQty");
            return (Criteria) this;
        }

        public Criteria andDQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dQty between", value1, value2, "dQty");
            return (Criteria) this;
        }

        public Criteria andDQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dQty not between", value1, value2, "dQty");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyIsNull() {
            addCriterion("dShift1Qty is null");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyIsNotNull() {
            addCriterion("dShift1Qty is not null");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyEqualTo(BigDecimal value) {
            addCriterion("dShift1Qty =", value, "dShift1Qty");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyNotEqualTo(BigDecimal value) {
            addCriterion("dShift1Qty <>", value, "dShift1Qty");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyGreaterThan(BigDecimal value) {
            addCriterion("dShift1Qty >", value, "dShift1Qty");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dShift1Qty >=", value, "dShift1Qty");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyLessThan(BigDecimal value) {
            addCriterion("dShift1Qty <", value, "dShift1Qty");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dShift1Qty <=", value, "dShift1Qty");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyIn(List<BigDecimal> values) {
            addCriterion("dShift1Qty in", values, "dShift1Qty");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyNotIn(List<BigDecimal> values) {
            addCriterion("dShift1Qty not in", values, "dShift1Qty");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dShift1Qty between", value1, value2, "dShift1Qty");
            return (Criteria) this;
        }

        public Criteria andDShift1QtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dShift1Qty not between", value1, value2, "dShift1Qty");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyIsNull() {
            addCriterion("dShift2Qty is null");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyIsNotNull() {
            addCriterion("dShift2Qty is not null");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyEqualTo(BigDecimal value) {
            addCriterion("dShift2Qty =", value, "dShift2Qty");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyNotEqualTo(BigDecimal value) {
            addCriterion("dShift2Qty <>", value, "dShift2Qty");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyGreaterThan(BigDecimal value) {
            addCriterion("dShift2Qty >", value, "dShift2Qty");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dShift2Qty >=", value, "dShift2Qty");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyLessThan(BigDecimal value) {
            addCriterion("dShift2Qty <", value, "dShift2Qty");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dShift2Qty <=", value, "dShift2Qty");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyIn(List<BigDecimal> values) {
            addCriterion("dShift2Qty in", values, "dShift2Qty");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyNotIn(List<BigDecimal> values) {
            addCriterion("dShift2Qty not in", values, "dShift2Qty");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dShift2Qty between", value1, value2, "dShift2Qty");
            return (Criteria) this;
        }

        public Criteria andDShift2QtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dShift2Qty not between", value1, value2, "dShift2Qty");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyIsNull() {
            addCriterion("dShift3Qty is null");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyIsNotNull() {
            addCriterion("dShift3Qty is not null");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyEqualTo(BigDecimal value) {
            addCriterion("dShift3Qty =", value, "dShift3Qty");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyNotEqualTo(BigDecimal value) {
            addCriterion("dShift3Qty <>", value, "dShift3Qty");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyGreaterThan(BigDecimal value) {
            addCriterion("dShift3Qty >", value, "dShift3Qty");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dShift3Qty >=", value, "dShift3Qty");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyLessThan(BigDecimal value) {
            addCriterion("dShift3Qty <", value, "dShift3Qty");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dShift3Qty <=", value, "dShift3Qty");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyIn(List<BigDecimal> values) {
            addCriterion("dShift3Qty in", values, "dShift3Qty");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyNotIn(List<BigDecimal> values) {
            addCriterion("dShift3Qty not in", values, "dShift3Qty");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dShift3Qty between", value1, value2, "dShift3Qty");
            return (Criteria) this;
        }

        public Criteria andDShift3QtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dShift3Qty not between", value1, value2, "dShift3Qty");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateIsNull() {
            addCriterion("szDeliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateIsNotNull() {
            addCriterion("szDeliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateEqualTo(String value) {
            addCriterion("szDeliveryDate =", value, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateNotEqualTo(String value) {
            addCriterion("szDeliveryDate <>", value, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateGreaterThan(String value) {
            addCriterion("szDeliveryDate >", value, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateGreaterThanOrEqualTo(String value) {
            addCriterion("szDeliveryDate >=", value, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateLessThan(String value) {
            addCriterion("szDeliveryDate <", value, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateLessThanOrEqualTo(String value) {
            addCriterion("szDeliveryDate <=", value, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateLike(String value) {
            addCriterion("szDeliveryDate like", value, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateNotLike(String value) {
            addCriterion("szDeliveryDate not like", value, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateIn(List<String> values) {
            addCriterion("szDeliveryDate in", values, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateNotIn(List<String> values) {
            addCriterion("szDeliveryDate not in", values, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateBetween(String value1, String value2) {
            addCriterion("szDeliveryDate between", value1, value2, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andSzDeliveryDateNotBetween(String value1, String value2) {
            addCriterion("szDeliveryDate not between", value1, value2, "szDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandIsNull() {
            addCriterion("dOrderDayOnHand is null");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandIsNotNull() {
            addCriterion("dOrderDayOnHand is not null");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandEqualTo(BigDecimal value) {
            addCriterion("dOrderDayOnHand =", value, "dOrderDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandNotEqualTo(BigDecimal value) {
            addCriterion("dOrderDayOnHand <>", value, "dOrderDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandGreaterThan(BigDecimal value) {
            addCriterion("dOrderDayOnHand >", value, "dOrderDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dOrderDayOnHand >=", value, "dOrderDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandLessThan(BigDecimal value) {
            addCriterion("dOrderDayOnHand <", value, "dOrderDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dOrderDayOnHand <=", value, "dOrderDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandIn(List<BigDecimal> values) {
            addCriterion("dOrderDayOnHand in", values, "dOrderDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandNotIn(List<BigDecimal> values) {
            addCriterion("dOrderDayOnHand not in", values, "dOrderDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dOrderDayOnHand between", value1, value2, "dOrderDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDOrderDayOnHandNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dOrderDayOnHand not between", value1, value2, "dOrderDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastIsNull() {
            addCriterion("dOrderDayForecast is null");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastIsNotNull() {
            addCriterion("dOrderDayForecast is not null");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastEqualTo(BigDecimal value) {
            addCriterion("dOrderDayForecast =", value, "dOrderDayForecast");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastNotEqualTo(BigDecimal value) {
            addCriterion("dOrderDayForecast <>", value, "dOrderDayForecast");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastGreaterThan(BigDecimal value) {
            addCriterion("dOrderDayForecast >", value, "dOrderDayForecast");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dOrderDayForecast >=", value, "dOrderDayForecast");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastLessThan(BigDecimal value) {
            addCriterion("dOrderDayForecast <", value, "dOrderDayForecast");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dOrderDayForecast <=", value, "dOrderDayForecast");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastIn(List<BigDecimal> values) {
            addCriterion("dOrderDayForecast in", values, "dOrderDayForecast");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastNotIn(List<BigDecimal> values) {
            addCriterion("dOrderDayForecast not in", values, "dOrderDayForecast");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dOrderDayForecast between", value1, value2, "dOrderDayForecast");
            return (Criteria) this;
        }

        public Criteria andDOrderDayForecastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dOrderDayForecast not between", value1, value2, "dOrderDayForecast");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandIsNull() {
            addCriterion("dNextDayOnHand is null");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandIsNotNull() {
            addCriterion("dNextDayOnHand is not null");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandEqualTo(BigDecimal value) {
            addCriterion("dNextDayOnHand =", value, "dNextDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandNotEqualTo(BigDecimal value) {
            addCriterion("dNextDayOnHand <>", value, "dNextDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandGreaterThan(BigDecimal value) {
            addCriterion("dNextDayOnHand >", value, "dNextDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dNextDayOnHand >=", value, "dNextDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandLessThan(BigDecimal value) {
            addCriterion("dNextDayOnHand <", value, "dNextDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dNextDayOnHand <=", value, "dNextDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandIn(List<BigDecimal> values) {
            addCriterion("dNextDayOnHand in", values, "dNextDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandNotIn(List<BigDecimal> values) {
            addCriterion("dNextDayOnHand not in", values, "dNextDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dNextDayOnHand between", value1, value2, "dNextDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDNextDayOnHandNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dNextDayOnHand not between", value1, value2, "dNextDayOnHand");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastIsNull() {
            addCriterion("dNextDayForecast is null");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastIsNotNull() {
            addCriterion("dNextDayForecast is not null");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastEqualTo(BigDecimal value) {
            addCriterion("dNextDayForecast =", value, "dNextDayForecast");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastNotEqualTo(BigDecimal value) {
            addCriterion("dNextDayForecast <>", value, "dNextDayForecast");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastGreaterThan(BigDecimal value) {
            addCriterion("dNextDayForecast >", value, "dNextDayForecast");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dNextDayForecast >=", value, "dNextDayForecast");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastLessThan(BigDecimal value) {
            addCriterion("dNextDayForecast <", value, "dNextDayForecast");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dNextDayForecast <=", value, "dNextDayForecast");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastIn(List<BigDecimal> values) {
            addCriterion("dNextDayForecast in", values, "dNextDayForecast");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastNotIn(List<BigDecimal> values) {
            addCriterion("dNextDayForecast not in", values, "dNextDayForecast");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dNextDayForecast between", value1, value2, "dNextDayForecast");
            return (Criteria) this;
        }

        public Criteria andDNextDayForecastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dNextDayForecast not between", value1, value2, "dNextDayForecast");
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

        public Criteria andLSupplySourceIsNull() {
            addCriterion("lSupplySource is null");
            return (Criteria) this;
        }

        public Criteria andLSupplySourceIsNotNull() {
            addCriterion("lSupplySource is not null");
            return (Criteria) this;
        }

        public Criteria andLSupplySourceEqualTo(Integer value) {
            addCriterion("lSupplySource =", value, "lSupplySource");
            return (Criteria) this;
        }

        public Criteria andLSupplySourceNotEqualTo(Integer value) {
            addCriterion("lSupplySource <>", value, "lSupplySource");
            return (Criteria) this;
        }

        public Criteria andLSupplySourceGreaterThan(Integer value) {
            addCriterion("lSupplySource >", value, "lSupplySource");
            return (Criteria) this;
        }

        public Criteria andLSupplySourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("lSupplySource >=", value, "lSupplySource");
            return (Criteria) this;
        }

        public Criteria andLSupplySourceLessThan(Integer value) {
            addCriterion("lSupplySource <", value, "lSupplySource");
            return (Criteria) this;
        }

        public Criteria andLSupplySourceLessThanOrEqualTo(Integer value) {
            addCriterion("lSupplySource <=", value, "lSupplySource");
            return (Criteria) this;
        }

        public Criteria andLSupplySourceIn(List<Integer> values) {
            addCriterion("lSupplySource in", values, "lSupplySource");
            return (Criteria) this;
        }

        public Criteria andLSupplySourceNotIn(List<Integer> values) {
            addCriterion("lSupplySource not in", values, "lSupplySource");
            return (Criteria) this;
        }

        public Criteria andLSupplySourceBetween(Integer value1, Integer value2) {
            addCriterion("lSupplySource between", value1, value2, "lSupplySource");
            return (Criteria) this;
        }

        public Criteria andLSupplySourceNotBetween(Integer value1, Integer value2) {
            addCriterion("lSupplySource not between", value1, value2, "lSupplySource");
            return (Criteria) this;
        }

        public Criteria andBConsignmentIsNull() {
            addCriterion("bConsignment is null");
            return (Criteria) this;
        }

        public Criteria andBConsignmentIsNotNull() {
            addCriterion("bConsignment is not null");
            return (Criteria) this;
        }

        public Criteria andBConsignmentEqualTo(Integer value) {
            addCriterion("bConsignment =", value, "bConsignment");
            return (Criteria) this;
        }

        public Criteria andBConsignmentNotEqualTo(Integer value) {
            addCriterion("bConsignment <>", value, "bConsignment");
            return (Criteria) this;
        }

        public Criteria andBConsignmentGreaterThan(Integer value) {
            addCriterion("bConsignment >", value, "bConsignment");
            return (Criteria) this;
        }

        public Criteria andBConsignmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("bConsignment >=", value, "bConsignment");
            return (Criteria) this;
        }

        public Criteria andBConsignmentLessThan(Integer value) {
            addCriterion("bConsignment <", value, "bConsignment");
            return (Criteria) this;
        }

        public Criteria andBConsignmentLessThanOrEqualTo(Integer value) {
            addCriterion("bConsignment <=", value, "bConsignment");
            return (Criteria) this;
        }

        public Criteria andBConsignmentIn(List<Integer> values) {
            addCriterion("bConsignment in", values, "bConsignment");
            return (Criteria) this;
        }

        public Criteria andBConsignmentNotIn(List<Integer> values) {
            addCriterion("bConsignment not in", values, "bConsignment");
            return (Criteria) this;
        }

        public Criteria andBConsignmentBetween(Integer value1, Integer value2) {
            addCriterion("bConsignment between", value1, value2, "bConsignment");
            return (Criteria) this;
        }

        public Criteria andBConsignmentNotBetween(Integer value1, Integer value2) {
            addCriterion("bConsignment not between", value1, value2, "bConsignment");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeIsNull() {
            addCriterion("szArticleType is null");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeIsNotNull() {
            addCriterion("szArticleType is not null");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeEqualTo(String value) {
            addCriterion("szArticleType =", value, "szArticleType");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeNotEqualTo(String value) {
            addCriterion("szArticleType <>", value, "szArticleType");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeGreaterThan(String value) {
            addCriterion("szArticleType >", value, "szArticleType");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("szArticleType >=", value, "szArticleType");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeLessThan(String value) {
            addCriterion("szArticleType <", value, "szArticleType");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeLessThanOrEqualTo(String value) {
            addCriterion("szArticleType <=", value, "szArticleType");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeLike(String value) {
            addCriterion("szArticleType like", value, "szArticleType");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeNotLike(String value) {
            addCriterion("szArticleType not like", value, "szArticleType");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeIn(List<String> values) {
            addCriterion("szArticleType in", values, "szArticleType");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeNotIn(List<String> values) {
            addCriterion("szArticleType not in", values, "szArticleType");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeBetween(String value1, String value2) {
            addCriterion("szArticleType between", value1, value2, "szArticleType");
            return (Criteria) this;
        }

        public Criteria andSzArticleTypeNotBetween(String value1, String value2) {
            addCriterion("szArticleType not between", value1, value2, "szArticleType");
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

        public Criteria andSzPurchaseGroupIsNull() {
            addCriterion("szPurchaseGroup is null");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupIsNotNull() {
            addCriterion("szPurchaseGroup is not null");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupEqualTo(String value) {
            addCriterion("szPurchaseGroup =", value, "szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupNotEqualTo(String value) {
            addCriterion("szPurchaseGroup <>", value, "szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupGreaterThan(String value) {
            addCriterion("szPurchaseGroup >", value, "szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupGreaterThanOrEqualTo(String value) {
            addCriterion("szPurchaseGroup >=", value, "szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupLessThan(String value) {
            addCriterion("szPurchaseGroup <", value, "szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupLessThanOrEqualTo(String value) {
            addCriterion("szPurchaseGroup <=", value, "szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupLike(String value) {
            addCriterion("szPurchaseGroup like", value, "szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupNotLike(String value) {
            addCriterion("szPurchaseGroup not like", value, "szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupIn(List<String> values) {
            addCriterion("szPurchaseGroup in", values, "szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupNotIn(List<String> values) {
            addCriterion("szPurchaseGroup not in", values, "szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupBetween(String value1, String value2) {
            addCriterion("szPurchaseGroup between", value1, value2, "szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andSzPurchaseGroupNotBetween(String value1, String value2) {
            addCriterion("szPurchaseGroup not between", value1, value2, "szPurchaseGroup");
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

        public Criteria andSzABCIndicatorDescIsNull() {
            addCriterion("szABCIndicatorDesc is null");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescIsNotNull() {
            addCriterion("szABCIndicatorDesc is not null");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescEqualTo(String value) {
            addCriterion("szABCIndicatorDesc =", value, "szABCIndicatorDesc");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescNotEqualTo(String value) {
            addCriterion("szABCIndicatorDesc <>", value, "szABCIndicatorDesc");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescGreaterThan(String value) {
            addCriterion("szABCIndicatorDesc >", value, "szABCIndicatorDesc");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescGreaterThanOrEqualTo(String value) {
            addCriterion("szABCIndicatorDesc >=", value, "szABCIndicatorDesc");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescLessThan(String value) {
            addCriterion("szABCIndicatorDesc <", value, "szABCIndicatorDesc");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescLessThanOrEqualTo(String value) {
            addCriterion("szABCIndicatorDesc <=", value, "szABCIndicatorDesc");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescLike(String value) {
            addCriterion("szABCIndicatorDesc like", value, "szABCIndicatorDesc");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescNotLike(String value) {
            addCriterion("szABCIndicatorDesc not like", value, "szABCIndicatorDesc");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescIn(List<String> values) {
            addCriterion("szABCIndicatorDesc in", values, "szABCIndicatorDesc");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescNotIn(List<String> values) {
            addCriterion("szABCIndicatorDesc not in", values, "szABCIndicatorDesc");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescBetween(String value1, String value2) {
            addCriterion("szABCIndicatorDesc between", value1, value2, "szABCIndicatorDesc");
            return (Criteria) this;
        }

        public Criteria andSzABCIndicatorDescNotBetween(String value1, String value2) {
            addCriterion("szABCIndicatorDesc not between", value1, value2, "szABCIndicatorDesc");
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