package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IMMovementDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IMMovementDetailExample() {
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

        public Criteria andLSequenceNumberIsNull() {
            addCriterion("lSequenceNumber is null");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberIsNotNull() {
            addCriterion("lSequenceNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberEqualTo(Integer value) {
            addCriterion("lSequenceNumber =", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberNotEqualTo(Integer value) {
            addCriterion("lSequenceNumber <>", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberGreaterThan(Integer value) {
            addCriterion("lSequenceNumber >", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("lSequenceNumber >=", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberLessThan(Integer value) {
            addCriterion("lSequenceNumber <", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberLessThanOrEqualTo(Integer value) {
            addCriterion("lSequenceNumber <=", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberIn(List<Integer> values) {
            addCriterion("lSequenceNumber in", values, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberNotIn(List<Integer> values) {
            addCriterion("lSequenceNumber not in", values, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberBetween(Integer value1, Integer value2) {
            addCriterion("lSequenceNumber between", value1, value2, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("lSequenceNumber not between", value1, value2, "lSequenceNumber");
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

        public Criteria andDOrderQtyIsNull() {
            addCriterion("dOrderQty is null");
            return (Criteria) this;
        }

        public Criteria andDOrderQtyIsNotNull() {
            addCriterion("dOrderQty is not null");
            return (Criteria) this;
        }

        public Criteria andDOrderQtyEqualTo(BigDecimal value) {
            addCriterion("dOrderQty =", value, "dOrderQty");
            return (Criteria) this;
        }

        public Criteria andDOrderQtyNotEqualTo(BigDecimal value) {
            addCriterion("dOrderQty <>", value, "dOrderQty");
            return (Criteria) this;
        }

        public Criteria andDOrderQtyGreaterThan(BigDecimal value) {
            addCriterion("dOrderQty >", value, "dOrderQty");
            return (Criteria) this;
        }

        public Criteria andDOrderQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dOrderQty >=", value, "dOrderQty");
            return (Criteria) this;
        }

        public Criteria andDOrderQtyLessThan(BigDecimal value) {
            addCriterion("dOrderQty <", value, "dOrderQty");
            return (Criteria) this;
        }

        public Criteria andDOrderQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dOrderQty <=", value, "dOrderQty");
            return (Criteria) this;
        }

        public Criteria andDOrderQtyIn(List<BigDecimal> values) {
            addCriterion("dOrderQty in", values, "dOrderQty");
            return (Criteria) this;
        }

        public Criteria andDOrderQtyNotIn(List<BigDecimal> values) {
            addCriterion("dOrderQty not in", values, "dOrderQty");
            return (Criteria) this;
        }

        public Criteria andDOrderQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dOrderQty between", value1, value2, "dOrderQty");
            return (Criteria) this;
        }

        public Criteria andDOrderQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dOrderQty not between", value1, value2, "dOrderQty");
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

        public Criteria andSzItemShelfLocIsNull() {
            addCriterion("szItemShelfLoc is null");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocIsNotNull() {
            addCriterion("szItemShelfLoc is not null");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocEqualTo(String value) {
            addCriterion("szItemShelfLoc =", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocNotEqualTo(String value) {
            addCriterion("szItemShelfLoc <>", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocGreaterThan(String value) {
            addCriterion("szItemShelfLoc >", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocGreaterThanOrEqualTo(String value) {
            addCriterion("szItemShelfLoc >=", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocLessThan(String value) {
            addCriterion("szItemShelfLoc <", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocLessThanOrEqualTo(String value) {
            addCriterion("szItemShelfLoc <=", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocLike(String value) {
            addCriterion("szItemShelfLoc like", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocNotLike(String value) {
            addCriterion("szItemShelfLoc not like", value, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocIn(List<String> values) {
            addCriterion("szItemShelfLoc in", values, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocNotIn(List<String> values) {
            addCriterion("szItemShelfLoc not in", values, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocBetween(String value1, String value2) {
            addCriterion("szItemShelfLoc between", value1, value2, "szItemShelfLoc");
            return (Criteria) this;
        }

        public Criteria andSzItemShelfLocNotBetween(String value1, String value2) {
            addCriterion("szItemShelfLoc not between", value1, value2, "szItemShelfLoc");
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

        public Criteria andDMAPIsNull() {
            addCriterion("dMAP is null");
            return (Criteria) this;
        }

        public Criteria andDMAPIsNotNull() {
            addCriterion("dMAP is not null");
            return (Criteria) this;
        }

        public Criteria andDMAPEqualTo(BigDecimal value) {
            addCriterion("dMAP =", value, "dMAP");
            return (Criteria) this;
        }

        public Criteria andDMAPNotEqualTo(BigDecimal value) {
            addCriterion("dMAP <>", value, "dMAP");
            return (Criteria) this;
        }

        public Criteria andDMAPGreaterThan(BigDecimal value) {
            addCriterion("dMAP >", value, "dMAP");
            return (Criteria) this;
        }

        public Criteria andDMAPGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dMAP >=", value, "dMAP");
            return (Criteria) this;
        }

        public Criteria andDMAPLessThan(BigDecimal value) {
            addCriterion("dMAP <", value, "dMAP");
            return (Criteria) this;
        }

        public Criteria andDMAPLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dMAP <=", value, "dMAP");
            return (Criteria) this;
        }

        public Criteria andDMAPIn(List<BigDecimal> values) {
            addCriterion("dMAP in", values, "dMAP");
            return (Criteria) this;
        }

        public Criteria andDMAPNotIn(List<BigDecimal> values) {
            addCriterion("dMAP not in", values, "dMAP");
            return (Criteria) this;
        }

        public Criteria andDMAPBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMAP between", value1, value2, "dMAP");
            return (Criteria) this;
        }

        public Criteria andDMAPNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dMAP not between", value1, value2, "dMAP");
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

        public Criteria andDTotalRetailAmountIsNull() {
            addCriterion("dTotalRetailAmount is null");
            return (Criteria) this;
        }

        public Criteria andDTotalRetailAmountIsNotNull() {
            addCriterion("dTotalRetailAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDTotalRetailAmountEqualTo(BigDecimal value) {
            addCriterion("dTotalRetailAmount =", value, "dTotalRetailAmount");
            return (Criteria) this;
        }

        public Criteria andDTotalRetailAmountNotEqualTo(BigDecimal value) {
            addCriterion("dTotalRetailAmount <>", value, "dTotalRetailAmount");
            return (Criteria) this;
        }

        public Criteria andDTotalRetailAmountGreaterThan(BigDecimal value) {
            addCriterion("dTotalRetailAmount >", value, "dTotalRetailAmount");
            return (Criteria) this;
        }

        public Criteria andDTotalRetailAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dTotalRetailAmount >=", value, "dTotalRetailAmount");
            return (Criteria) this;
        }

        public Criteria andDTotalRetailAmountLessThan(BigDecimal value) {
            addCriterion("dTotalRetailAmount <", value, "dTotalRetailAmount");
            return (Criteria) this;
        }

        public Criteria andDTotalRetailAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dTotalRetailAmount <=", value, "dTotalRetailAmount");
            return (Criteria) this;
        }

        public Criteria andDTotalRetailAmountIn(List<BigDecimal> values) {
            addCriterion("dTotalRetailAmount in", values, "dTotalRetailAmount");
            return (Criteria) this;
        }

        public Criteria andDTotalRetailAmountNotIn(List<BigDecimal> values) {
            addCriterion("dTotalRetailAmount not in", values, "dTotalRetailAmount");
            return (Criteria) this;
        }

        public Criteria andDTotalRetailAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dTotalRetailAmount between", value1, value2, "dTotalRetailAmount");
            return (Criteria) this;
        }

        public Criteria andDTotalRetailAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dTotalRetailAmount not between", value1, value2, "dTotalRetailAmount");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponIsNull() {
            addCriterion("bParkingCoupon is null");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponIsNotNull() {
            addCriterion("bParkingCoupon is not null");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponEqualTo(Integer value) {
            addCriterion("bParkingCoupon =", value, "bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponNotEqualTo(Integer value) {
            addCriterion("bParkingCoupon <>", value, "bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponGreaterThan(Integer value) {
            addCriterion("bParkingCoupon >", value, "bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponGreaterThanOrEqualTo(Integer value) {
            addCriterion("bParkingCoupon >=", value, "bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponLessThan(Integer value) {
            addCriterion("bParkingCoupon <", value, "bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponLessThanOrEqualTo(Integer value) {
            addCriterion("bParkingCoupon <=", value, "bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponIn(List<Integer> values) {
            addCriterion("bParkingCoupon in", values, "bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponNotIn(List<Integer> values) {
            addCriterion("bParkingCoupon not in", values, "bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponBetween(Integer value1, Integer value2) {
            addCriterion("bParkingCoupon between", value1, value2, "bParkingCoupon");
            return (Criteria) this;
        }

        public Criteria andBParkingCouponNotBetween(Integer value1, Integer value2) {
            addCriterion("bParkingCoupon not between", value1, value2, "bParkingCoupon");
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

        public Criteria andSzVendorIDOrCDCExternalIDIsNull() {
            addCriterion("szVendorIDOrCDCExternalID is null");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDIsNotNull() {
            addCriterion("szVendorIDOrCDCExternalID is not null");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDEqualTo(String value) {
            addCriterion("szVendorIDOrCDCExternalID =", value, "szVendorIDOrCDCExternalID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDNotEqualTo(String value) {
            addCriterion("szVendorIDOrCDCExternalID <>", value, "szVendorIDOrCDCExternalID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDGreaterThan(String value) {
            addCriterion("szVendorIDOrCDCExternalID >", value, "szVendorIDOrCDCExternalID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDGreaterThanOrEqualTo(String value) {
            addCriterion("szVendorIDOrCDCExternalID >=", value, "szVendorIDOrCDCExternalID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDLessThan(String value) {
            addCriterion("szVendorIDOrCDCExternalID <", value, "szVendorIDOrCDCExternalID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDLessThanOrEqualTo(String value) {
            addCriterion("szVendorIDOrCDCExternalID <=", value, "szVendorIDOrCDCExternalID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDLike(String value) {
            addCriterion("szVendorIDOrCDCExternalID like", value, "szVendorIDOrCDCExternalID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDNotLike(String value) {
            addCriterion("szVendorIDOrCDCExternalID not like", value, "szVendorIDOrCDCExternalID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDIn(List<String> values) {
            addCriterion("szVendorIDOrCDCExternalID in", values, "szVendorIDOrCDCExternalID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDNotIn(List<String> values) {
            addCriterion("szVendorIDOrCDCExternalID not in", values, "szVendorIDOrCDCExternalID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDBetween(String value1, String value2) {
            addCriterion("szVendorIDOrCDCExternalID between", value1, value2, "szVendorIDOrCDCExternalID");
            return (Criteria) this;
        }

        public Criteria andSzVendorIDOrCDCExternalIDNotBetween(String value1, String value2) {
            addCriterion("szVendorIDOrCDCExternalID not between", value1, value2, "szVendorIDOrCDCExternalID");
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

        public Criteria andSzReasonNameIsNull() {
            addCriterion("szReasonName is null");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameIsNotNull() {
            addCriterion("szReasonName is not null");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameEqualTo(String value) {
            addCriterion("szReasonName =", value, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameNotEqualTo(String value) {
            addCriterion("szReasonName <>", value, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameGreaterThan(String value) {
            addCriterion("szReasonName >", value, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameGreaterThanOrEqualTo(String value) {
            addCriterion("szReasonName >=", value, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameLessThan(String value) {
            addCriterion("szReasonName <", value, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameLessThanOrEqualTo(String value) {
            addCriterion("szReasonName <=", value, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameLike(String value) {
            addCriterion("szReasonName like", value, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameNotLike(String value) {
            addCriterion("szReasonName not like", value, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameIn(List<String> values) {
            addCriterion("szReasonName in", values, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameNotIn(List<String> values) {
            addCriterion("szReasonName not in", values, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameBetween(String value1, String value2) {
            addCriterion("szReasonName between", value1, value2, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andSzReasonNameNotBetween(String value1, String value2) {
            addCriterion("szReasonName not between", value1, value2, "szReasonName");
            return (Criteria) this;
        }

        public Criteria andDLossQtyIsNull() {
            addCriterion("dLossQty is null");
            return (Criteria) this;
        }

        public Criteria andDLossQtyIsNotNull() {
            addCriterion("dLossQty is not null");
            return (Criteria) this;
        }

        public Criteria andDLossQtyEqualTo(BigDecimal value) {
            addCriterion("dLossQty =", value, "dLossQty");
            return (Criteria) this;
        }

        public Criteria andDLossQtyNotEqualTo(BigDecimal value) {
            addCriterion("dLossQty <>", value, "dLossQty");
            return (Criteria) this;
        }

        public Criteria andDLossQtyGreaterThan(BigDecimal value) {
            addCriterion("dLossQty >", value, "dLossQty");
            return (Criteria) this;
        }

        public Criteria andDLossQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dLossQty >=", value, "dLossQty");
            return (Criteria) this;
        }

        public Criteria andDLossQtyLessThan(BigDecimal value) {
            addCriterion("dLossQty <", value, "dLossQty");
            return (Criteria) this;
        }

        public Criteria andDLossQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dLossQty <=", value, "dLossQty");
            return (Criteria) this;
        }

        public Criteria andDLossQtyIn(List<BigDecimal> values) {
            addCriterion("dLossQty in", values, "dLossQty");
            return (Criteria) this;
        }

        public Criteria andDLossQtyNotIn(List<BigDecimal> values) {
            addCriterion("dLossQty not in", values, "dLossQty");
            return (Criteria) this;
        }

        public Criteria andDLossQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dLossQty between", value1, value2, "dLossQty");
            return (Criteria) this;
        }

        public Criteria andDLossQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dLossQty not between", value1, value2, "dLossQty");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyIsNull() {
            addCriterion("dRvrActualQty is null");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyIsNotNull() {
            addCriterion("dRvrActualQty is not null");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyEqualTo(BigDecimal value) {
            addCriterion("dRvrActualQty =", value, "dRvrActualQty");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyNotEqualTo(BigDecimal value) {
            addCriterion("dRvrActualQty <>", value, "dRvrActualQty");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyGreaterThan(BigDecimal value) {
            addCriterion("dRvrActualQty >", value, "dRvrActualQty");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dRvrActualQty >=", value, "dRvrActualQty");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyLessThan(BigDecimal value) {
            addCriterion("dRvrActualQty <", value, "dRvrActualQty");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dRvrActualQty <=", value, "dRvrActualQty");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyIn(List<BigDecimal> values) {
            addCriterion("dRvrActualQty in", values, "dRvrActualQty");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyNotIn(List<BigDecimal> values) {
            addCriterion("dRvrActualQty not in", values, "dRvrActualQty");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dRvrActualQty between", value1, value2, "dRvrActualQty");
            return (Criteria) this;
        }

        public Criteria andDRvrActualQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dRvrActualQty not between", value1, value2, "dRvrActualQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyIsNull() {
            addCriterion("dCompensateDamageQty is null");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyIsNotNull() {
            addCriterion("dCompensateDamageQty is not null");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyEqualTo(BigDecimal value) {
            addCriterion("dCompensateDamageQty =", value, "dCompensateDamageQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyNotEqualTo(BigDecimal value) {
            addCriterion("dCompensateDamageQty <>", value, "dCompensateDamageQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyGreaterThan(BigDecimal value) {
            addCriterion("dCompensateDamageQty >", value, "dCompensateDamageQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dCompensateDamageQty >=", value, "dCompensateDamageQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyLessThan(BigDecimal value) {
            addCriterion("dCompensateDamageQty <", value, "dCompensateDamageQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dCompensateDamageQty <=", value, "dCompensateDamageQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyIn(List<BigDecimal> values) {
            addCriterion("dCompensateDamageQty in", values, "dCompensateDamageQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyNotIn(List<BigDecimal> values) {
            addCriterion("dCompensateDamageQty not in", values, "dCompensateDamageQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dCompensateDamageQty between", value1, value2, "dCompensateDamageQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDamageQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dCompensateDamageQty not between", value1, value2, "dCompensateDamageQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyIsNull() {
            addCriterion("dCompensateDiffQty is null");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyIsNotNull() {
            addCriterion("dCompensateDiffQty is not null");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyEqualTo(BigDecimal value) {
            addCriterion("dCompensateDiffQty =", value, "dCompensateDiffQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyNotEqualTo(BigDecimal value) {
            addCriterion("dCompensateDiffQty <>", value, "dCompensateDiffQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyGreaterThan(BigDecimal value) {
            addCriterion("dCompensateDiffQty >", value, "dCompensateDiffQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dCompensateDiffQty >=", value, "dCompensateDiffQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyLessThan(BigDecimal value) {
            addCriterion("dCompensateDiffQty <", value, "dCompensateDiffQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dCompensateDiffQty <=", value, "dCompensateDiffQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyIn(List<BigDecimal> values) {
            addCriterion("dCompensateDiffQty in", values, "dCompensateDiffQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyNotIn(List<BigDecimal> values) {
            addCriterion("dCompensateDiffQty not in", values, "dCompensateDiffQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dCompensateDiffQty between", value1, value2, "dCompensateDiffQty");
            return (Criteria) this;
        }

        public Criteria andDCompensateDiffQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dCompensateDiffQty not between", value1, value2, "dCompensateDiffQty");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmIsNull() {
            addCriterion("szDamaConfirm is null");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmIsNotNull() {
            addCriterion("szDamaConfirm is not null");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmEqualTo(Integer value) {
            addCriterion("szDamaConfirm =", value, "szDamaConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmNotEqualTo(Integer value) {
            addCriterion("szDamaConfirm <>", value, "szDamaConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmGreaterThan(Integer value) {
            addCriterion("szDamaConfirm >", value, "szDamaConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("szDamaConfirm >=", value, "szDamaConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmLessThan(Integer value) {
            addCriterion("szDamaConfirm <", value, "szDamaConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmLessThanOrEqualTo(Integer value) {
            addCriterion("szDamaConfirm <=", value, "szDamaConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmIn(List<Integer> values) {
            addCriterion("szDamaConfirm in", values, "szDamaConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmNotIn(List<Integer> values) {
            addCriterion("szDamaConfirm not in", values, "szDamaConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmBetween(Integer value1, Integer value2) {
            addCriterion("szDamaConfirm between", value1, value2, "szDamaConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDamaConfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("szDamaConfirm not between", value1, value2, "szDamaConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmIsNull() {
            addCriterion("szDiffConfirm is null");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmIsNotNull() {
            addCriterion("szDiffConfirm is not null");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmEqualTo(Integer value) {
            addCriterion("szDiffConfirm =", value, "szDiffConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmNotEqualTo(Integer value) {
            addCriterion("szDiffConfirm <>", value, "szDiffConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmGreaterThan(Integer value) {
            addCriterion("szDiffConfirm >", value, "szDiffConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("szDiffConfirm >=", value, "szDiffConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmLessThan(Integer value) {
            addCriterion("szDiffConfirm <", value, "szDiffConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmLessThanOrEqualTo(Integer value) {
            addCriterion("szDiffConfirm <=", value, "szDiffConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmIn(List<Integer> values) {
            addCriterion("szDiffConfirm in", values, "szDiffConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmNotIn(List<Integer> values) {
            addCriterion("szDiffConfirm not in", values, "szDiffConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmBetween(Integer value1, Integer value2) {
            addCriterion("szDiffConfirm between", value1, value2, "szDiffConfirm");
            return (Criteria) this;
        }

        public Criteria andSzDiffConfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("szDiffConfirm not between", value1, value2, "szDiffConfirm");
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