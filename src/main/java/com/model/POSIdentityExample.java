package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class POSIdentityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public POSIdentityExample() {
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

        public Criteria andSzItemIdIsNull() {
            addCriterion("szItemId is null");
            return (Criteria) this;
        }

        public Criteria andSzItemIdIsNotNull() {
            addCriterion("szItemId is not null");
            return (Criteria) this;
        }

        public Criteria andSzItemIdEqualTo(String value) {
            addCriterion("szItemId =", value, "szItemId");
            return (Criteria) this;
        }

        public Criteria andSzItemIdNotEqualTo(String value) {
            addCriterion("szItemId <>", value, "szItemId");
            return (Criteria) this;
        }

        public Criteria andSzItemIdGreaterThan(String value) {
            addCriterion("szItemId >", value, "szItemId");
            return (Criteria) this;
        }

        public Criteria andSzItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("szItemId >=", value, "szItemId");
            return (Criteria) this;
        }

        public Criteria andSzItemIdLessThan(String value) {
            addCriterion("szItemId <", value, "szItemId");
            return (Criteria) this;
        }

        public Criteria andSzItemIdLessThanOrEqualTo(String value) {
            addCriterion("szItemId <=", value, "szItemId");
            return (Criteria) this;
        }

        public Criteria andSzItemIdLike(String value) {
            addCriterion("szItemId like", value, "szItemId");
            return (Criteria) this;
        }

        public Criteria andSzItemIdNotLike(String value) {
            addCriterion("szItemId not like", value, "szItemId");
            return (Criteria) this;
        }

        public Criteria andSzItemIdIn(List<String> values) {
            addCriterion("szItemId in", values, "szItemId");
            return (Criteria) this;
        }

        public Criteria andSzItemIdNotIn(List<String> values) {
            addCriterion("szItemId not in", values, "szItemId");
            return (Criteria) this;
        }

        public Criteria andSzItemIdBetween(String value1, String value2) {
            addCriterion("szItemId between", value1, value2, "szItemId");
            return (Criteria) this;
        }

        public Criteria andSzItemIdNotBetween(String value1, String value2) {
            addCriterion("szItemId not between", value1, value2, "szItemId");
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

        public Criteria andSzDesc1IsNull() {
            addCriterion("szDesc1 is null");
            return (Criteria) this;
        }

        public Criteria andSzDesc1IsNotNull() {
            addCriterion("szDesc1 is not null");
            return (Criteria) this;
        }

        public Criteria andSzDesc1EqualTo(String value) {
            addCriterion("szDesc1 =", value, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc1NotEqualTo(String value) {
            addCriterion("szDesc1 <>", value, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc1GreaterThan(String value) {
            addCriterion("szDesc1 >", value, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc1GreaterThanOrEqualTo(String value) {
            addCriterion("szDesc1 >=", value, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc1LessThan(String value) {
            addCriterion("szDesc1 <", value, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc1LessThanOrEqualTo(String value) {
            addCriterion("szDesc1 <=", value, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc1Like(String value) {
            addCriterion("szDesc1 like", value, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc1NotLike(String value) {
            addCriterion("szDesc1 not like", value, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc1In(List<String> values) {
            addCriterion("szDesc1 in", values, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc1NotIn(List<String> values) {
            addCriterion("szDesc1 not in", values, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc1Between(String value1, String value2) {
            addCriterion("szDesc1 between", value1, value2, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc1NotBetween(String value1, String value2) {
            addCriterion("szDesc1 not between", value1, value2, "szDesc1");
            return (Criteria) this;
        }

        public Criteria andSzDesc2IsNull() {
            addCriterion("szDesc2 is null");
            return (Criteria) this;
        }

        public Criteria andSzDesc2IsNotNull() {
            addCriterion("szDesc2 is not null");
            return (Criteria) this;
        }

        public Criteria andSzDesc2EqualTo(String value) {
            addCriterion("szDesc2 =", value, "szDesc2");
            return (Criteria) this;
        }

        public Criteria andSzDesc2NotEqualTo(String value) {
            addCriterion("szDesc2 <>", value, "szDesc2");
            return (Criteria) this;
        }

        public Criteria andSzDesc2GreaterThan(String value) {
            addCriterion("szDesc2 >", value, "szDesc2");
            return (Criteria) this;
        }

        public Criteria andSzDesc2GreaterThanOrEqualTo(String value) {
            addCriterion("szDesc2 >=", value, "szDesc2");
            return (Criteria) this;
        }

        public Criteria andSzDesc2LessThan(String value) {
            addCriterion("szDesc2 <", value, "szDesc2");
            return (Criteria) this;
        }

        public Criteria andSzDesc2LessThanOrEqualTo(String value) {
            addCriterion("szDesc2 <=", value, "szDesc2");
            return (Criteria) this;
        }

        public Criteria andSzDesc2Like(String value) {
            addCriterion("szDesc2 like", value, "szDesc2");
            return (Criteria) this;
        }

        public Criteria andSzDesc2NotLike(String value) {
            addCriterion("szDesc2 not like", value, "szDesc2");
            return (Criteria) this;
        }

        public Criteria andSzDesc2In(List<String> values) {
            addCriterion("szDesc2 in", values, "szDesc2");
            return (Criteria) this;
        }

        public Criteria andSzDesc2NotIn(List<String> values) {
            addCriterion("szDesc2 not in", values, "szDesc2");
            return (Criteria) this;
        }

        public Criteria andSzDesc2Between(String value1, String value2) {
            addCriterion("szDesc2 between", value1, value2, "szDesc2");
            return (Criteria) this;
        }

        public Criteria andSzDesc2NotBetween(String value1, String value2) {
            addCriterion("szDesc2 not between", value1, value2, "szDesc2");
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

        public Criteria andBPriceEntryRequiredFlagIsNull() {
            addCriterion("bPriceEntryRequiredFlag is null");
            return (Criteria) this;
        }

        public Criteria andBPriceEntryRequiredFlagIsNotNull() {
            addCriterion("bPriceEntryRequiredFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBPriceEntryRequiredFlagEqualTo(Short value) {
            addCriterion("bPriceEntryRequiredFlag =", value, "bPriceEntryRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceEntryRequiredFlagNotEqualTo(Short value) {
            addCriterion("bPriceEntryRequiredFlag <>", value, "bPriceEntryRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceEntryRequiredFlagGreaterThan(Short value) {
            addCriterion("bPriceEntryRequiredFlag >", value, "bPriceEntryRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceEntryRequiredFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bPriceEntryRequiredFlag >=", value, "bPriceEntryRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceEntryRequiredFlagLessThan(Short value) {
            addCriterion("bPriceEntryRequiredFlag <", value, "bPriceEntryRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceEntryRequiredFlagLessThanOrEqualTo(Short value) {
            addCriterion("bPriceEntryRequiredFlag <=", value, "bPriceEntryRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceEntryRequiredFlagIn(List<Short> values) {
            addCriterion("bPriceEntryRequiredFlag in", values, "bPriceEntryRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceEntryRequiredFlagNotIn(List<Short> values) {
            addCriterion("bPriceEntryRequiredFlag not in", values, "bPriceEntryRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceEntryRequiredFlagBetween(Short value1, Short value2) {
            addCriterion("bPriceEntryRequiredFlag between", value1, value2, "bPriceEntryRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceEntryRequiredFlagNotBetween(Short value1, Short value2) {
            addCriterion("bPriceEntryRequiredFlag not between", value1, value2, "bPriceEntryRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredIsNull() {
            addCriterion("bMeasurementEntryRequired is null");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredIsNotNull() {
            addCriterion("bMeasurementEntryRequired is not null");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredEqualTo(Short value) {
            addCriterion("bMeasurementEntryRequired =", value, "bMeasurementEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredNotEqualTo(Short value) {
            addCriterion("bMeasurementEntryRequired <>", value, "bMeasurementEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredGreaterThan(Short value) {
            addCriterion("bMeasurementEntryRequired >", value, "bMeasurementEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredGreaterThanOrEqualTo(Short value) {
            addCriterion("bMeasurementEntryRequired >=", value, "bMeasurementEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredLessThan(Short value) {
            addCriterion("bMeasurementEntryRequired <", value, "bMeasurementEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredLessThanOrEqualTo(Short value) {
            addCriterion("bMeasurementEntryRequired <=", value, "bMeasurementEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredIn(List<Short> values) {
            addCriterion("bMeasurementEntryRequired in", values, "bMeasurementEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredNotIn(List<Short> values) {
            addCriterion("bMeasurementEntryRequired not in", values, "bMeasurementEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredBetween(Short value1, Short value2) {
            addCriterion("bMeasurementEntryRequired between", value1, value2, "bMeasurementEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBMeasurementEntryRequiredNotBetween(Short value1, Short value2) {
            addCriterion("bMeasurementEntryRequired not between", value1, value2, "bMeasurementEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagIsNull() {
            addCriterion("bQuantityKeyProhibitFlag is null");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagIsNotNull() {
            addCriterion("bQuantityKeyProhibitFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagEqualTo(Short value) {
            addCriterion("bQuantityKeyProhibitFlag =", value, "bQuantityKeyProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagNotEqualTo(Short value) {
            addCriterion("bQuantityKeyProhibitFlag <>", value, "bQuantityKeyProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagGreaterThan(Short value) {
            addCriterion("bQuantityKeyProhibitFlag >", value, "bQuantityKeyProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bQuantityKeyProhibitFlag >=", value, "bQuantityKeyProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagLessThan(Short value) {
            addCriterion("bQuantityKeyProhibitFlag <", value, "bQuantityKeyProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagLessThanOrEqualTo(Short value) {
            addCriterion("bQuantityKeyProhibitFlag <=", value, "bQuantityKeyProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagIn(List<Short> values) {
            addCriterion("bQuantityKeyProhibitFlag in", values, "bQuantityKeyProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagNotIn(List<Short> values) {
            addCriterion("bQuantityKeyProhibitFlag not in", values, "bQuantityKeyProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagBetween(Short value1, Short value2) {
            addCriterion("bQuantityKeyProhibitFlag between", value1, value2, "bQuantityKeyProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBQuantityKeyProhibitFlagNotBetween(Short value1, Short value2) {
            addCriterion("bQuantityKeyProhibitFlag not between", value1, value2, "bQuantityKeyProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagIsNull() {
            addCriterion("bProhibitReturnFlag is null");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagIsNotNull() {
            addCriterion("bProhibitReturnFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagEqualTo(Short value) {
            addCriterion("bProhibitReturnFlag =", value, "bProhibitReturnFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagNotEqualTo(Short value) {
            addCriterion("bProhibitReturnFlag <>", value, "bProhibitReturnFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagGreaterThan(Short value) {
            addCriterion("bProhibitReturnFlag >", value, "bProhibitReturnFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bProhibitReturnFlag >=", value, "bProhibitReturnFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagLessThan(Short value) {
            addCriterion("bProhibitReturnFlag <", value, "bProhibitReturnFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagLessThanOrEqualTo(Short value) {
            addCriterion("bProhibitReturnFlag <=", value, "bProhibitReturnFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagIn(List<Short> values) {
            addCriterion("bProhibitReturnFlag in", values, "bProhibitReturnFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagNotIn(List<Short> values) {
            addCriterion("bProhibitReturnFlag not in", values, "bProhibitReturnFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagBetween(Short value1, Short value2) {
            addCriterion("bProhibitReturnFlag between", value1, value2, "bProhibitReturnFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitReturnFlagNotBetween(Short value1, Short value2) {
            addCriterion("bProhibitReturnFlag not between", value1, value2, "bProhibitReturnFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagIsNull() {
            addCriterion("bProhibitRepeatKeyFlag is null");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagIsNotNull() {
            addCriterion("bProhibitRepeatKeyFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagEqualTo(Short value) {
            addCriterion("bProhibitRepeatKeyFlag =", value, "bProhibitRepeatKeyFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagNotEqualTo(Short value) {
            addCriterion("bProhibitRepeatKeyFlag <>", value, "bProhibitRepeatKeyFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagGreaterThan(Short value) {
            addCriterion("bProhibitRepeatKeyFlag >", value, "bProhibitRepeatKeyFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bProhibitRepeatKeyFlag >=", value, "bProhibitRepeatKeyFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagLessThan(Short value) {
            addCriterion("bProhibitRepeatKeyFlag <", value, "bProhibitRepeatKeyFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagLessThanOrEqualTo(Short value) {
            addCriterion("bProhibitRepeatKeyFlag <=", value, "bProhibitRepeatKeyFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagIn(List<Short> values) {
            addCriterion("bProhibitRepeatKeyFlag in", values, "bProhibitRepeatKeyFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagNotIn(List<Short> values) {
            addCriterion("bProhibitRepeatKeyFlag not in", values, "bProhibitRepeatKeyFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagBetween(Short value1, Short value2) {
            addCriterion("bProhibitRepeatKeyFlag between", value1, value2, "bProhibitRepeatKeyFlag");
            return (Criteria) this;
        }

        public Criteria andBProhibitRepeatKeyFlagNotBetween(Short value1, Short value2) {
            addCriterion("bProhibitRepeatKeyFlag not between", value1, value2, "bProhibitRepeatKeyFlag");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountIsNull() {
            addCriterion("dFrequentShopperPointsCount is null");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountIsNotNull() {
            addCriterion("dFrequentShopperPointsCount is not null");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountEqualTo(BigDecimal value) {
            addCriterion("dFrequentShopperPointsCount =", value, "dFrequentShopperPointsCount");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountNotEqualTo(BigDecimal value) {
            addCriterion("dFrequentShopperPointsCount <>", value, "dFrequentShopperPointsCount");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountGreaterThan(BigDecimal value) {
            addCriterion("dFrequentShopperPointsCount >", value, "dFrequentShopperPointsCount");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dFrequentShopperPointsCount >=", value, "dFrequentShopperPointsCount");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountLessThan(BigDecimal value) {
            addCriterion("dFrequentShopperPointsCount <", value, "dFrequentShopperPointsCount");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dFrequentShopperPointsCount <=", value, "dFrequentShopperPointsCount");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountIn(List<BigDecimal> values) {
            addCriterion("dFrequentShopperPointsCount in", values, "dFrequentShopperPointsCount");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountNotIn(List<BigDecimal> values) {
            addCriterion("dFrequentShopperPointsCount not in", values, "dFrequentShopperPointsCount");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dFrequentShopperPointsCount between", value1, value2, "dFrequentShopperPointsCount");
            return (Criteria) this;
        }

        public Criteria andDFrequentShopperPointsCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dFrequentShopperPointsCount not between", value1, value2, "dFrequentShopperPointsCount");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDIsNull() {
            addCriterion("lCurrencyID is null");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDIsNotNull() {
            addCriterion("lCurrencyID is not null");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDEqualTo(Integer value) {
            addCriterion("lCurrencyID =", value, "lCurrencyID");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDNotEqualTo(Integer value) {
            addCriterion("lCurrencyID <>", value, "lCurrencyID");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDGreaterThan(Integer value) {
            addCriterion("lCurrencyID >", value, "lCurrencyID");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lCurrencyID >=", value, "lCurrencyID");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDLessThan(Integer value) {
            addCriterion("lCurrencyID <", value, "lCurrencyID");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDLessThanOrEqualTo(Integer value) {
            addCriterion("lCurrencyID <=", value, "lCurrencyID");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDIn(List<Integer> values) {
            addCriterion("lCurrencyID in", values, "lCurrencyID");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDNotIn(List<Integer> values) {
            addCriterion("lCurrencyID not in", values, "lCurrencyID");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDBetween(Integer value1, Integer value2) {
            addCriterion("lCurrencyID between", value1, value2, "lCurrencyID");
            return (Criteria) this;
        }

        public Criteria andLCurrencyIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lCurrencyID not between", value1, value2, "lCurrencyID");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountIsNull() {
            addCriterion("dPackingUnitPriceAmount is null");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountIsNotNull() {
            addCriterion("dPackingUnitPriceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountEqualTo(BigDecimal value) {
            addCriterion("dPackingUnitPriceAmount =", value, "dPackingUnitPriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountNotEqualTo(BigDecimal value) {
            addCriterion("dPackingUnitPriceAmount <>", value, "dPackingUnitPriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountGreaterThan(BigDecimal value) {
            addCriterion("dPackingUnitPriceAmount >", value, "dPackingUnitPriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dPackingUnitPriceAmount >=", value, "dPackingUnitPriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountLessThan(BigDecimal value) {
            addCriterion("dPackingUnitPriceAmount <", value, "dPackingUnitPriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dPackingUnitPriceAmount <=", value, "dPackingUnitPriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountIn(List<BigDecimal> values) {
            addCriterion("dPackingUnitPriceAmount in", values, "dPackingUnitPriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountNotIn(List<BigDecimal> values) {
            addCriterion("dPackingUnitPriceAmount not in", values, "dPackingUnitPriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dPackingUnitPriceAmount between", value1, value2, "dPackingUnitPriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPackingUnitPriceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dPackingUnitPriceAmount not between", value1, value2, "dPackingUnitPriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityIsNull() {
            addCriterion("dPieceQuantity is null");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityIsNotNull() {
            addCriterion("dPieceQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityEqualTo(BigDecimal value) {
            addCriterion("dPieceQuantity =", value, "dPieceQuantity");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityNotEqualTo(BigDecimal value) {
            addCriterion("dPieceQuantity <>", value, "dPieceQuantity");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityGreaterThan(BigDecimal value) {
            addCriterion("dPieceQuantity >", value, "dPieceQuantity");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dPieceQuantity >=", value, "dPieceQuantity");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityLessThan(BigDecimal value) {
            addCriterion("dPieceQuantity <", value, "dPieceQuantity");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dPieceQuantity <=", value, "dPieceQuantity");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityIn(List<BigDecimal> values) {
            addCriterion("dPieceQuantity in", values, "dPieceQuantity");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityNotIn(List<BigDecimal> values) {
            addCriterion("dPieceQuantity not in", values, "dPieceQuantity");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dPieceQuantity between", value1, value2, "dPieceQuantity");
            return (Criteria) this;
        }

        public Criteria andDPieceQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dPieceQuantity not between", value1, value2, "dPieceQuantity");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountIsNull() {
            addCriterion("dPiecePriceAmount is null");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountIsNotNull() {
            addCriterion("dPiecePriceAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountEqualTo(BigDecimal value) {
            addCriterion("dPiecePriceAmount =", value, "dPiecePriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountNotEqualTo(BigDecimal value) {
            addCriterion("dPiecePriceAmount <>", value, "dPiecePriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountGreaterThan(BigDecimal value) {
            addCriterion("dPiecePriceAmount >", value, "dPiecePriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dPiecePriceAmount >=", value, "dPiecePriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountLessThan(BigDecimal value) {
            addCriterion("dPiecePriceAmount <", value, "dPiecePriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dPiecePriceAmount <=", value, "dPiecePriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountIn(List<BigDecimal> values) {
            addCriterion("dPiecePriceAmount in", values, "dPiecePriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountNotIn(List<BigDecimal> values) {
            addCriterion("dPiecePriceAmount not in", values, "dPiecePriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dPiecePriceAmount between", value1, value2, "dPiecePriceAmount");
            return (Criteria) this;
        }

        public Criteria andDPiecePriceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dPiecePriceAmount not between", value1, value2, "dPiecePriceAmount");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagIsNull() {
            addCriterion("bCalculationOnPiecePriceFlag is null");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagIsNotNull() {
            addCriterion("bCalculationOnPiecePriceFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagEqualTo(Short value) {
            addCriterion("bCalculationOnPiecePriceFlag =", value, "bCalculationOnPiecePriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagNotEqualTo(Short value) {
            addCriterion("bCalculationOnPiecePriceFlag <>", value, "bCalculationOnPiecePriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagGreaterThan(Short value) {
            addCriterion("bCalculationOnPiecePriceFlag >", value, "bCalculationOnPiecePriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bCalculationOnPiecePriceFlag >=", value, "bCalculationOnPiecePriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagLessThan(Short value) {
            addCriterion("bCalculationOnPiecePriceFlag <", value, "bCalculationOnPiecePriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagLessThanOrEqualTo(Short value) {
            addCriterion("bCalculationOnPiecePriceFlag <=", value, "bCalculationOnPiecePriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagIn(List<Short> values) {
            addCriterion("bCalculationOnPiecePriceFlag in", values, "bCalculationOnPiecePriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagNotIn(List<Short> values) {
            addCriterion("bCalculationOnPiecePriceFlag not in", values, "bCalculationOnPiecePriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagBetween(Short value1, Short value2) {
            addCriterion("bCalculationOnPiecePriceFlag between", value1, value2, "bCalculationOnPiecePriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCalculationOnPiecePriceFlagNotBetween(Short value1, Short value2) {
            addCriterion("bCalculationOnPiecePriceFlag not between", value1, value2, "bCalculationOnPiecePriceFlag");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagIsNull() {
            addCriterion("bLinkedSaleOnlyFlag is null");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagIsNotNull() {
            addCriterion("bLinkedSaleOnlyFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagEqualTo(Short value) {
            addCriterion("bLinkedSaleOnlyFlag =", value, "bLinkedSaleOnlyFlag");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagNotEqualTo(Short value) {
            addCriterion("bLinkedSaleOnlyFlag <>", value, "bLinkedSaleOnlyFlag");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagGreaterThan(Short value) {
            addCriterion("bLinkedSaleOnlyFlag >", value, "bLinkedSaleOnlyFlag");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bLinkedSaleOnlyFlag >=", value, "bLinkedSaleOnlyFlag");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagLessThan(Short value) {
            addCriterion("bLinkedSaleOnlyFlag <", value, "bLinkedSaleOnlyFlag");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagLessThanOrEqualTo(Short value) {
            addCriterion("bLinkedSaleOnlyFlag <=", value, "bLinkedSaleOnlyFlag");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagIn(List<Short> values) {
            addCriterion("bLinkedSaleOnlyFlag in", values, "bLinkedSaleOnlyFlag");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagNotIn(List<Short> values) {
            addCriterion("bLinkedSaleOnlyFlag not in", values, "bLinkedSaleOnlyFlag");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagBetween(Short value1, Short value2) {
            addCriterion("bLinkedSaleOnlyFlag between", value1, value2, "bLinkedSaleOnlyFlag");
            return (Criteria) this;
        }

        public Criteria andBLinkedSaleOnlyFlagNotBetween(Short value1, Short value2) {
            addCriterion("bLinkedSaleOnlyFlag not between", value1, value2, "bLinkedSaleOnlyFlag");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeIsNull() {
            addCriterion("szPackingUnitCounterTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeIsNotNull() {
            addCriterion("szPackingUnitCounterTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeEqualTo(String value) {
            addCriterion("szPackingUnitCounterTypeCode =", value, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeNotEqualTo(String value) {
            addCriterion("szPackingUnitCounterTypeCode <>", value, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeGreaterThan(String value) {
            addCriterion("szPackingUnitCounterTypeCode >", value, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("szPackingUnitCounterTypeCode >=", value, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeLessThan(String value) {
            addCriterion("szPackingUnitCounterTypeCode <", value, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("szPackingUnitCounterTypeCode <=", value, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeLike(String value) {
            addCriterion("szPackingUnitCounterTypeCode like", value, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeNotLike(String value) {
            addCriterion("szPackingUnitCounterTypeCode not like", value, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeIn(List<String> values) {
            addCriterion("szPackingUnitCounterTypeCode in", values, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeNotIn(List<String> values) {
            addCriterion("szPackingUnitCounterTypeCode not in", values, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeBetween(String value1, String value2) {
            addCriterion("szPackingUnitCounterTypeCode between", value1, value2, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPackingUnitCounterTypeCodeNotBetween(String value1, String value2) {
            addCriterion("szPackingUnitCounterTypeCode not between", value1, value2, "szPackingUnitCounterTypeCode");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagIsNull() {
            addCriterion("bPriceNegativeFlag is null");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagIsNotNull() {
            addCriterion("bPriceNegativeFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagEqualTo(Short value) {
            addCriterion("bPriceNegativeFlag =", value, "bPriceNegativeFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagNotEqualTo(Short value) {
            addCriterion("bPriceNegativeFlag <>", value, "bPriceNegativeFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagGreaterThan(Short value) {
            addCriterion("bPriceNegativeFlag >", value, "bPriceNegativeFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bPriceNegativeFlag >=", value, "bPriceNegativeFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagLessThan(Short value) {
            addCriterion("bPriceNegativeFlag <", value, "bPriceNegativeFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagLessThanOrEqualTo(Short value) {
            addCriterion("bPriceNegativeFlag <=", value, "bPriceNegativeFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagIn(List<Short> values) {
            addCriterion("bPriceNegativeFlag in", values, "bPriceNegativeFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagNotIn(List<Short> values) {
            addCriterion("bPriceNegativeFlag not in", values, "bPriceNegativeFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagBetween(Short value1, Short value2) {
            addCriterion("bPriceNegativeFlag between", value1, value2, "bPriceNegativeFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceNegativeFlagNotBetween(Short value1, Short value2) {
            addCriterion("bPriceNegativeFlag not between", value1, value2, "bPriceNegativeFlag");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureIsNull() {
            addCriterion("szQuantityEntryUnitOfMeasure is null");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureIsNotNull() {
            addCriterion("szQuantityEntryUnitOfMeasure is not null");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureEqualTo(String value) {
            addCriterion("szQuantityEntryUnitOfMeasure =", value, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureNotEqualTo(String value) {
            addCriterion("szQuantityEntryUnitOfMeasure <>", value, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureGreaterThan(String value) {
            addCriterion("szQuantityEntryUnitOfMeasure >", value, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("szQuantityEntryUnitOfMeasure >=", value, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureLessThan(String value) {
            addCriterion("szQuantityEntryUnitOfMeasure <", value, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureLessThanOrEqualTo(String value) {
            addCriterion("szQuantityEntryUnitOfMeasure <=", value, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureLike(String value) {
            addCriterion("szQuantityEntryUnitOfMeasure like", value, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureNotLike(String value) {
            addCriterion("szQuantityEntryUnitOfMeasure not like", value, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureIn(List<String> values) {
            addCriterion("szQuantityEntryUnitOfMeasure in", values, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureNotIn(List<String> values) {
            addCriterion("szQuantityEntryUnitOfMeasure not in", values, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureBetween(String value1, String value2) {
            addCriterion("szQuantityEntryUnitOfMeasure between", value1, value2, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andSzQuantityEntryUnitOfMeasureNotBetween(String value1, String value2) {
            addCriterion("szQuantityEntryUnitOfMeasure not between", value1, value2, "szQuantityEntryUnitOfMeasure");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagIsNull() {
            addCriterion("bPriceChangeProhibitFlag is null");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagIsNotNull() {
            addCriterion("bPriceChangeProhibitFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagEqualTo(Short value) {
            addCriterion("bPriceChangeProhibitFlag =", value, "bPriceChangeProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagNotEqualTo(Short value) {
            addCriterion("bPriceChangeProhibitFlag <>", value, "bPriceChangeProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagGreaterThan(Short value) {
            addCriterion("bPriceChangeProhibitFlag >", value, "bPriceChangeProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bPriceChangeProhibitFlag >=", value, "bPriceChangeProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagLessThan(Short value) {
            addCriterion("bPriceChangeProhibitFlag <", value, "bPriceChangeProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagLessThanOrEqualTo(Short value) {
            addCriterion("bPriceChangeProhibitFlag <=", value, "bPriceChangeProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagIn(List<Short> values) {
            addCriterion("bPriceChangeProhibitFlag in", values, "bPriceChangeProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagNotIn(List<Short> values) {
            addCriterion("bPriceChangeProhibitFlag not in", values, "bPriceChangeProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagBetween(Short value1, Short value2) {
            addCriterion("bPriceChangeProhibitFlag between", value1, value2, "bPriceChangeProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andBPriceChangeProhibitFlagNotBetween(Short value1, Short value2) {
            addCriterion("bPriceChangeProhibitFlag not between", value1, value2, "bPriceChangeProhibitFlag");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountIsNull() {
            addCriterion("dPriceEntryLowAmount is null");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountIsNotNull() {
            addCriterion("dPriceEntryLowAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountEqualTo(BigDecimal value) {
            addCriterion("dPriceEntryLowAmount =", value, "dPriceEntryLowAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountNotEqualTo(BigDecimal value) {
            addCriterion("dPriceEntryLowAmount <>", value, "dPriceEntryLowAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountGreaterThan(BigDecimal value) {
            addCriterion("dPriceEntryLowAmount >", value, "dPriceEntryLowAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dPriceEntryLowAmount >=", value, "dPriceEntryLowAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountLessThan(BigDecimal value) {
            addCriterion("dPriceEntryLowAmount <", value, "dPriceEntryLowAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dPriceEntryLowAmount <=", value, "dPriceEntryLowAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountIn(List<BigDecimal> values) {
            addCriterion("dPriceEntryLowAmount in", values, "dPriceEntryLowAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountNotIn(List<BigDecimal> values) {
            addCriterion("dPriceEntryLowAmount not in", values, "dPriceEntryLowAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dPriceEntryLowAmount between", value1, value2, "dPriceEntryLowAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryLowAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dPriceEntryLowAmount not between", value1, value2, "dPriceEntryLowAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountIsNull() {
            addCriterion("dPriceEntryHighAmount is null");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountIsNotNull() {
            addCriterion("dPriceEntryHighAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountEqualTo(BigDecimal value) {
            addCriterion("dPriceEntryHighAmount =", value, "dPriceEntryHighAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountNotEqualTo(BigDecimal value) {
            addCriterion("dPriceEntryHighAmount <>", value, "dPriceEntryHighAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountGreaterThan(BigDecimal value) {
            addCriterion("dPriceEntryHighAmount >", value, "dPriceEntryHighAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dPriceEntryHighAmount >=", value, "dPriceEntryHighAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountLessThan(BigDecimal value) {
            addCriterion("dPriceEntryHighAmount <", value, "dPriceEntryHighAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dPriceEntryHighAmount <=", value, "dPriceEntryHighAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountIn(List<BigDecimal> values) {
            addCriterion("dPriceEntryHighAmount in", values, "dPriceEntryHighAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountNotIn(List<BigDecimal> values) {
            addCriterion("dPriceEntryHighAmount not in", values, "dPriceEntryHighAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dPriceEntryHighAmount between", value1, value2, "dPriceEntryHighAmount");
            return (Criteria) this;
        }

        public Criteria andDPriceEntryHighAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dPriceEntryHighAmount not between", value1, value2, "dPriceEntryHighAmount");
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

        public Criteria andD2ndPriceIsNull() {
            addCriterion("d2ndPrice is null");
            return (Criteria) this;
        }

        public Criteria andD2ndPriceIsNotNull() {
            addCriterion("d2ndPrice is not null");
            return (Criteria) this;
        }

        public Criteria andD2ndPriceEqualTo(BigDecimal value) {
            addCriterion("d2ndPrice =", value, "d2ndPrice");
            return (Criteria) this;
        }

        public Criteria andD2ndPriceNotEqualTo(BigDecimal value) {
            addCriterion("d2ndPrice <>", value, "d2ndPrice");
            return (Criteria) this;
        }

        public Criteria andD2ndPriceGreaterThan(BigDecimal value) {
            addCriterion("d2ndPrice >", value, "d2ndPrice");
            return (Criteria) this;
        }

        public Criteria andD2ndPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("d2ndPrice >=", value, "d2ndPrice");
            return (Criteria) this;
        }

        public Criteria andD2ndPriceLessThan(BigDecimal value) {
            addCriterion("d2ndPrice <", value, "d2ndPrice");
            return (Criteria) this;
        }

        public Criteria andD2ndPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("d2ndPrice <=", value, "d2ndPrice");
            return (Criteria) this;
        }

        public Criteria andD2ndPriceIn(List<BigDecimal> values) {
            addCriterion("d2ndPrice in", values, "d2ndPrice");
            return (Criteria) this;
        }

        public Criteria andD2ndPriceNotIn(List<BigDecimal> values) {
            addCriterion("d2ndPrice not in", values, "d2ndPrice");
            return (Criteria) this;
        }

        public Criteria andD2ndPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("d2ndPrice between", value1, value2, "d2ndPrice");
            return (Criteria) this;
        }

        public Criteria andD2ndPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("d2ndPrice not between", value1, value2, "d2ndPrice");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceIsNull() {
            addCriterion("d3rdPrice is null");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceIsNotNull() {
            addCriterion("d3rdPrice is not null");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceEqualTo(BigDecimal value) {
            addCriterion("d3rdPrice =", value, "d3rdPrice");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceNotEqualTo(BigDecimal value) {
            addCriterion("d3rdPrice <>", value, "d3rdPrice");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceGreaterThan(BigDecimal value) {
            addCriterion("d3rdPrice >", value, "d3rdPrice");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("d3rdPrice >=", value, "d3rdPrice");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceLessThan(BigDecimal value) {
            addCriterion("d3rdPrice <", value, "d3rdPrice");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("d3rdPrice <=", value, "d3rdPrice");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceIn(List<BigDecimal> values) {
            addCriterion("d3rdPrice in", values, "d3rdPrice");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceNotIn(List<BigDecimal> values) {
            addCriterion("d3rdPrice not in", values, "d3rdPrice");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("d3rdPrice between", value1, value2, "d3rdPrice");
            return (Criteria) this;
        }

        public Criteria andD3rdPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("d3rdPrice not between", value1, value2, "d3rdPrice");
            return (Criteria) this;
        }

        public Criteria andD4thPriceIsNull() {
            addCriterion("d4thPrice is null");
            return (Criteria) this;
        }

        public Criteria andD4thPriceIsNotNull() {
            addCriterion("d4thPrice is not null");
            return (Criteria) this;
        }

        public Criteria andD4thPriceEqualTo(BigDecimal value) {
            addCriterion("d4thPrice =", value, "d4thPrice");
            return (Criteria) this;
        }

        public Criteria andD4thPriceNotEqualTo(BigDecimal value) {
            addCriterion("d4thPrice <>", value, "d4thPrice");
            return (Criteria) this;
        }

        public Criteria andD4thPriceGreaterThan(BigDecimal value) {
            addCriterion("d4thPrice >", value, "d4thPrice");
            return (Criteria) this;
        }

        public Criteria andD4thPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("d4thPrice >=", value, "d4thPrice");
            return (Criteria) this;
        }

        public Criteria andD4thPriceLessThan(BigDecimal value) {
            addCriterion("d4thPrice <", value, "d4thPrice");
            return (Criteria) this;
        }

        public Criteria andD4thPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("d4thPrice <=", value, "d4thPrice");
            return (Criteria) this;
        }

        public Criteria andD4thPriceIn(List<BigDecimal> values) {
            addCriterion("d4thPrice in", values, "d4thPrice");
            return (Criteria) this;
        }

        public Criteria andD4thPriceNotIn(List<BigDecimal> values) {
            addCriterion("d4thPrice not in", values, "d4thPrice");
            return (Criteria) this;
        }

        public Criteria andD4thPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("d4thPrice between", value1, value2, "d4thPrice");
            return (Criteria) this;
        }

        public Criteria andD4thPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("d4thPrice not between", value1, value2, "d4thPrice");
            return (Criteria) this;
        }

        public Criteria andD5thPriceIsNull() {
            addCriterion("d5thPrice is null");
            return (Criteria) this;
        }

        public Criteria andD5thPriceIsNotNull() {
            addCriterion("d5thPrice is not null");
            return (Criteria) this;
        }

        public Criteria andD5thPriceEqualTo(BigDecimal value) {
            addCriterion("d5thPrice =", value, "d5thPrice");
            return (Criteria) this;
        }

        public Criteria andD5thPriceNotEqualTo(BigDecimal value) {
            addCriterion("d5thPrice <>", value, "d5thPrice");
            return (Criteria) this;
        }

        public Criteria andD5thPriceGreaterThan(BigDecimal value) {
            addCriterion("d5thPrice >", value, "d5thPrice");
            return (Criteria) this;
        }

        public Criteria andD5thPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("d5thPrice >=", value, "d5thPrice");
            return (Criteria) this;
        }

        public Criteria andD5thPriceLessThan(BigDecimal value) {
            addCriterion("d5thPrice <", value, "d5thPrice");
            return (Criteria) this;
        }

        public Criteria andD5thPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("d5thPrice <=", value, "d5thPrice");
            return (Criteria) this;
        }

        public Criteria andD5thPriceIn(List<BigDecimal> values) {
            addCriterion("d5thPrice in", values, "d5thPrice");
            return (Criteria) this;
        }

        public Criteria andD5thPriceNotIn(List<BigDecimal> values) {
            addCriterion("d5thPrice not in", values, "d5thPrice");
            return (Criteria) this;
        }

        public Criteria andD5thPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("d5thPrice between", value1, value2, "d5thPrice");
            return (Criteria) this;
        }

        public Criteria andD5thPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("d5thPrice not between", value1, value2, "d5thPrice");
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

        public Criteria andSzArtLinkIsNull() {
            addCriterion("szArtLink is null");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkIsNotNull() {
            addCriterion("szArtLink is not null");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkEqualTo(String value) {
            addCriterion("szArtLink =", value, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkNotEqualTo(String value) {
            addCriterion("szArtLink <>", value, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkGreaterThan(String value) {
            addCriterion("szArtLink >", value, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkGreaterThanOrEqualTo(String value) {
            addCriterion("szArtLink >=", value, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkLessThan(String value) {
            addCriterion("szArtLink <", value, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkLessThanOrEqualTo(String value) {
            addCriterion("szArtLink <=", value, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkLike(String value) {
            addCriterion("szArtLink like", value, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkNotLike(String value) {
            addCriterion("szArtLink not like", value, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkIn(List<String> values) {
            addCriterion("szArtLink in", values, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkNotIn(List<String> values) {
            addCriterion("szArtLink not in", values, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkBetween(String value1, String value2) {
            addCriterion("szArtLink between", value1, value2, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andSzArtLinkNotBetween(String value1, String value2) {
            addCriterion("szArtLink not between", value1, value2, "szArtLink");
            return (Criteria) this;
        }

        public Criteria andBLockedIsNull() {
            addCriterion("bLocked is null");
            return (Criteria) this;
        }

        public Criteria andBLockedIsNotNull() {
            addCriterion("bLocked is not null");
            return (Criteria) this;
        }

        public Criteria andBLockedEqualTo(Short value) {
            addCriterion("bLocked =", value, "bLocked");
            return (Criteria) this;
        }

        public Criteria andBLockedNotEqualTo(Short value) {
            addCriterion("bLocked <>", value, "bLocked");
            return (Criteria) this;
        }

        public Criteria andBLockedGreaterThan(Short value) {
            addCriterion("bLocked >", value, "bLocked");
            return (Criteria) this;
        }

        public Criteria andBLockedGreaterThanOrEqualTo(Short value) {
            addCriterion("bLocked >=", value, "bLocked");
            return (Criteria) this;
        }

        public Criteria andBLockedLessThan(Short value) {
            addCriterion("bLocked <", value, "bLocked");
            return (Criteria) this;
        }

        public Criteria andBLockedLessThanOrEqualTo(Short value) {
            addCriterion("bLocked <=", value, "bLocked");
            return (Criteria) this;
        }

        public Criteria andBLockedIn(List<Short> values) {
            addCriterion("bLocked in", values, "bLocked");
            return (Criteria) this;
        }

        public Criteria andBLockedNotIn(List<Short> values) {
            addCriterion("bLocked not in", values, "bLocked");
            return (Criteria) this;
        }

        public Criteria andBLockedBetween(Short value1, Short value2) {
            addCriterion("bLocked between", value1, value2, "bLocked");
            return (Criteria) this;
        }

        public Criteria andBLockedNotBetween(Short value1, Short value2) {
            addCriterion("bLocked not between", value1, value2, "bLocked");
            return (Criteria) this;
        }

        public Criteria andLWarrantyIsNull() {
            addCriterion("lWarranty is null");
            return (Criteria) this;
        }

        public Criteria andLWarrantyIsNotNull() {
            addCriterion("lWarranty is not null");
            return (Criteria) this;
        }

        public Criteria andLWarrantyEqualTo(Integer value) {
            addCriterion("lWarranty =", value, "lWarranty");
            return (Criteria) this;
        }

        public Criteria andLWarrantyNotEqualTo(Integer value) {
            addCriterion("lWarranty <>", value, "lWarranty");
            return (Criteria) this;
        }

        public Criteria andLWarrantyGreaterThan(Integer value) {
            addCriterion("lWarranty >", value, "lWarranty");
            return (Criteria) this;
        }

        public Criteria andLWarrantyGreaterThanOrEqualTo(Integer value) {
            addCriterion("lWarranty >=", value, "lWarranty");
            return (Criteria) this;
        }

        public Criteria andLWarrantyLessThan(Integer value) {
            addCriterion("lWarranty <", value, "lWarranty");
            return (Criteria) this;
        }

        public Criteria andLWarrantyLessThanOrEqualTo(Integer value) {
            addCriterion("lWarranty <=", value, "lWarranty");
            return (Criteria) this;
        }

        public Criteria andLWarrantyIn(List<Integer> values) {
            addCriterion("lWarranty in", values, "lWarranty");
            return (Criteria) this;
        }

        public Criteria andLWarrantyNotIn(List<Integer> values) {
            addCriterion("lWarranty not in", values, "lWarranty");
            return (Criteria) this;
        }

        public Criteria andLWarrantyBetween(Integer value1, Integer value2) {
            addCriterion("lWarranty between", value1, value2, "lWarranty");
            return (Criteria) this;
        }

        public Criteria andLWarrantyNotBetween(Integer value1, Integer value2) {
            addCriterion("lWarranty not between", value1, value2, "lWarranty");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDIsNull() {
            addCriterion("szPrintLayoutID is null");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDIsNotNull() {
            addCriterion("szPrintLayoutID is not null");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDEqualTo(String value) {
            addCriterion("szPrintLayoutID =", value, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDNotEqualTo(String value) {
            addCriterion("szPrintLayoutID <>", value, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDGreaterThan(String value) {
            addCriterion("szPrintLayoutID >", value, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDGreaterThanOrEqualTo(String value) {
            addCriterion("szPrintLayoutID >=", value, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDLessThan(String value) {
            addCriterion("szPrintLayoutID <", value, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDLessThanOrEqualTo(String value) {
            addCriterion("szPrintLayoutID <=", value, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDLike(String value) {
            addCriterion("szPrintLayoutID like", value, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDNotLike(String value) {
            addCriterion("szPrintLayoutID not like", value, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDIn(List<String> values) {
            addCriterion("szPrintLayoutID in", values, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDNotIn(List<String> values) {
            addCriterion("szPrintLayoutID not in", values, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDBetween(String value1, String value2) {
            addCriterion("szPrintLayoutID between", value1, value2, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzPrintLayoutIDNotBetween(String value1, String value2) {
            addCriterion("szPrintLayoutID not between", value1, value2, "szPrintLayoutID");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogIsNull() {
            addCriterion("szAddOnDialog is null");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogIsNotNull() {
            addCriterion("szAddOnDialog is not null");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogEqualTo(String value) {
            addCriterion("szAddOnDialog =", value, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogNotEqualTo(String value) {
            addCriterion("szAddOnDialog <>", value, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogGreaterThan(String value) {
            addCriterion("szAddOnDialog >", value, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogGreaterThanOrEqualTo(String value) {
            addCriterion("szAddOnDialog >=", value, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogLessThan(String value) {
            addCriterion("szAddOnDialog <", value, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogLessThanOrEqualTo(String value) {
            addCriterion("szAddOnDialog <=", value, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogLike(String value) {
            addCriterion("szAddOnDialog like", value, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogNotLike(String value) {
            addCriterion("szAddOnDialog not like", value, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogIn(List<String> values) {
            addCriterion("szAddOnDialog in", values, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogNotIn(List<String> values) {
            addCriterion("szAddOnDialog not in", values, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogBetween(String value1, String value2) {
            addCriterion("szAddOnDialog between", value1, value2, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andSzAddOnDialogNotBetween(String value1, String value2) {
            addCriterion("szAddOnDialog not between", value1, value2, "szAddOnDialog");
            return (Criteria) this;
        }

        public Criteria andBIsContractIsNull() {
            addCriterion("bIsContract is null");
            return (Criteria) this;
        }

        public Criteria andBIsContractIsNotNull() {
            addCriterion("bIsContract is not null");
            return (Criteria) this;
        }

        public Criteria andBIsContractEqualTo(Short value) {
            addCriterion("bIsContract =", value, "bIsContract");
            return (Criteria) this;
        }

        public Criteria andBIsContractNotEqualTo(Short value) {
            addCriterion("bIsContract <>", value, "bIsContract");
            return (Criteria) this;
        }

        public Criteria andBIsContractGreaterThan(Short value) {
            addCriterion("bIsContract >", value, "bIsContract");
            return (Criteria) this;
        }

        public Criteria andBIsContractGreaterThanOrEqualTo(Short value) {
            addCriterion("bIsContract >=", value, "bIsContract");
            return (Criteria) this;
        }

        public Criteria andBIsContractLessThan(Short value) {
            addCriterion("bIsContract <", value, "bIsContract");
            return (Criteria) this;
        }

        public Criteria andBIsContractLessThanOrEqualTo(Short value) {
            addCriterion("bIsContract <=", value, "bIsContract");
            return (Criteria) this;
        }

        public Criteria andBIsContractIn(List<Short> values) {
            addCriterion("bIsContract in", values, "bIsContract");
            return (Criteria) this;
        }

        public Criteria andBIsContractNotIn(List<Short> values) {
            addCriterion("bIsContract not in", values, "bIsContract");
            return (Criteria) this;
        }

        public Criteria andBIsContractBetween(Short value1, Short value2) {
            addCriterion("bIsContract between", value1, value2, "bIsContract");
            return (Criteria) this;
        }

        public Criteria andBIsContractNotBetween(Short value1, Short value2) {
            addCriterion("bIsContract not between", value1, value2, "bIsContract");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtIsNull() {
            addCriterion("bIsFiscalArt is null");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtIsNotNull() {
            addCriterion("bIsFiscalArt is not null");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtEqualTo(Short value) {
            addCriterion("bIsFiscalArt =", value, "bIsFiscalArt");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtNotEqualTo(Short value) {
            addCriterion("bIsFiscalArt <>", value, "bIsFiscalArt");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtGreaterThan(Short value) {
            addCriterion("bIsFiscalArt >", value, "bIsFiscalArt");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtGreaterThanOrEqualTo(Short value) {
            addCriterion("bIsFiscalArt >=", value, "bIsFiscalArt");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtLessThan(Short value) {
            addCriterion("bIsFiscalArt <", value, "bIsFiscalArt");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtLessThanOrEqualTo(Short value) {
            addCriterion("bIsFiscalArt <=", value, "bIsFiscalArt");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtIn(List<Short> values) {
            addCriterion("bIsFiscalArt in", values, "bIsFiscalArt");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtNotIn(List<Short> values) {
            addCriterion("bIsFiscalArt not in", values, "bIsFiscalArt");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtBetween(Short value1, Short value2) {
            addCriterion("bIsFiscalArt between", value1, value2, "bIsFiscalArt");
            return (Criteria) this;
        }

        public Criteria andBIsFiscalArtNotBetween(Short value1, Short value2) {
            addCriterion("bIsFiscalArt not between", value1, value2, "bIsFiscalArt");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedIsNull() {
            addCriterion("bIsSerialized is null");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedIsNotNull() {
            addCriterion("bIsSerialized is not null");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedEqualTo(Short value) {
            addCriterion("bIsSerialized =", value, "bIsSerialized");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedNotEqualTo(Short value) {
            addCriterion("bIsSerialized <>", value, "bIsSerialized");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedGreaterThan(Short value) {
            addCriterion("bIsSerialized >", value, "bIsSerialized");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedGreaterThanOrEqualTo(Short value) {
            addCriterion("bIsSerialized >=", value, "bIsSerialized");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedLessThan(Short value) {
            addCriterion("bIsSerialized <", value, "bIsSerialized");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedLessThanOrEqualTo(Short value) {
            addCriterion("bIsSerialized <=", value, "bIsSerialized");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedIn(List<Short> values) {
            addCriterion("bIsSerialized in", values, "bIsSerialized");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedNotIn(List<Short> values) {
            addCriterion("bIsSerialized not in", values, "bIsSerialized");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedBetween(Short value1, Short value2) {
            addCriterion("bIsSerialized between", value1, value2, "bIsSerialized");
            return (Criteria) this;
        }

        public Criteria andBIsSerializedNotBetween(Short value1, Short value2) {
            addCriterion("bIsSerialized not between", value1, value2, "bIsSerialized");
            return (Criteria) this;
        }

        public Criteria andBOnStockIsNull() {
            addCriterion("bOnStock is null");
            return (Criteria) this;
        }

        public Criteria andBOnStockIsNotNull() {
            addCriterion("bOnStock is not null");
            return (Criteria) this;
        }

        public Criteria andBOnStockEqualTo(Short value) {
            addCriterion("bOnStock =", value, "bOnStock");
            return (Criteria) this;
        }

        public Criteria andBOnStockNotEqualTo(Short value) {
            addCriterion("bOnStock <>", value, "bOnStock");
            return (Criteria) this;
        }

        public Criteria andBOnStockGreaterThan(Short value) {
            addCriterion("bOnStock >", value, "bOnStock");
            return (Criteria) this;
        }

        public Criteria andBOnStockGreaterThanOrEqualTo(Short value) {
            addCriterion("bOnStock >=", value, "bOnStock");
            return (Criteria) this;
        }

        public Criteria andBOnStockLessThan(Short value) {
            addCriterion("bOnStock <", value, "bOnStock");
            return (Criteria) this;
        }

        public Criteria andBOnStockLessThanOrEqualTo(Short value) {
            addCriterion("bOnStock <=", value, "bOnStock");
            return (Criteria) this;
        }

        public Criteria andBOnStockIn(List<Short> values) {
            addCriterion("bOnStock in", values, "bOnStock");
            return (Criteria) this;
        }

        public Criteria andBOnStockNotIn(List<Short> values) {
            addCriterion("bOnStock not in", values, "bOnStock");
            return (Criteria) this;
        }

        public Criteria andBOnStockBetween(Short value1, Short value2) {
            addCriterion("bOnStock between", value1, value2, "bOnStock");
            return (Criteria) this;
        }

        public Criteria andBOnStockNotBetween(Short value1, Short value2) {
            addCriterion("bOnStock not between", value1, value2, "bOnStock");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetIsNull() {
            addCriterion("bArtKVSet is null");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetIsNotNull() {
            addCriterion("bArtKVSet is not null");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetEqualTo(Short value) {
            addCriterion("bArtKVSet =", value, "bArtKVSet");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetNotEqualTo(Short value) {
            addCriterion("bArtKVSet <>", value, "bArtKVSet");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetGreaterThan(Short value) {
            addCriterion("bArtKVSet >", value, "bArtKVSet");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetGreaterThanOrEqualTo(Short value) {
            addCriterion("bArtKVSet >=", value, "bArtKVSet");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetLessThan(Short value) {
            addCriterion("bArtKVSet <", value, "bArtKVSet");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetLessThanOrEqualTo(Short value) {
            addCriterion("bArtKVSet <=", value, "bArtKVSet");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetIn(List<Short> values) {
            addCriterion("bArtKVSet in", values, "bArtKVSet");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetNotIn(List<Short> values) {
            addCriterion("bArtKVSet not in", values, "bArtKVSet");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetBetween(Short value1, Short value2) {
            addCriterion("bArtKVSet between", value1, value2, "bArtKVSet");
            return (Criteria) this;
        }

        public Criteria andBArtKVSetNotBetween(Short value1, Short value2) {
            addCriterion("bArtKVSet not between", value1, value2, "bArtKVSet");
            return (Criteria) this;
        }

        public Criteria andBArtKSetIsNull() {
            addCriterion("bArtKSet is null");
            return (Criteria) this;
        }

        public Criteria andBArtKSetIsNotNull() {
            addCriterion("bArtKSet is not null");
            return (Criteria) this;
        }

        public Criteria andBArtKSetEqualTo(Short value) {
            addCriterion("bArtKSet =", value, "bArtKSet");
            return (Criteria) this;
        }

        public Criteria andBArtKSetNotEqualTo(Short value) {
            addCriterion("bArtKSet <>", value, "bArtKSet");
            return (Criteria) this;
        }

        public Criteria andBArtKSetGreaterThan(Short value) {
            addCriterion("bArtKSet >", value, "bArtKSet");
            return (Criteria) this;
        }

        public Criteria andBArtKSetGreaterThanOrEqualTo(Short value) {
            addCriterion("bArtKSet >=", value, "bArtKSet");
            return (Criteria) this;
        }

        public Criteria andBArtKSetLessThan(Short value) {
            addCriterion("bArtKSet <", value, "bArtKSet");
            return (Criteria) this;
        }

        public Criteria andBArtKSetLessThanOrEqualTo(Short value) {
            addCriterion("bArtKSet <=", value, "bArtKSet");
            return (Criteria) this;
        }

        public Criteria andBArtKSetIn(List<Short> values) {
            addCriterion("bArtKSet in", values, "bArtKSet");
            return (Criteria) this;
        }

        public Criteria andBArtKSetNotIn(List<Short> values) {
            addCriterion("bArtKSet not in", values, "bArtKSet");
            return (Criteria) this;
        }

        public Criteria andBArtKSetBetween(Short value1, Short value2) {
            addCriterion("bArtKSet between", value1, value2, "bArtKSet");
            return (Criteria) this;
        }

        public Criteria andBArtKSetNotBetween(Short value1, Short value2) {
            addCriterion("bArtKSet not between", value1, value2, "bArtKSet");
            return (Criteria) this;
        }

        public Criteria andBArtVSetIsNull() {
            addCriterion("bArtVSet is null");
            return (Criteria) this;
        }

        public Criteria andBArtVSetIsNotNull() {
            addCriterion("bArtVSet is not null");
            return (Criteria) this;
        }

        public Criteria andBArtVSetEqualTo(Short value) {
            addCriterion("bArtVSet =", value, "bArtVSet");
            return (Criteria) this;
        }

        public Criteria andBArtVSetNotEqualTo(Short value) {
            addCriterion("bArtVSet <>", value, "bArtVSet");
            return (Criteria) this;
        }

        public Criteria andBArtVSetGreaterThan(Short value) {
            addCriterion("bArtVSet >", value, "bArtVSet");
            return (Criteria) this;
        }

        public Criteria andBArtVSetGreaterThanOrEqualTo(Short value) {
            addCriterion("bArtVSet >=", value, "bArtVSet");
            return (Criteria) this;
        }

        public Criteria andBArtVSetLessThan(Short value) {
            addCriterion("bArtVSet <", value, "bArtVSet");
            return (Criteria) this;
        }

        public Criteria andBArtVSetLessThanOrEqualTo(Short value) {
            addCriterion("bArtVSet <=", value, "bArtVSet");
            return (Criteria) this;
        }

        public Criteria andBArtVSetIn(List<Short> values) {
            addCriterion("bArtVSet in", values, "bArtVSet");
            return (Criteria) this;
        }

        public Criteria andBArtVSetNotIn(List<Short> values) {
            addCriterion("bArtVSet not in", values, "bArtVSet");
            return (Criteria) this;
        }

        public Criteria andBArtVSetBetween(Short value1, Short value2) {
            addCriterion("bArtVSet between", value1, value2, "bArtVSet");
            return (Criteria) this;
        }

        public Criteria andBArtVSetNotBetween(Short value1, Short value2) {
            addCriterion("bArtVSet not between", value1, value2, "bArtVSet");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedIsNull() {
            addCriterion("bTotalDiscountAllowed is null");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedIsNotNull() {
            addCriterion("bTotalDiscountAllowed is not null");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedEqualTo(Short value) {
            addCriterion("bTotalDiscountAllowed =", value, "bTotalDiscountAllowed");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedNotEqualTo(Short value) {
            addCriterion("bTotalDiscountAllowed <>", value, "bTotalDiscountAllowed");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedGreaterThan(Short value) {
            addCriterion("bTotalDiscountAllowed >", value, "bTotalDiscountAllowed");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedGreaterThanOrEqualTo(Short value) {
            addCriterion("bTotalDiscountAllowed >=", value, "bTotalDiscountAllowed");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedLessThan(Short value) {
            addCriterion("bTotalDiscountAllowed <", value, "bTotalDiscountAllowed");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedLessThanOrEqualTo(Short value) {
            addCriterion("bTotalDiscountAllowed <=", value, "bTotalDiscountAllowed");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedIn(List<Short> values) {
            addCriterion("bTotalDiscountAllowed in", values, "bTotalDiscountAllowed");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedNotIn(List<Short> values) {
            addCriterion("bTotalDiscountAllowed not in", values, "bTotalDiscountAllowed");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedBetween(Short value1, Short value2) {
            addCriterion("bTotalDiscountAllowed between", value1, value2, "bTotalDiscountAllowed");
            return (Criteria) this;
        }

        public Criteria andBTotalDiscountAllowedNotBetween(Short value1, Short value2) {
            addCriterion("bTotalDiscountAllowed not between", value1, value2, "bTotalDiscountAllowed");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagIsNull() {
            addCriterion("bScaleItemFlag is null");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagIsNotNull() {
            addCriterion("bScaleItemFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagEqualTo(Short value) {
            addCriterion("bScaleItemFlag =", value, "bScaleItemFlag");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagNotEqualTo(Short value) {
            addCriterion("bScaleItemFlag <>", value, "bScaleItemFlag");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagGreaterThan(Short value) {
            addCriterion("bScaleItemFlag >", value, "bScaleItemFlag");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bScaleItemFlag >=", value, "bScaleItemFlag");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagLessThan(Short value) {
            addCriterion("bScaleItemFlag <", value, "bScaleItemFlag");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagLessThanOrEqualTo(Short value) {
            addCriterion("bScaleItemFlag <=", value, "bScaleItemFlag");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagIn(List<Short> values) {
            addCriterion("bScaleItemFlag in", values, "bScaleItemFlag");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagNotIn(List<Short> values) {
            addCriterion("bScaleItemFlag not in", values, "bScaleItemFlag");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagBetween(Short value1, Short value2) {
            addCriterion("bScaleItemFlag between", value1, value2, "bScaleItemFlag");
            return (Criteria) this;
        }

        public Criteria andBScaleItemFlagNotBetween(Short value1, Short value2) {
            addCriterion("bScaleItemFlag not between", value1, value2, "bScaleItemFlag");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagIsNull() {
            addCriterion("bBrandItemFlag is null");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagIsNotNull() {
            addCriterion("bBrandItemFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagEqualTo(Short value) {
            addCriterion("bBrandItemFlag =", value, "bBrandItemFlag");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagNotEqualTo(Short value) {
            addCriterion("bBrandItemFlag <>", value, "bBrandItemFlag");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagGreaterThan(Short value) {
            addCriterion("bBrandItemFlag >", value, "bBrandItemFlag");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bBrandItemFlag >=", value, "bBrandItemFlag");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagLessThan(Short value) {
            addCriterion("bBrandItemFlag <", value, "bBrandItemFlag");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagLessThanOrEqualTo(Short value) {
            addCriterion("bBrandItemFlag <=", value, "bBrandItemFlag");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagIn(List<Short> values) {
            addCriterion("bBrandItemFlag in", values, "bBrandItemFlag");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagNotIn(List<Short> values) {
            addCriterion("bBrandItemFlag not in", values, "bBrandItemFlag");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagBetween(Short value1, Short value2) {
            addCriterion("bBrandItemFlag between", value1, value2, "bBrandItemFlag");
            return (Criteria) this;
        }

        public Criteria andBBrandItemFlagNotBetween(Short value1, Short value2) {
            addCriterion("bBrandItemFlag not between", value1, value2, "bBrandItemFlag");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagIsNull() {
            addCriterion("bSupervisorRequiredFlag is null");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagIsNotNull() {
            addCriterion("bSupervisorRequiredFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagEqualTo(Short value) {
            addCriterion("bSupervisorRequiredFlag =", value, "bSupervisorRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagNotEqualTo(Short value) {
            addCriterion("bSupervisorRequiredFlag <>", value, "bSupervisorRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagGreaterThan(Short value) {
            addCriterion("bSupervisorRequiredFlag >", value, "bSupervisorRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bSupervisorRequiredFlag >=", value, "bSupervisorRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagLessThan(Short value) {
            addCriterion("bSupervisorRequiredFlag <", value, "bSupervisorRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagLessThanOrEqualTo(Short value) {
            addCriterion("bSupervisorRequiredFlag <=", value, "bSupervisorRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagIn(List<Short> values) {
            addCriterion("bSupervisorRequiredFlag in", values, "bSupervisorRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagNotIn(List<Short> values) {
            addCriterion("bSupervisorRequiredFlag not in", values, "bSupervisorRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagBetween(Short value1, Short value2) {
            addCriterion("bSupervisorRequiredFlag between", value1, value2, "bSupervisorRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBSupervisorRequiredFlagNotBetween(Short value1, Short value2) {
            addCriterion("bSupervisorRequiredFlag not between", value1, value2, "bSupervisorRequiredFlag");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagIsNull() {
            addCriterion("bCheckPriceFlag is null");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagIsNotNull() {
            addCriterion("bCheckPriceFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagEqualTo(Short value) {
            addCriterion("bCheckPriceFlag =", value, "bCheckPriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagNotEqualTo(Short value) {
            addCriterion("bCheckPriceFlag <>", value, "bCheckPriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagGreaterThan(Short value) {
            addCriterion("bCheckPriceFlag >", value, "bCheckPriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bCheckPriceFlag >=", value, "bCheckPriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagLessThan(Short value) {
            addCriterion("bCheckPriceFlag <", value, "bCheckPriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagLessThanOrEqualTo(Short value) {
            addCriterion("bCheckPriceFlag <=", value, "bCheckPriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagIn(List<Short> values) {
            addCriterion("bCheckPriceFlag in", values, "bCheckPriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagNotIn(List<Short> values) {
            addCriterion("bCheckPriceFlag not in", values, "bCheckPriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagBetween(Short value1, Short value2) {
            addCriterion("bCheckPriceFlag between", value1, value2, "bCheckPriceFlag");
            return (Criteria) this;
        }

        public Criteria andBCheckPriceFlagNotBetween(Short value1, Short value2) {
            addCriterion("bCheckPriceFlag not between", value1, value2, "bCheckPriceFlag");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagIsNull() {
            addCriterion("bAgeControlFlag is null");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagIsNotNull() {
            addCriterion("bAgeControlFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagEqualTo(Short value) {
            addCriterion("bAgeControlFlag =", value, "bAgeControlFlag");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagNotEqualTo(Short value) {
            addCriterion("bAgeControlFlag <>", value, "bAgeControlFlag");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagGreaterThan(Short value) {
            addCriterion("bAgeControlFlag >", value, "bAgeControlFlag");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("bAgeControlFlag >=", value, "bAgeControlFlag");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagLessThan(Short value) {
            addCriterion("bAgeControlFlag <", value, "bAgeControlFlag");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagLessThanOrEqualTo(Short value) {
            addCriterion("bAgeControlFlag <=", value, "bAgeControlFlag");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagIn(List<Short> values) {
            addCriterion("bAgeControlFlag in", values, "bAgeControlFlag");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagNotIn(List<Short> values) {
            addCriterion("bAgeControlFlag not in", values, "bAgeControlFlag");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagBetween(Short value1, Short value2) {
            addCriterion("bAgeControlFlag between", value1, value2, "bAgeControlFlag");
            return (Criteria) this;
        }

        public Criteria andBAgeControlFlagNotBetween(Short value1, Short value2) {
            addCriterion("bAgeControlFlag not between", value1, value2, "bAgeControlFlag");
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

        public Criteria andDTareAmountIsNull() {
            addCriterion("dTareAmount is null");
            return (Criteria) this;
        }

        public Criteria andDTareAmountIsNotNull() {
            addCriterion("dTareAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDTareAmountEqualTo(BigDecimal value) {
            addCriterion("dTareAmount =", value, "dTareAmount");
            return (Criteria) this;
        }

        public Criteria andDTareAmountNotEqualTo(BigDecimal value) {
            addCriterion("dTareAmount <>", value, "dTareAmount");
            return (Criteria) this;
        }

        public Criteria andDTareAmountGreaterThan(BigDecimal value) {
            addCriterion("dTareAmount >", value, "dTareAmount");
            return (Criteria) this;
        }

        public Criteria andDTareAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dTareAmount >=", value, "dTareAmount");
            return (Criteria) this;
        }

        public Criteria andDTareAmountLessThan(BigDecimal value) {
            addCriterion("dTareAmount <", value, "dTareAmount");
            return (Criteria) this;
        }

        public Criteria andDTareAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dTareAmount <=", value, "dTareAmount");
            return (Criteria) this;
        }

        public Criteria andDTareAmountIn(List<BigDecimal> values) {
            addCriterion("dTareAmount in", values, "dTareAmount");
            return (Criteria) this;
        }

        public Criteria andDTareAmountNotIn(List<BigDecimal> values) {
            addCriterion("dTareAmount not in", values, "dTareAmount");
            return (Criteria) this;
        }

        public Criteria andDTareAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dTareAmount between", value1, value2, "dTareAmount");
            return (Criteria) this;
        }

        public Criteria andDTareAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dTareAmount not between", value1, value2, "dTareAmount");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromIsNull() {
            addCriterion("szDateValidFrom is null");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromIsNotNull() {
            addCriterion("szDateValidFrom is not null");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromEqualTo(String value) {
            addCriterion("szDateValidFrom =", value, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromNotEqualTo(String value) {
            addCriterion("szDateValidFrom <>", value, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromGreaterThan(String value) {
            addCriterion("szDateValidFrom >", value, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromGreaterThanOrEqualTo(String value) {
            addCriterion("szDateValidFrom >=", value, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromLessThan(String value) {
            addCriterion("szDateValidFrom <", value, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromLessThanOrEqualTo(String value) {
            addCriterion("szDateValidFrom <=", value, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromLike(String value) {
            addCriterion("szDateValidFrom like", value, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromNotLike(String value) {
            addCriterion("szDateValidFrom not like", value, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromIn(List<String> values) {
            addCriterion("szDateValidFrom in", values, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromNotIn(List<String> values) {
            addCriterion("szDateValidFrom not in", values, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromBetween(String value1, String value2) {
            addCriterion("szDateValidFrom between", value1, value2, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidFromNotBetween(String value1, String value2) {
            addCriterion("szDateValidFrom not between", value1, value2, "szDateValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromIsNull() {
            addCriterion("szTimeValidFrom is null");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromIsNotNull() {
            addCriterion("szTimeValidFrom is not null");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromEqualTo(String value) {
            addCriterion("szTimeValidFrom =", value, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromNotEqualTo(String value) {
            addCriterion("szTimeValidFrom <>", value, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromGreaterThan(String value) {
            addCriterion("szTimeValidFrom >", value, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromGreaterThanOrEqualTo(String value) {
            addCriterion("szTimeValidFrom >=", value, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromLessThan(String value) {
            addCriterion("szTimeValidFrom <", value, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromLessThanOrEqualTo(String value) {
            addCriterion("szTimeValidFrom <=", value, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromLike(String value) {
            addCriterion("szTimeValidFrom like", value, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromNotLike(String value) {
            addCriterion("szTimeValidFrom not like", value, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromIn(List<String> values) {
            addCriterion("szTimeValidFrom in", values, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromNotIn(List<String> values) {
            addCriterion("szTimeValidFrom not in", values, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromBetween(String value1, String value2) {
            addCriterion("szTimeValidFrom between", value1, value2, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidFromNotBetween(String value1, String value2) {
            addCriterion("szTimeValidFrom not between", value1, value2, "szTimeValidFrom");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToIsNull() {
            addCriterion("szDateValidTo is null");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToIsNotNull() {
            addCriterion("szDateValidTo is not null");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToEqualTo(String value) {
            addCriterion("szDateValidTo =", value, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToNotEqualTo(String value) {
            addCriterion("szDateValidTo <>", value, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToGreaterThan(String value) {
            addCriterion("szDateValidTo >", value, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToGreaterThanOrEqualTo(String value) {
            addCriterion("szDateValidTo >=", value, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToLessThan(String value) {
            addCriterion("szDateValidTo <", value, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToLessThanOrEqualTo(String value) {
            addCriterion("szDateValidTo <=", value, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToLike(String value) {
            addCriterion("szDateValidTo like", value, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToNotLike(String value) {
            addCriterion("szDateValidTo not like", value, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToIn(List<String> values) {
            addCriterion("szDateValidTo in", values, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToNotIn(List<String> values) {
            addCriterion("szDateValidTo not in", values, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToBetween(String value1, String value2) {
            addCriterion("szDateValidTo between", value1, value2, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzDateValidToNotBetween(String value1, String value2) {
            addCriterion("szDateValidTo not between", value1, value2, "szDateValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToIsNull() {
            addCriterion("szTimeValidTo is null");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToIsNotNull() {
            addCriterion("szTimeValidTo is not null");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToEqualTo(String value) {
            addCriterion("szTimeValidTo =", value, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToNotEqualTo(String value) {
            addCriterion("szTimeValidTo <>", value, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToGreaterThan(String value) {
            addCriterion("szTimeValidTo >", value, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToGreaterThanOrEqualTo(String value) {
            addCriterion("szTimeValidTo >=", value, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToLessThan(String value) {
            addCriterion("szTimeValidTo <", value, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToLessThanOrEqualTo(String value) {
            addCriterion("szTimeValidTo <=", value, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToLike(String value) {
            addCriterion("szTimeValidTo like", value, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToNotLike(String value) {
            addCriterion("szTimeValidTo not like", value, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToIn(List<String> values) {
            addCriterion("szTimeValidTo in", values, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToNotIn(List<String> values) {
            addCriterion("szTimeValidTo not in", values, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToBetween(String value1, String value2) {
            addCriterion("szTimeValidTo between", value1, value2, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andSzTimeValidToNotBetween(String value1, String value2) {
            addCriterion("szTimeValidTo not between", value1, value2, "szTimeValidTo");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemIsNull() {
            addCriterion("bIsDepositItem is null");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemIsNotNull() {
            addCriterion("bIsDepositItem is not null");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemEqualTo(Short value) {
            addCriterion("bIsDepositItem =", value, "bIsDepositItem");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemNotEqualTo(Short value) {
            addCriterion("bIsDepositItem <>", value, "bIsDepositItem");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemGreaterThan(Short value) {
            addCriterion("bIsDepositItem >", value, "bIsDepositItem");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemGreaterThanOrEqualTo(Short value) {
            addCriterion("bIsDepositItem >=", value, "bIsDepositItem");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemLessThan(Short value) {
            addCriterion("bIsDepositItem <", value, "bIsDepositItem");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemLessThanOrEqualTo(Short value) {
            addCriterion("bIsDepositItem <=", value, "bIsDepositItem");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemIn(List<Short> values) {
            addCriterion("bIsDepositItem in", values, "bIsDepositItem");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemNotIn(List<Short> values) {
            addCriterion("bIsDepositItem not in", values, "bIsDepositItem");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemBetween(Short value1, Short value2) {
            addCriterion("bIsDepositItem between", value1, value2, "bIsDepositItem");
            return (Criteria) this;
        }

        public Criteria andBIsDepositItemNotBetween(Short value1, Short value2) {
            addCriterion("bIsDepositItem not between", value1, value2, "bIsDepositItem");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkIsNull() {
            addCriterion("dQtyArtLink is null");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkIsNotNull() {
            addCriterion("dQtyArtLink is not null");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkEqualTo(BigDecimal value) {
            addCriterion("dQtyArtLink =", value, "dQtyArtLink");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkNotEqualTo(BigDecimal value) {
            addCriterion("dQtyArtLink <>", value, "dQtyArtLink");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkGreaterThan(BigDecimal value) {
            addCriterion("dQtyArtLink >", value, "dQtyArtLink");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dQtyArtLink >=", value, "dQtyArtLink");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkLessThan(BigDecimal value) {
            addCriterion("dQtyArtLink <", value, "dQtyArtLink");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dQtyArtLink <=", value, "dQtyArtLink");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkIn(List<BigDecimal> values) {
            addCriterion("dQtyArtLink in", values, "dQtyArtLink");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkNotIn(List<BigDecimal> values) {
            addCriterion("dQtyArtLink not in", values, "dQtyArtLink");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dQtyArtLink between", value1, value2, "dQtyArtLink");
            return (Criteria) this;
        }

        public Criteria andDQtyArtLinkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dQtyArtLink not between", value1, value2, "dQtyArtLink");
            return (Criteria) this;
        }

        public Criteria andBPressItemIsNull() {
            addCriterion("bPressItem is null");
            return (Criteria) this;
        }

        public Criteria andBPressItemIsNotNull() {
            addCriterion("bPressItem is not null");
            return (Criteria) this;
        }

        public Criteria andBPressItemEqualTo(Short value) {
            addCriterion("bPressItem =", value, "bPressItem");
            return (Criteria) this;
        }

        public Criteria andBPressItemNotEqualTo(Short value) {
            addCriterion("bPressItem <>", value, "bPressItem");
            return (Criteria) this;
        }

        public Criteria andBPressItemGreaterThan(Short value) {
            addCriterion("bPressItem >", value, "bPressItem");
            return (Criteria) this;
        }

        public Criteria andBPressItemGreaterThanOrEqualTo(Short value) {
            addCriterion("bPressItem >=", value, "bPressItem");
            return (Criteria) this;
        }

        public Criteria andBPressItemLessThan(Short value) {
            addCriterion("bPressItem <", value, "bPressItem");
            return (Criteria) this;
        }

        public Criteria andBPressItemLessThanOrEqualTo(Short value) {
            addCriterion("bPressItem <=", value, "bPressItem");
            return (Criteria) this;
        }

        public Criteria andBPressItemIn(List<Short> values) {
            addCriterion("bPressItem in", values, "bPressItem");
            return (Criteria) this;
        }

        public Criteria andBPressItemNotIn(List<Short> values) {
            addCriterion("bPressItem not in", values, "bPressItem");
            return (Criteria) this;
        }

        public Criteria andBPressItemBetween(Short value1, Short value2) {
            addCriterion("bPressItem between", value1, value2, "bPressItem");
            return (Criteria) this;
        }

        public Criteria andBPressItemNotBetween(Short value1, Short value2) {
            addCriterion("bPressItem not between", value1, value2, "bPressItem");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredIsNull() {
            addCriterion("bQuantityEntryRequired is null");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredIsNotNull() {
            addCriterion("bQuantityEntryRequired is not null");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredEqualTo(Short value) {
            addCriterion("bQuantityEntryRequired =", value, "bQuantityEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredNotEqualTo(Short value) {
            addCriterion("bQuantityEntryRequired <>", value, "bQuantityEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredGreaterThan(Short value) {
            addCriterion("bQuantityEntryRequired >", value, "bQuantityEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredGreaterThanOrEqualTo(Short value) {
            addCriterion("bQuantityEntryRequired >=", value, "bQuantityEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredLessThan(Short value) {
            addCriterion("bQuantityEntryRequired <", value, "bQuantityEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredLessThanOrEqualTo(Short value) {
            addCriterion("bQuantityEntryRequired <=", value, "bQuantityEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredIn(List<Short> values) {
            addCriterion("bQuantityEntryRequired in", values, "bQuantityEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredNotIn(List<Short> values) {
            addCriterion("bQuantityEntryRequired not in", values, "bQuantityEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredBetween(Short value1, Short value2) {
            addCriterion("bQuantityEntryRequired between", value1, value2, "bQuantityEntryRequired");
            return (Criteria) this;
        }

        public Criteria andBQuantityEntryRequiredNotBetween(Short value1, Short value2) {
            addCriterion("bQuantityEntryRequired not between", value1, value2, "bQuantityEntryRequired");
            return (Criteria) this;
        }

        public Criteria andLAgeControlIsNull() {
            addCriterion("lAgeControl is null");
            return (Criteria) this;
        }

        public Criteria andLAgeControlIsNotNull() {
            addCriterion("lAgeControl is not null");
            return (Criteria) this;
        }

        public Criteria andLAgeControlEqualTo(Integer value) {
            addCriterion("lAgeControl =", value, "lAgeControl");
            return (Criteria) this;
        }

        public Criteria andLAgeControlNotEqualTo(Integer value) {
            addCriterion("lAgeControl <>", value, "lAgeControl");
            return (Criteria) this;
        }

        public Criteria andLAgeControlGreaterThan(Integer value) {
            addCriterion("lAgeControl >", value, "lAgeControl");
            return (Criteria) this;
        }

        public Criteria andLAgeControlGreaterThanOrEqualTo(Integer value) {
            addCriterion("lAgeControl >=", value, "lAgeControl");
            return (Criteria) this;
        }

        public Criteria andLAgeControlLessThan(Integer value) {
            addCriterion("lAgeControl <", value, "lAgeControl");
            return (Criteria) this;
        }

        public Criteria andLAgeControlLessThanOrEqualTo(Integer value) {
            addCriterion("lAgeControl <=", value, "lAgeControl");
            return (Criteria) this;
        }

        public Criteria andLAgeControlIn(List<Integer> values) {
            addCriterion("lAgeControl in", values, "lAgeControl");
            return (Criteria) this;
        }

        public Criteria andLAgeControlNotIn(List<Integer> values) {
            addCriterion("lAgeControl not in", values, "lAgeControl");
            return (Criteria) this;
        }

        public Criteria andLAgeControlBetween(Integer value1, Integer value2) {
            addCriterion("lAgeControl between", value1, value2, "lAgeControl");
            return (Criteria) this;
        }

        public Criteria andLAgeControlNotBetween(Integer value1, Integer value2) {
            addCriterion("lAgeControl not between", value1, value2, "lAgeControl");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorIsNull() {
            addCriterion("bUseSizeAndColor is null");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorIsNotNull() {
            addCriterion("bUseSizeAndColor is not null");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorEqualTo(Short value) {
            addCriterion("bUseSizeAndColor =", value, "bUseSizeAndColor");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorNotEqualTo(Short value) {
            addCriterion("bUseSizeAndColor <>", value, "bUseSizeAndColor");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorGreaterThan(Short value) {
            addCriterion("bUseSizeAndColor >", value, "bUseSizeAndColor");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorGreaterThanOrEqualTo(Short value) {
            addCriterion("bUseSizeAndColor >=", value, "bUseSizeAndColor");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorLessThan(Short value) {
            addCriterion("bUseSizeAndColor <", value, "bUseSizeAndColor");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorLessThanOrEqualTo(Short value) {
            addCriterion("bUseSizeAndColor <=", value, "bUseSizeAndColor");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorIn(List<Short> values) {
            addCriterion("bUseSizeAndColor in", values, "bUseSizeAndColor");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorNotIn(List<Short> values) {
            addCriterion("bUseSizeAndColor not in", values, "bUseSizeAndColor");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorBetween(Short value1, Short value2) {
            addCriterion("bUseSizeAndColor between", value1, value2, "bUseSizeAndColor");
            return (Criteria) this;
        }

        public Criteria andBUseSizeAndColorNotBetween(Short value1, Short value2) {
            addCriterion("bUseSizeAndColor not between", value1, value2, "bUseSizeAndColor");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemIsNull() {
            addCriterion("bIsBundleItem is null");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemIsNotNull() {
            addCriterion("bIsBundleItem is not null");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemEqualTo(Short value) {
            addCriterion("bIsBundleItem =", value, "bIsBundleItem");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemNotEqualTo(Short value) {
            addCriterion("bIsBundleItem <>", value, "bIsBundleItem");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemGreaterThan(Short value) {
            addCriterion("bIsBundleItem >", value, "bIsBundleItem");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemGreaterThanOrEqualTo(Short value) {
            addCriterion("bIsBundleItem >=", value, "bIsBundleItem");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemLessThan(Short value) {
            addCriterion("bIsBundleItem <", value, "bIsBundleItem");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemLessThanOrEqualTo(Short value) {
            addCriterion("bIsBundleItem <=", value, "bIsBundleItem");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemIn(List<Short> values) {
            addCriterion("bIsBundleItem in", values, "bIsBundleItem");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemNotIn(List<Short> values) {
            addCriterion("bIsBundleItem not in", values, "bIsBundleItem");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemBetween(Short value1, Short value2) {
            addCriterion("bIsBundleItem between", value1, value2, "bIsBundleItem");
            return (Criteria) this;
        }

        public Criteria andBIsBundleItemNotBetween(Short value1, Short value2) {
            addCriterion("bIsBundleItem not between", value1, value2, "bIsBundleItem");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPIsNull() {
            addCriterion("bLockedByERP is null");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPIsNotNull() {
            addCriterion("bLockedByERP is not null");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPEqualTo(Short value) {
            addCriterion("bLockedByERP =", value, "bLockedByERP");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPNotEqualTo(Short value) {
            addCriterion("bLockedByERP <>", value, "bLockedByERP");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPGreaterThan(Short value) {
            addCriterion("bLockedByERP >", value, "bLockedByERP");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPGreaterThanOrEqualTo(Short value) {
            addCriterion("bLockedByERP >=", value, "bLockedByERP");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPLessThan(Short value) {
            addCriterion("bLockedByERP <", value, "bLockedByERP");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPLessThanOrEqualTo(Short value) {
            addCriterion("bLockedByERP <=", value, "bLockedByERP");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPIn(List<Short> values) {
            addCriterion("bLockedByERP in", values, "bLockedByERP");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPNotIn(List<Short> values) {
            addCriterion("bLockedByERP not in", values, "bLockedByERP");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPBetween(Short value1, Short value2) {
            addCriterion("bLockedByERP between", value1, value2, "bLockedByERP");
            return (Criteria) this;
        }

        public Criteria andBLockedByERPNotBetween(Short value1, Short value2) {
            addCriterion("bLockedByERP not between", value1, value2, "bLockedByERP");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedIsNull() {
            addCriterion("bLoyaltyPointsAllowed is null");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedIsNotNull() {
            addCriterion("bLoyaltyPointsAllowed is not null");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedEqualTo(Short value) {
            addCriterion("bLoyaltyPointsAllowed =", value, "bLoyaltyPointsAllowed");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedNotEqualTo(Short value) {
            addCriterion("bLoyaltyPointsAllowed <>", value, "bLoyaltyPointsAllowed");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedGreaterThan(Short value) {
            addCriterion("bLoyaltyPointsAllowed >", value, "bLoyaltyPointsAllowed");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedGreaterThanOrEqualTo(Short value) {
            addCriterion("bLoyaltyPointsAllowed >=", value, "bLoyaltyPointsAllowed");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedLessThan(Short value) {
            addCriterion("bLoyaltyPointsAllowed <", value, "bLoyaltyPointsAllowed");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedLessThanOrEqualTo(Short value) {
            addCriterion("bLoyaltyPointsAllowed <=", value, "bLoyaltyPointsAllowed");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedIn(List<Short> values) {
            addCriterion("bLoyaltyPointsAllowed in", values, "bLoyaltyPointsAllowed");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedNotIn(List<Short> values) {
            addCriterion("bLoyaltyPointsAllowed not in", values, "bLoyaltyPointsAllowed");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedBetween(Short value1, Short value2) {
            addCriterion("bLoyaltyPointsAllowed between", value1, value2, "bLoyaltyPointsAllowed");
            return (Criteria) this;
        }

        public Criteria andBLoyaltyPointsAllowedNotBetween(Short value1, Short value2) {
            addCriterion("bLoyaltyPointsAllowed not between", value1, value2, "bLoyaltyPointsAllowed");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDIsNull() {
            addCriterion("lChangedByOperatorID is null");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDIsNotNull() {
            addCriterion("lChangedByOperatorID is not null");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDEqualTo(Integer value) {
            addCriterion("lChangedByOperatorID =", value, "lChangedByOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDNotEqualTo(Integer value) {
            addCriterion("lChangedByOperatorID <>", value, "lChangedByOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDGreaterThan(Integer value) {
            addCriterion("lChangedByOperatorID >", value, "lChangedByOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lChangedByOperatorID >=", value, "lChangedByOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDLessThan(Integer value) {
            addCriterion("lChangedByOperatorID <", value, "lChangedByOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDLessThanOrEqualTo(Integer value) {
            addCriterion("lChangedByOperatorID <=", value, "lChangedByOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDIn(List<Integer> values) {
            addCriterion("lChangedByOperatorID in", values, "lChangedByOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDNotIn(List<Integer> values) {
            addCriterion("lChangedByOperatorID not in", values, "lChangedByOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDBetween(Integer value1, Integer value2) {
            addCriterion("lChangedByOperatorID between", value1, value2, "lChangedByOperatorID");
            return (Criteria) this;
        }

        public Criteria andLChangedByOperatorIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lChangedByOperatorID not between", value1, value2, "lChangedByOperatorID");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsIsNull() {
            addCriterion("dLoyaltyPoints is null");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsIsNotNull() {
            addCriterion("dLoyaltyPoints is not null");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsEqualTo(Integer value) {
            addCriterion("dLoyaltyPoints =", value, "dLoyaltyPoints");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsNotEqualTo(Integer value) {
            addCriterion("dLoyaltyPoints <>", value, "dLoyaltyPoints");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsGreaterThan(Integer value) {
            addCriterion("dLoyaltyPoints >", value, "dLoyaltyPoints");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("dLoyaltyPoints >=", value, "dLoyaltyPoints");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsLessThan(Integer value) {
            addCriterion("dLoyaltyPoints <", value, "dLoyaltyPoints");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsLessThanOrEqualTo(Integer value) {
            addCriterion("dLoyaltyPoints <=", value, "dLoyaltyPoints");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsIn(List<Integer> values) {
            addCriterion("dLoyaltyPoints in", values, "dLoyaltyPoints");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsNotIn(List<Integer> values) {
            addCriterion("dLoyaltyPoints not in", values, "dLoyaltyPoints");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsBetween(Integer value1, Integer value2) {
            addCriterion("dLoyaltyPoints between", value1, value2, "dLoyaltyPoints");
            return (Criteria) this;
        }

        public Criteria andDLoyaltyPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("dLoyaltyPoints not between", value1, value2, "dLoyaltyPoints");
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

        public Criteria andSzAccountingIDIsNull() {
            addCriterion("szAccountingID is null");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDIsNotNull() {
            addCriterion("szAccountingID is not null");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDEqualTo(String value) {
            addCriterion("szAccountingID =", value, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDNotEqualTo(String value) {
            addCriterion("szAccountingID <>", value, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDGreaterThan(String value) {
            addCriterion("szAccountingID >", value, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDGreaterThanOrEqualTo(String value) {
            addCriterion("szAccountingID >=", value, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDLessThan(String value) {
            addCriterion("szAccountingID <", value, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDLessThanOrEqualTo(String value) {
            addCriterion("szAccountingID <=", value, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDLike(String value) {
            addCriterion("szAccountingID like", value, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDNotLike(String value) {
            addCriterion("szAccountingID not like", value, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDIn(List<String> values) {
            addCriterion("szAccountingID in", values, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDNotIn(List<String> values) {
            addCriterion("szAccountingID not in", values, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDBetween(String value1, String value2) {
            addCriterion("szAccountingID between", value1, value2, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andSzAccountingIDNotBetween(String value1, String value2) {
            addCriterion("szAccountingID not between", value1, value2, "szAccountingID");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedIsNull() {
            addCriterion("bVoidAllowed is null");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedIsNotNull() {
            addCriterion("bVoidAllowed is not null");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedEqualTo(Short value) {
            addCriterion("bVoidAllowed =", value, "bVoidAllowed");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedNotEqualTo(Short value) {
            addCriterion("bVoidAllowed <>", value, "bVoidAllowed");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedGreaterThan(Short value) {
            addCriterion("bVoidAllowed >", value, "bVoidAllowed");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedGreaterThanOrEqualTo(Short value) {
            addCriterion("bVoidAllowed >=", value, "bVoidAllowed");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedLessThan(Short value) {
            addCriterion("bVoidAllowed <", value, "bVoidAllowed");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedLessThanOrEqualTo(Short value) {
            addCriterion("bVoidAllowed <=", value, "bVoidAllowed");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedIn(List<Short> values) {
            addCriterion("bVoidAllowed in", values, "bVoidAllowed");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedNotIn(List<Short> values) {
            addCriterion("bVoidAllowed not in", values, "bVoidAllowed");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedBetween(Short value1, Short value2) {
            addCriterion("bVoidAllowed between", value1, value2, "bVoidAllowed");
            return (Criteria) this;
        }

        public Criteria andBVoidAllowedNotBetween(Short value1, Short value2) {
            addCriterion("bVoidAllowed not between", value1, value2, "bVoidAllowed");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyIsNull() {
            addCriterion("dMaxAllowedQty is null");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyIsNotNull() {
            addCriterion("dMaxAllowedQty is not null");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyEqualTo(BigDecimal value) {
            addCriterion("dMaxAllowedQty =", value, "dMaxAllowedQty");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyNotEqualTo(BigDecimal value) {
            addCriterion("dMaxAllowedQty <>", value, "dMaxAllowedQty");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyGreaterThan(BigDecimal value) {
            addCriterion("dMaxAllowedQty >", value, "dMaxAllowedQty");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dMaxAllowedQty >=", value, "dMaxAllowedQty");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyLessThan(BigDecimal value) {
            addCriterion("dMaxAllowedQty <", value, "dMaxAllowedQty");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dMaxAllowedQty <=", value, "dMaxAllowedQty");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyIn(List<BigDecimal> values) {
            addCriterion("dMaxAllowedQty in", values, "dMaxAllowedQty");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyNotIn(List<BigDecimal> values) {
            addCriterion("dMaxAllowedQty not in", values, "dMaxAllowedQty");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMaxAllowedQty between", value1, value2, "dMaxAllowedQty");
            return (Criteria) this;
        }

        public Criteria andDMaxAllowedQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMaxAllowedQty not between", value1, value2, "dMaxAllowedQty");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlIsNull() {
            addCriterion("lOperatorAgeControl is null");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlIsNotNull() {
            addCriterion("lOperatorAgeControl is not null");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlEqualTo(Integer value) {
            addCriterion("lOperatorAgeControl =", value, "lOperatorAgeControl");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlNotEqualTo(Integer value) {
            addCriterion("lOperatorAgeControl <>", value, "lOperatorAgeControl");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlGreaterThan(Integer value) {
            addCriterion("lOperatorAgeControl >", value, "lOperatorAgeControl");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlGreaterThanOrEqualTo(Integer value) {
            addCriterion("lOperatorAgeControl >=", value, "lOperatorAgeControl");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlLessThan(Integer value) {
            addCriterion("lOperatorAgeControl <", value, "lOperatorAgeControl");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlLessThanOrEqualTo(Integer value) {
            addCriterion("lOperatorAgeControl <=", value, "lOperatorAgeControl");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlIn(List<Integer> values) {
            addCriterion("lOperatorAgeControl in", values, "lOperatorAgeControl");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlNotIn(List<Integer> values) {
            addCriterion("lOperatorAgeControl not in", values, "lOperatorAgeControl");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlBetween(Integer value1, Integer value2) {
            addCriterion("lOperatorAgeControl between", value1, value2, "lOperatorAgeControl");
            return (Criteria) this;
        }

        public Criteria andLOperatorAgeControlNotBetween(Integer value1, Integer value2) {
            addCriterion("lOperatorAgeControl not between", value1, value2, "lOperatorAgeControl");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnIsNull() {
            addCriterion("IM_bAllowPOGoodReturn is null");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnIsNotNull() {
            addCriterion("IM_bAllowPOGoodReturn is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnEqualTo(Integer value) {
            addCriterion("IM_bAllowPOGoodReturn =", value, "IM_bAllowPOGoodReturn");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnNotEqualTo(Integer value) {
            addCriterion("IM_bAllowPOGoodReturn <>", value, "IM_bAllowPOGoodReturn");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnGreaterThan(Integer value) {
            addCriterion("IM_bAllowPOGoodReturn >", value, "IM_bAllowPOGoodReturn");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bAllowPOGoodReturn >=", value, "IM_bAllowPOGoodReturn");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnLessThan(Integer value) {
            addCriterion("IM_bAllowPOGoodReturn <", value, "IM_bAllowPOGoodReturn");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnLessThanOrEqualTo(Integer value) {
            addCriterion("IM_bAllowPOGoodReturn <=", value, "IM_bAllowPOGoodReturn");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnIn(List<Integer> values) {
            addCriterion("IM_bAllowPOGoodReturn in", values, "IM_bAllowPOGoodReturn");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnNotIn(List<Integer> values) {
            addCriterion("IM_bAllowPOGoodReturn not in", values, "IM_bAllowPOGoodReturn");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnBetween(Integer value1, Integer value2) {
            addCriterion("IM_bAllowPOGoodReturn between", value1, value2, "IM_bAllowPOGoodReturn");
            return (Criteria) this;
        }

        public Criteria andIM_bAllowPOGoodReturnNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bAllowPOGoodReturn not between", value1, value2, "IM_bAllowPOGoodReturn");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyIsNull() {
            addCriterion("IM_dMinOrderQty is null");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyIsNotNull() {
            addCriterion("IM_dMinOrderQty is not null");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyEqualTo(BigDecimal value) {
            addCriterion("IM_dMinOrderQty =", value, "IM_dMinOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyNotEqualTo(BigDecimal value) {
            addCriterion("IM_dMinOrderQty <>", value, "IM_dMinOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyGreaterThan(BigDecimal value) {
            addCriterion("IM_dMinOrderQty >", value, "IM_dMinOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IM_dMinOrderQty >=", value, "IM_dMinOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyLessThan(BigDecimal value) {
            addCriterion("IM_dMinOrderQty <", value, "IM_dMinOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IM_dMinOrderQty <=", value, "IM_dMinOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyIn(List<BigDecimal> values) {
            addCriterion("IM_dMinOrderQty in", values, "IM_dMinOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyNotIn(List<BigDecimal> values) {
            addCriterion("IM_dMinOrderQty not in", values, "IM_dMinOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IM_dMinOrderQty between", value1, value2, "IM_dMinOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMinOrderQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IM_dMinOrderQty not between", value1, value2, "IM_dMinOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysIsNull() {
            addCriterion("IM_lInventoryDays is null");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysIsNotNull() {
            addCriterion("IM_lInventoryDays is not null");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysEqualTo(Integer value) {
            addCriterion("IM_lInventoryDays =", value, "IM_lInventoryDays");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysNotEqualTo(Integer value) {
            addCriterion("IM_lInventoryDays <>", value, "IM_lInventoryDays");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysGreaterThan(Integer value) {
            addCriterion("IM_lInventoryDays >", value, "IM_lInventoryDays");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_lInventoryDays >=", value, "IM_lInventoryDays");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysLessThan(Integer value) {
            addCriterion("IM_lInventoryDays <", value, "IM_lInventoryDays");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysLessThanOrEqualTo(Integer value) {
            addCriterion("IM_lInventoryDays <=", value, "IM_lInventoryDays");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysIn(List<Integer> values) {
            addCriterion("IM_lInventoryDays in", values, "IM_lInventoryDays");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysNotIn(List<Integer> values) {
            addCriterion("IM_lInventoryDays not in", values, "IM_lInventoryDays");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysBetween(Integer value1, Integer value2) {
            addCriterion("IM_lInventoryDays between", value1, value2, "IM_lInventoryDays");
            return (Criteria) this;
        }

        public Criteria andIM_lInventoryDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_lInventoryDays not between", value1, value2, "IM_lInventoryDays");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeIsNull() {
            addCriterion("IM_lShelfLife is null");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeIsNotNull() {
            addCriterion("IM_lShelfLife is not null");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeEqualTo(Integer value) {
            addCriterion("IM_lShelfLife =", value, "IM_lShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeNotEqualTo(Integer value) {
            addCriterion("IM_lShelfLife <>", value, "IM_lShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeGreaterThan(Integer value) {
            addCriterion("IM_lShelfLife >", value, "IM_lShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_lShelfLife >=", value, "IM_lShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeLessThan(Integer value) {
            addCriterion("IM_lShelfLife <", value, "IM_lShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeLessThanOrEqualTo(Integer value) {
            addCriterion("IM_lShelfLife <=", value, "IM_lShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeIn(List<Integer> values) {
            addCriterion("IM_lShelfLife in", values, "IM_lShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeNotIn(List<Integer> values) {
            addCriterion("IM_lShelfLife not in", values, "IM_lShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeBetween(Integer value1, Integer value2) {
            addCriterion("IM_lShelfLife between", value1, value2, "IM_lShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lShelfLifeNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_lShelfLife not between", value1, value2, "IM_lShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeIsNull() {
            addCriterion("IM_lReceiveShelfLife is null");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeIsNotNull() {
            addCriterion("IM_lReceiveShelfLife is not null");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeEqualTo(Integer value) {
            addCriterion("IM_lReceiveShelfLife =", value, "IM_lReceiveShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeNotEqualTo(Integer value) {
            addCriterion("IM_lReceiveShelfLife <>", value, "IM_lReceiveShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeGreaterThan(Integer value) {
            addCriterion("IM_lReceiveShelfLife >", value, "IM_lReceiveShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_lReceiveShelfLife >=", value, "IM_lReceiveShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeLessThan(Integer value) {
            addCriterion("IM_lReceiveShelfLife <", value, "IM_lReceiveShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeLessThanOrEqualTo(Integer value) {
            addCriterion("IM_lReceiveShelfLife <=", value, "IM_lReceiveShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeIn(List<Integer> values) {
            addCriterion("IM_lReceiveShelfLife in", values, "IM_lReceiveShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeNotIn(List<Integer> values) {
            addCriterion("IM_lReceiveShelfLife not in", values, "IM_lReceiveShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeBetween(Integer value1, Integer value2) {
            addCriterion("IM_lReceiveShelfLife between", value1, value2, "IM_lReceiveShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lReceiveShelfLifeNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_lReceiveShelfLife not between", value1, value2, "IM_lReceiveShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeIsNull() {
            addCriterion("IM_lSaleShelfLife is null");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeIsNotNull() {
            addCriterion("IM_lSaleShelfLife is not null");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeEqualTo(Integer value) {
            addCriterion("IM_lSaleShelfLife =", value, "IM_lSaleShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeNotEqualTo(Integer value) {
            addCriterion("IM_lSaleShelfLife <>", value, "IM_lSaleShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeGreaterThan(Integer value) {
            addCriterion("IM_lSaleShelfLife >", value, "IM_lSaleShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_lSaleShelfLife >=", value, "IM_lSaleShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeLessThan(Integer value) {
            addCriterion("IM_lSaleShelfLife <", value, "IM_lSaleShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeLessThanOrEqualTo(Integer value) {
            addCriterion("IM_lSaleShelfLife <=", value, "IM_lSaleShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeIn(List<Integer> values) {
            addCriterion("IM_lSaleShelfLife in", values, "IM_lSaleShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeNotIn(List<Integer> values) {
            addCriterion("IM_lSaleShelfLife not in", values, "IM_lSaleShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeBetween(Integer value1, Integer value2) {
            addCriterion("IM_lSaleShelfLife between", value1, value2, "IM_lSaleShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_lSaleShelfLifeNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_lSaleShelfLife not between", value1, value2, "IM_lSaleShelfLife");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDIsNull() {
            addCriterion("IM_szPrimaryStorageLocationID is null");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDIsNotNull() {
            addCriterion("IM_szPrimaryStorageLocationID is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDEqualTo(String value) {
            addCriterion("IM_szPrimaryStorageLocationID =", value, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDNotEqualTo(String value) {
            addCriterion("IM_szPrimaryStorageLocationID <>", value, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDGreaterThan(String value) {
            addCriterion("IM_szPrimaryStorageLocationID >", value, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szPrimaryStorageLocationID >=", value, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDLessThan(String value) {
            addCriterion("IM_szPrimaryStorageLocationID <", value, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDLessThanOrEqualTo(String value) {
            addCriterion("IM_szPrimaryStorageLocationID <=", value, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDLike(String value) {
            addCriterion("IM_szPrimaryStorageLocationID like", value, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDNotLike(String value) {
            addCriterion("IM_szPrimaryStorageLocationID not like", value, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDIn(List<String> values) {
            addCriterion("IM_szPrimaryStorageLocationID in", values, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDNotIn(List<String> values) {
            addCriterion("IM_szPrimaryStorageLocationID not in", values, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDBetween(String value1, String value2) {
            addCriterion("IM_szPrimaryStorageLocationID between", value1, value2, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryStorageLocationIDNotBetween(String value1, String value2) {
            addCriterion("IM_szPrimaryStorageLocationID not between", value1, value2, "IM_szPrimaryStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeIsNull() {
            addCriterion("IM_lOrderType is null");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeIsNotNull() {
            addCriterion("IM_lOrderType is not null");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeEqualTo(Integer value) {
            addCriterion("IM_lOrderType =", value, "IM_lOrderType");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeNotEqualTo(Integer value) {
            addCriterion("IM_lOrderType <>", value, "IM_lOrderType");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeGreaterThan(Integer value) {
            addCriterion("IM_lOrderType >", value, "IM_lOrderType");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_lOrderType >=", value, "IM_lOrderType");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeLessThan(Integer value) {
            addCriterion("IM_lOrderType <", value, "IM_lOrderType");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("IM_lOrderType <=", value, "IM_lOrderType");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeIn(List<Integer> values) {
            addCriterion("IM_lOrderType in", values, "IM_lOrderType");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeNotIn(List<Integer> values) {
            addCriterion("IM_lOrderType not in", values, "IM_lOrderType");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("IM_lOrderType between", value1, value2, "IM_lOrderType");
            return (Criteria) this;
        }

        public Criteria andIM_lOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_lOrderType not between", value1, value2, "IM_lOrderType");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1IsNull() {
            addCriterion("IM_bFreshFoodD1 is null");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1IsNotNull() {
            addCriterion("IM_bFreshFoodD1 is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1EqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD1 =", value, "IM_bFreshFoodD1");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1NotEqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD1 <>", value, "IM_bFreshFoodD1");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1GreaterThan(Integer value) {
            addCriterion("IM_bFreshFoodD1 >", value, "IM_bFreshFoodD1");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1GreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD1 >=", value, "IM_bFreshFoodD1");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1LessThan(Integer value) {
            addCriterion("IM_bFreshFoodD1 <", value, "IM_bFreshFoodD1");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1LessThanOrEqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD1 <=", value, "IM_bFreshFoodD1");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1In(List<Integer> values) {
            addCriterion("IM_bFreshFoodD1 in", values, "IM_bFreshFoodD1");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1NotIn(List<Integer> values) {
            addCriterion("IM_bFreshFoodD1 not in", values, "IM_bFreshFoodD1");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1Between(Integer value1, Integer value2) {
            addCriterion("IM_bFreshFoodD1 between", value1, value2, "IM_bFreshFoodD1");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD1NotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bFreshFoodD1 not between", value1, value2, "IM_bFreshFoodD1");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2IsNull() {
            addCriterion("IM_bFreshFoodD2 is null");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2IsNotNull() {
            addCriterion("IM_bFreshFoodD2 is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2EqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD2 =", value, "IM_bFreshFoodD2");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2NotEqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD2 <>", value, "IM_bFreshFoodD2");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2GreaterThan(Integer value) {
            addCriterion("IM_bFreshFoodD2 >", value, "IM_bFreshFoodD2");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2GreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD2 >=", value, "IM_bFreshFoodD2");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2LessThan(Integer value) {
            addCriterion("IM_bFreshFoodD2 <", value, "IM_bFreshFoodD2");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2LessThanOrEqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD2 <=", value, "IM_bFreshFoodD2");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2In(List<Integer> values) {
            addCriterion("IM_bFreshFoodD2 in", values, "IM_bFreshFoodD2");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2NotIn(List<Integer> values) {
            addCriterion("IM_bFreshFoodD2 not in", values, "IM_bFreshFoodD2");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2Between(Integer value1, Integer value2) {
            addCriterion("IM_bFreshFoodD2 between", value1, value2, "IM_bFreshFoodD2");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD2NotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bFreshFoodD2 not between", value1, value2, "IM_bFreshFoodD2");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3IsNull() {
            addCriterion("IM_bFreshFoodD3 is null");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3IsNotNull() {
            addCriterion("IM_bFreshFoodD3 is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3EqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD3 =", value, "IM_bFreshFoodD3");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3NotEqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD3 <>", value, "IM_bFreshFoodD3");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3GreaterThan(Integer value) {
            addCriterion("IM_bFreshFoodD3 >", value, "IM_bFreshFoodD3");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3GreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD3 >=", value, "IM_bFreshFoodD3");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3LessThan(Integer value) {
            addCriterion("IM_bFreshFoodD3 <", value, "IM_bFreshFoodD3");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3LessThanOrEqualTo(Integer value) {
            addCriterion("IM_bFreshFoodD3 <=", value, "IM_bFreshFoodD3");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3In(List<Integer> values) {
            addCriterion("IM_bFreshFoodD3 in", values, "IM_bFreshFoodD3");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3NotIn(List<Integer> values) {
            addCriterion("IM_bFreshFoodD3 not in", values, "IM_bFreshFoodD3");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3Between(Integer value1, Integer value2) {
            addCriterion("IM_bFreshFoodD3 between", value1, value2, "IM_bFreshFoodD3");
            return (Criteria) this;
        }

        public Criteria andIM_bFreshFoodD3NotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bFreshFoodD3 not between", value1, value2, "IM_bFreshFoodD3");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateIsNull() {
            addCriterion("IM_szOrderBlockDate is null");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateIsNotNull() {
            addCriterion("IM_szOrderBlockDate is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateEqualTo(String value) {
            addCriterion("IM_szOrderBlockDate =", value, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateNotEqualTo(String value) {
            addCriterion("IM_szOrderBlockDate <>", value, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateGreaterThan(String value) {
            addCriterion("IM_szOrderBlockDate >", value, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szOrderBlockDate >=", value, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateLessThan(String value) {
            addCriterion("IM_szOrderBlockDate <", value, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateLessThanOrEqualTo(String value) {
            addCriterion("IM_szOrderBlockDate <=", value, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateLike(String value) {
            addCriterion("IM_szOrderBlockDate like", value, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateNotLike(String value) {
            addCriterion("IM_szOrderBlockDate not like", value, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateIn(List<String> values) {
            addCriterion("IM_szOrderBlockDate in", values, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateNotIn(List<String> values) {
            addCriterion("IM_szOrderBlockDate not in", values, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateBetween(String value1, String value2) {
            addCriterion("IM_szOrderBlockDate between", value1, value2, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderBlockDateNotBetween(String value1, String value2) {
            addCriterion("IM_szOrderBlockDate not between", value1, value2, "IM_szOrderBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateIsNull() {
            addCriterion("IM_szReturnBlockDate is null");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateIsNotNull() {
            addCriterion("IM_szReturnBlockDate is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateEqualTo(String value) {
            addCriterion("IM_szReturnBlockDate =", value, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateNotEqualTo(String value) {
            addCriterion("IM_szReturnBlockDate <>", value, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateGreaterThan(String value) {
            addCriterion("IM_szReturnBlockDate >", value, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szReturnBlockDate >=", value, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateLessThan(String value) {
            addCriterion("IM_szReturnBlockDate <", value, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateLessThanOrEqualTo(String value) {
            addCriterion("IM_szReturnBlockDate <=", value, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateLike(String value) {
            addCriterion("IM_szReturnBlockDate like", value, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateNotLike(String value) {
            addCriterion("IM_szReturnBlockDate not like", value, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateIn(List<String> values) {
            addCriterion("IM_szReturnBlockDate in", values, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateNotIn(List<String> values) {
            addCriterion("IM_szReturnBlockDate not in", values, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateBetween(String value1, String value2) {
            addCriterion("IM_szReturnBlockDate between", value1, value2, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szReturnBlockDateNotBetween(String value1, String value2) {
            addCriterion("IM_szReturnBlockDate not between", value1, value2, "IM_szReturnBlockDate");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromIsNull() {
            addCriterion("IM_szDailySalesBlockTimeFrom is null");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromIsNotNull() {
            addCriterion("IM_szDailySalesBlockTimeFrom is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromEqualTo(String value) {
            addCriterion("IM_szDailySalesBlockTimeFrom =", value, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromNotEqualTo(String value) {
            addCriterion("IM_szDailySalesBlockTimeFrom <>", value, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromGreaterThan(String value) {
            addCriterion("IM_szDailySalesBlockTimeFrom >", value, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szDailySalesBlockTimeFrom >=", value, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromLessThan(String value) {
            addCriterion("IM_szDailySalesBlockTimeFrom <", value, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromLessThanOrEqualTo(String value) {
            addCriterion("IM_szDailySalesBlockTimeFrom <=", value, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromLike(String value) {
            addCriterion("IM_szDailySalesBlockTimeFrom like", value, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromNotLike(String value) {
            addCriterion("IM_szDailySalesBlockTimeFrom not like", value, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromIn(List<String> values) {
            addCriterion("IM_szDailySalesBlockTimeFrom in", values, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromNotIn(List<String> values) {
            addCriterion("IM_szDailySalesBlockTimeFrom not in", values, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromBetween(String value1, String value2) {
            addCriterion("IM_szDailySalesBlockTimeFrom between", value1, value2, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeFromNotBetween(String value1, String value2) {
            addCriterion("IM_szDailySalesBlockTimeFrom not between", value1, value2, "IM_szDailySalesBlockTimeFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToIsNull() {
            addCriterion("IM_szDailySalesBlockTimeTo is null");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToIsNotNull() {
            addCriterion("IM_szDailySalesBlockTimeTo is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToEqualTo(String value) {
            addCriterion("IM_szDailySalesBlockTimeTo =", value, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToNotEqualTo(String value) {
            addCriterion("IM_szDailySalesBlockTimeTo <>", value, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToGreaterThan(String value) {
            addCriterion("IM_szDailySalesBlockTimeTo >", value, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szDailySalesBlockTimeTo >=", value, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToLessThan(String value) {
            addCriterion("IM_szDailySalesBlockTimeTo <", value, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToLessThanOrEqualTo(String value) {
            addCriterion("IM_szDailySalesBlockTimeTo <=", value, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToLike(String value) {
            addCriterion("IM_szDailySalesBlockTimeTo like", value, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToNotLike(String value) {
            addCriterion("IM_szDailySalesBlockTimeTo not like", value, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToIn(List<String> values) {
            addCriterion("IM_szDailySalesBlockTimeTo in", values, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToNotIn(List<String> values) {
            addCriterion("IM_szDailySalesBlockTimeTo not in", values, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToBetween(String value1, String value2) {
            addCriterion("IM_szDailySalesBlockTimeTo between", value1, value2, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szDailySalesBlockTimeToNotBetween(String value1, String value2) {
            addCriterion("IM_szDailySalesBlockTimeTo not between", value1, value2, "IM_szDailySalesBlockTimeTo");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDIsNull() {
            addCriterion("IM_szPrimaryVendorID is null");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDIsNotNull() {
            addCriterion("IM_szPrimaryVendorID is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDEqualTo(String value) {
            addCriterion("IM_szPrimaryVendorID =", value, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDNotEqualTo(String value) {
            addCriterion("IM_szPrimaryVendorID <>", value, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDGreaterThan(String value) {
            addCriterion("IM_szPrimaryVendorID >", value, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szPrimaryVendorID >=", value, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDLessThan(String value) {
            addCriterion("IM_szPrimaryVendorID <", value, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDLessThanOrEqualTo(String value) {
            addCriterion("IM_szPrimaryVendorID <=", value, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDLike(String value) {
            addCriterion("IM_szPrimaryVendorID like", value, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDNotLike(String value) {
            addCriterion("IM_szPrimaryVendorID not like", value, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDIn(List<String> values) {
            addCriterion("IM_szPrimaryVendorID in", values, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDNotIn(List<String> values) {
            addCriterion("IM_szPrimaryVendorID not in", values, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDBetween(String value1, String value2) {
            addCriterion("IM_szPrimaryVendorID between", value1, value2, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryVendorIDNotBetween(String value1, String value2) {
            addCriterion("IM_szPrimaryVendorID not between", value1, value2, "IM_szPrimaryVendorID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDIsNull() {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID is null");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDIsNotNull() {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDEqualTo(String value) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID =", value, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDNotEqualTo(String value) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID <>", value, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDGreaterThan(String value) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID >", value, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID >=", value, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDLessThan(String value) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID <", value, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDLessThanOrEqualTo(String value) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID <=", value, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDLike(String value) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID like", value, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDNotLike(String value) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID not like", value, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDIn(List<String> values) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID in", values, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDNotIn(List<String> values) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID not in", values, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDBetween(String value1, String value2) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID between", value1, value2, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_szPrimaryCDCRetailStoreExternalIDNotBetween(String value1, String value2) {
            addCriterion("IM_szPrimaryCDCRetailStoreExternalID not between", value1, value2, "IM_szPrimaryCDCRetailStoreExternalID");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponIsNull() {
            addCriterion("IM_bParkingCoupon is null");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponIsNotNull() {
            addCriterion("IM_bParkingCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponEqualTo(Integer value) {
            addCriterion("IM_bParkingCoupon =", value, "IM_bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponNotEqualTo(Integer value) {
            addCriterion("IM_bParkingCoupon <>", value, "IM_bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponGreaterThan(Integer value) {
            addCriterion("IM_bParkingCoupon >", value, "IM_bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bParkingCoupon >=", value, "IM_bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponLessThan(Integer value) {
            addCriterion("IM_bParkingCoupon <", value, "IM_bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponLessThanOrEqualTo(Integer value) {
            addCriterion("IM_bParkingCoupon <=", value, "IM_bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponIn(List<Integer> values) {
            addCriterion("IM_bParkingCoupon in", values, "IM_bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponNotIn(List<Integer> values) {
            addCriterion("IM_bParkingCoupon not in", values, "IM_bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponBetween(Integer value1, Integer value2) {
            addCriterion("IM_bParkingCoupon between", value1, value2, "IM_bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andIM_bParkingCouponNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bParkingCoupon not between", value1, value2, "IM_bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyIsNull() {
            addCriterion("IM_dMaxOrderQty is null");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyIsNotNull() {
            addCriterion("IM_dMaxOrderQty is not null");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyEqualTo(BigDecimal value) {
            addCriterion("IM_dMaxOrderQty =", value, "IM_dMaxOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyNotEqualTo(BigDecimal value) {
            addCriterion("IM_dMaxOrderQty <>", value, "IM_dMaxOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyGreaterThan(BigDecimal value) {
            addCriterion("IM_dMaxOrderQty >", value, "IM_dMaxOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IM_dMaxOrderQty >=", value, "IM_dMaxOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyLessThan(BigDecimal value) {
            addCriterion("IM_dMaxOrderQty <", value, "IM_dMaxOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IM_dMaxOrderQty <=", value, "IM_dMaxOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyIn(List<BigDecimal> values) {
            addCriterion("IM_dMaxOrderQty in", values, "IM_dMaxOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyNotIn(List<BigDecimal> values) {
            addCriterion("IM_dMaxOrderQty not in", values, "IM_dMaxOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IM_dMaxOrderQty between", value1, value2, "IM_dMaxOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_dMaxOrderQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IM_dMaxOrderQty not between", value1, value2, "IM_dMaxOrderQty");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemIsNull() {
            addCriterion("IM_bCoreItem is null");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemIsNotNull() {
            addCriterion("IM_bCoreItem is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemEqualTo(Integer value) {
            addCriterion("IM_bCoreItem =", value, "IM_bCoreItem");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemNotEqualTo(Integer value) {
            addCriterion("IM_bCoreItem <>", value, "IM_bCoreItem");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemGreaterThan(Integer value) {
            addCriterion("IM_bCoreItem >", value, "IM_bCoreItem");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bCoreItem >=", value, "IM_bCoreItem");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemLessThan(Integer value) {
            addCriterion("IM_bCoreItem <", value, "IM_bCoreItem");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemLessThanOrEqualTo(Integer value) {
            addCriterion("IM_bCoreItem <=", value, "IM_bCoreItem");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemIn(List<Integer> values) {
            addCriterion("IM_bCoreItem in", values, "IM_bCoreItem");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemNotIn(List<Integer> values) {
            addCriterion("IM_bCoreItem not in", values, "IM_bCoreItem");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemBetween(Integer value1, Integer value2) {
            addCriterion("IM_bCoreItem between", value1, value2, "IM_bCoreItem");
            return (Criteria) this;
        }

        public Criteria andIM_bCoreItemNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bCoreItem not between", value1, value2, "IM_bCoreItem");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlIsNull() {
            addCriterion("IM_bUnderCDUControl is null");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlIsNotNull() {
            addCriterion("IM_bUnderCDUControl is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlEqualTo(Integer value) {
            addCriterion("IM_bUnderCDUControl =", value, "IM_bUnderCDUControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlNotEqualTo(Integer value) {
            addCriterion("IM_bUnderCDUControl <>", value, "IM_bUnderCDUControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlGreaterThan(Integer value) {
            addCriterion("IM_bUnderCDUControl >", value, "IM_bUnderCDUControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bUnderCDUControl >=", value, "IM_bUnderCDUControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlLessThan(Integer value) {
            addCriterion("IM_bUnderCDUControl <", value, "IM_bUnderCDUControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlLessThanOrEqualTo(Integer value) {
            addCriterion("IM_bUnderCDUControl <=", value, "IM_bUnderCDUControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlIn(List<Integer> values) {
            addCriterion("IM_bUnderCDUControl in", values, "IM_bUnderCDUControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlNotIn(List<Integer> values) {
            addCriterion("IM_bUnderCDUControl not in", values, "IM_bUnderCDUControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlBetween(Integer value1, Integer value2) {
            addCriterion("IM_bUnderCDUControl between", value1, value2, "IM_bUnderCDUControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderCDUControlNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bUnderCDUControl not between", value1, value2, "IM_bUnderCDUControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlIsNull() {
            addCriterion("IM_bUnderStockControl is null");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlIsNotNull() {
            addCriterion("IM_bUnderStockControl is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlEqualTo(Integer value) {
            addCriterion("IM_bUnderStockControl =", value, "IM_bUnderStockControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlNotEqualTo(Integer value) {
            addCriterion("IM_bUnderStockControl <>", value, "IM_bUnderStockControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlGreaterThan(Integer value) {
            addCriterion("IM_bUnderStockControl >", value, "IM_bUnderStockControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bUnderStockControl >=", value, "IM_bUnderStockControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlLessThan(Integer value) {
            addCriterion("IM_bUnderStockControl <", value, "IM_bUnderStockControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlLessThanOrEqualTo(Integer value) {
            addCriterion("IM_bUnderStockControl <=", value, "IM_bUnderStockControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlIn(List<Integer> values) {
            addCriterion("IM_bUnderStockControl in", values, "IM_bUnderStockControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlNotIn(List<Integer> values) {
            addCriterion("IM_bUnderStockControl not in", values, "IM_bUnderStockControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlBetween(Integer value1, Integer value2) {
            addCriterion("IM_bUnderStockControl between", value1, value2, "IM_bUnderStockControl");
            return (Criteria) this;
        }

        public Criteria andIM_bUnderStockControlNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bUnderStockControl not between", value1, value2, "IM_bUnderStockControl");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceIsNull() {
            addCriterion("IM_lSupplySource is null");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceIsNotNull() {
            addCriterion("IM_lSupplySource is not null");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceEqualTo(Integer value) {
            addCriterion("IM_lSupplySource =", value, "IM_lSupplySource");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceNotEqualTo(Integer value) {
            addCriterion("IM_lSupplySource <>", value, "IM_lSupplySource");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceGreaterThan(Integer value) {
            addCriterion("IM_lSupplySource >", value, "IM_lSupplySource");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_lSupplySource >=", value, "IM_lSupplySource");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceLessThan(Integer value) {
            addCriterion("IM_lSupplySource <", value, "IM_lSupplySource");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceLessThanOrEqualTo(Integer value) {
            addCriterion("IM_lSupplySource <=", value, "IM_lSupplySource");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceIn(List<Integer> values) {
            addCriterion("IM_lSupplySource in", values, "IM_lSupplySource");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceNotIn(List<Integer> values) {
            addCriterion("IM_lSupplySource not in", values, "IM_lSupplySource");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceBetween(Integer value1, Integer value2) {
            addCriterion("IM_lSupplySource between", value1, value2, "IM_lSupplySource");
            return (Criteria) this;
        }

        public Criteria andIM_lSupplySourceNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_lSupplySource not between", value1, value2, "IM_lSupplySource");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeIsNull() {
            addCriterion("IM_szArticleType is null");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeIsNotNull() {
            addCriterion("IM_szArticleType is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeEqualTo(String value) {
            addCriterion("IM_szArticleType =", value, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeNotEqualTo(String value) {
            addCriterion("IM_szArticleType <>", value, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeGreaterThan(String value) {
            addCriterion("IM_szArticleType >", value, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szArticleType >=", value, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeLessThan(String value) {
            addCriterion("IM_szArticleType <", value, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeLessThanOrEqualTo(String value) {
            addCriterion("IM_szArticleType <=", value, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeLike(String value) {
            addCriterion("IM_szArticleType like", value, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeNotLike(String value) {
            addCriterion("IM_szArticleType not like", value, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeIn(List<String> values) {
            addCriterion("IM_szArticleType in", values, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeNotIn(List<String> values) {
            addCriterion("IM_szArticleType not in", values, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeBetween(String value1, String value2) {
            addCriterion("IM_szArticleType between", value1, value2, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szArticleTypeNotBetween(String value1, String value2) {
            addCriterion("IM_szArticleType not between", value1, value2, "IM_szArticleType");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupIsNull() {
            addCriterion("IM_szPurchaseGroup is null");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupIsNotNull() {
            addCriterion("IM_szPurchaseGroup is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupEqualTo(String value) {
            addCriterion("IM_szPurchaseGroup =", value, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupNotEqualTo(String value) {
            addCriterion("IM_szPurchaseGroup <>", value, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupGreaterThan(String value) {
            addCriterion("IM_szPurchaseGroup >", value, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szPurchaseGroup >=", value, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupLessThan(String value) {
            addCriterion("IM_szPurchaseGroup <", value, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupLessThanOrEqualTo(String value) {
            addCriterion("IM_szPurchaseGroup <=", value, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupLike(String value) {
            addCriterion("IM_szPurchaseGroup like", value, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupNotLike(String value) {
            addCriterion("IM_szPurchaseGroup not like", value, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupIn(List<String> values) {
            addCriterion("IM_szPurchaseGroup in", values, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupNotIn(List<String> values) {
            addCriterion("IM_szPurchaseGroup not in", values, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupBetween(String value1, String value2) {
            addCriterion("IM_szPurchaseGroup between", value1, value2, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_szPurchaseGroupNotBetween(String value1, String value2) {
            addCriterion("IM_szPurchaseGroup not between", value1, value2, "IM_szPurchaseGroup");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedIsNull() {
            addCriterion("IM_bGRWithoutPOAllowed is null");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedIsNotNull() {
            addCriterion("IM_bGRWithoutPOAllowed is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedEqualTo(Integer value) {
            addCriterion("IM_bGRWithoutPOAllowed =", value, "IM_bGRWithoutPOAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedNotEqualTo(Integer value) {
            addCriterion("IM_bGRWithoutPOAllowed <>", value, "IM_bGRWithoutPOAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedGreaterThan(Integer value) {
            addCriterion("IM_bGRWithoutPOAllowed >", value, "IM_bGRWithoutPOAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bGRWithoutPOAllowed >=", value, "IM_bGRWithoutPOAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedLessThan(Integer value) {
            addCriterion("IM_bGRWithoutPOAllowed <", value, "IM_bGRWithoutPOAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedLessThanOrEqualTo(Integer value) {
            addCriterion("IM_bGRWithoutPOAllowed <=", value, "IM_bGRWithoutPOAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedIn(List<Integer> values) {
            addCriterion("IM_bGRWithoutPOAllowed in", values, "IM_bGRWithoutPOAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedNotIn(List<Integer> values) {
            addCriterion("IM_bGRWithoutPOAllowed not in", values, "IM_bGRWithoutPOAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedBetween(Integer value1, Integer value2) {
            addCriterion("IM_bGRWithoutPOAllowed between", value1, value2, "IM_bGRWithoutPOAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bGRWithoutPOAllowedNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bGRWithoutPOAllowed not between", value1, value2, "IM_bGRWithoutPOAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentIsNull() {
            addCriterion("IM_bConsignment is null");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentIsNotNull() {
            addCriterion("IM_bConsignment is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentEqualTo(Integer value) {
            addCriterion("IM_bConsignment =", value, "IM_bConsignment");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentNotEqualTo(Integer value) {
            addCriterion("IM_bConsignment <>", value, "IM_bConsignment");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentGreaterThan(Integer value) {
            addCriterion("IM_bConsignment >", value, "IM_bConsignment");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bConsignment >=", value, "IM_bConsignment");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentLessThan(Integer value) {
            addCriterion("IM_bConsignment <", value, "IM_bConsignment");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentLessThanOrEqualTo(Integer value) {
            addCriterion("IM_bConsignment <=", value, "IM_bConsignment");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentIn(List<Integer> values) {
            addCriterion("IM_bConsignment in", values, "IM_bConsignment");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentNotIn(List<Integer> values) {
            addCriterion("IM_bConsignment not in", values, "IM_bConsignment");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentBetween(Integer value1, Integer value2) {
            addCriterion("IM_bConsignment between", value1, value2, "IM_bConsignment");
            return (Criteria) this;
        }

        public Criteria andIM_bConsignmentNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bConsignment not between", value1, value2, "IM_bConsignment");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedIsNull() {
            addCriterion("IM_bWriteOffAllowed is null");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedIsNotNull() {
            addCriterion("IM_bWriteOffAllowed is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedEqualTo(Integer value) {
            addCriterion("IM_bWriteOffAllowed =", value, "IM_bWriteOffAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedNotEqualTo(Integer value) {
            addCriterion("IM_bWriteOffAllowed <>", value, "IM_bWriteOffAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedGreaterThan(Integer value) {
            addCriterion("IM_bWriteOffAllowed >", value, "IM_bWriteOffAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bWriteOffAllowed >=", value, "IM_bWriteOffAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedLessThan(Integer value) {
            addCriterion("IM_bWriteOffAllowed <", value, "IM_bWriteOffAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedLessThanOrEqualTo(Integer value) {
            addCriterion("IM_bWriteOffAllowed <=", value, "IM_bWriteOffAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedIn(List<Integer> values) {
            addCriterion("IM_bWriteOffAllowed in", values, "IM_bWriteOffAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedNotIn(List<Integer> values) {
            addCriterion("IM_bWriteOffAllowed not in", values, "IM_bWriteOffAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedBetween(Integer value1, Integer value2) {
            addCriterion("IM_bWriteOffAllowed between", value1, value2, "IM_bWriteOffAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_bWriteOffAllowedNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bWriteOffAllowed not between", value1, value2, "IM_bWriteOffAllowed");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeIsNull() {
            addCriterion("IM_szOrderCycleCode is null");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeIsNotNull() {
            addCriterion("IM_szOrderCycleCode is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeEqualTo(String value) {
            addCriterion("IM_szOrderCycleCode =", value, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeNotEqualTo(String value) {
            addCriterion("IM_szOrderCycleCode <>", value, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeGreaterThan(String value) {
            addCriterion("IM_szOrderCycleCode >", value, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szOrderCycleCode >=", value, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeLessThan(String value) {
            addCriterion("IM_szOrderCycleCode <", value, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeLessThanOrEqualTo(String value) {
            addCriterion("IM_szOrderCycleCode <=", value, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeLike(String value) {
            addCriterion("IM_szOrderCycleCode like", value, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeNotLike(String value) {
            addCriterion("IM_szOrderCycleCode not like", value, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeIn(List<String> values) {
            addCriterion("IM_szOrderCycleCode in", values, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeNotIn(List<String> values) {
            addCriterion("IM_szOrderCycleCode not in", values, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeBetween(String value1, String value2) {
            addCriterion("IM_szOrderCycleCode between", value1, value2, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szOrderCycleCodeNotBetween(String value1, String value2) {
            addCriterion("IM_szOrderCycleCode not between", value1, value2, "IM_szOrderCycleCode");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSAIsNull() {
            addCriterion("IM_szIMPSA is null");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSAIsNotNull() {
            addCriterion("IM_szIMPSA is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSAEqualTo(String value) {
            addCriterion("IM_szIMPSA =", value, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSANotEqualTo(String value) {
            addCriterion("IM_szIMPSA <>", value, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSAGreaterThan(String value) {
            addCriterion("IM_szIMPSA >", value, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSAGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szIMPSA >=", value, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSALessThan(String value) {
            addCriterion("IM_szIMPSA <", value, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSALessThanOrEqualTo(String value) {
            addCriterion("IM_szIMPSA <=", value, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSALike(String value) {
            addCriterion("IM_szIMPSA like", value, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSANotLike(String value) {
            addCriterion("IM_szIMPSA not like", value, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSAIn(List<String> values) {
            addCriterion("IM_szIMPSA in", values, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSANotIn(List<String> values) {
            addCriterion("IM_szIMPSA not in", values, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSABetween(String value1, String value2) {
            addCriterion("IM_szIMPSA between", value1, value2, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szIMPSANotBetween(String value1, String value2) {
            addCriterion("IM_szIMPSA not between", value1, value2, "IM_szIMPSA");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorIsNull() {
            addCriterion("IM_szABCIndicator is null");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorIsNotNull() {
            addCriterion("IM_szABCIndicator is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorEqualTo(String value) {
            addCriterion("IM_szABCIndicator =", value, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorNotEqualTo(String value) {
            addCriterion("IM_szABCIndicator <>", value, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorGreaterThan(String value) {
            addCriterion("IM_szABCIndicator >", value, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szABCIndicator >=", value, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorLessThan(String value) {
            addCriterion("IM_szABCIndicator <", value, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorLessThanOrEqualTo(String value) {
            addCriterion("IM_szABCIndicator <=", value, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorLike(String value) {
            addCriterion("IM_szABCIndicator like", value, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorNotLike(String value) {
            addCriterion("IM_szABCIndicator not like", value, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorIn(List<String> values) {
            addCriterion("IM_szABCIndicator in", values, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorNotIn(List<String> values) {
            addCriterion("IM_szABCIndicator not in", values, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorBetween(String value1, String value2) {
            addCriterion("IM_szABCIndicator between", value1, value2, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_szABCIndicatorNotBetween(String value1, String value2) {
            addCriterion("IM_szABCIndicator not between", value1, value2, "IM_szABCIndicator");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeIsNull() {
            addCriterion("IM_lDeliveryLeadTime is null");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeIsNotNull() {
            addCriterion("IM_lDeliveryLeadTime is not null");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeEqualTo(Integer value) {
            addCriterion("IM_lDeliveryLeadTime =", value, "IM_lDeliveryLeadTime");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeNotEqualTo(Integer value) {
            addCriterion("IM_lDeliveryLeadTime <>", value, "IM_lDeliveryLeadTime");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeGreaterThan(Integer value) {
            addCriterion("IM_lDeliveryLeadTime >", value, "IM_lDeliveryLeadTime");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_lDeliveryLeadTime >=", value, "IM_lDeliveryLeadTime");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeLessThan(Integer value) {
            addCriterion("IM_lDeliveryLeadTime <", value, "IM_lDeliveryLeadTime");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeLessThanOrEqualTo(Integer value) {
            addCriterion("IM_lDeliveryLeadTime <=", value, "IM_lDeliveryLeadTime");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeIn(List<Integer> values) {
            addCriterion("IM_lDeliveryLeadTime in", values, "IM_lDeliveryLeadTime");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeNotIn(List<Integer> values) {
            addCriterion("IM_lDeliveryLeadTime not in", values, "IM_lDeliveryLeadTime");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeBetween(Integer value1, Integer value2) {
            addCriterion("IM_lDeliveryLeadTime between", value1, value2, "IM_lDeliveryLeadTime");
            return (Criteria) this;
        }

        public Criteria andIM_lDeliveryLeadTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_lDeliveryLeadTime not between", value1, value2, "IM_lDeliveryLeadTime");
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