package com.model;

import java.util.ArrayList;
import java.util.List;

public class IMStockTakeItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IMStockTakeItemExample() {
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

        public Criteria andSzPosItemIDIsNull() {
            addCriterion("szPosItemID is null");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDIsNotNull() {
            addCriterion("szPosItemID is not null");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDEqualTo(String value) {
            addCriterion("szPosItemID =", value, "szPosItemID");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDNotEqualTo(String value) {
            addCriterion("szPosItemID <>", value, "szPosItemID");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDGreaterThan(String value) {
            addCriterion("szPosItemID >", value, "szPosItemID");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDGreaterThanOrEqualTo(String value) {
            addCriterion("szPosItemID >=", value, "szPosItemID");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDLessThan(String value) {
            addCriterion("szPosItemID <", value, "szPosItemID");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDLessThanOrEqualTo(String value) {
            addCriterion("szPosItemID <=", value, "szPosItemID");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDLike(String value) {
            addCriterion("szPosItemID like", value, "szPosItemID");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDNotLike(String value) {
            addCriterion("szPosItemID not like", value, "szPosItemID");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDIn(List<String> values) {
            addCriterion("szPosItemID in", values, "szPosItemID");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDNotIn(List<String> values) {
            addCriterion("szPosItemID not in", values, "szPosItemID");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDBetween(String value1, String value2) {
            addCriterion("szPosItemID between", value1, value2, "szPosItemID");
            return (Criteria) this;
        }

        public Criteria andSzPosItemIDNotBetween(String value1, String value2) {
            addCriterion("szPosItemID not between", value1, value2, "szPosItemID");
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