package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IMStockTakeDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IMStockTakeDetailExample() {
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

        public Criteria andSzGondolaNmbrIsNull() {
            addCriterion("szGondolaNmbr is null");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrIsNotNull() {
            addCriterion("szGondolaNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrEqualTo(String value) {
            addCriterion("szGondolaNmbr =", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrNotEqualTo(String value) {
            addCriterion("szGondolaNmbr <>", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrGreaterThan(String value) {
            addCriterion("szGondolaNmbr >", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrGreaterThanOrEqualTo(String value) {
            addCriterion("szGondolaNmbr >=", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrLessThan(String value) {
            addCriterion("szGondolaNmbr <", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrLessThanOrEqualTo(String value) {
            addCriterion("szGondolaNmbr <=", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrLike(String value) {
            addCriterion("szGondolaNmbr like", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrNotLike(String value) {
            addCriterion("szGondolaNmbr not like", value, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrIn(List<String> values) {
            addCriterion("szGondolaNmbr in", values, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrNotIn(List<String> values) {
            addCriterion("szGondolaNmbr not in", values, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrBetween(String value1, String value2) {
            addCriterion("szGondolaNmbr between", value1, value2, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzGondolaNmbrNotBetween(String value1, String value2) {
            addCriterion("szGondolaNmbr not between", value1, value2, "szGondolaNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateIsNull() {
            addCriterion("szCountedDate is null");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateIsNotNull() {
            addCriterion("szCountedDate is not null");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateEqualTo(String value) {
            addCriterion("szCountedDate =", value, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateNotEqualTo(String value) {
            addCriterion("szCountedDate <>", value, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateGreaterThan(String value) {
            addCriterion("szCountedDate >", value, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateGreaterThanOrEqualTo(String value) {
            addCriterion("szCountedDate >=", value, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateLessThan(String value) {
            addCriterion("szCountedDate <", value, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateLessThanOrEqualTo(String value) {
            addCriterion("szCountedDate <=", value, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateLike(String value) {
            addCriterion("szCountedDate like", value, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateNotLike(String value) {
            addCriterion("szCountedDate not like", value, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateIn(List<String> values) {
            addCriterion("szCountedDate in", values, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateNotIn(List<String> values) {
            addCriterion("szCountedDate not in", values, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateBetween(String value1, String value2) {
            addCriterion("szCountedDate between", value1, value2, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedDateNotBetween(String value1, String value2) {
            addCriterion("szCountedDate not between", value1, value2, "szCountedDate");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeIsNull() {
            addCriterion("szCountedTime is null");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeIsNotNull() {
            addCriterion("szCountedTime is not null");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeEqualTo(String value) {
            addCriterion("szCountedTime =", value, "szCountedTime");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeNotEqualTo(String value) {
            addCriterion("szCountedTime <>", value, "szCountedTime");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeGreaterThan(String value) {
            addCriterion("szCountedTime >", value, "szCountedTime");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("szCountedTime >=", value, "szCountedTime");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeLessThan(String value) {
            addCriterion("szCountedTime <", value, "szCountedTime");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeLessThanOrEqualTo(String value) {
            addCriterion("szCountedTime <=", value, "szCountedTime");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeLike(String value) {
            addCriterion("szCountedTime like", value, "szCountedTime");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeNotLike(String value) {
            addCriterion("szCountedTime not like", value, "szCountedTime");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeIn(List<String> values) {
            addCriterion("szCountedTime in", values, "szCountedTime");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeNotIn(List<String> values) {
            addCriterion("szCountedTime not in", values, "szCountedTime");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeBetween(String value1, String value2) {
            addCriterion("szCountedTime between", value1, value2, "szCountedTime");
            return (Criteria) this;
        }

        public Criteria andSzCountedTimeNotBetween(String value1, String value2) {
            addCriterion("szCountedTime not between", value1, value2, "szCountedTime");
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

        public Criteria andSzGondolaDescIsNull() {
            addCriterion("szGondolaDesc is null");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescIsNotNull() {
            addCriterion("szGondolaDesc is not null");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescEqualTo(String value) {
            addCriterion("szGondolaDesc =", value, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescNotEqualTo(String value) {
            addCriterion("szGondolaDesc <>", value, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescGreaterThan(String value) {
            addCriterion("szGondolaDesc >", value, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescGreaterThanOrEqualTo(String value) {
            addCriterion("szGondolaDesc >=", value, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescLessThan(String value) {
            addCriterion("szGondolaDesc <", value, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescLessThanOrEqualTo(String value) {
            addCriterion("szGondolaDesc <=", value, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescLike(String value) {
            addCriterion("szGondolaDesc like", value, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescNotLike(String value) {
            addCriterion("szGondolaDesc not like", value, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescIn(List<String> values) {
            addCriterion("szGondolaDesc in", values, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescNotIn(List<String> values) {
            addCriterion("szGondolaDesc not in", values, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescBetween(String value1, String value2) {
            addCriterion("szGondolaDesc between", value1, value2, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaDescNotBetween(String value1, String value2) {
            addCriterion("szGondolaDesc not between", value1, value2, "szGondolaDesc");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDIsNull() {
            addCriterion("szGondolaStorageLocationID is null");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDIsNotNull() {
            addCriterion("szGondolaStorageLocationID is not null");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDEqualTo(String value) {
            addCriterion("szGondolaStorageLocationID =", value, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDNotEqualTo(String value) {
            addCriterion("szGondolaStorageLocationID <>", value, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDGreaterThan(String value) {
            addCriterion("szGondolaStorageLocationID >", value, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDGreaterThanOrEqualTo(String value) {
            addCriterion("szGondolaStorageLocationID >=", value, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDLessThan(String value) {
            addCriterion("szGondolaStorageLocationID <", value, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDLessThanOrEqualTo(String value) {
            addCriterion("szGondolaStorageLocationID <=", value, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDLike(String value) {
            addCriterion("szGondolaStorageLocationID like", value, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDNotLike(String value) {
            addCriterion("szGondolaStorageLocationID not like", value, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDIn(List<String> values) {
            addCriterion("szGondolaStorageLocationID in", values, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDNotIn(List<String> values) {
            addCriterion("szGondolaStorageLocationID not in", values, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDBetween(String value1, String value2) {
            addCriterion("szGondolaStorageLocationID between", value1, value2, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationIDNotBetween(String value1, String value2) {
            addCriterion("szGondolaStorageLocationID not between", value1, value2, "szGondolaStorageLocationID");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameIsNull() {
            addCriterion("szGondolaStorageLocationName is null");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameIsNotNull() {
            addCriterion("szGondolaStorageLocationName is not null");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameEqualTo(String value) {
            addCriterion("szGondolaStorageLocationName =", value, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameNotEqualTo(String value) {
            addCriterion("szGondolaStorageLocationName <>", value, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameGreaterThan(String value) {
            addCriterion("szGondolaStorageLocationName >", value, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("szGondolaStorageLocationName >=", value, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameLessThan(String value) {
            addCriterion("szGondolaStorageLocationName <", value, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameLessThanOrEqualTo(String value) {
            addCriterion("szGondolaStorageLocationName <=", value, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameLike(String value) {
            addCriterion("szGondolaStorageLocationName like", value, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameNotLike(String value) {
            addCriterion("szGondolaStorageLocationName not like", value, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameIn(List<String> values) {
            addCriterion("szGondolaStorageLocationName in", values, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameNotIn(List<String> values) {
            addCriterion("szGondolaStorageLocationName not in", values, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameBetween(String value1, String value2) {
            addCriterion("szGondolaStorageLocationName between", value1, value2, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzGondolaStorageLocationNameNotBetween(String value1, String value2) {
            addCriterion("szGondolaStorageLocationName not between", value1, value2, "szGondolaStorageLocationName");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDIsNull() {
            addCriterion("szPSA_ID is null");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDIsNotNull() {
            addCriterion("szPSA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDEqualTo(String value) {
            addCriterion("szPSA_ID =", value, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDNotEqualTo(String value) {
            addCriterion("szPSA_ID <>", value, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDGreaterThan(String value) {
            addCriterion("szPSA_ID >", value, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDGreaterThanOrEqualTo(String value) {
            addCriterion("szPSA_ID >=", value, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDLessThan(String value) {
            addCriterion("szPSA_ID <", value, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDLessThanOrEqualTo(String value) {
            addCriterion("szPSA_ID <=", value, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDLike(String value) {
            addCriterion("szPSA_ID like", value, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDNotLike(String value) {
            addCriterion("szPSA_ID not like", value, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDIn(List<String> values) {
            addCriterion("szPSA_ID in", values, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDNotIn(List<String> values) {
            addCriterion("szPSA_ID not in", values, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDBetween(String value1, String value2) {
            addCriterion("szPSA_ID between", value1, value2, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSA_IDNotBetween(String value1, String value2) {
            addCriterion("szPSA_ID not between", value1, value2, "szPSA_ID");
            return (Criteria) this;
        }

        public Criteria andSzPSANameIsNull() {
            addCriterion("szPSAName is null");
            return (Criteria) this;
        }

        public Criteria andSzPSANameIsNotNull() {
            addCriterion("szPSAName is not null");
            return (Criteria) this;
        }

        public Criteria andSzPSANameEqualTo(String value) {
            addCriterion("szPSAName =", value, "szPSAName");
            return (Criteria) this;
        }

        public Criteria andSzPSANameNotEqualTo(String value) {
            addCriterion("szPSAName <>", value, "szPSAName");
            return (Criteria) this;
        }

        public Criteria andSzPSANameGreaterThan(String value) {
            addCriterion("szPSAName >", value, "szPSAName");
            return (Criteria) this;
        }

        public Criteria andSzPSANameGreaterThanOrEqualTo(String value) {
            addCriterion("szPSAName >=", value, "szPSAName");
            return (Criteria) this;
        }

        public Criteria andSzPSANameLessThan(String value) {
            addCriterion("szPSAName <", value, "szPSAName");
            return (Criteria) this;
        }

        public Criteria andSzPSANameLessThanOrEqualTo(String value) {
            addCriterion("szPSAName <=", value, "szPSAName");
            return (Criteria) this;
        }

        public Criteria andSzPSANameLike(String value) {
            addCriterion("szPSAName like", value, "szPSAName");
            return (Criteria) this;
        }

        public Criteria andSzPSANameNotLike(String value) {
            addCriterion("szPSAName not like", value, "szPSAName");
            return (Criteria) this;
        }

        public Criteria andSzPSANameIn(List<String> values) {
            addCriterion("szPSAName in", values, "szPSAName");
            return (Criteria) this;
        }

        public Criteria andSzPSANameNotIn(List<String> values) {
            addCriterion("szPSAName not in", values, "szPSAName");
            return (Criteria) this;
        }

        public Criteria andSzPSANameBetween(String value1, String value2) {
            addCriterion("szPSAName between", value1, value2, "szPSAName");
            return (Criteria) this;
        }

        public Criteria andSzPSANameNotBetween(String value1, String value2) {
            addCriterion("szPSAName not between", value1, value2, "szPSAName");
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

        public Criteria andDAdjQtyIsNull() {
            addCriterion("dAdjQty is null");
            return (Criteria) this;
        }

        public Criteria andDAdjQtyIsNotNull() {
            addCriterion("dAdjQty is not null");
            return (Criteria) this;
        }

        public Criteria andDAdjQtyEqualTo(BigDecimal value) {
            addCriterion("dAdjQty =", value, "dAdjQty");
            return (Criteria) this;
        }

        public Criteria andDAdjQtyNotEqualTo(BigDecimal value) {
            addCriterion("dAdjQty <>", value, "dAdjQty");
            return (Criteria) this;
        }

        public Criteria andDAdjQtyGreaterThan(BigDecimal value) {
            addCriterion("dAdjQty >", value, "dAdjQty");
            return (Criteria) this;
        }

        public Criteria andDAdjQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dAdjQty >=", value, "dAdjQty");
            return (Criteria) this;
        }

        public Criteria andDAdjQtyLessThan(BigDecimal value) {
            addCriterion("dAdjQty <", value, "dAdjQty");
            return (Criteria) this;
        }

        public Criteria andDAdjQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dAdjQty <=", value, "dAdjQty");
            return (Criteria) this;
        }

        public Criteria andDAdjQtyIn(List<BigDecimal> values) {
            addCriterion("dAdjQty in", values, "dAdjQty");
            return (Criteria) this;
        }

        public Criteria andDAdjQtyNotIn(List<BigDecimal> values) {
            addCriterion("dAdjQty not in", values, "dAdjQty");
            return (Criteria) this;
        }

        public Criteria andDAdjQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dAdjQty between", value1, value2, "dAdjQty");
            return (Criteria) this;
        }

        public Criteria andDAdjQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dAdjQty not between", value1, value2, "dAdjQty");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyIsNull() {
            addCriterion("dFinalQty is null");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyIsNotNull() {
            addCriterion("dFinalQty is not null");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyEqualTo(BigDecimal value) {
            addCriterion("dFinalQty =", value, "dFinalQty");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyNotEqualTo(BigDecimal value) {
            addCriterion("dFinalQty <>", value, "dFinalQty");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyGreaterThan(BigDecimal value) {
            addCriterion("dFinalQty >", value, "dFinalQty");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dFinalQty >=", value, "dFinalQty");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyLessThan(BigDecimal value) {
            addCriterion("dFinalQty <", value, "dFinalQty");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dFinalQty <=", value, "dFinalQty");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyIn(List<BigDecimal> values) {
            addCriterion("dFinalQty in", values, "dFinalQty");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyNotIn(List<BigDecimal> values) {
            addCriterion("dFinalQty not in", values, "dFinalQty");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dFinalQty between", value1, value2, "dFinalQty");
            return (Criteria) this;
        }

        public Criteria andDFinalQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dFinalQty not between", value1, value2, "dFinalQty");
            return (Criteria) this;
        }

        public Criteria andDBookQtyIsNull() {
            addCriterion("dBookQty is null");
            return (Criteria) this;
        }

        public Criteria andDBookQtyIsNotNull() {
            addCriterion("dBookQty is not null");
            return (Criteria) this;
        }

        public Criteria andDBookQtyEqualTo(BigDecimal value) {
            addCriterion("dBookQty =", value, "dBookQty");
            return (Criteria) this;
        }

        public Criteria andDBookQtyNotEqualTo(BigDecimal value) {
            addCriterion("dBookQty <>", value, "dBookQty");
            return (Criteria) this;
        }

        public Criteria andDBookQtyGreaterThan(BigDecimal value) {
            addCriterion("dBookQty >", value, "dBookQty");
            return (Criteria) this;
        }

        public Criteria andDBookQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dBookQty >=", value, "dBookQty");
            return (Criteria) this;
        }

        public Criteria andDBookQtyLessThan(BigDecimal value) {
            addCriterion("dBookQty <", value, "dBookQty");
            return (Criteria) this;
        }

        public Criteria andDBookQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dBookQty <=", value, "dBookQty");
            return (Criteria) this;
        }

        public Criteria andDBookQtyIn(List<BigDecimal> values) {
            addCriterion("dBookQty in", values, "dBookQty");
            return (Criteria) this;
        }

        public Criteria andDBookQtyNotIn(List<BigDecimal> values) {
            addCriterion("dBookQty not in", values, "dBookQty");
            return (Criteria) this;
        }

        public Criteria andDBookQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dBookQty between", value1, value2, "dBookQty");
            return (Criteria) this;
        }

        public Criteria andDBookQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dBookQty not between", value1, value2, "dBookQty");
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

        public Criteria andDMapIsNull() {
            addCriterion("dMap is null");
            return (Criteria) this;
        }

        public Criteria andDMapIsNotNull() {
            addCriterion("dMap is not null");
            return (Criteria) this;
        }

        public Criteria andDMapEqualTo(BigDecimal value) {
            addCriterion("dMap =", value, "dMap");
            return (Criteria) this;
        }

        public Criteria andDMapNotEqualTo(BigDecimal value) {
            addCriterion("dMap <>", value, "dMap");
            return (Criteria) this;
        }

        public Criteria andDMapGreaterThan(BigDecimal value) {
            addCriterion("dMap >", value, "dMap");
            return (Criteria) this;
        }

        public Criteria andDMapGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dMap >=", value, "dMap");
            return (Criteria) this;
        }

        public Criteria andDMapLessThan(BigDecimal value) {
            addCriterion("dMap <", value, "dMap");
            return (Criteria) this;
        }

        public Criteria andDMapLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dMap <=", value, "dMap");
            return (Criteria) this;
        }

        public Criteria andDMapIn(List<BigDecimal> values) {
            addCriterion("dMap in", values, "dMap");
            return (Criteria) this;
        }

        public Criteria andDMapNotIn(List<BigDecimal> values) {
            addCriterion("dMap not in", values, "dMap");
            return (Criteria) this;
        }

        public Criteria andDMapBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMap between", value1, value2, "dMap");
            return (Criteria) this;
        }

        public Criteria andDMapNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMap not between", value1, value2, "dMap");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeIsNull() {
            addCriterion("szInputType is null");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeIsNotNull() {
            addCriterion("szInputType is not null");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeEqualTo(String value) {
            addCriterion("szInputType =", value, "szInputType");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeNotEqualTo(String value) {
            addCriterion("szInputType <>", value, "szInputType");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeGreaterThan(String value) {
            addCriterion("szInputType >", value, "szInputType");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeGreaterThanOrEqualTo(String value) {
            addCriterion("szInputType >=", value, "szInputType");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeLessThan(String value) {
            addCriterion("szInputType <", value, "szInputType");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeLessThanOrEqualTo(String value) {
            addCriterion("szInputType <=", value, "szInputType");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeLike(String value) {
            addCriterion("szInputType like", value, "szInputType");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeNotLike(String value) {
            addCriterion("szInputType not like", value, "szInputType");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeIn(List<String> values) {
            addCriterion("szInputType in", values, "szInputType");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeNotIn(List<String> values) {
            addCriterion("szInputType not in", values, "szInputType");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeBetween(String value1, String value2) {
            addCriterion("szInputType between", value1, value2, "szInputType");
            return (Criteria) this;
        }

        public Criteria andSzInputTypeNotBetween(String value1, String value2) {
            addCriterion("szInputType not between", value1, value2, "szInputType");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyIsNull() {
            addCriterion("dDiffQty is null");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyIsNotNull() {
            addCriterion("dDiffQty is not null");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyEqualTo(BigDecimal value) {
            addCriterion("dDiffQty =", value, "dDiffQty");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyNotEqualTo(BigDecimal value) {
            addCriterion("dDiffQty <>", value, "dDiffQty");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyGreaterThan(BigDecimal value) {
            addCriterion("dDiffQty >", value, "dDiffQty");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dDiffQty >=", value, "dDiffQty");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyLessThan(BigDecimal value) {
            addCriterion("dDiffQty <", value, "dDiffQty");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dDiffQty <=", value, "dDiffQty");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyIn(List<BigDecimal> values) {
            addCriterion("dDiffQty in", values, "dDiffQty");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyNotIn(List<BigDecimal> values) {
            addCriterion("dDiffQty not in", values, "dDiffQty");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dDiffQty between", value1, value2, "dDiffQty");
            return (Criteria) this;
        }

        public Criteria andDDiffQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dDiffQty not between", value1, value2, "dDiffQty");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountIsNull() {
            addCriterion("dDiffAmount is null");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountIsNotNull() {
            addCriterion("dDiffAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountEqualTo(BigDecimal value) {
            addCriterion("dDiffAmount =", value, "dDiffAmount");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountNotEqualTo(BigDecimal value) {
            addCriterion("dDiffAmount <>", value, "dDiffAmount");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountGreaterThan(BigDecimal value) {
            addCriterion("dDiffAmount >", value, "dDiffAmount");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dDiffAmount >=", value, "dDiffAmount");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountLessThan(BigDecimal value) {
            addCriterion("dDiffAmount <", value, "dDiffAmount");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dDiffAmount <=", value, "dDiffAmount");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountIn(List<BigDecimal> values) {
            addCriterion("dDiffAmount in", values, "dDiffAmount");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountNotIn(List<BigDecimal> values) {
            addCriterion("dDiffAmount not in", values, "dDiffAmount");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dDiffAmount between", value1, value2, "dDiffAmount");
            return (Criteria) this;
        }

        public Criteria andDDiffAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dDiffAmount not between", value1, value2, "dDiffAmount");
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

        public Criteria andSzIMPSAIsNull() {
            addCriterion("szIMPSA is null");
            return (Criteria) this;
        }

        public Criteria andSzIMPSAIsNotNull() {
            addCriterion("szIMPSA is not null");
            return (Criteria) this;
        }

        public Criteria andSzIMPSAEqualTo(String value) {
            addCriterion("szIMPSA =", value, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andSzIMPSANotEqualTo(String value) {
            addCriterion("szIMPSA <>", value, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andSzIMPSAGreaterThan(String value) {
            addCriterion("szIMPSA >", value, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andSzIMPSAGreaterThanOrEqualTo(String value) {
            addCriterion("szIMPSA >=", value, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andSzIMPSALessThan(String value) {
            addCriterion("szIMPSA <", value, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andSzIMPSALessThanOrEqualTo(String value) {
            addCriterion("szIMPSA <=", value, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andSzIMPSALike(String value) {
            addCriterion("szIMPSA like", value, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andSzIMPSANotLike(String value) {
            addCriterion("szIMPSA not like", value, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andSzIMPSAIn(List<String> values) {
            addCriterion("szIMPSA in", values, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andSzIMPSANotIn(List<String> values) {
            addCriterion("szIMPSA not in", values, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andSzIMPSABetween(String value1, String value2) {
            addCriterion("szIMPSA between", value1, value2, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andSzIMPSANotBetween(String value1, String value2) {
            addCriterion("szIMPSA not between", value1, value2, "szIMPSA");
            return (Criteria) this;
        }

        public Criteria andDQty2IsNull() {
            addCriterion("dQty2 is null");
            return (Criteria) this;
        }

        public Criteria andDQty2IsNotNull() {
            addCriterion("dQty2 is not null");
            return (Criteria) this;
        }

        public Criteria andDQty2EqualTo(BigDecimal value) {
            addCriterion("dQty2 =", value, "dQty2");
            return (Criteria) this;
        }

        public Criteria andDQty2NotEqualTo(BigDecimal value) {
            addCriterion("dQty2 <>", value, "dQty2");
            return (Criteria) this;
        }

        public Criteria andDQty2GreaterThan(BigDecimal value) {
            addCriterion("dQty2 >", value, "dQty2");
            return (Criteria) this;
        }

        public Criteria andDQty2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dQty2 >=", value, "dQty2");
            return (Criteria) this;
        }

        public Criteria andDQty2LessThan(BigDecimal value) {
            addCriterion("dQty2 <", value, "dQty2");
            return (Criteria) this;
        }

        public Criteria andDQty2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("dQty2 <=", value, "dQty2");
            return (Criteria) this;
        }

        public Criteria andDQty2In(List<BigDecimal> values) {
            addCriterion("dQty2 in", values, "dQty2");
            return (Criteria) this;
        }

        public Criteria andDQty2NotIn(List<BigDecimal> values) {
            addCriterion("dQty2 not in", values, "dQty2");
            return (Criteria) this;
        }

        public Criteria andDQty2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("dQty2 between", value1, value2, "dQty2");
            return (Criteria) this;
        }

        public Criteria andDQty2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dQty2 not between", value1, value2, "dQty2");
            return (Criteria) this;
        }

        public Criteria andDQty3IsNull() {
            addCriterion("dQty3 is null");
            return (Criteria) this;
        }

        public Criteria andDQty3IsNotNull() {
            addCriterion("dQty3 is not null");
            return (Criteria) this;
        }

        public Criteria andDQty3EqualTo(BigDecimal value) {
            addCriterion("dQty3 =", value, "dQty3");
            return (Criteria) this;
        }

        public Criteria andDQty3NotEqualTo(BigDecimal value) {
            addCriterion("dQty3 <>", value, "dQty3");
            return (Criteria) this;
        }

        public Criteria andDQty3GreaterThan(BigDecimal value) {
            addCriterion("dQty3 >", value, "dQty3");
            return (Criteria) this;
        }

        public Criteria andDQty3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dQty3 >=", value, "dQty3");
            return (Criteria) this;
        }

        public Criteria andDQty3LessThan(BigDecimal value) {
            addCriterion("dQty3 <", value, "dQty3");
            return (Criteria) this;
        }

        public Criteria andDQty3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("dQty3 <=", value, "dQty3");
            return (Criteria) this;
        }

        public Criteria andDQty3In(List<BigDecimal> values) {
            addCriterion("dQty3 in", values, "dQty3");
            return (Criteria) this;
        }

        public Criteria andDQty3NotIn(List<BigDecimal> values) {
            addCriterion("dQty3 not in", values, "dQty3");
            return (Criteria) this;
        }

        public Criteria andDQty3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("dQty3 between", value1, value2, "dQty3");
            return (Criteria) this;
        }

        public Criteria andDQty3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dQty3 not between", value1, value2, "dQty3");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2IsNull() {
            addCriterion("bScanduringCount2 is null");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2IsNotNull() {
            addCriterion("bScanduringCount2 is not null");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2EqualTo(Integer value) {
            addCriterion("bScanduringCount2 =", value, "bScanduringCount2");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2NotEqualTo(Integer value) {
            addCriterion("bScanduringCount2 <>", value, "bScanduringCount2");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2GreaterThan(Integer value) {
            addCriterion("bScanduringCount2 >", value, "bScanduringCount2");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2GreaterThanOrEqualTo(Integer value) {
            addCriterion("bScanduringCount2 >=", value, "bScanduringCount2");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2LessThan(Integer value) {
            addCriterion("bScanduringCount2 <", value, "bScanduringCount2");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2LessThanOrEqualTo(Integer value) {
            addCriterion("bScanduringCount2 <=", value, "bScanduringCount2");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2In(List<Integer> values) {
            addCriterion("bScanduringCount2 in", values, "bScanduringCount2");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2NotIn(List<Integer> values) {
            addCriterion("bScanduringCount2 not in", values, "bScanduringCount2");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2Between(Integer value1, Integer value2) {
            addCriterion("bScanduringCount2 between", value1, value2, "bScanduringCount2");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount2NotBetween(Integer value1, Integer value2) {
            addCriterion("bScanduringCount2 not between", value1, value2, "bScanduringCount2");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3IsNull() {
            addCriterion("bScanduringCount3 is null");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3IsNotNull() {
            addCriterion("bScanduringCount3 is not null");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3EqualTo(Integer value) {
            addCriterion("bScanduringCount3 =", value, "bScanduringCount3");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3NotEqualTo(Integer value) {
            addCriterion("bScanduringCount3 <>", value, "bScanduringCount3");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3GreaterThan(Integer value) {
            addCriterion("bScanduringCount3 >", value, "bScanduringCount3");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3GreaterThanOrEqualTo(Integer value) {
            addCriterion("bScanduringCount3 >=", value, "bScanduringCount3");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3LessThan(Integer value) {
            addCriterion("bScanduringCount3 <", value, "bScanduringCount3");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3LessThanOrEqualTo(Integer value) {
            addCriterion("bScanduringCount3 <=", value, "bScanduringCount3");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3In(List<Integer> values) {
            addCriterion("bScanduringCount3 in", values, "bScanduringCount3");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3NotIn(List<Integer> values) {
            addCriterion("bScanduringCount3 not in", values, "bScanduringCount3");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3Between(Integer value1, Integer value2) {
            addCriterion("bScanduringCount3 between", value1, value2, "bScanduringCount3");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount3NotBetween(Integer value1, Integer value2) {
            addCriterion("bScanduringCount3 not between", value1, value2, "bScanduringCount3");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyIsNull() {
            addCriterion("dLastestQty is null");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyIsNotNull() {
            addCriterion("dLastestQty is not null");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyEqualTo(BigDecimal value) {
            addCriterion("dLastestQty =", value, "dLastestQty");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyNotEqualTo(BigDecimal value) {
            addCriterion("dLastestQty <>", value, "dLastestQty");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyGreaterThan(BigDecimal value) {
            addCriterion("dLastestQty >", value, "dLastestQty");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dLastestQty >=", value, "dLastestQty");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyLessThan(BigDecimal value) {
            addCriterion("dLastestQty <", value, "dLastestQty");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dLastestQty <=", value, "dLastestQty");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyIn(List<BigDecimal> values) {
            addCriterion("dLastestQty in", values, "dLastestQty");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyNotIn(List<BigDecimal> values) {
            addCriterion("dLastestQty not in", values, "dLastestQty");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dLastestQty between", value1, value2, "dLastestQty");
            return (Criteria) this;
        }

        public Criteria andDLastestQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dLastestQty not between", value1, value2, "dLastestQty");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSAIsNull() {
            addCriterion("dBookQtyPSA is null");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSAIsNotNull() {
            addCriterion("dBookQtyPSA is not null");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSAEqualTo(BigDecimal value) {
            addCriterion("dBookQtyPSA =", value, "dBookQtyPSA");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSANotEqualTo(BigDecimal value) {
            addCriterion("dBookQtyPSA <>", value, "dBookQtyPSA");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSAGreaterThan(BigDecimal value) {
            addCriterion("dBookQtyPSA >", value, "dBookQtyPSA");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dBookQtyPSA >=", value, "dBookQtyPSA");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSALessThan(BigDecimal value) {
            addCriterion("dBookQtyPSA <", value, "dBookQtyPSA");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSALessThanOrEqualTo(BigDecimal value) {
            addCriterion("dBookQtyPSA <=", value, "dBookQtyPSA");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSAIn(List<BigDecimal> values) {
            addCriterion("dBookQtyPSA in", values, "dBookQtyPSA");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSANotIn(List<BigDecimal> values) {
            addCriterion("dBookQtyPSA not in", values, "dBookQtyPSA");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dBookQtyPSA between", value1, value2, "dBookQtyPSA");
            return (Criteria) this;
        }

        public Criteria andDBookQtyPSANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dBookQtyPSA not between", value1, value2, "dBookQtyPSA");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaIsNull() {
            addCriterion("bMasterGondola is null");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaIsNotNull() {
            addCriterion("bMasterGondola is not null");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaEqualTo(Integer value) {
            addCriterion("bMasterGondola =", value, "bMasterGondola");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaNotEqualTo(Integer value) {
            addCriterion("bMasterGondola <>", value, "bMasterGondola");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaGreaterThan(Integer value) {
            addCriterion("bMasterGondola >", value, "bMasterGondola");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaGreaterThanOrEqualTo(Integer value) {
            addCriterion("bMasterGondola >=", value, "bMasterGondola");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaLessThan(Integer value) {
            addCriterion("bMasterGondola <", value, "bMasterGondola");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaLessThanOrEqualTo(Integer value) {
            addCriterion("bMasterGondola <=", value, "bMasterGondola");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaIn(List<Integer> values) {
            addCriterion("bMasterGondola in", values, "bMasterGondola");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaNotIn(List<Integer> values) {
            addCriterion("bMasterGondola not in", values, "bMasterGondola");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaBetween(Integer value1, Integer value2) {
            addCriterion("bMasterGondola between", value1, value2, "bMasterGondola");
            return (Criteria) this;
        }

        public Criteria andBMasterGondolaNotBetween(Integer value1, Integer value2) {
            addCriterion("bMasterGondola not between", value1, value2, "bMasterGondola");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1IsNull() {
            addCriterion("bScanduringCount1 is null");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1IsNotNull() {
            addCriterion("bScanduringCount1 is not null");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1EqualTo(Integer value) {
            addCriterion("bScanduringCount1 =", value, "bScanduringCount1");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1NotEqualTo(Integer value) {
            addCriterion("bScanduringCount1 <>", value, "bScanduringCount1");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1GreaterThan(Integer value) {
            addCriterion("bScanduringCount1 >", value, "bScanduringCount1");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1GreaterThanOrEqualTo(Integer value) {
            addCriterion("bScanduringCount1 >=", value, "bScanduringCount1");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1LessThan(Integer value) {
            addCriterion("bScanduringCount1 <", value, "bScanduringCount1");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1LessThanOrEqualTo(Integer value) {
            addCriterion("bScanduringCount1 <=", value, "bScanduringCount1");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1In(List<Integer> values) {
            addCriterion("bScanduringCount1 in", values, "bScanduringCount1");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1NotIn(List<Integer> values) {
            addCriterion("bScanduringCount1 not in", values, "bScanduringCount1");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1Between(Integer value1, Integer value2) {
            addCriterion("bScanduringCount1 between", value1, value2, "bScanduringCount1");
            return (Criteria) this;
        }

        public Criteria andBScanduringCount1NotBetween(Integer value1, Integer value2) {
            addCriterion("bScanduringCount1 not between", value1, value2, "bScanduringCount1");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryIsNull() {
            addCriterion("dMovementInventory is null");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryIsNotNull() {
            addCriterion("dMovementInventory is not null");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryEqualTo(BigDecimal value) {
            addCriterion("dMovementInventory =", value, "dMovementInventory");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryNotEqualTo(BigDecimal value) {
            addCriterion("dMovementInventory <>", value, "dMovementInventory");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryGreaterThan(BigDecimal value) {
            addCriterion("dMovementInventory >", value, "dMovementInventory");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dMovementInventory >=", value, "dMovementInventory");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLessThan(BigDecimal value) {
            addCriterion("dMovementInventory <", value, "dMovementInventory");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dMovementInventory <=", value, "dMovementInventory");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryIn(List<BigDecimal> values) {
            addCriterion("dMovementInventory in", values, "dMovementInventory");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryNotIn(List<BigDecimal> values) {
            addCriterion("dMovementInventory not in", values, "dMovementInventory");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMovementInventory between", value1, value2, "dMovementInventory");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMovementInventory not between", value1, value2, "dMovementInventory");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationIsNull() {
            addCriterion("dMovementInventoryLocation is null");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationIsNotNull() {
            addCriterion("dMovementInventoryLocation is not null");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationEqualTo(BigDecimal value) {
            addCriterion("dMovementInventoryLocation =", value, "dMovementInventoryLocation");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationNotEqualTo(BigDecimal value) {
            addCriterion("dMovementInventoryLocation <>", value, "dMovementInventoryLocation");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationGreaterThan(BigDecimal value) {
            addCriterion("dMovementInventoryLocation >", value, "dMovementInventoryLocation");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dMovementInventoryLocation >=", value, "dMovementInventoryLocation");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationLessThan(BigDecimal value) {
            addCriterion("dMovementInventoryLocation <", value, "dMovementInventoryLocation");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dMovementInventoryLocation <=", value, "dMovementInventoryLocation");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationIn(List<BigDecimal> values) {
            addCriterion("dMovementInventoryLocation in", values, "dMovementInventoryLocation");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationNotIn(List<BigDecimal> values) {
            addCriterion("dMovementInventoryLocation not in", values, "dMovementInventoryLocation");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMovementInventoryLocation between", value1, value2, "dMovementInventoryLocation");
            return (Criteria) this;
        }

        public Criteria andDMovementInventoryLocationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMovementInventoryLocation not between", value1, value2, "dMovementInventoryLocation");
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