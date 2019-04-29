package com.model;

import java.util.ArrayList;
import java.util.List;

public class IMStockTakeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IMStockTakeExample() {
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

        public Criteria andSzStartTimeIsNull() {
            addCriterion("szStartTime is null");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeIsNotNull() {
            addCriterion("szStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeEqualTo(String value) {
            addCriterion("szStartTime =", value, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeNotEqualTo(String value) {
            addCriterion("szStartTime <>", value, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeGreaterThan(String value) {
            addCriterion("szStartTime >", value, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("szStartTime >=", value, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeLessThan(String value) {
            addCriterion("szStartTime <", value, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeLessThanOrEqualTo(String value) {
            addCriterion("szStartTime <=", value, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeLike(String value) {
            addCriterion("szStartTime like", value, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeNotLike(String value) {
            addCriterion("szStartTime not like", value, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeIn(List<String> values) {
            addCriterion("szStartTime in", values, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeNotIn(List<String> values) {
            addCriterion("szStartTime not in", values, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeBetween(String value1, String value2) {
            addCriterion("szStartTime between", value1, value2, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzStartTimeNotBetween(String value1, String value2) {
            addCriterion("szStartTime not between", value1, value2, "szStartTime");
            return (Criteria) this;
        }

        public Criteria andSzEndDateIsNull() {
            addCriterion("szEndDate is null");
            return (Criteria) this;
        }

        public Criteria andSzEndDateIsNotNull() {
            addCriterion("szEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzEndDateEqualTo(String value) {
            addCriterion("szEndDate =", value, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndDateNotEqualTo(String value) {
            addCriterion("szEndDate <>", value, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndDateGreaterThan(String value) {
            addCriterion("szEndDate >", value, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("szEndDate >=", value, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndDateLessThan(String value) {
            addCriterion("szEndDate <", value, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndDateLessThanOrEqualTo(String value) {
            addCriterion("szEndDate <=", value, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndDateLike(String value) {
            addCriterion("szEndDate like", value, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndDateNotLike(String value) {
            addCriterion("szEndDate not like", value, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndDateIn(List<String> values) {
            addCriterion("szEndDate in", values, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndDateNotIn(List<String> values) {
            addCriterion("szEndDate not in", values, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndDateBetween(String value1, String value2) {
            addCriterion("szEndDate between", value1, value2, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndDateNotBetween(String value1, String value2) {
            addCriterion("szEndDate not between", value1, value2, "szEndDate");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeIsNull() {
            addCriterion("szEndTime is null");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeIsNotNull() {
            addCriterion("szEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeEqualTo(String value) {
            addCriterion("szEndTime =", value, "szEndTime");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeNotEqualTo(String value) {
            addCriterion("szEndTime <>", value, "szEndTime");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeGreaterThan(String value) {
            addCriterion("szEndTime >", value, "szEndTime");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("szEndTime >=", value, "szEndTime");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeLessThan(String value) {
            addCriterion("szEndTime <", value, "szEndTime");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeLessThanOrEqualTo(String value) {
            addCriterion("szEndTime <=", value, "szEndTime");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeLike(String value) {
            addCriterion("szEndTime like", value, "szEndTime");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeNotLike(String value) {
            addCriterion("szEndTime not like", value, "szEndTime");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeIn(List<String> values) {
            addCriterion("szEndTime in", values, "szEndTime");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeNotIn(List<String> values) {
            addCriterion("szEndTime not in", values, "szEndTime");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeBetween(String value1, String value2) {
            addCriterion("szEndTime between", value1, value2, "szEndTime");
            return (Criteria) this;
        }

        public Criteria andSzEndTimeNotBetween(String value1, String value2) {
            addCriterion("szEndTime not between", value1, value2, "szEndTime");
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

        public Criteria andSzDescIsNull() {
            addCriterion("szDesc is null");
            return (Criteria) this;
        }

        public Criteria andSzDescIsNotNull() {
            addCriterion("szDesc is not null");
            return (Criteria) this;
        }

        public Criteria andSzDescEqualTo(String value) {
            addCriterion("szDesc =", value, "szDesc");
            return (Criteria) this;
        }

        public Criteria andSzDescNotEqualTo(String value) {
            addCriterion("szDesc <>", value, "szDesc");
            return (Criteria) this;
        }

        public Criteria andSzDescGreaterThan(String value) {
            addCriterion("szDesc >", value, "szDesc");
            return (Criteria) this;
        }

        public Criteria andSzDescGreaterThanOrEqualTo(String value) {
            addCriterion("szDesc >=", value, "szDesc");
            return (Criteria) this;
        }

        public Criteria andSzDescLessThan(String value) {
            addCriterion("szDesc <", value, "szDesc");
            return (Criteria) this;
        }

        public Criteria andSzDescLessThanOrEqualTo(String value) {
            addCriterion("szDesc <=", value, "szDesc");
            return (Criteria) this;
        }

        public Criteria andSzDescLike(String value) {
            addCriterion("szDesc like", value, "szDesc");
            return (Criteria) this;
        }

        public Criteria andSzDescNotLike(String value) {
            addCriterion("szDesc not like", value, "szDesc");
            return (Criteria) this;
        }

        public Criteria andSzDescIn(List<String> values) {
            addCriterion("szDesc in", values, "szDesc");
            return (Criteria) this;
        }

        public Criteria andSzDescNotIn(List<String> values) {
            addCriterion("szDesc not in", values, "szDesc");
            return (Criteria) this;
        }

        public Criteria andSzDescBetween(String value1, String value2) {
            addCriterion("szDesc between", value1, value2, "szDesc");
            return (Criteria) this;
        }

        public Criteria andSzDescNotBetween(String value1, String value2) {
            addCriterion("szDesc not between", value1, value2, "szDesc");
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

        public Criteria andLCountIsNull() {
            addCriterion("lCount is null");
            return (Criteria) this;
        }

        public Criteria andLCountIsNotNull() {
            addCriterion("lCount is not null");
            return (Criteria) this;
        }

        public Criteria andLCountEqualTo(Integer value) {
            addCriterion("lCount =", value, "lCount");
            return (Criteria) this;
        }

        public Criteria andLCountNotEqualTo(Integer value) {
            addCriterion("lCount <>", value, "lCount");
            return (Criteria) this;
        }

        public Criteria andLCountGreaterThan(Integer value) {
            addCriterion("lCount >", value, "lCount");
            return (Criteria) this;
        }

        public Criteria andLCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lCount >=", value, "lCount");
            return (Criteria) this;
        }

        public Criteria andLCountLessThan(Integer value) {
            addCriterion("lCount <", value, "lCount");
            return (Criteria) this;
        }

        public Criteria andLCountLessThanOrEqualTo(Integer value) {
            addCriterion("lCount <=", value, "lCount");
            return (Criteria) this;
        }

        public Criteria andLCountIn(List<Integer> values) {
            addCriterion("lCount in", values, "lCount");
            return (Criteria) this;
        }

        public Criteria andLCountNotIn(List<Integer> values) {
            addCriterion("lCount not in", values, "lCount");
            return (Criteria) this;
        }

        public Criteria andLCountBetween(Integer value1, Integer value2) {
            addCriterion("lCount between", value1, value2, "lCount");
            return (Criteria) this;
        }

        public Criteria andLCountNotBetween(Integer value1, Integer value2) {
            addCriterion("lCount not between", value1, value2, "lCount");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTIsNull() {
            addCriterion("bDownloadedToHHT is null");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTIsNotNull() {
            addCriterion("bDownloadedToHHT is not null");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTEqualTo(Integer value) {
            addCriterion("bDownloadedToHHT =", value, "bDownloadedToHHT");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTNotEqualTo(Integer value) {
            addCriterion("bDownloadedToHHT <>", value, "bDownloadedToHHT");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTGreaterThan(Integer value) {
            addCriterion("bDownloadedToHHT >", value, "bDownloadedToHHT");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTGreaterThanOrEqualTo(Integer value) {
            addCriterion("bDownloadedToHHT >=", value, "bDownloadedToHHT");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTLessThan(Integer value) {
            addCriterion("bDownloadedToHHT <", value, "bDownloadedToHHT");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTLessThanOrEqualTo(Integer value) {
            addCriterion("bDownloadedToHHT <=", value, "bDownloadedToHHT");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTIn(List<Integer> values) {
            addCriterion("bDownloadedToHHT in", values, "bDownloadedToHHT");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTNotIn(List<Integer> values) {
            addCriterion("bDownloadedToHHT not in", values, "bDownloadedToHHT");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTBetween(Integer value1, Integer value2) {
            addCriterion("bDownloadedToHHT between", value1, value2, "bDownloadedToHHT");
            return (Criteria) this;
        }

        public Criteria andBDownloadedToHHTNotBetween(Integer value1, Integer value2) {
            addCriterion("bDownloadedToHHT not between", value1, value2, "bDownloadedToHHT");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateIsNull() {
            addCriterion("szDeleteDate is null");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateIsNotNull() {
            addCriterion("szDeleteDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateEqualTo(String value) {
            addCriterion("szDeleteDate =", value, "szDeleteDate");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateNotEqualTo(String value) {
            addCriterion("szDeleteDate <>", value, "szDeleteDate");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateGreaterThan(String value) {
            addCriterion("szDeleteDate >", value, "szDeleteDate");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateGreaterThanOrEqualTo(String value) {
            addCriterion("szDeleteDate >=", value, "szDeleteDate");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateLessThan(String value) {
            addCriterion("szDeleteDate <", value, "szDeleteDate");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateLessThanOrEqualTo(String value) {
            addCriterion("szDeleteDate <=", value, "szDeleteDate");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateLike(String value) {
            addCriterion("szDeleteDate like", value, "szDeleteDate");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateNotLike(String value) {
            addCriterion("szDeleteDate not like", value, "szDeleteDate");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateIn(List<String> values) {
            addCriterion("szDeleteDate in", values, "szDeleteDate");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateNotIn(List<String> values) {
            addCriterion("szDeleteDate not in", values, "szDeleteDate");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateBetween(String value1, String value2) {
            addCriterion("szDeleteDate between", value1, value2, "szDeleteDate");
            return (Criteria) this;
        }

        public Criteria andSzDeleteDateNotBetween(String value1, String value2) {
            addCriterion("szDeleteDate not between", value1, value2, "szDeleteDate");
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

        public Criteria andSzPOSDepartmentIDIsNull() {
            addCriterion("szPOSDepartmentID is null");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDIsNotNull() {
            addCriterion("szPOSDepartmentID is not null");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDEqualTo(String value) {
            addCriterion("szPOSDepartmentID =", value, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDNotEqualTo(String value) {
            addCriterion("szPOSDepartmentID <>", value, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDGreaterThan(String value) {
            addCriterion("szPOSDepartmentID >", value, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDGreaterThanOrEqualTo(String value) {
            addCriterion("szPOSDepartmentID >=", value, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDLessThan(String value) {
            addCriterion("szPOSDepartmentID <", value, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDLessThanOrEqualTo(String value) {
            addCriterion("szPOSDepartmentID <=", value, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDLike(String value) {
            addCriterion("szPOSDepartmentID like", value, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDNotLike(String value) {
            addCriterion("szPOSDepartmentID not like", value, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDIn(List<String> values) {
            addCriterion("szPOSDepartmentID in", values, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDNotIn(List<String> values) {
            addCriterion("szPOSDepartmentID not in", values, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDBetween(String value1, String value2) {
            addCriterion("szPOSDepartmentID between", value1, value2, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzPOSDepartmentIDNotBetween(String value1, String value2) {
            addCriterion("szPOSDepartmentID not between", value1, value2, "szPOSDepartmentID");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSAIsNull() {
            addCriterion("szSemrisPSA is null");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSAIsNotNull() {
            addCriterion("szSemrisPSA is not null");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSAEqualTo(String value) {
            addCriterion("szSemrisPSA =", value, "szSemrisPSA");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSANotEqualTo(String value) {
            addCriterion("szSemrisPSA <>", value, "szSemrisPSA");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSAGreaterThan(String value) {
            addCriterion("szSemrisPSA >", value, "szSemrisPSA");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSAGreaterThanOrEqualTo(String value) {
            addCriterion("szSemrisPSA >=", value, "szSemrisPSA");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSALessThan(String value) {
            addCriterion("szSemrisPSA <", value, "szSemrisPSA");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSALessThanOrEqualTo(String value) {
            addCriterion("szSemrisPSA <=", value, "szSemrisPSA");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSALike(String value) {
            addCriterion("szSemrisPSA like", value, "szSemrisPSA");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSANotLike(String value) {
            addCriterion("szSemrisPSA not like", value, "szSemrisPSA");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSAIn(List<String> values) {
            addCriterion("szSemrisPSA in", values, "szSemrisPSA");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSANotIn(List<String> values) {
            addCriterion("szSemrisPSA not in", values, "szSemrisPSA");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSABetween(String value1, String value2) {
            addCriterion("szSemrisPSA between", value1, value2, "szSemrisPSA");
            return (Criteria) this;
        }

        public Criteria andSzSemrisPSANotBetween(String value1, String value2) {
            addCriterion("szSemrisPSA not between", value1, value2, "szSemrisPSA");
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