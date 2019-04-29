package com.model;

import java.util.ArrayList;
import java.util.List;

public class RetailStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RetailStoreExample() {
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

        public Criteria andLPartyIDIsNull() {
            addCriterion("lPartyID is null");
            return (Criteria) this;
        }

        public Criteria andLPartyIDIsNotNull() {
            addCriterion("lPartyID is not null");
            return (Criteria) this;
        }

        public Criteria andLPartyIDEqualTo(Integer value) {
            addCriterion("lPartyID =", value, "lPartyID");
            return (Criteria) this;
        }

        public Criteria andLPartyIDNotEqualTo(Integer value) {
            addCriterion("lPartyID <>", value, "lPartyID");
            return (Criteria) this;
        }

        public Criteria andLPartyIDGreaterThan(Integer value) {
            addCriterion("lPartyID >", value, "lPartyID");
            return (Criteria) this;
        }

        public Criteria andLPartyIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lPartyID >=", value, "lPartyID");
            return (Criteria) this;
        }

        public Criteria andLPartyIDLessThan(Integer value) {
            addCriterion("lPartyID <", value, "lPartyID");
            return (Criteria) this;
        }

        public Criteria andLPartyIDLessThanOrEqualTo(Integer value) {
            addCriterion("lPartyID <=", value, "lPartyID");
            return (Criteria) this;
        }

        public Criteria andLPartyIDIn(List<Integer> values) {
            addCriterion("lPartyID in", values, "lPartyID");
            return (Criteria) this;
        }

        public Criteria andLPartyIDNotIn(List<Integer> values) {
            addCriterion("lPartyID not in", values, "lPartyID");
            return (Criteria) this;
        }

        public Criteria andLPartyIDBetween(Integer value1, Integer value2) {
            addCriterion("lPartyID between", value1, value2, "lPartyID");
            return (Criteria) this;
        }

        public Criteria andLPartyIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lPartyID not between", value1, value2, "lPartyID");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeIsNull() {
            addCriterion("szPartyRoleTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeIsNotNull() {
            addCriterion("szPartyRoleTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeEqualTo(String value) {
            addCriterion("szPartyRoleTypeCode =", value, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeNotEqualTo(String value) {
            addCriterion("szPartyRoleTypeCode <>", value, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeGreaterThan(String value) {
            addCriterion("szPartyRoleTypeCode >", value, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("szPartyRoleTypeCode >=", value, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeLessThan(String value) {
            addCriterion("szPartyRoleTypeCode <", value, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("szPartyRoleTypeCode <=", value, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeLike(String value) {
            addCriterion("szPartyRoleTypeCode like", value, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeNotLike(String value) {
            addCriterion("szPartyRoleTypeCode not like", value, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeIn(List<String> values) {
            addCriterion("szPartyRoleTypeCode in", values, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeNotIn(List<String> values) {
            addCriterion("szPartyRoleTypeCode not in", values, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeBetween(String value1, String value2) {
            addCriterion("szPartyRoleTypeCode between", value1, value2, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzPartyRoleTypeCodeNotBetween(String value1, String value2) {
            addCriterion("szPartyRoleTypeCode not between", value1, value2, "szPartyRoleTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeIsNull() {
            addCriterion("szStoreTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeIsNotNull() {
            addCriterion("szStoreTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeEqualTo(String value) {
            addCriterion("szStoreTypeCode =", value, "szStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeNotEqualTo(String value) {
            addCriterion("szStoreTypeCode <>", value, "szStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeGreaterThan(String value) {
            addCriterion("szStoreTypeCode >", value, "szStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("szStoreTypeCode >=", value, "szStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeLessThan(String value) {
            addCriterion("szStoreTypeCode <", value, "szStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("szStoreTypeCode <=", value, "szStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeLike(String value) {
            addCriterion("szStoreTypeCode like", value, "szStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeNotLike(String value) {
            addCriterion("szStoreTypeCode not like", value, "szStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeIn(List<String> values) {
            addCriterion("szStoreTypeCode in", values, "szStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeNotIn(List<String> values) {
            addCriterion("szStoreTypeCode not in", values, "szStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeBetween(String value1, String value2) {
            addCriterion("szStoreTypeCode between", value1, value2, "szStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzStoreTypeCodeNotBetween(String value1, String value2) {
            addCriterion("szStoreTypeCode not between", value1, value2, "szStoreTypeCode");
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

        public Criteria andSzResponsibleIsNull() {
            addCriterion("szResponsible is null");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleIsNotNull() {
            addCriterion("szResponsible is not null");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleEqualTo(String value) {
            addCriterion("szResponsible =", value, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleNotEqualTo(String value) {
            addCriterion("szResponsible <>", value, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleGreaterThan(String value) {
            addCriterion("szResponsible >", value, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleGreaterThanOrEqualTo(String value) {
            addCriterion("szResponsible >=", value, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleLessThan(String value) {
            addCriterion("szResponsible <", value, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleLessThanOrEqualTo(String value) {
            addCriterion("szResponsible <=", value, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleLike(String value) {
            addCriterion("szResponsible like", value, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleNotLike(String value) {
            addCriterion("szResponsible not like", value, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleIn(List<String> values) {
            addCriterion("szResponsible in", values, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleNotIn(List<String> values) {
            addCriterion("szResponsible not in", values, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleBetween(String value1, String value2) {
            addCriterion("szResponsible between", value1, value2, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andSzResponsibleNotBetween(String value1, String value2) {
            addCriterion("szResponsible not between", value1, value2, "szResponsible");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterIsNull() {
            addCriterion("lCurrentEODCounter is null");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterIsNotNull() {
            addCriterion("lCurrentEODCounter is not null");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterEqualTo(Integer value) {
            addCriterion("lCurrentEODCounter =", value, "lCurrentEODCounter");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterNotEqualTo(Integer value) {
            addCriterion("lCurrentEODCounter <>", value, "lCurrentEODCounter");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterGreaterThan(Integer value) {
            addCriterion("lCurrentEODCounter >", value, "lCurrentEODCounter");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterGreaterThanOrEqualTo(Integer value) {
            addCriterion("lCurrentEODCounter >=", value, "lCurrentEODCounter");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterLessThan(Integer value) {
            addCriterion("lCurrentEODCounter <", value, "lCurrentEODCounter");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterLessThanOrEqualTo(Integer value) {
            addCriterion("lCurrentEODCounter <=", value, "lCurrentEODCounter");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterIn(List<Integer> values) {
            addCriterion("lCurrentEODCounter in", values, "lCurrentEODCounter");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterNotIn(List<Integer> values) {
            addCriterion("lCurrentEODCounter not in", values, "lCurrentEODCounter");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterBetween(Integer value1, Integer value2) {
            addCriterion("lCurrentEODCounter between", value1, value2, "lCurrentEODCounter");
            return (Criteria) this;
        }

        public Criteria andLCurrentEODCounterNotBetween(Integer value1, Integer value2) {
            addCriterion("lCurrentEODCounter not between", value1, value2, "lCurrentEODCounter");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterIsNull() {
            addCriterion("lStartEODCounter is null");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterIsNotNull() {
            addCriterion("lStartEODCounter is not null");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterEqualTo(Integer value) {
            addCriterion("lStartEODCounter =", value, "lStartEODCounter");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterNotEqualTo(Integer value) {
            addCriterion("lStartEODCounter <>", value, "lStartEODCounter");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterGreaterThan(Integer value) {
            addCriterion("lStartEODCounter >", value, "lStartEODCounter");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterGreaterThanOrEqualTo(Integer value) {
            addCriterion("lStartEODCounter >=", value, "lStartEODCounter");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterLessThan(Integer value) {
            addCriterion("lStartEODCounter <", value, "lStartEODCounter");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterLessThanOrEqualTo(Integer value) {
            addCriterion("lStartEODCounter <=", value, "lStartEODCounter");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterIn(List<Integer> values) {
            addCriterion("lStartEODCounter in", values, "lStartEODCounter");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterNotIn(List<Integer> values) {
            addCriterion("lStartEODCounter not in", values, "lStartEODCounter");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterBetween(Integer value1, Integer value2) {
            addCriterion("lStartEODCounter between", value1, value2, "lStartEODCounter");
            return (Criteria) this;
        }

        public Criteria andLStartEODCounterNotBetween(Integer value1, Integer value2) {
            addCriterion("lStartEODCounter not between", value1, value2, "lStartEODCounter");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodIsNull() {
            addCriterion("bAbortEndOfPeriod is null");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodIsNotNull() {
            addCriterion("bAbortEndOfPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodEqualTo(Short value) {
            addCriterion("bAbortEndOfPeriod =", value, "bAbortEndOfPeriod");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodNotEqualTo(Short value) {
            addCriterion("bAbortEndOfPeriod <>", value, "bAbortEndOfPeriod");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodGreaterThan(Short value) {
            addCriterion("bAbortEndOfPeriod >", value, "bAbortEndOfPeriod");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodGreaterThanOrEqualTo(Short value) {
            addCriterion("bAbortEndOfPeriod >=", value, "bAbortEndOfPeriod");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodLessThan(Short value) {
            addCriterion("bAbortEndOfPeriod <", value, "bAbortEndOfPeriod");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodLessThanOrEqualTo(Short value) {
            addCriterion("bAbortEndOfPeriod <=", value, "bAbortEndOfPeriod");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodIn(List<Short> values) {
            addCriterion("bAbortEndOfPeriod in", values, "bAbortEndOfPeriod");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodNotIn(List<Short> values) {
            addCriterion("bAbortEndOfPeriod not in", values, "bAbortEndOfPeriod");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodBetween(Short value1, Short value2) {
            addCriterion("bAbortEndOfPeriod between", value1, value2, "bAbortEndOfPeriod");
            return (Criteria) this;
        }

        public Criteria andBAbortEndOfPeriodNotBetween(Short value1, Short value2) {
            addCriterion("bAbortEndOfPeriod not between", value1, value2, "bAbortEndOfPeriod");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrIsNull() {
            addCriterion("szCompanyTaxNmbr is null");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrIsNotNull() {
            addCriterion("szCompanyTaxNmbr is not null");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr =", value, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrNotEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr <>", value, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrGreaterThan(String value) {
            addCriterion("szCompanyTaxNmbr >", value, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrGreaterThanOrEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr >=", value, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrLessThan(String value) {
            addCriterion("szCompanyTaxNmbr <", value, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrLessThanOrEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr <=", value, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrLike(String value) {
            addCriterion("szCompanyTaxNmbr like", value, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrNotLike(String value) {
            addCriterion("szCompanyTaxNmbr not like", value, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrIn(List<String> values) {
            addCriterion("szCompanyTaxNmbr in", values, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrNotIn(List<String> values) {
            addCriterion("szCompanyTaxNmbr not in", values, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrBetween(String value1, String value2) {
            addCriterion("szCompanyTaxNmbr between", value1, value2, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbrNotBetween(String value1, String value2) {
            addCriterion("szCompanyTaxNmbr not between", value1, value2, "szCompanyTaxNmbr");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysIsNull() {
            addCriterion("lTxPosSecurityInDays is null");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysIsNotNull() {
            addCriterion("lTxPosSecurityInDays is not null");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysEqualTo(Integer value) {
            addCriterion("lTxPosSecurityInDays =", value, "lTxPosSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysNotEqualTo(Integer value) {
            addCriterion("lTxPosSecurityInDays <>", value, "lTxPosSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysGreaterThan(Integer value) {
            addCriterion("lTxPosSecurityInDays >", value, "lTxPosSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("lTxPosSecurityInDays >=", value, "lTxPosSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysLessThan(Integer value) {
            addCriterion("lTxPosSecurityInDays <", value, "lTxPosSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysLessThanOrEqualTo(Integer value) {
            addCriterion("lTxPosSecurityInDays <=", value, "lTxPosSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysIn(List<Integer> values) {
            addCriterion("lTxPosSecurityInDays in", values, "lTxPosSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysNotIn(List<Integer> values) {
            addCriterion("lTxPosSecurityInDays not in", values, "lTxPosSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysBetween(Integer value1, Integer value2) {
            addCriterion("lTxPosSecurityInDays between", value1, value2, "lTxPosSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxPosSecurityInDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("lTxPosSecurityInDays not between", value1, value2, "lTxPosSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysIsNull() {
            addCriterion("lTxServerSecurityInDays is null");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysIsNotNull() {
            addCriterion("lTxServerSecurityInDays is not null");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysEqualTo(Integer value) {
            addCriterion("lTxServerSecurityInDays =", value, "lTxServerSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysNotEqualTo(Integer value) {
            addCriterion("lTxServerSecurityInDays <>", value, "lTxServerSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysGreaterThan(Integer value) {
            addCriterion("lTxServerSecurityInDays >", value, "lTxServerSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("lTxServerSecurityInDays >=", value, "lTxServerSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysLessThan(Integer value) {
            addCriterion("lTxServerSecurityInDays <", value, "lTxServerSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysLessThanOrEqualTo(Integer value) {
            addCriterion("lTxServerSecurityInDays <=", value, "lTxServerSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysIn(List<Integer> values) {
            addCriterion("lTxServerSecurityInDays in", values, "lTxServerSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysNotIn(List<Integer> values) {
            addCriterion("lTxServerSecurityInDays not in", values, "lTxServerSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysBetween(Integer value1, Integer value2) {
            addCriterion("lTxServerSecurityInDays between", value1, value2, "lTxServerSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andLTxServerSecurityInDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("lTxServerSecurityInDays not between", value1, value2, "lTxServerSecurityInDays");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersIsNull() {
            addCriterion("bDefaultRetailStoreParameters is null");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersIsNotNull() {
            addCriterion("bDefaultRetailStoreParameters is not null");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersEqualTo(Short value) {
            addCriterion("bDefaultRetailStoreParameters =", value, "bDefaultRetailStoreParameters");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersNotEqualTo(Short value) {
            addCriterion("bDefaultRetailStoreParameters <>", value, "bDefaultRetailStoreParameters");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersGreaterThan(Short value) {
            addCriterion("bDefaultRetailStoreParameters >", value, "bDefaultRetailStoreParameters");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersGreaterThanOrEqualTo(Short value) {
            addCriterion("bDefaultRetailStoreParameters >=", value, "bDefaultRetailStoreParameters");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersLessThan(Short value) {
            addCriterion("bDefaultRetailStoreParameters <", value, "bDefaultRetailStoreParameters");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersLessThanOrEqualTo(Short value) {
            addCriterion("bDefaultRetailStoreParameters <=", value, "bDefaultRetailStoreParameters");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersIn(List<Short> values) {
            addCriterion("bDefaultRetailStoreParameters in", values, "bDefaultRetailStoreParameters");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersNotIn(List<Short> values) {
            addCriterion("bDefaultRetailStoreParameters not in", values, "bDefaultRetailStoreParameters");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersBetween(Short value1, Short value2) {
            addCriterion("bDefaultRetailStoreParameters between", value1, value2, "bDefaultRetailStoreParameters");
            return (Criteria) this;
        }

        public Criteria andBDefaultRetailStoreParametersNotBetween(Short value1, Short value2) {
            addCriterion("bDefaultRetailStoreParameters not between", value1, value2, "bDefaultRetailStoreParameters");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeIsNull() {
            addCriterion("szDefaultLanguageCode is null");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeIsNotNull() {
            addCriterion("szDefaultLanguageCode is not null");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeEqualTo(String value) {
            addCriterion("szDefaultLanguageCode =", value, "szDefaultLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeNotEqualTo(String value) {
            addCriterion("szDefaultLanguageCode <>", value, "szDefaultLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeGreaterThan(String value) {
            addCriterion("szDefaultLanguageCode >", value, "szDefaultLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("szDefaultLanguageCode >=", value, "szDefaultLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeLessThan(String value) {
            addCriterion("szDefaultLanguageCode <", value, "szDefaultLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeLessThanOrEqualTo(String value) {
            addCriterion("szDefaultLanguageCode <=", value, "szDefaultLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeLike(String value) {
            addCriterion("szDefaultLanguageCode like", value, "szDefaultLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeNotLike(String value) {
            addCriterion("szDefaultLanguageCode not like", value, "szDefaultLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeIn(List<String> values) {
            addCriterion("szDefaultLanguageCode in", values, "szDefaultLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeNotIn(List<String> values) {
            addCriterion("szDefaultLanguageCode not in", values, "szDefaultLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeBetween(String value1, String value2) {
            addCriterion("szDefaultLanguageCode between", value1, value2, "szDefaultLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSzDefaultLanguageCodeNotBetween(String value1, String value2) {
            addCriterion("szDefaultLanguageCode not between", value1, value2, "szDefaultLanguageCode");
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

        public Criteria andLParentRetailStoreIDIsNull() {
            addCriterion("lParentRetailStoreID is null");
            return (Criteria) this;
        }

        public Criteria andLParentRetailStoreIDIsNotNull() {
            addCriterion("lParentRetailStoreID is not null");
            return (Criteria) this;
        }

        public Criteria andLParentRetailStoreIDEqualTo(Integer value) {
            addCriterion("lParentRetailStoreID =", value, "lParentRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLParentRetailStoreIDNotEqualTo(Integer value) {
            addCriterion("lParentRetailStoreID <>", value, "lParentRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLParentRetailStoreIDGreaterThan(Integer value) {
            addCriterion("lParentRetailStoreID >", value, "lParentRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLParentRetailStoreIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lParentRetailStoreID >=", value, "lParentRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLParentRetailStoreIDLessThan(Integer value) {
            addCriterion("lParentRetailStoreID <", value, "lParentRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLParentRetailStoreIDLessThanOrEqualTo(Integer value) {
            addCriterion("lParentRetailStoreID <=", value, "lParentRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLParentRetailStoreIDIn(List<Integer> values) {
            addCriterion("lParentRetailStoreID in", values, "lParentRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLParentRetailStoreIDNotIn(List<Integer> values) {
            addCriterion("lParentRetailStoreID not in", values, "lParentRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLParentRetailStoreIDBetween(Integer value1, Integer value2) {
            addCriterion("lParentRetailStoreID between", value1, value2, "lParentRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andLParentRetailStoreIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lParentRetailStoreID not between", value1, value2, "lParentRetailStoreID");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeIsNull() {
            addCriterion("szMultiStoreTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeIsNotNull() {
            addCriterion("szMultiStoreTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeEqualTo(String value) {
            addCriterion("szMultiStoreTypeCode =", value, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeNotEqualTo(String value) {
            addCriterion("szMultiStoreTypeCode <>", value, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeGreaterThan(String value) {
            addCriterion("szMultiStoreTypeCode >", value, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("szMultiStoreTypeCode >=", value, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeLessThan(String value) {
            addCriterion("szMultiStoreTypeCode <", value, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("szMultiStoreTypeCode <=", value, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeLike(String value) {
            addCriterion("szMultiStoreTypeCode like", value, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeNotLike(String value) {
            addCriterion("szMultiStoreTypeCode not like", value, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeIn(List<String> values) {
            addCriterion("szMultiStoreTypeCode in", values, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeNotIn(List<String> values) {
            addCriterion("szMultiStoreTypeCode not in", values, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeBetween(String value1, String value2) {
            addCriterion("szMultiStoreTypeCode between", value1, value2, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andSzMultiStoreTypeCodeNotBetween(String value1, String value2) {
            addCriterion("szMultiStoreTypeCode not between", value1, value2, "szMultiStoreTypeCode");
            return (Criteria) this;
        }

        public Criteria andLClientIDIsNull() {
            addCriterion("lClientID is null");
            return (Criteria) this;
        }

        public Criteria andLClientIDIsNotNull() {
            addCriterion("lClientID is not null");
            return (Criteria) this;
        }

        public Criteria andLClientIDEqualTo(Integer value) {
            addCriterion("lClientID =", value, "lClientID");
            return (Criteria) this;
        }

        public Criteria andLClientIDNotEqualTo(Integer value) {
            addCriterion("lClientID <>", value, "lClientID");
            return (Criteria) this;
        }

        public Criteria andLClientIDGreaterThan(Integer value) {
            addCriterion("lClientID >", value, "lClientID");
            return (Criteria) this;
        }

        public Criteria andLClientIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lClientID >=", value, "lClientID");
            return (Criteria) this;
        }

        public Criteria andLClientIDLessThan(Integer value) {
            addCriterion("lClientID <", value, "lClientID");
            return (Criteria) this;
        }

        public Criteria andLClientIDLessThanOrEqualTo(Integer value) {
            addCriterion("lClientID <=", value, "lClientID");
            return (Criteria) this;
        }

        public Criteria andLClientIDIn(List<Integer> values) {
            addCriterion("lClientID in", values, "lClientID");
            return (Criteria) this;
        }

        public Criteria andLClientIDNotIn(List<Integer> values) {
            addCriterion("lClientID not in", values, "lClientID");
            return (Criteria) this;
        }

        public Criteria andLClientIDBetween(Integer value1, Integer value2) {
            addCriterion("lClientID between", value1, value2, "lClientID");
            return (Criteria) this;
        }

        public Criteria andLClientIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lClientID not between", value1, value2, "lClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDIsNull() {
            addCriterion("szExternalClientID is null");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDIsNotNull() {
            addCriterion("szExternalClientID is not null");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDEqualTo(String value) {
            addCriterion("szExternalClientID =", value, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDNotEqualTo(String value) {
            addCriterion("szExternalClientID <>", value, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDGreaterThan(String value) {
            addCriterion("szExternalClientID >", value, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDGreaterThanOrEqualTo(String value) {
            addCriterion("szExternalClientID >=", value, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDLessThan(String value) {
            addCriterion("szExternalClientID <", value, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDLessThanOrEqualTo(String value) {
            addCriterion("szExternalClientID <=", value, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDLike(String value) {
            addCriterion("szExternalClientID like", value, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDNotLike(String value) {
            addCriterion("szExternalClientID not like", value, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDIn(List<String> values) {
            addCriterion("szExternalClientID in", values, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDNotIn(List<String> values) {
            addCriterion("szExternalClientID not in", values, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDBetween(String value1, String value2) {
            addCriterion("szExternalClientID between", value1, value2, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzExternalClientIDNotBetween(String value1, String value2) {
            addCriterion("szExternalClientID not between", value1, value2, "szExternalClientID");
            return (Criteria) this;
        }

        public Criteria andSzClientNameIsNull() {
            addCriterion("szClientName is null");
            return (Criteria) this;
        }

        public Criteria andSzClientNameIsNotNull() {
            addCriterion("szClientName is not null");
            return (Criteria) this;
        }

        public Criteria andSzClientNameEqualTo(String value) {
            addCriterion("szClientName =", value, "szClientName");
            return (Criteria) this;
        }

        public Criteria andSzClientNameNotEqualTo(String value) {
            addCriterion("szClientName <>", value, "szClientName");
            return (Criteria) this;
        }

        public Criteria andSzClientNameGreaterThan(String value) {
            addCriterion("szClientName >", value, "szClientName");
            return (Criteria) this;
        }

        public Criteria andSzClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("szClientName >=", value, "szClientName");
            return (Criteria) this;
        }

        public Criteria andSzClientNameLessThan(String value) {
            addCriterion("szClientName <", value, "szClientName");
            return (Criteria) this;
        }

        public Criteria andSzClientNameLessThanOrEqualTo(String value) {
            addCriterion("szClientName <=", value, "szClientName");
            return (Criteria) this;
        }

        public Criteria andSzClientNameLike(String value) {
            addCriterion("szClientName like", value, "szClientName");
            return (Criteria) this;
        }

        public Criteria andSzClientNameNotLike(String value) {
            addCriterion("szClientName not like", value, "szClientName");
            return (Criteria) this;
        }

        public Criteria andSzClientNameIn(List<String> values) {
            addCriterion("szClientName in", values, "szClientName");
            return (Criteria) this;
        }

        public Criteria andSzClientNameNotIn(List<String> values) {
            addCriterion("szClientName not in", values, "szClientName");
            return (Criteria) this;
        }

        public Criteria andSzClientNameBetween(String value1, String value2) {
            addCriterion("szClientName between", value1, value2, "szClientName");
            return (Criteria) this;
        }

        public Criteria andSzClientNameNotBetween(String value1, String value2) {
            addCriterion("szClientName not between", value1, value2, "szClientName");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDIsNull() {
            addCriterion("lProdRangeStoreGroupID is null");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDIsNotNull() {
            addCriterion("lProdRangeStoreGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDEqualTo(Integer value) {
            addCriterion("lProdRangeStoreGroupID =", value, "lProdRangeStoreGroupID");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDNotEqualTo(Integer value) {
            addCriterion("lProdRangeStoreGroupID <>", value, "lProdRangeStoreGroupID");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDGreaterThan(Integer value) {
            addCriterion("lProdRangeStoreGroupID >", value, "lProdRangeStoreGroupID");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lProdRangeStoreGroupID >=", value, "lProdRangeStoreGroupID");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDLessThan(Integer value) {
            addCriterion("lProdRangeStoreGroupID <", value, "lProdRangeStoreGroupID");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDLessThanOrEqualTo(Integer value) {
            addCriterion("lProdRangeStoreGroupID <=", value, "lProdRangeStoreGroupID");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDIn(List<Integer> values) {
            addCriterion("lProdRangeStoreGroupID in", values, "lProdRangeStoreGroupID");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDNotIn(List<Integer> values) {
            addCriterion("lProdRangeStoreGroupID not in", values, "lProdRangeStoreGroupID");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDBetween(Integer value1, Integer value2) {
            addCriterion("lProdRangeStoreGroupID between", value1, value2, "lProdRangeStoreGroupID");
            return (Criteria) this;
        }

        public Criteria andLProdRangeStoreGroupIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lProdRangeStoreGroupID not between", value1, value2, "lProdRangeStoreGroupID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDIsNull() {
            addCriterion("szTaxStoreLocationID is null");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDIsNotNull() {
            addCriterion("szTaxStoreLocationID is not null");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDEqualTo(String value) {
            addCriterion("szTaxStoreLocationID =", value, "szTaxStoreLocationID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDNotEqualTo(String value) {
            addCriterion("szTaxStoreLocationID <>", value, "szTaxStoreLocationID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDGreaterThan(String value) {
            addCriterion("szTaxStoreLocationID >", value, "szTaxStoreLocationID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDGreaterThanOrEqualTo(String value) {
            addCriterion("szTaxStoreLocationID >=", value, "szTaxStoreLocationID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDLessThan(String value) {
            addCriterion("szTaxStoreLocationID <", value, "szTaxStoreLocationID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDLessThanOrEqualTo(String value) {
            addCriterion("szTaxStoreLocationID <=", value, "szTaxStoreLocationID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDLike(String value) {
            addCriterion("szTaxStoreLocationID like", value, "szTaxStoreLocationID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDNotLike(String value) {
            addCriterion("szTaxStoreLocationID not like", value, "szTaxStoreLocationID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDIn(List<String> values) {
            addCriterion("szTaxStoreLocationID in", values, "szTaxStoreLocationID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDNotIn(List<String> values) {
            addCriterion("szTaxStoreLocationID not in", values, "szTaxStoreLocationID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDBetween(String value1, String value2) {
            addCriterion("szTaxStoreLocationID between", value1, value2, "szTaxStoreLocationID");
            return (Criteria) this;
        }

        public Criteria andSzTaxStoreLocationIDNotBetween(String value1, String value2) {
            addCriterion("szTaxStoreLocationID not between", value1, value2, "szTaxStoreLocationID");
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

        public Criteria andSzGBoiUniqueCustomerIDIsNull() {
            addCriterion("szGBoiUniqueCustomerID is null");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDIsNotNull() {
            addCriterion("szGBoiUniqueCustomerID is not null");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDEqualTo(String value) {
            addCriterion("szGBoiUniqueCustomerID =", value, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDNotEqualTo(String value) {
            addCriterion("szGBoiUniqueCustomerID <>", value, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDGreaterThan(String value) {
            addCriterion("szGBoiUniqueCustomerID >", value, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDGreaterThanOrEqualTo(String value) {
            addCriterion("szGBoiUniqueCustomerID >=", value, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDLessThan(String value) {
            addCriterion("szGBoiUniqueCustomerID <", value, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDLessThanOrEqualTo(String value) {
            addCriterion("szGBoiUniqueCustomerID <=", value, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDLike(String value) {
            addCriterion("szGBoiUniqueCustomerID like", value, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDNotLike(String value) {
            addCriterion("szGBoiUniqueCustomerID not like", value, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDIn(List<String> values) {
            addCriterion("szGBoiUniqueCustomerID in", values, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDNotIn(List<String> values) {
            addCriterion("szGBoiUniqueCustomerID not in", values, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDBetween(String value1, String value2) {
            addCriterion("szGBoiUniqueCustomerID between", value1, value2, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueCustomerIDNotBetween(String value1, String value2) {
            addCriterion("szGBoiUniqueCustomerID not between", value1, value2, "szGBoiUniqueCustomerID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameIsNull() {
            addCriterion("szGBoiTFSUserName is null");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameIsNotNull() {
            addCriterion("szGBoiTFSUserName is not null");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameEqualTo(String value) {
            addCriterion("szGBoiTFSUserName =", value, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameNotEqualTo(String value) {
            addCriterion("szGBoiTFSUserName <>", value, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameGreaterThan(String value) {
            addCriterion("szGBoiTFSUserName >", value, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("szGBoiTFSUserName >=", value, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameLessThan(String value) {
            addCriterion("szGBoiTFSUserName <", value, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameLessThanOrEqualTo(String value) {
            addCriterion("szGBoiTFSUserName <=", value, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameLike(String value) {
            addCriterion("szGBoiTFSUserName like", value, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameNotLike(String value) {
            addCriterion("szGBoiTFSUserName not like", value, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameIn(List<String> values) {
            addCriterion("szGBoiTFSUserName in", values, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameNotIn(List<String> values) {
            addCriterion("szGBoiTFSUserName not in", values, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameBetween(String value1, String value2) {
            addCriterion("szGBoiTFSUserName between", value1, value2, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSUserNameNotBetween(String value1, String value2) {
            addCriterion("szGBoiTFSUserName not between", value1, value2, "szGBoiTFSUserName");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordIsNull() {
            addCriterion("szGBoiTFSPassword is null");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordIsNotNull() {
            addCriterion("szGBoiTFSPassword is not null");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordEqualTo(String value) {
            addCriterion("szGBoiTFSPassword =", value, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordNotEqualTo(String value) {
            addCriterion("szGBoiTFSPassword <>", value, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordGreaterThan(String value) {
            addCriterion("szGBoiTFSPassword >", value, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("szGBoiTFSPassword >=", value, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordLessThan(String value) {
            addCriterion("szGBoiTFSPassword <", value, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordLessThanOrEqualTo(String value) {
            addCriterion("szGBoiTFSPassword <=", value, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordLike(String value) {
            addCriterion("szGBoiTFSPassword like", value, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordNotLike(String value) {
            addCriterion("szGBoiTFSPassword not like", value, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordIn(List<String> values) {
            addCriterion("szGBoiTFSPassword in", values, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordNotIn(List<String> values) {
            addCriterion("szGBoiTFSPassword not in", values, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordBetween(String value1, String value2) {
            addCriterion("szGBoiTFSPassword between", value1, value2, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiTFSPasswordNotBetween(String value1, String value2) {
            addCriterion("szGBoiTFSPassword not between", value1, value2, "szGBoiTFSPassword");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDIsNull() {
            addCriterion("szGBoiUniqueMerchantID is null");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDIsNotNull() {
            addCriterion("szGBoiUniqueMerchantID is not null");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDEqualTo(String value) {
            addCriterion("szGBoiUniqueMerchantID =", value, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDNotEqualTo(String value) {
            addCriterion("szGBoiUniqueMerchantID <>", value, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDGreaterThan(String value) {
            addCriterion("szGBoiUniqueMerchantID >", value, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDGreaterThanOrEqualTo(String value) {
            addCriterion("szGBoiUniqueMerchantID >=", value, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDLessThan(String value) {
            addCriterion("szGBoiUniqueMerchantID <", value, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDLessThanOrEqualTo(String value) {
            addCriterion("szGBoiUniqueMerchantID <=", value, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDLike(String value) {
            addCriterion("szGBoiUniqueMerchantID like", value, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDNotLike(String value) {
            addCriterion("szGBoiUniqueMerchantID not like", value, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDIn(List<String> values) {
            addCriterion("szGBoiUniqueMerchantID in", values, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDNotIn(List<String> values) {
            addCriterion("szGBoiUniqueMerchantID not in", values, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDBetween(String value1, String value2) {
            addCriterion("szGBoiUniqueMerchantID between", value1, value2, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzGBoiUniqueMerchantIDNotBetween(String value1, String value2) {
            addCriterion("szGBoiUniqueMerchantID not between", value1, value2, "szGBoiUniqueMerchantID");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2IsNull() {
            addCriterion("szCompanyTaxNmbr2 is null");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2IsNotNull() {
            addCriterion("szCompanyTaxNmbr2 is not null");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2EqualTo(String value) {
            addCriterion("szCompanyTaxNmbr2 =", value, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2NotEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr2 <>", value, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2GreaterThan(String value) {
            addCriterion("szCompanyTaxNmbr2 >", value, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2GreaterThanOrEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr2 >=", value, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2LessThan(String value) {
            addCriterion("szCompanyTaxNmbr2 <", value, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2LessThanOrEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr2 <=", value, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2Like(String value) {
            addCriterion("szCompanyTaxNmbr2 like", value, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2NotLike(String value) {
            addCriterion("szCompanyTaxNmbr2 not like", value, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2In(List<String> values) {
            addCriterion("szCompanyTaxNmbr2 in", values, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2NotIn(List<String> values) {
            addCriterion("szCompanyTaxNmbr2 not in", values, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2Between(String value1, String value2) {
            addCriterion("szCompanyTaxNmbr2 between", value1, value2, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr2NotBetween(String value1, String value2) {
            addCriterion("szCompanyTaxNmbr2 not between", value1, value2, "szCompanyTaxNmbr2");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3IsNull() {
            addCriterion("szCompanyTaxNmbr3 is null");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3IsNotNull() {
            addCriterion("szCompanyTaxNmbr3 is not null");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3EqualTo(String value) {
            addCriterion("szCompanyTaxNmbr3 =", value, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3NotEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr3 <>", value, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3GreaterThan(String value) {
            addCriterion("szCompanyTaxNmbr3 >", value, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3GreaterThanOrEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr3 >=", value, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3LessThan(String value) {
            addCriterion("szCompanyTaxNmbr3 <", value, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3LessThanOrEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr3 <=", value, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3Like(String value) {
            addCriterion("szCompanyTaxNmbr3 like", value, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3NotLike(String value) {
            addCriterion("szCompanyTaxNmbr3 not like", value, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3In(List<String> values) {
            addCriterion("szCompanyTaxNmbr3 in", values, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3NotIn(List<String> values) {
            addCriterion("szCompanyTaxNmbr3 not in", values, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3Between(String value1, String value2) {
            addCriterion("szCompanyTaxNmbr3 between", value1, value2, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr3NotBetween(String value1, String value2) {
            addCriterion("szCompanyTaxNmbr3 not between", value1, value2, "szCompanyTaxNmbr3");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4IsNull() {
            addCriterion("szCompanyTaxNmbr4 is null");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4IsNotNull() {
            addCriterion("szCompanyTaxNmbr4 is not null");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4EqualTo(String value) {
            addCriterion("szCompanyTaxNmbr4 =", value, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4NotEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr4 <>", value, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4GreaterThan(String value) {
            addCriterion("szCompanyTaxNmbr4 >", value, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4GreaterThanOrEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr4 >=", value, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4LessThan(String value) {
            addCriterion("szCompanyTaxNmbr4 <", value, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4LessThanOrEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr4 <=", value, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4Like(String value) {
            addCriterion("szCompanyTaxNmbr4 like", value, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4NotLike(String value) {
            addCriterion("szCompanyTaxNmbr4 not like", value, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4In(List<String> values) {
            addCriterion("szCompanyTaxNmbr4 in", values, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4NotIn(List<String> values) {
            addCriterion("szCompanyTaxNmbr4 not in", values, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4Between(String value1, String value2) {
            addCriterion("szCompanyTaxNmbr4 between", value1, value2, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr4NotBetween(String value1, String value2) {
            addCriterion("szCompanyTaxNmbr4 not between", value1, value2, "szCompanyTaxNmbr4");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5IsNull() {
            addCriterion("szCompanyTaxNmbr5 is null");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5IsNotNull() {
            addCriterion("szCompanyTaxNmbr5 is not null");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5EqualTo(String value) {
            addCriterion("szCompanyTaxNmbr5 =", value, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5NotEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr5 <>", value, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5GreaterThan(String value) {
            addCriterion("szCompanyTaxNmbr5 >", value, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5GreaterThanOrEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr5 >=", value, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5LessThan(String value) {
            addCriterion("szCompanyTaxNmbr5 <", value, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5LessThanOrEqualTo(String value) {
            addCriterion("szCompanyTaxNmbr5 <=", value, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5Like(String value) {
            addCriterion("szCompanyTaxNmbr5 like", value, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5NotLike(String value) {
            addCriterion("szCompanyTaxNmbr5 not like", value, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5In(List<String> values) {
            addCriterion("szCompanyTaxNmbr5 in", values, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5NotIn(List<String> values) {
            addCriterion("szCompanyTaxNmbr5 not in", values, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5Between(String value1, String value2) {
            addCriterion("szCompanyTaxNmbr5 between", value1, value2, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andSzCompanyTaxNmbr5NotBetween(String value1, String value2) {
            addCriterion("szCompanyTaxNmbr5 not between", value1, value2, "szCompanyTaxNmbr5");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtIsNull() {
            addCriterion("lRolloverTransactionNmbrAt is null");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtIsNotNull() {
            addCriterion("lRolloverTransactionNmbrAt is not null");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtEqualTo(Integer value) {
            addCriterion("lRolloverTransactionNmbrAt =", value, "lRolloverTransactionNmbrAt");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtNotEqualTo(Integer value) {
            addCriterion("lRolloverTransactionNmbrAt <>", value, "lRolloverTransactionNmbrAt");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtGreaterThan(Integer value) {
            addCriterion("lRolloverTransactionNmbrAt >", value, "lRolloverTransactionNmbrAt");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("lRolloverTransactionNmbrAt >=", value, "lRolloverTransactionNmbrAt");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtLessThan(Integer value) {
            addCriterion("lRolloverTransactionNmbrAt <", value, "lRolloverTransactionNmbrAt");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtLessThanOrEqualTo(Integer value) {
            addCriterion("lRolloverTransactionNmbrAt <=", value, "lRolloverTransactionNmbrAt");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtIn(List<Integer> values) {
            addCriterion("lRolloverTransactionNmbrAt in", values, "lRolloverTransactionNmbrAt");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtNotIn(List<Integer> values) {
            addCriterion("lRolloverTransactionNmbrAt not in", values, "lRolloverTransactionNmbrAt");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtBetween(Integer value1, Integer value2) {
            addCriterion("lRolloverTransactionNmbrAt between", value1, value2, "lRolloverTransactionNmbrAt");
            return (Criteria) this;
        }

        public Criteria andLRolloverTransactionNmbrAtNotBetween(Integer value1, Integer value2) {
            addCriterion("lRolloverTransactionNmbrAt not between", value1, value2, "lRolloverTransactionNmbrAt");
            return (Criteria) this;
        }

        public Criteria andLChannelIDIsNull() {
            addCriterion("lChannelID is null");
            return (Criteria) this;
        }

        public Criteria andLChannelIDIsNotNull() {
            addCriterion("lChannelID is not null");
            return (Criteria) this;
        }

        public Criteria andLChannelIDEqualTo(Integer value) {
            addCriterion("lChannelID =", value, "lChannelID");
            return (Criteria) this;
        }

        public Criteria andLChannelIDNotEqualTo(Integer value) {
            addCriterion("lChannelID <>", value, "lChannelID");
            return (Criteria) this;
        }

        public Criteria andLChannelIDGreaterThan(Integer value) {
            addCriterion("lChannelID >", value, "lChannelID");
            return (Criteria) this;
        }

        public Criteria andLChannelIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("lChannelID >=", value, "lChannelID");
            return (Criteria) this;
        }

        public Criteria andLChannelIDLessThan(Integer value) {
            addCriterion("lChannelID <", value, "lChannelID");
            return (Criteria) this;
        }

        public Criteria andLChannelIDLessThanOrEqualTo(Integer value) {
            addCriterion("lChannelID <=", value, "lChannelID");
            return (Criteria) this;
        }

        public Criteria andLChannelIDIn(List<Integer> values) {
            addCriterion("lChannelID in", values, "lChannelID");
            return (Criteria) this;
        }

        public Criteria andLChannelIDNotIn(List<Integer> values) {
            addCriterion("lChannelID not in", values, "lChannelID");
            return (Criteria) this;
        }

        public Criteria andLChannelIDBetween(Integer value1, Integer value2) {
            addCriterion("lChannelID between", value1, value2, "lChannelID");
            return (Criteria) this;
        }

        public Criteria andLChannelIDNotBetween(Integer value1, Integer value2) {
            addCriterion("lChannelID not between", value1, value2, "lChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDIsNull() {
            addCriterion("szExternalChannelID is null");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDIsNotNull() {
            addCriterion("szExternalChannelID is not null");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDEqualTo(String value) {
            addCriterion("szExternalChannelID =", value, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDNotEqualTo(String value) {
            addCriterion("szExternalChannelID <>", value, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDGreaterThan(String value) {
            addCriterion("szExternalChannelID >", value, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDGreaterThanOrEqualTo(String value) {
            addCriterion("szExternalChannelID >=", value, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDLessThan(String value) {
            addCriterion("szExternalChannelID <", value, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDLessThanOrEqualTo(String value) {
            addCriterion("szExternalChannelID <=", value, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDLike(String value) {
            addCriterion("szExternalChannelID like", value, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDNotLike(String value) {
            addCriterion("szExternalChannelID not like", value, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDIn(List<String> values) {
            addCriterion("szExternalChannelID in", values, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDNotIn(List<String> values) {
            addCriterion("szExternalChannelID not in", values, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDBetween(String value1, String value2) {
            addCriterion("szExternalChannelID between", value1, value2, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzExternalChannelIDNotBetween(String value1, String value2) {
            addCriterion("szExternalChannelID not between", value1, value2, "szExternalChannelID");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeIsNull() {
            addCriterion("szAlpha2Code is null");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeIsNotNull() {
            addCriterion("szAlpha2Code is not null");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeEqualTo(String value) {
            addCriterion("szAlpha2Code =", value, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeNotEqualTo(String value) {
            addCriterion("szAlpha2Code <>", value, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeGreaterThan(String value) {
            addCriterion("szAlpha2Code >", value, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeGreaterThanOrEqualTo(String value) {
            addCriterion("szAlpha2Code >=", value, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeLessThan(String value) {
            addCriterion("szAlpha2Code <", value, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeLessThanOrEqualTo(String value) {
            addCriterion("szAlpha2Code <=", value, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeLike(String value) {
            addCriterion("szAlpha2Code like", value, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeNotLike(String value) {
            addCriterion("szAlpha2Code not like", value, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeIn(List<String> values) {
            addCriterion("szAlpha2Code in", values, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeNotIn(List<String> values) {
            addCriterion("szAlpha2Code not in", values, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeBetween(String value1, String value2) {
            addCriterion("szAlpha2Code between", value1, value2, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andSzAlpha2CodeNotBetween(String value1, String value2) {
            addCriterion("szAlpha2Code not between", value1, value2, "szAlpha2Code");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreIsNull() {
            addCriterion("bIsCountryReferenceStore is null");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreIsNotNull() {
            addCriterion("bIsCountryReferenceStore is not null");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreEqualTo(Short value) {
            addCriterion("bIsCountryReferenceStore =", value, "bIsCountryReferenceStore");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreNotEqualTo(Short value) {
            addCriterion("bIsCountryReferenceStore <>", value, "bIsCountryReferenceStore");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreGreaterThan(Short value) {
            addCriterion("bIsCountryReferenceStore >", value, "bIsCountryReferenceStore");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreGreaterThanOrEqualTo(Short value) {
            addCriterion("bIsCountryReferenceStore >=", value, "bIsCountryReferenceStore");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreLessThan(Short value) {
            addCriterion("bIsCountryReferenceStore <", value, "bIsCountryReferenceStore");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreLessThanOrEqualTo(Short value) {
            addCriterion("bIsCountryReferenceStore <=", value, "bIsCountryReferenceStore");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreIn(List<Short> values) {
            addCriterion("bIsCountryReferenceStore in", values, "bIsCountryReferenceStore");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreNotIn(List<Short> values) {
            addCriterion("bIsCountryReferenceStore not in", values, "bIsCountryReferenceStore");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreBetween(Short value1, Short value2) {
            addCriterion("bIsCountryReferenceStore between", value1, value2, "bIsCountryReferenceStore");
            return (Criteria) this;
        }

        public Criteria andBIsCountryReferenceStoreNotBetween(Short value1, Short value2) {
            addCriterion("bIsCountryReferenceStore not between", value1, value2, "bIsCountryReferenceStore");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCIsNull() {
            addCriterion("IM_bIsCDC is null");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCIsNotNull() {
            addCriterion("IM_bIsCDC is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCEqualTo(Integer value) {
            addCriterion("IM_bIsCDC =", value, "IM_bIsCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCNotEqualTo(Integer value) {
            addCriterion("IM_bIsCDC <>", value, "IM_bIsCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCGreaterThan(Integer value) {
            addCriterion("IM_bIsCDC >", value, "IM_bIsCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bIsCDC >=", value, "IM_bIsCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCLessThan(Integer value) {
            addCriterion("IM_bIsCDC <", value, "IM_bIsCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCLessThanOrEqualTo(Integer value) {
            addCriterion("IM_bIsCDC <=", value, "IM_bIsCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCIn(List<Integer> values) {
            addCriterion("IM_bIsCDC in", values, "IM_bIsCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCNotIn(List<Integer> values) {
            addCriterion("IM_bIsCDC not in", values, "IM_bIsCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCBetween(Integer value1, Integer value2) {
            addCriterion("IM_bIsCDC between", value1, value2, "IM_bIsCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsCDCNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bIsCDC not between", value1, value2, "IM_bIsCDC");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionIsNull() {
            addCriterion("IM_szRegionDescription is null");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionIsNotNull() {
            addCriterion("IM_szRegionDescription is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionEqualTo(String value) {
            addCriterion("IM_szRegionDescription =", value, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionNotEqualTo(String value) {
            addCriterion("IM_szRegionDescription <>", value, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionGreaterThan(String value) {
            addCriterion("IM_szRegionDescription >", value, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szRegionDescription >=", value, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionLessThan(String value) {
            addCriterion("IM_szRegionDescription <", value, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionLessThanOrEqualTo(String value) {
            addCriterion("IM_szRegionDescription <=", value, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionLike(String value) {
            addCriterion("IM_szRegionDescription like", value, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionNotLike(String value) {
            addCriterion("IM_szRegionDescription not like", value, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionIn(List<String> values) {
            addCriterion("IM_szRegionDescription in", values, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionNotIn(List<String> values) {
            addCriterion("IM_szRegionDescription not in", values, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionBetween(String value1, String value2) {
            addCriterion("IM_szRegionDescription between", value1, value2, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szRegionDescriptionNotBetween(String value1, String value2) {
            addCriterion("IM_szRegionDescription not between", value1, value2, "IM_szRegionDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonIsNull() {
            addCriterion("IM_szBlockingReason is null");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonIsNotNull() {
            addCriterion("IM_szBlockingReason is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonEqualTo(String value) {
            addCriterion("IM_szBlockingReason =", value, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonNotEqualTo(String value) {
            addCriterion("IM_szBlockingReason <>", value, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonGreaterThan(String value) {
            addCriterion("IM_szBlockingReason >", value, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szBlockingReason >=", value, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonLessThan(String value) {
            addCriterion("IM_szBlockingReason <", value, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonLessThanOrEqualTo(String value) {
            addCriterion("IM_szBlockingReason <=", value, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonLike(String value) {
            addCriterion("IM_szBlockingReason like", value, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonNotLike(String value) {
            addCriterion("IM_szBlockingReason not like", value, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonIn(List<String> values) {
            addCriterion("IM_szBlockingReason in", values, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonNotIn(List<String> values) {
            addCriterion("IM_szBlockingReason not in", values, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonBetween(String value1, String value2) {
            addCriterion("IM_szBlockingReason between", value1, value2, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonNotBetween(String value1, String value2) {
            addCriterion("IM_szBlockingReason not between", value1, value2, "IM_szBlockingReason");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextIsNull() {
            addCriterion("IM_szBlockingReasonText is null");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextIsNotNull() {
            addCriterion("IM_szBlockingReasonText is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextEqualTo(String value) {
            addCriterion("IM_szBlockingReasonText =", value, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextNotEqualTo(String value) {
            addCriterion("IM_szBlockingReasonText <>", value, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextGreaterThan(String value) {
            addCriterion("IM_szBlockingReasonText >", value, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szBlockingReasonText >=", value, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextLessThan(String value) {
            addCriterion("IM_szBlockingReasonText <", value, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextLessThanOrEqualTo(String value) {
            addCriterion("IM_szBlockingReasonText <=", value, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextLike(String value) {
            addCriterion("IM_szBlockingReasonText like", value, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextNotLike(String value) {
            addCriterion("IM_szBlockingReasonText not like", value, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextIn(List<String> values) {
            addCriterion("IM_szBlockingReasonText in", values, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextNotIn(List<String> values) {
            addCriterion("IM_szBlockingReasonText not in", values, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextBetween(String value1, String value2) {
            addCriterion("IM_szBlockingReasonText between", value1, value2, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingReasonTextNotBetween(String value1, String value2) {
            addCriterion("IM_szBlockingReasonText not between", value1, value2, "IM_szBlockingReasonText");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromIsNull() {
            addCriterion("IM_szBlockingDateFrom is null");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromIsNotNull() {
            addCriterion("IM_szBlockingDateFrom is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromEqualTo(String value) {
            addCriterion("IM_szBlockingDateFrom =", value, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromNotEqualTo(String value) {
            addCriterion("IM_szBlockingDateFrom <>", value, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromGreaterThan(String value) {
            addCriterion("IM_szBlockingDateFrom >", value, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szBlockingDateFrom >=", value, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromLessThan(String value) {
            addCriterion("IM_szBlockingDateFrom <", value, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromLessThanOrEqualTo(String value) {
            addCriterion("IM_szBlockingDateFrom <=", value, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromLike(String value) {
            addCriterion("IM_szBlockingDateFrom like", value, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromNotLike(String value) {
            addCriterion("IM_szBlockingDateFrom not like", value, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromIn(List<String> values) {
            addCriterion("IM_szBlockingDateFrom in", values, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromNotIn(List<String> values) {
            addCriterion("IM_szBlockingDateFrom not in", values, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromBetween(String value1, String value2) {
            addCriterion("IM_szBlockingDateFrom between", value1, value2, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateFromNotBetween(String value1, String value2) {
            addCriterion("IM_szBlockingDateFrom not between", value1, value2, "IM_szBlockingDateFrom");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToIsNull() {
            addCriterion("IM_szBlockingDateTo is null");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToIsNotNull() {
            addCriterion("IM_szBlockingDateTo is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToEqualTo(String value) {
            addCriterion("IM_szBlockingDateTo =", value, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToNotEqualTo(String value) {
            addCriterion("IM_szBlockingDateTo <>", value, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToGreaterThan(String value) {
            addCriterion("IM_szBlockingDateTo >", value, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szBlockingDateTo >=", value, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToLessThan(String value) {
            addCriterion("IM_szBlockingDateTo <", value, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToLessThanOrEqualTo(String value) {
            addCriterion("IM_szBlockingDateTo <=", value, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToLike(String value) {
            addCriterion("IM_szBlockingDateTo like", value, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToNotLike(String value) {
            addCriterion("IM_szBlockingDateTo not like", value, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToIn(List<String> values) {
            addCriterion("IM_szBlockingDateTo in", values, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToNotIn(List<String> values) {
            addCriterion("IM_szBlockingDateTo not in", values, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToBetween(String value1, String value2) {
            addCriterion("IM_szBlockingDateTo between", value1, value2, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szBlockingDateToNotBetween(String value1, String value2) {
            addCriterion("IM_szBlockingDateTo not between", value1, value2, "IM_szBlockingDateTo");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeIsNull() {
            addCriterion("IM_szStoreType is null");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeIsNotNull() {
            addCriterion("IM_szStoreType is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeEqualTo(String value) {
            addCriterion("IM_szStoreType =", value, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeNotEqualTo(String value) {
            addCriterion("IM_szStoreType <>", value, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeGreaterThan(String value) {
            addCriterion("IM_szStoreType >", value, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szStoreType >=", value, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeLessThan(String value) {
            addCriterion("IM_szStoreType <", value, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeLessThanOrEqualTo(String value) {
            addCriterion("IM_szStoreType <=", value, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeLike(String value) {
            addCriterion("IM_szStoreType like", value, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeNotLike(String value) {
            addCriterion("IM_szStoreType not like", value, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeIn(List<String> values) {
            addCriterion("IM_szStoreType in", values, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeNotIn(List<String> values) {
            addCriterion("IM_szStoreType not in", values, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeBetween(String value1, String value2) {
            addCriterion("IM_szStoreType between", value1, value2, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szStoreTypeNotBetween(String value1, String value2) {
            addCriterion("IM_szStoreType not between", value1, value2, "IM_szStoreType");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentIsNull() {
            addCriterion("IM_szDepartment is null");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentIsNotNull() {
            addCriterion("IM_szDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentEqualTo(String value) {
            addCriterion("IM_szDepartment =", value, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentNotEqualTo(String value) {
            addCriterion("IM_szDepartment <>", value, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentGreaterThan(String value) {
            addCriterion("IM_szDepartment >", value, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szDepartment >=", value, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentLessThan(String value) {
            addCriterion("IM_szDepartment <", value, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentLessThanOrEqualTo(String value) {
            addCriterion("IM_szDepartment <=", value, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentLike(String value) {
            addCriterion("IM_szDepartment like", value, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentNotLike(String value) {
            addCriterion("IM_szDepartment not like", value, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentIn(List<String> values) {
            addCriterion("IM_szDepartment in", values, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentNotIn(List<String> values) {
            addCriterion("IM_szDepartment not in", values, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentBetween(String value1, String value2) {
            addCriterion("IM_szDepartment between", value1, value2, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentNotBetween(String value1, String value2) {
            addCriterion("IM_szDepartment not between", value1, value2, "IM_szDepartment");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionIsNull() {
            addCriterion("IM_szDepartmentDescription is null");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionIsNotNull() {
            addCriterion("IM_szDepartmentDescription is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionEqualTo(String value) {
            addCriterion("IM_szDepartmentDescription =", value, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionNotEqualTo(String value) {
            addCriterion("IM_szDepartmentDescription <>", value, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionGreaterThan(String value) {
            addCriterion("IM_szDepartmentDescription >", value, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szDepartmentDescription >=", value, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionLessThan(String value) {
            addCriterion("IM_szDepartmentDescription <", value, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionLessThanOrEqualTo(String value) {
            addCriterion("IM_szDepartmentDescription <=", value, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionLike(String value) {
            addCriterion("IM_szDepartmentDescription like", value, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionNotLike(String value) {
            addCriterion("IM_szDepartmentDescription not like", value, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionIn(List<String> values) {
            addCriterion("IM_szDepartmentDescription in", values, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionNotIn(List<String> values) {
            addCriterion("IM_szDepartmentDescription not in", values, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionBetween(String value1, String value2) {
            addCriterion("IM_szDepartmentDescription between", value1, value2, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szDepartmentDescriptionNotBetween(String value1, String value2) {
            addCriterion("IM_szDepartmentDescription not between", value1, value2, "IM_szDepartmentDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateIsNull() {
            addCriterion("IM_szOpeningDate is null");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateIsNotNull() {
            addCriterion("IM_szOpeningDate is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateEqualTo(String value) {
            addCriterion("IM_szOpeningDate =", value, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateNotEqualTo(String value) {
            addCriterion("IM_szOpeningDate <>", value, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateGreaterThan(String value) {
            addCriterion("IM_szOpeningDate >", value, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szOpeningDate >=", value, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateLessThan(String value) {
            addCriterion("IM_szOpeningDate <", value, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateLessThanOrEqualTo(String value) {
            addCriterion("IM_szOpeningDate <=", value, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateLike(String value) {
            addCriterion("IM_szOpeningDate like", value, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateNotLike(String value) {
            addCriterion("IM_szOpeningDate not like", value, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateIn(List<String> values) {
            addCriterion("IM_szOpeningDate in", values, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateNotIn(List<String> values) {
            addCriterion("IM_szOpeningDate not in", values, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateBetween(String value1, String value2) {
            addCriterion("IM_szOpeningDate between", value1, value2, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szOpeningDateNotBetween(String value1, String value2) {
            addCriterion("IM_szOpeningDate not between", value1, value2, "IM_szOpeningDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateIsNull() {
            addCriterion("IM_szClosingDate is null");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateIsNotNull() {
            addCriterion("IM_szClosingDate is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateEqualTo(String value) {
            addCriterion("IM_szClosingDate =", value, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateNotEqualTo(String value) {
            addCriterion("IM_szClosingDate <>", value, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateGreaterThan(String value) {
            addCriterion("IM_szClosingDate >", value, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szClosingDate >=", value, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateLessThan(String value) {
            addCriterion("IM_szClosingDate <", value, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateLessThanOrEqualTo(String value) {
            addCriterion("IM_szClosingDate <=", value, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateLike(String value) {
            addCriterion("IM_szClosingDate like", value, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateNotLike(String value) {
            addCriterion("IM_szClosingDate not like", value, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateIn(List<String> values) {
            addCriterion("IM_szClosingDate in", values, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateNotIn(List<String> values) {
            addCriterion("IM_szClosingDate not in", values, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateBetween(String value1, String value2) {
            addCriterion("IM_szClosingDate between", value1, value2, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szClosingDateNotBetween(String value1, String value2) {
            addCriterion("IM_szClosingDate not between", value1, value2, "IM_szClosingDate");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeIsNull() {
            addCriterion("IM_szBuildingTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeIsNotNull() {
            addCriterion("IM_szBuildingTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeEqualTo(String value) {
            addCriterion("IM_szBuildingTypeCode =", value, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeNotEqualTo(String value) {
            addCriterion("IM_szBuildingTypeCode <>", value, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeGreaterThan(String value) {
            addCriterion("IM_szBuildingTypeCode >", value, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szBuildingTypeCode >=", value, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeLessThan(String value) {
            addCriterion("IM_szBuildingTypeCode <", value, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("IM_szBuildingTypeCode <=", value, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeLike(String value) {
            addCriterion("IM_szBuildingTypeCode like", value, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeNotLike(String value) {
            addCriterion("IM_szBuildingTypeCode not like", value, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeIn(List<String> values) {
            addCriterion("IM_szBuildingTypeCode in", values, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeNotIn(List<String> values) {
            addCriterion("IM_szBuildingTypeCode not in", values, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeBetween(String value1, String value2) {
            addCriterion("IM_szBuildingTypeCode between", value1, value2, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeCodeNotBetween(String value1, String value2) {
            addCriterion("IM_szBuildingTypeCode not between", value1, value2, "IM_szBuildingTypeCode");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionIsNull() {
            addCriterion("IM_szBuildingTypeDescription is null");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionIsNotNull() {
            addCriterion("IM_szBuildingTypeDescription is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionEqualTo(String value) {
            addCriterion("IM_szBuildingTypeDescription =", value, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionNotEqualTo(String value) {
            addCriterion("IM_szBuildingTypeDescription <>", value, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionGreaterThan(String value) {
            addCriterion("IM_szBuildingTypeDescription >", value, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szBuildingTypeDescription >=", value, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionLessThan(String value) {
            addCriterion("IM_szBuildingTypeDescription <", value, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionLessThanOrEqualTo(String value) {
            addCriterion("IM_szBuildingTypeDescription <=", value, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionLike(String value) {
            addCriterion("IM_szBuildingTypeDescription like", value, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionNotLike(String value) {
            addCriterion("IM_szBuildingTypeDescription not like", value, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionIn(List<String> values) {
            addCriterion("IM_szBuildingTypeDescription in", values, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionNotIn(List<String> values) {
            addCriterion("IM_szBuildingTypeDescription not in", values, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionBetween(String value1, String value2) {
            addCriterion("IM_szBuildingTypeDescription between", value1, value2, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szBuildingTypeDescriptionNotBetween(String value1, String value2) {
            addCriterion("IM_szBuildingTypeDescription not between", value1, value2, "IM_szBuildingTypeDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeIsNull() {
            addCriterion("IM_szFullDayOperationCode is null");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeIsNotNull() {
            addCriterion("IM_szFullDayOperationCode is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeEqualTo(String value) {
            addCriterion("IM_szFullDayOperationCode =", value, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeNotEqualTo(String value) {
            addCriterion("IM_szFullDayOperationCode <>", value, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeGreaterThan(String value) {
            addCriterion("IM_szFullDayOperationCode >", value, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szFullDayOperationCode >=", value, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeLessThan(String value) {
            addCriterion("IM_szFullDayOperationCode <", value, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeLessThanOrEqualTo(String value) {
            addCriterion("IM_szFullDayOperationCode <=", value, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeLike(String value) {
            addCriterion("IM_szFullDayOperationCode like", value, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeNotLike(String value) {
            addCriterion("IM_szFullDayOperationCode not like", value, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeIn(List<String> values) {
            addCriterion("IM_szFullDayOperationCode in", values, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeNotIn(List<String> values) {
            addCriterion("IM_szFullDayOperationCode not in", values, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeBetween(String value1, String value2) {
            addCriterion("IM_szFullDayOperationCode between", value1, value2, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationCodeNotBetween(String value1, String value2) {
            addCriterion("IM_szFullDayOperationCode not between", value1, value2, "IM_szFullDayOperationCode");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionIsNull() {
            addCriterion("IM_szFullDayOperationDescription is null");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionIsNotNull() {
            addCriterion("IM_szFullDayOperationDescription is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionEqualTo(String value) {
            addCriterion("IM_szFullDayOperationDescription =", value, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionNotEqualTo(String value) {
            addCriterion("IM_szFullDayOperationDescription <>", value, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionGreaterThan(String value) {
            addCriterion("IM_szFullDayOperationDescription >", value, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szFullDayOperationDescription >=", value, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionLessThan(String value) {
            addCriterion("IM_szFullDayOperationDescription <", value, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionLessThanOrEqualTo(String value) {
            addCriterion("IM_szFullDayOperationDescription <=", value, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionLike(String value) {
            addCriterion("IM_szFullDayOperationDescription like", value, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionNotLike(String value) {
            addCriterion("IM_szFullDayOperationDescription not like", value, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionIn(List<String> values) {
            addCriterion("IM_szFullDayOperationDescription in", values, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionNotIn(List<String> values) {
            addCriterion("IM_szFullDayOperationDescription not in", values, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionBetween(String value1, String value2) {
            addCriterion("IM_szFullDayOperationDescription between", value1, value2, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szFullDayOperationDescriptionNotBetween(String value1, String value2) {
            addCriterion("IM_szFullDayOperationDescription not between", value1, value2, "IM_szFullDayOperationDescription");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateIsNull() {
            addCriterion("IM_szEffectiveDate is null");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateIsNotNull() {
            addCriterion("IM_szEffectiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateEqualTo(String value) {
            addCriterion("IM_szEffectiveDate =", value, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateNotEqualTo(String value) {
            addCriterion("IM_szEffectiveDate <>", value, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateGreaterThan(String value) {
            addCriterion("IM_szEffectiveDate >", value, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateGreaterThanOrEqualTo(String value) {
            addCriterion("IM_szEffectiveDate >=", value, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateLessThan(String value) {
            addCriterion("IM_szEffectiveDate <", value, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateLessThanOrEqualTo(String value) {
            addCriterion("IM_szEffectiveDate <=", value, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateLike(String value) {
            addCriterion("IM_szEffectiveDate like", value, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateNotLike(String value) {
            addCriterion("IM_szEffectiveDate not like", value, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateIn(List<String> values) {
            addCriterion("IM_szEffectiveDate in", values, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateNotIn(List<String> values) {
            addCriterion("IM_szEffectiveDate not in", values, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateBetween(String value1, String value2) {
            addCriterion("IM_szEffectiveDate between", value1, value2, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_szEffectiveDateNotBetween(String value1, String value2) {
            addCriterion("IM_szEffectiveDate not between", value1, value2, "IM_szEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCIsNull() {
            addCriterion("IM_bIsReturnCDC is null");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCIsNotNull() {
            addCriterion("IM_bIsReturnCDC is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCEqualTo(Integer value) {
            addCriterion("IM_bIsReturnCDC =", value, "IM_bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCNotEqualTo(Integer value) {
            addCriterion("IM_bIsReturnCDC <>", value, "IM_bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCGreaterThan(Integer value) {
            addCriterion("IM_bIsReturnCDC >", value, "IM_bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bIsReturnCDC >=", value, "IM_bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCLessThan(Integer value) {
            addCriterion("IM_bIsReturnCDC <", value, "IM_bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCLessThanOrEqualTo(Integer value) {
            addCriterion("IM_bIsReturnCDC <=", value, "IM_bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCIn(List<Integer> values) {
            addCriterion("IM_bIsReturnCDC in", values, "IM_bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCNotIn(List<Integer> values) {
            addCriterion("IM_bIsReturnCDC not in", values, "IM_bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCBetween(Integer value1, Integer value2) {
            addCriterion("IM_bIsReturnCDC between", value1, value2, "IM_bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bIsReturnCDCNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bIsReturnCDC not between", value1, value2, "IM_bIsReturnCDC");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetIsNull() {
            addCriterion("IM_bUnconfirmedTimesheet is null");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetIsNotNull() {
            addCriterion("IM_bUnconfirmedTimesheet is not null");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetEqualTo(Integer value) {
            addCriterion("IM_bUnconfirmedTimesheet =", value, "IM_bUnconfirmedTimesheet");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetNotEqualTo(Integer value) {
            addCriterion("IM_bUnconfirmedTimesheet <>", value, "IM_bUnconfirmedTimesheet");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetGreaterThan(Integer value) {
            addCriterion("IM_bUnconfirmedTimesheet >", value, "IM_bUnconfirmedTimesheet");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetGreaterThanOrEqualTo(Integer value) {
            addCriterion("IM_bUnconfirmedTimesheet >=", value, "IM_bUnconfirmedTimesheet");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetLessThan(Integer value) {
            addCriterion("IM_bUnconfirmedTimesheet <", value, "IM_bUnconfirmedTimesheet");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetLessThanOrEqualTo(Integer value) {
            addCriterion("IM_bUnconfirmedTimesheet <=", value, "IM_bUnconfirmedTimesheet");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetIn(List<Integer> values) {
            addCriterion("IM_bUnconfirmedTimesheet in", values, "IM_bUnconfirmedTimesheet");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetNotIn(List<Integer> values) {
            addCriterion("IM_bUnconfirmedTimesheet not in", values, "IM_bUnconfirmedTimesheet");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetBetween(Integer value1, Integer value2) {
            addCriterion("IM_bUnconfirmedTimesheet between", value1, value2, "IM_bUnconfirmedTimesheet");
            return (Criteria) this;
        }

        public Criteria andIM_bUnconfirmedTimesheetNotBetween(Integer value1, Integer value2) {
            addCriterion("IM_bUnconfirmedTimesheet not between", value1, value2, "IM_bUnconfirmedTimesheet");
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