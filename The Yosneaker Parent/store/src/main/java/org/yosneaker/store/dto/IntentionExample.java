package org.yosneaker.store.dto;

import java.util.ArrayList;
import java.util.List;
import org.yosneaker.store.common.Page;

public class IntentionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public IntentionExample() {
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

        public Criteria andIntentionModelIdIsNull() {
            addCriterion("intention_model_id is null");
            return (Criteria) this;
        }

        public Criteria andIntentionModelIdIsNotNull() {
            addCriterion("intention_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionModelIdEqualTo(Integer value) {
            addCriterion("intention_model_id =", value, "intentionModelId");
            return (Criteria) this;
        }

        public Criteria andIntentionModelIdNotEqualTo(Integer value) {
            addCriterion("intention_model_id <>", value, "intentionModelId");
            return (Criteria) this;
        }

        public Criteria andIntentionModelIdGreaterThan(Integer value) {
            addCriterion("intention_model_id >", value, "intentionModelId");
            return (Criteria) this;
        }

        public Criteria andIntentionModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("intention_model_id >=", value, "intentionModelId");
            return (Criteria) this;
        }

        public Criteria andIntentionModelIdLessThan(Integer value) {
            addCriterion("intention_model_id <", value, "intentionModelId");
            return (Criteria) this;
        }

        public Criteria andIntentionModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("intention_model_id <=", value, "intentionModelId");
            return (Criteria) this;
        }

        public Criteria andIntentionModelIdIn(List<Integer> values) {
            addCriterion("intention_model_id in", values, "intentionModelId");
            return (Criteria) this;
        }

        public Criteria andIntentionModelIdNotIn(List<Integer> values) {
            addCriterion("intention_model_id not in", values, "intentionModelId");
            return (Criteria) this;
        }

        public Criteria andIntentionModelIdBetween(Integer value1, Integer value2) {
            addCriterion("intention_model_id between", value1, value2, "intentionModelId");
            return (Criteria) this;
        }

        public Criteria andIntentionModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("intention_model_id not between", value1, value2, "intentionModelId");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdIsNull() {
            addCriterion("intention_account_id is null");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdIsNotNull() {
            addCriterion("intention_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdEqualTo(Integer value) {
            addCriterion("intention_account_id =", value, "intentionAccountId");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdNotEqualTo(Integer value) {
            addCriterion("intention_account_id <>", value, "intentionAccountId");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdGreaterThan(Integer value) {
            addCriterion("intention_account_id >", value, "intentionAccountId");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("intention_account_id >=", value, "intentionAccountId");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdLessThan(Integer value) {
            addCriterion("intention_account_id <", value, "intentionAccountId");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("intention_account_id <=", value, "intentionAccountId");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdIn(List<Integer> values) {
            addCriterion("intention_account_id in", values, "intentionAccountId");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdNotIn(List<Integer> values) {
            addCriterion("intention_account_id not in", values, "intentionAccountId");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("intention_account_id between", value1, value2, "intentionAccountId");
            return (Criteria) this;
        }

        public Criteria andIntentionAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("intention_account_id not between", value1, value2, "intentionAccountId");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeIsNull() {
            addCriterion("intention_article_type is null");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeIsNotNull() {
            addCriterion("intention_article_type is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeEqualTo(Integer value) {
            addCriterion("intention_article_type =", value, "intentionArticleType");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeNotEqualTo(Integer value) {
            addCriterion("intention_article_type <>", value, "intentionArticleType");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeGreaterThan(Integer value) {
            addCriterion("intention_article_type >", value, "intentionArticleType");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("intention_article_type >=", value, "intentionArticleType");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeLessThan(Integer value) {
            addCriterion("intention_article_type <", value, "intentionArticleType");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("intention_article_type <=", value, "intentionArticleType");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeIn(List<Integer> values) {
            addCriterion("intention_article_type in", values, "intentionArticleType");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeNotIn(List<Integer> values) {
            addCriterion("intention_article_type not in", values, "intentionArticleType");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeBetween(Integer value1, Integer value2) {
            addCriterion("intention_article_type between", value1, value2, "intentionArticleType");
            return (Criteria) this;
        }

        public Criteria andIntentionArticleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("intention_article_type not between", value1, value2, "intentionArticleType");
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