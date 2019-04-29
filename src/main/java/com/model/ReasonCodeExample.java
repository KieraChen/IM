package com.model;

import java.util.ArrayList;
import java.util.List;

public class ReasonCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReasonCodeExample() {
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

        public Criteria andLDomainIDIsNull() {
            addCriterion("lDomainID is null");
            return (Criteria) this;
        }

        public Criteria andLDomainIDIsNotNull() {
            addCriterion("lDomainID is not null");
            return (Criteria) this;
        }

        public Criteria andLDomainIDEqualTo(Integer value) {
            addCriterion("lDomainID =", value, "lDomainID");
            return (Criteria) this;
        }

        public Criteria andLDomainIDNotEqualTo(Integer value) {
            addCriterion("lDomainID <>", value, "lDomainID");
            return (Criteria) this;
        }

        public Criteria andLDomainIDGreaterThan(Integer value) {
            addCriterion("lDomainID >", value, "lDomainID");
            return (Criteria) this;
        }

        public Criteria andLDomainIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lDomainID >=", value, "lDomainID");
            return (Criteria) this;
        }

        public Criteria andLDomainIDLessThan(Integer value) {
            addCriterion("lDomainID <", value, "lDomainID");
            return (Criteria) this;
        }

        public Criteria andLDomainIDLessThanOrEqualTo(Integer value) {
            addCriterion("lDomainID <=", value, "lDomainID");
            return (Criteria) this;
        }

        public Criteria andLDomainIDIn(List<Integer> values) {
            addCriterion("lDomainID in", values, "lDomainID");
            return (Criteria) this;
        }

        public Criteria andLDomainIDNotIn(List<Integer> values) {
            addCriterion("lDomainID not in", values, "lDomainID");
            return (Criteria) this;
        }

        public Criteria andLDomainIDBetween(Integer value1, Integer value2) {
            addCriterion("lDomainID between", value1, value2, "lDomainID");
            return (Criteria) this;
        }

        public Criteria andLDomainIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lDomainID not between", value1, value2, "lDomainID");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeIsNull() {
            addCriterion("szLanguageCode is null");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeIsNotNull() {
            addCriterion("szLanguageCode is not null");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeEqualTo(String value) {
            addCriterion("szLanguageCode =", value, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeNotEqualTo(String value) {
            addCriterion("szLanguageCode <>", value, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeGreaterThan(String value) {
            addCriterion("szLanguageCode >", value, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("szLanguageCode >=", value, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeLessThan(String value) {
            addCriterion("szLanguageCode <", value, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeLessThanOrEqualTo(String value) {
            addCriterion("szLanguageCode <=", value, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeLike(String value) {
            addCriterion("szLanguageCode like", value, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeNotLike(String value) {
            addCriterion("szLanguageCode not like", value, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeIn(List<String> values) {
            addCriterion("szLanguageCode in", values, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeNotIn(List<String> values) {
            addCriterion("szLanguageCode not in", values, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeBetween(String value1, String value2) {
            addCriterion("szLanguageCode between", value1, value2, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzLanguageCodeNotBetween(String value1, String value2) {
            addCriterion("szLanguageCode not between", value1, value2, "szLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1IsNull() {
            addCriterion("szDomainAreaKeyPart1 is null");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1IsNotNull() {
            addCriterion("szDomainAreaKeyPart1 is not null");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1EqualTo(String value) {
            addCriterion("szDomainAreaKeyPart1 =", value, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1NotEqualTo(String value) {
            addCriterion("szDomainAreaKeyPart1 <>", value, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1GreaterThan(String value) {
            addCriterion("szDomainAreaKeyPart1 >", value, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1GreaterThanOrEqualTo(String value) {
            addCriterion("szDomainAreaKeyPart1 >=", value, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1LessThan(String value) {
            addCriterion("szDomainAreaKeyPart1 <", value, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1LessThanOrEqualTo(String value) {
            addCriterion("szDomainAreaKeyPart1 <=", value, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1Like(String value) {
            addCriterion("szDomainAreaKeyPart1 like", value, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1NotLike(String value) {
            addCriterion("szDomainAreaKeyPart1 not like", value, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1In(List<String> values) {
            addCriterion("szDomainAreaKeyPart1 in", values, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1NotIn(List<String> values) {
            addCriterion("szDomainAreaKeyPart1 not in", values, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1Between(String value1, String value2) {
            addCriterion("szDomainAreaKeyPart1 between", value1, value2, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart1NotBetween(String value1, String value2) {
            addCriterion("szDomainAreaKeyPart1 not between", value1, value2, "szDomainAreaKeyPart1");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2IsNull() {
            addCriterion("szDomainAreaKeyPart2 is null");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2IsNotNull() {
            addCriterion("szDomainAreaKeyPart2 is not null");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2EqualTo(String value) {
            addCriterion("szDomainAreaKeyPart2 =", value, "szDomainAreaKeyPart2");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2NotEqualTo(String value) {
            addCriterion("szDomainAreaKeyPart2 <>", value, "szDomainAreaKeyPart2");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2GreaterThan(String value) {
            addCriterion("szDomainAreaKeyPart2 >", value, "szDomainAreaKeyPart2");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2GreaterThanOrEqualTo(String value) {
            addCriterion("szDomainAreaKeyPart2 >=", value, "szDomainAreaKeyPart2");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2LessThan(String value) {
            addCriterion("szDomainAreaKeyPart2 <", value, "szDomainAreaKeyPart2");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2LessThanOrEqualTo(String value) {
            addCriterion("szDomainAreaKeyPart2 <=", value, "szDomainAreaKeyPart2");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2Like(String value) {
            addCriterion("szDomainAreaKeyPart2 like", value, "szDomainAreaKeyPart2");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2NotLike(String value) {
            addCriterion("szDomainAreaKeyPart2 not like", value, "szDomainAreaKeyPart2");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2In(List<String> values) {
            addCriterion("szDomainAreaKeyPart2 in", values, "szDomainAreaKeyPart2");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2NotIn(List<String> values) {
            addCriterion("szDomainAreaKeyPart2 not in", values, "szDomainAreaKeyPart2");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2Between(String value1, String value2) {
            addCriterion("szDomainAreaKeyPart2 between", value1, value2, "szDomainAreaKeyPart2");
            return (Criteria) this;
        }

        public Criteria andSzDomainAreaKeyPart2NotBetween(String value1, String value2) {
            addCriterion("szDomainAreaKeyPart2 not between", value1, value2, "szDomainAreaKeyPart2");
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

        public Criteria andIM_szReasonGroupCodeIsNull() {
            addCriterion("IM_szReasonGroupCode is null");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeIsNotNull() {
            addCriterion("IM_szReasonGroupCode is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeEqualTo(String value) {
            addCriterion("IM_szReasonGroupCode =", value, "IM_szReasonGroupCode");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeNotEqualTo(String value) {
            addCriterion("IM_szReasonGroupCode <>", value, "IM_szReasonGroupCode");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeGreaterThan(String value) {
            addCriterion("IM_szReasonGroupCode >", value, "IM_szReasonGroupCode");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szReasonGroupCode >=", value, "IM_szReasonGroupCode");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeLessThan(String value) {
            addCriterion("IM_szReasonGroupCode <", value, "IM_szReasonGroupCode");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeLessThanOrEqualTo(String value) {
            addCriterion("IM_szReasonGroupCode <=", value, "IM_szReasonGroupCode");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeLike(String value) {
            addCriterion("IM_szReasonGroupCode like", value, "IM_szReasonGroupCode");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeNotLike(String value) {
            addCriterion("IM_szReasonGroupCode not like", value, "IM_szReasonGroupCode");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeIn(List<String> values) {
            addCriterion("IM_szReasonGroupCode in", values, "IM_szReasonGroupCode");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeNotIn(List<String> values) {
            addCriterion("IM_szReasonGroupCode not in", values, "IM_szReasonGroupCode");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeBetween(String value1, String value2) {
            addCriterion("IM_szReasonGroupCode between", value1, value2, "IM_szReasonGroupCode");
            return (Criteria) this;
        }

        public Criteria andIM_szReasonGroupCodeNotBetween(String value1, String value2) {
            addCriterion("IM_szReasonGroupCode not between", value1, value2, "IM_szReasonGroupCode");
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