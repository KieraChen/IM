package com.model;

import java.util.ArrayList;
import java.util.List;

public class ItemCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemCategoryExample() {
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

        public Criteria andSzItemCategoryTypeCodeIsNull() {
            addCriterion("szItemCategoryTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeIsNotNull() {
            addCriterion("szItemCategoryTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeEqualTo(String value) {
            addCriterion("szItemCategoryTypeCode =", value, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeNotEqualTo(String value) {
            addCriterion("szItemCategoryTypeCode <>", value, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeGreaterThan(String value) {
            addCriterion("szItemCategoryTypeCode >", value, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("szItemCategoryTypeCode >=", value, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeLessThan(String value) {
            addCriterion("szItemCategoryTypeCode <", value, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("szItemCategoryTypeCode <=", value, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeLike(String value) {
            addCriterion("szItemCategoryTypeCode like", value, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeNotLike(String value) {
            addCriterion("szItemCategoryTypeCode not like", value, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeIn(List<String> values) {
            addCriterion("szItemCategoryTypeCode in", values, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeNotIn(List<String> values) {
            addCriterion("szItemCategoryTypeCode not in", values, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeBetween(String value1, String value2) {
            addCriterion("szItemCategoryTypeCode between", value1, value2, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzItemCategoryTypeCodeNotBetween(String value1, String value2) {
            addCriterion("szItemCategoryTypeCode not between", value1, value2, "szItemCategoryTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzNameIsNull() {
            addCriterion("szName is null");
            return (Criteria) this;
        }

        public Criteria andSzNameIsNotNull() {
            addCriterion("szName is not null");
            return (Criteria) this;
        }

        public Criteria andSzNameEqualTo(String value) {
            addCriterion("szName =", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameNotEqualTo(String value) {
            addCriterion("szName <>", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameGreaterThan(String value) {
            addCriterion("szName >", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameGreaterThanOrEqualTo(String value) {
            addCriterion("szName >=", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameLessThan(String value) {
            addCriterion("szName <", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameLessThanOrEqualTo(String value) {
            addCriterion("szName <=", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameLike(String value) {
            addCriterion("szName like", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameNotLike(String value) {
            addCriterion("szName not like", value, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameIn(List<String> values) {
            addCriterion("szName in", values, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameNotIn(List<String> values) {
            addCriterion("szName not in", values, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameBetween(String value1, String value2) {
            addCriterion("szName between", value1, value2, "szName");
            return (Criteria) this;
        }

        public Criteria andSzNameNotBetween(String value1, String value2) {
            addCriterion("szName not between", value1, value2, "szName");
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

        public Criteria andLDummy2631IsNull() {
            addCriterion("lDummy2631 is null");
            return (Criteria) this;
        }

        public Criteria andLDummy2631IsNotNull() {
            addCriterion("lDummy2631 is not null");
            return (Criteria) this;
        }

        public Criteria andLDummy2631EqualTo(Integer value) {
            addCriterion("lDummy2631 =", value, "lDummy2631");
            return (Criteria) this;
        }

        public Criteria andLDummy2631NotEqualTo(Integer value) {
            addCriterion("lDummy2631 <>", value, "lDummy2631");
            return (Criteria) this;
        }

        public Criteria andLDummy2631GreaterThan(Integer value) {
            addCriterion("lDummy2631 >", value, "lDummy2631");
            return (Criteria) this;
        }

        public Criteria andLDummy2631GreaterThanOrEqualTo(Integer value) {
            addCriterion("lDummy2631 >=", value, "lDummy2631");
            return (Criteria) this;
        }

        public Criteria andLDummy2631LessThan(Integer value) {
            addCriterion("lDummy2631 <", value, "lDummy2631");
            return (Criteria) this;
        }

        public Criteria andLDummy2631LessThanOrEqualTo(Integer value) {
            addCriterion("lDummy2631 <=", value, "lDummy2631");
            return (Criteria) this;
        }

        public Criteria andLDummy2631In(List<Integer> values) {
            addCriterion("lDummy2631 in", values, "lDummy2631");
            return (Criteria) this;
        }

        public Criteria andLDummy2631NotIn(List<Integer> values) {
            addCriterion("lDummy2631 not in", values, "lDummy2631");
            return (Criteria) this;
        }

        public Criteria andLDummy2631Between(Integer value1, Integer value2) {
            addCriterion("lDummy2631 between", value1, value2, "lDummy2631");
            return (Criteria) this;
        }

        public Criteria andLDummy2631NotBetween(Integer value1, Integer value2) {
            addCriterion("lDummy2631 not between", value1, value2, "lDummy2631");
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

        public Criteria andUidObjectIDIsNull() {
            addCriterion("uidObjectID is null");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDIsNotNull() {
            addCriterion("uidObjectID is not null");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDEqualTo(String value) {
            addCriterion("uidObjectID =", value, "uidObjectID");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDNotEqualTo(String value) {
            addCriterion("uidObjectID <>", value, "uidObjectID");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDGreaterThan(String value) {
            addCriterion("uidObjectID >", value, "uidObjectID");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDGreaterThanOrEqualTo(String value) {
            addCriterion("uidObjectID >=", value, "uidObjectID");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDLessThan(String value) {
            addCriterion("uidObjectID <", value, "uidObjectID");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDLessThanOrEqualTo(String value) {
            addCriterion("uidObjectID <=", value, "uidObjectID");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDLike(String value) {
            addCriterion("uidObjectID like", value, "uidObjectID");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDNotLike(String value) {
            addCriterion("uidObjectID not like", value, "uidObjectID");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDIn(List<String> values) {
            addCriterion("uidObjectID in", values, "uidObjectID");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDNotIn(List<String> values) {
            addCriterion("uidObjectID not in", values, "uidObjectID");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDBetween(String value1, String value2) {
            addCriterion("uidObjectID between", value1, value2, "uidObjectID");
            return (Criteria) this;
        }

        public Criteria andUidObjectIDNotBetween(String value1, String value2) {
            addCriterion("uidObjectID not between", value1, value2, "uidObjectID");
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