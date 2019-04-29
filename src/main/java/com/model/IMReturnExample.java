package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IMReturnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IMReturnExample() {
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

        public Criteria andLSequenceNumberIsNull() {
            addCriterion("lSequenceNumber is null");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberIsNotNull() {
            addCriterion("lSequenceNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberEqualTo(Long value) {
            addCriterion("lSequenceNumber =", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberNotEqualTo(Long value) {
            addCriterion("lSequenceNumber <>", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberGreaterThan(Long value) {
            addCriterion("lSequenceNumber >", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("lSequenceNumber >=", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberLessThan(Long value) {
            addCriterion("lSequenceNumber <", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberLessThanOrEqualTo(Long value) {
            addCriterion("lSequenceNumber <=", value, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberIn(List<Long> values) {
            addCriterion("lSequenceNumber in", values, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberNotIn(List<Long> values) {
            addCriterion("lSequenceNumber not in", values, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberBetween(Long value1, Long value2) {
            addCriterion("lSequenceNumber between", value1, value2, "lSequenceNumber");
            return (Criteria) this;
        }

        public Criteria andLSequenceNumberNotBetween(Long value1, Long value2) {
            addCriterion("lSequenceNumber not between", value1, value2, "lSequenceNumber");
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

        public Criteria andSzItemLookupCodeIsNull() {
            addCriterion("szItemLookupCode is null");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeIsNotNull() {
            addCriterion("szItemLookupCode is not null");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeEqualTo(String value) {
            addCriterion("szItemLookupCode =", value, "szItemLookupCode");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeNotEqualTo(String value) {
            addCriterion("szItemLookupCode <>", value, "szItemLookupCode");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeGreaterThan(String value) {
            addCriterion("szItemLookupCode >", value, "szItemLookupCode");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("szItemLookupCode >=", value, "szItemLookupCode");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeLessThan(String value) {
            addCriterion("szItemLookupCode <", value, "szItemLookupCode");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeLessThanOrEqualTo(String value) {
            addCriterion("szItemLookupCode <=", value, "szItemLookupCode");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeLike(String value) {
            addCriterion("szItemLookupCode like", value, "szItemLookupCode");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeNotLike(String value) {
            addCriterion("szItemLookupCode not like", value, "szItemLookupCode");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeIn(List<String> values) {
            addCriterion("szItemLookupCode in", values, "szItemLookupCode");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeNotIn(List<String> values) {
            addCriterion("szItemLookupCode not in", values, "szItemLookupCode");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeBetween(String value1, String value2) {
            addCriterion("szItemLookupCode between", value1, value2, "szItemLookupCode");
            return (Criteria) this;
        }

        public Criteria andSzItemLookupCodeNotBetween(String value1, String value2) {
            addCriterion("szItemLookupCode not between", value1, value2, "szItemLookupCode");
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

        public Criteria andSzVendorNameIsNull() {
            addCriterion("szVendorName is null");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameIsNotNull() {
            addCriterion("szVendorName is not null");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameEqualTo(String value) {
            addCriterion("szVendorName =", value, "szVendorName");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameNotEqualTo(String value) {
            addCriterion("szVendorName <>", value, "szVendorName");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameGreaterThan(String value) {
            addCriterion("szVendorName >", value, "szVendorName");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameGreaterThanOrEqualTo(String value) {
            addCriterion("szVendorName >=", value, "szVendorName");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameLessThan(String value) {
            addCriterion("szVendorName <", value, "szVendorName");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameLessThanOrEqualTo(String value) {
            addCriterion("szVendorName <=", value, "szVendorName");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameLike(String value) {
            addCriterion("szVendorName like", value, "szVendorName");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameNotLike(String value) {
            addCriterion("szVendorName not like", value, "szVendorName");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameIn(List<String> values) {
            addCriterion("szVendorName in", values, "szVendorName");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameNotIn(List<String> values) {
            addCriterion("szVendorName not in", values, "szVendorName");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameBetween(String value1, String value2) {
            addCriterion("szVendorName between", value1, value2, "szVendorName");
            return (Criteria) this;
        }

        public Criteria andSzVendorNameNotBetween(String value1, String value2) {
            addCriterion("szVendorName not between", value1, value2, "szVendorName");
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

        public Criteria andLStatusIsNull() {
            addCriterion("lStatus is null");
            return (Criteria) this;
        }

        public Criteria andLStatusIsNotNull() {
            addCriterion("lStatus is not null");
            return (Criteria) this;
        }

        public Criteria andLStatusEqualTo(Integer value) {
            addCriterion("lStatus =", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotEqualTo(Integer value) {
            addCriterion("lStatus <>", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusGreaterThan(Integer value) {
            addCriterion("lStatus >", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("lStatus >=", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusLessThan(Integer value) {
            addCriterion("lStatus <", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusLessThanOrEqualTo(Integer value) {
            addCriterion("lStatus <=", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusIn(List<Integer> values) {
            addCriterion("lStatus in", values, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotIn(List<Integer> values) {
            addCriterion("lStatus not in", values, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusBetween(Integer value1, Integer value2) {
            addCriterion("lStatus between", value1, value2, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("lStatus not between", value1, value2, "lStatus");
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

        public Criteria andBNoObjectIsNull() {
            addCriterion("bNoObject is null");
            return (Criteria) this;
        }

        public Criteria andBNoObjectIsNotNull() {
            addCriterion("bNoObject is not null");
            return (Criteria) this;
        }

        public Criteria andBNoObjectEqualTo(Integer value) {
            addCriterion("bNoObject =", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectNotEqualTo(Integer value) {
            addCriterion("bNoObject <>", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectGreaterThan(Integer value) {
            addCriterion("bNoObject >", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("bNoObject >=", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectLessThan(Integer value) {
            addCriterion("bNoObject <", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectLessThanOrEqualTo(Integer value) {
            addCriterion("bNoObject <=", value, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectIn(List<Integer> values) {
            addCriterion("bNoObject in", values, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectNotIn(List<Integer> values) {
            addCriterion("bNoObject not in", values, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectBetween(Integer value1, Integer value2) {
            addCriterion("bNoObject between", value1, value2, "bNoObject");
            return (Criteria) this;
        }

        public Criteria andBNoObjectNotBetween(Integer value1, Integer value2) {
            addCriterion("bNoObject not between", value1, value2, "bNoObject");
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