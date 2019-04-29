package com.model;

import java.util.ArrayList;
import java.util.List;

public class IMRetailStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IMRetailStoreExample() {
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

        public Criteria andLRetailStoreLookUpIDIsNull() {
            addCriterion("lRetailStoreLookUpID is null");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreLookUpIDIsNotNull() {
            addCriterion("lRetailStoreLookUpID is not null");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreLookUpIDEqualTo(Integer value) {
            addCriterion("lRetailStoreLookUpID =", value, "lRetailStoreLookUpID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreLookUpIDNotEqualTo(Integer value) {
            addCriterion("lRetailStoreLookUpID <>", value, "lRetailStoreLookUpID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreLookUpIDGreaterThan(Integer value) {
            addCriterion("lRetailStoreLookUpID >", value, "lRetailStoreLookUpID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreLookUpIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lRetailStoreLookUpID >=", value, "lRetailStoreLookUpID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreLookUpIDLessThan(Integer value) {
            addCriterion("lRetailStoreLookUpID <", value, "lRetailStoreLookUpID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreLookUpIDLessThanOrEqualTo(Integer value) {
            addCriterion("lRetailStoreLookUpID <=", value, "lRetailStoreLookUpID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreLookUpIDIn(List<Integer> values) {
            addCriterion("lRetailStoreLookUpID in", values, "lRetailStoreLookUpID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreLookUpIDNotIn(List<Integer> values) {
            addCriterion("lRetailStoreLookUpID not in", values, "lRetailStoreLookUpID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreLookUpIDBetween(Integer value1, Integer value2) {
            addCriterion("lRetailStoreLookUpID between", value1, value2, "lRetailStoreLookUpID");
            return (Criteria) this;
        }

        public Criteria andLRetailStoreLookUpIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lRetailStoreLookUpID not between", value1, value2, "lRetailStoreLookUpID");
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

        public Criteria andBIsReturnCDCIsNull() {
            addCriterion("bIsReturnCDC is null");
            return (Criteria) this;
        }

        public Criteria andBIsReturnCDCIsNotNull() {
            addCriterion("bIsReturnCDC is not null");
            return (Criteria) this;
        }

        public Criteria andBIsReturnCDCEqualTo(Integer value) {
            addCriterion("bIsReturnCDC =", value, "bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andBIsReturnCDCNotEqualTo(Integer value) {
            addCriterion("bIsReturnCDC <>", value, "bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andBIsReturnCDCGreaterThan(Integer value) {
            addCriterion("bIsReturnCDC >", value, "bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andBIsReturnCDCGreaterThanOrEqualTo(Integer value) {
            addCriterion("bIsReturnCDC >=", value, "bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andBIsReturnCDCLessThan(Integer value) {
            addCriterion("bIsReturnCDC <", value, "bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andBIsReturnCDCLessThanOrEqualTo(Integer value) {
            addCriterion("bIsReturnCDC <=", value, "bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andBIsReturnCDCIn(List<Integer> values) {
            addCriterion("bIsReturnCDC in", values, "bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andBIsReturnCDCNotIn(List<Integer> values) {
            addCriterion("bIsReturnCDC not in", values, "bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andBIsReturnCDCBetween(Integer value1, Integer value2) {
            addCriterion("bIsReturnCDC between", value1, value2, "bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andBIsReturnCDCNotBetween(Integer value1, Integer value2) {
            addCriterion("bIsReturnCDC not between", value1, value2, "bIsReturnCDC");
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