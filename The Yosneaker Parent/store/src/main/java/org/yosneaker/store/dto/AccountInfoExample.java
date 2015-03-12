package org.yosneaker.store.dto;

import java.util.ArrayList;
import java.util.List;

import org.yosneaker.store.common.Page;

public class AccountInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public AccountInfoExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andAccountInformationIdIsNull() {
            addCriterion("account_information_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationIdIsNotNull() {
            addCriterion("account_information_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationIdEqualTo(Integer value) {
            addCriterion("account_information_id =", value, "accountInformationId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationIdNotEqualTo(Integer value) {
            addCriterion("account_information_id <>", value, "accountInformationId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationIdGreaterThan(Integer value) {
            addCriterion("account_information_id >", value, "accountInformationId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_information_id >=", value, "accountInformationId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationIdLessThan(Integer value) {
            addCriterion("account_information_id <", value, "accountInformationId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_information_id <=", value, "accountInformationId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationIdIn(List<Integer> values) {
            addCriterion("account_information_id in", values, "accountInformationId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationIdNotIn(List<Integer> values) {
            addCriterion("account_information_id not in", values, "accountInformationId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationIdBetween(Integer value1, Integer value2) {
            addCriterion("account_information_id between", value1, value2, "accountInformationId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_information_id not between", value1, value2, "accountInformationId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdIsNull() {
            addCriterion("account_information_account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdIsNotNull() {
            addCriterion("account_information_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdEqualTo(Integer value) {
            addCriterion("account_information_account_id =", value, "accountInformationAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdNotEqualTo(Integer value) {
            addCriterion("account_information_account_id <>", value, "accountInformationAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdGreaterThan(Integer value) {
            addCriterion("account_information_account_id >", value, "accountInformationAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_information_account_id >=", value, "accountInformationAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdLessThan(Integer value) {
            addCriterion("account_information_account_id <", value, "accountInformationAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_information_account_id <=", value, "accountInformationAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdIn(List<Integer> values) {
            addCriterion("account_information_account_id in", values, "accountInformationAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdNotIn(List<Integer> values) {
            addCriterion("account_information_account_id not in", values, "accountInformationAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_information_account_id between", value1, value2, "accountInformationAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_information_account_id not between", value1, value2, "accountInformationAccountId");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureIsNull() {
            addCriterion("account_information_stature is null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureIsNotNull() {
            addCriterion("account_information_stature is not null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureEqualTo(Float value) {
            addCriterion("account_information_stature =", value, "accountInformationStature");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureNotEqualTo(Float value) {
            addCriterion("account_information_stature <>", value, "accountInformationStature");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureGreaterThan(Float value) {
            addCriterion("account_information_stature >", value, "accountInformationStature");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureGreaterThanOrEqualTo(Float value) {
            addCriterion("account_information_stature >=", value, "accountInformationStature");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureLessThan(Float value) {
            addCriterion("account_information_stature <", value, "accountInformationStature");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureLessThanOrEqualTo(Float value) {
            addCriterion("account_information_stature <=", value, "accountInformationStature");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureIn(List<Float> values) {
            addCriterion("account_information_stature in", values, "accountInformationStature");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureNotIn(List<Float> values) {
            addCriterion("account_information_stature not in", values, "accountInformationStature");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureBetween(Float value1, Float value2) {
            addCriterion("account_information_stature between", value1, value2, "accountInformationStature");
            return (Criteria) this;
        }

        public Criteria andAccountInformationStatureNotBetween(Float value1, Float value2) {
            addCriterion("account_information_stature not between", value1, value2, "accountInformationStature");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeIsNull() {
            addCriterion("account_information_age is null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeIsNotNull() {
            addCriterion("account_information_age is not null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeEqualTo(Integer value) {
            addCriterion("account_information_age =", value, "accountInformationAge");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeNotEqualTo(Integer value) {
            addCriterion("account_information_age <>", value, "accountInformationAge");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeGreaterThan(Integer value) {
            addCriterion("account_information_age >", value, "accountInformationAge");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_information_age >=", value, "accountInformationAge");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeLessThan(Integer value) {
            addCriterion("account_information_age <", value, "accountInformationAge");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeLessThanOrEqualTo(Integer value) {
            addCriterion("account_information_age <=", value, "accountInformationAge");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeIn(List<Integer> values) {
            addCriterion("account_information_age in", values, "accountInformationAge");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeNotIn(List<Integer> values) {
            addCriterion("account_information_age not in", values, "accountInformationAge");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeBetween(Integer value1, Integer value2) {
            addCriterion("account_information_age between", value1, value2, "accountInformationAge");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("account_information_age not between", value1, value2, "accountInformationAge");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightIsNull() {
            addCriterion("account_information_weight is null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightIsNotNull() {
            addCriterion("account_information_weight is not null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightEqualTo(Float value) {
            addCriterion("account_information_weight =", value, "accountInformationWeight");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightNotEqualTo(Float value) {
            addCriterion("account_information_weight <>", value, "accountInformationWeight");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightGreaterThan(Float value) {
            addCriterion("account_information_weight >", value, "accountInformationWeight");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("account_information_weight >=", value, "accountInformationWeight");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightLessThan(Float value) {
            addCriterion("account_information_weight <", value, "accountInformationWeight");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightLessThanOrEqualTo(Float value) {
            addCriterion("account_information_weight <=", value, "accountInformationWeight");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightIn(List<Float> values) {
            addCriterion("account_information_weight in", values, "accountInformationWeight");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightNotIn(List<Float> values) {
            addCriterion("account_information_weight not in", values, "accountInformationWeight");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightBetween(Float value1, Float value2) {
            addCriterion("account_information_weight between", value1, value2, "accountInformationWeight");
            return (Criteria) this;
        }

        public Criteria andAccountInformationWeightNotBetween(Float value1, Float value2) {
            addCriterion("account_information_weight not between", value1, value2, "accountInformationWeight");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceIsNull() {
            addCriterion("account_information_bounce is null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceIsNotNull() {
            addCriterion("account_information_bounce is not null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceEqualTo(Float value) {
            addCriterion("account_information_bounce =", value, "accountInformationBounce");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceNotEqualTo(Float value) {
            addCriterion("account_information_bounce <>", value, "accountInformationBounce");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceGreaterThan(Float value) {
            addCriterion("account_information_bounce >", value, "accountInformationBounce");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceGreaterThanOrEqualTo(Float value) {
            addCriterion("account_information_bounce >=", value, "accountInformationBounce");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceLessThan(Float value) {
            addCriterion("account_information_bounce <", value, "accountInformationBounce");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceLessThanOrEqualTo(Float value) {
            addCriterion("account_information_bounce <=", value, "accountInformationBounce");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceIn(List<Float> values) {
            addCriterion("account_information_bounce in", values, "accountInformationBounce");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceNotIn(List<Float> values) {
            addCriterion("account_information_bounce not in", values, "accountInformationBounce");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceBetween(Float value1, Float value2) {
            addCriterion("account_information_bounce between", value1, value2, "accountInformationBounce");
            return (Criteria) this;
        }

        public Criteria andAccountInformationBounceNotBetween(Float value1, Float value2) {
            addCriterion("account_information_bounce not between", value1, value2, "accountInformationBounce");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionIsNull() {
            addCriterion("account_information_position is null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionIsNotNull() {
            addCriterion("account_information_position is not null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionEqualTo(String value) {
            addCriterion("account_information_position =", value, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionNotEqualTo(String value) {
            addCriterion("account_information_position <>", value, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionGreaterThan(String value) {
            addCriterion("account_information_position >", value, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionGreaterThanOrEqualTo(String value) {
            addCriterion("account_information_position >=", value, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionLessThan(String value) {
            addCriterion("account_information_position <", value, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionLessThanOrEqualTo(String value) {
            addCriterion("account_information_position <=", value, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionLike(String value) {
            addCriterion("account_information_position like", value, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionNotLike(String value) {
            addCriterion("account_information_position not like", value, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionIn(List<String> values) {
            addCriterion("account_information_position in", values, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionNotIn(List<String> values) {
            addCriterion("account_information_position not in", values, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionBetween(String value1, String value2) {
            addCriterion("account_information_position between", value1, value2, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionNotBetween(String value1, String value2) {
            addCriterion("account_information_position not between", value1, value2, "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityIsNull() {
            addCriterion("account_information_ability is null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityIsNotNull() {
            addCriterion("account_information_ability is not null");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityEqualTo(String value) {
            addCriterion("account_information_ability =", value, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityNotEqualTo(String value) {
            addCriterion("account_information_ability <>", value, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityGreaterThan(String value) {
            addCriterion("account_information_ability >", value, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("account_information_ability >=", value, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityLessThan(String value) {
            addCriterion("account_information_ability <", value, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityLessThanOrEqualTo(String value) {
            addCriterion("account_information_ability <=", value, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityLike(String value) {
            addCriterion("account_information_ability like", value, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityNotLike(String value) {
            addCriterion("account_information_ability not like", value, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityIn(List<String> values) {
            addCriterion("account_information_ability in", values, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityNotIn(List<String> values) {
            addCriterion("account_information_ability not in", values, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityBetween(String value1, String value2) {
            addCriterion("account_information_ability between", value1, value2, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityNotBetween(String value1, String value2) {
            addCriterion("account_information_ability not between", value1, value2, "accountInformationAbility");
            return (Criteria) this;
        }

        public Criteria andAccountInformationPositionLikeInsensitive(String value) {
            addCriterion("upper(account_information_position) like", value.toUpperCase(), "accountInformationPosition");
            return (Criteria) this;
        }

        public Criteria andAccountInformationAbilityLikeInsensitive(String value) {
            addCriterion("upper(account_information_ability) like", value.toUpperCase(), "accountInformationAbility");
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