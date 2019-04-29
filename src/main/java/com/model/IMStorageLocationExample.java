package com.model;

import java.util.ArrayList;
import java.util.List;

public class IMStorageLocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IMStorageLocationExample() {
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

        public Criteria andSzStorageLocationNameIsNull() {
            addCriterion("szStorageLocationName is null");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameIsNotNull() {
            addCriterion("szStorageLocationName is not null");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameEqualTo(String value) {
            addCriterion("szStorageLocationName =", value, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameNotEqualTo(String value) {
            addCriterion("szStorageLocationName <>", value, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameGreaterThan(String value) {
            addCriterion("szStorageLocationName >", value, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("szStorageLocationName >=", value, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameLessThan(String value) {
            addCriterion("szStorageLocationName <", value, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameLessThanOrEqualTo(String value) {
            addCriterion("szStorageLocationName <=", value, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameLike(String value) {
            addCriterion("szStorageLocationName like", value, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameNotLike(String value) {
            addCriterion("szStorageLocationName not like", value, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameIn(List<String> values) {
            addCriterion("szStorageLocationName in", values, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameNotIn(List<String> values) {
            addCriterion("szStorageLocationName not in", values, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameBetween(String value1, String value2) {
            addCriterion("szStorageLocationName between", value1, value2, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationNameNotBetween(String value1, String value2) {
            addCriterion("szStorageLocationName not between", value1, value2, "szStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescIsNull() {
            addCriterion("szStorageLocationDesc is null");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescIsNotNull() {
            addCriterion("szStorageLocationDesc is not null");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescEqualTo(String value) {
            addCriterion("szStorageLocationDesc =", value, "szStorageLocationDesc");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescNotEqualTo(String value) {
            addCriterion("szStorageLocationDesc <>", value, "szStorageLocationDesc");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescGreaterThan(String value) {
            addCriterion("szStorageLocationDesc >", value, "szStorageLocationDesc");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescGreaterThanOrEqualTo(String value) {
            addCriterion("szStorageLocationDesc >=", value, "szStorageLocationDesc");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescLessThan(String value) {
            addCriterion("szStorageLocationDesc <", value, "szStorageLocationDesc");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescLessThanOrEqualTo(String value) {
            addCriterion("szStorageLocationDesc <=", value, "szStorageLocationDesc");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescLike(String value) {
            addCriterion("szStorageLocationDesc like", value, "szStorageLocationDesc");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescNotLike(String value) {
            addCriterion("szStorageLocationDesc not like", value, "szStorageLocationDesc");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescIn(List<String> values) {
            addCriterion("szStorageLocationDesc in", values, "szStorageLocationDesc");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescNotIn(List<String> values) {
            addCriterion("szStorageLocationDesc not in", values, "szStorageLocationDesc");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescBetween(String value1, String value2) {
            addCriterion("szStorageLocationDesc between", value1, value2, "szStorageLocationDesc");
            return (Criteria) this;
        }

        public Criteria andSzStorageLocationDescNotBetween(String value1, String value2) {
            addCriterion("szStorageLocationDesc not between", value1, value2, "szStorageLocationDesc");
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