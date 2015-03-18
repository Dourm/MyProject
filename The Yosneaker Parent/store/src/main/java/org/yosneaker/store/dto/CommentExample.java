package org.yosneaker.store.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.yosneaker.store.common.Page;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public CommentExample() {
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

        public Criteria andArticleCommentIdIsNull() {
            addCriterion("article_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdIsNotNull() {
            addCriterion("article_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdEqualTo(Integer value) {
            addCriterion("article_comment_id =", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdNotEqualTo(Integer value) {
            addCriterion("article_comment_id <>", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdGreaterThan(Integer value) {
            addCriterion("article_comment_id >", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment_id >=", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdLessThan(Integer value) {
            addCriterion("article_comment_id <", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment_id <=", value, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdIn(List<Integer> values) {
            addCriterion("article_comment_id in", values, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdNotIn(List<Integer> values) {
            addCriterion("article_comment_id not in", values, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_id between", value1, value2, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_id not between", value1, value2, "articleCommentId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdIsNull() {
            addCriterion("article_comment_article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdIsNotNull() {
            addCriterion("article_comment_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdEqualTo(Integer value) {
            addCriterion("article_comment_article_id =", value, "articleCommentArticleId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdNotEqualTo(Integer value) {
            addCriterion("article_comment_article_id <>", value, "articleCommentArticleId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdGreaterThan(Integer value) {
            addCriterion("article_comment_article_id >", value, "articleCommentArticleId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment_article_id >=", value, "articleCommentArticleId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdLessThan(Integer value) {
            addCriterion("article_comment_article_id <", value, "articleCommentArticleId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment_article_id <=", value, "articleCommentArticleId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdIn(List<Integer> values) {
            addCriterion("article_comment_article_id in", values, "articleCommentArticleId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdNotIn(List<Integer> values) {
            addCriterion("article_comment_article_id not in", values, "articleCommentArticleId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_article_id between", value1, value2, "articleCommentArticleId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_article_id not between", value1, value2, "articleCommentArticleId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentIsNull() {
            addCriterion("article_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentIsNotNull() {
            addCriterion("article_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentEqualTo(String value) {
            addCriterion("article_comment_content =", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentNotEqualTo(String value) {
            addCriterion("article_comment_content <>", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentGreaterThan(String value) {
            addCriterion("article_comment_content >", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("article_comment_content >=", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentLessThan(String value) {
            addCriterion("article_comment_content <", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentLessThanOrEqualTo(String value) {
            addCriterion("article_comment_content <=", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentLike(String value) {
            addCriterion("article_comment_content like", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentNotLike(String value) {
            addCriterion("article_comment_content not like", value, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentIn(List<String> values) {
            addCriterion("article_comment_content in", values, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentNotIn(List<String> values) {
            addCriterion("article_comment_content not in", values, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentBetween(String value1, String value2) {
            addCriterion("article_comment_content between", value1, value2, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentNotBetween(String value1, String value2) {
            addCriterion("article_comment_content not between", value1, value2, "articleCommentContent");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdIsNull() {
            addCriterion("article_comment_account_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdIsNotNull() {
            addCriterion("article_comment_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdEqualTo(Integer value) {
            addCriterion("article_comment_account_id =", value, "articleCommentAccountId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdNotEqualTo(Integer value) {
            addCriterion("article_comment_account_id <>", value, "articleCommentAccountId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdGreaterThan(Integer value) {
            addCriterion("article_comment_account_id >", value, "articleCommentAccountId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment_account_id >=", value, "articleCommentAccountId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdLessThan(Integer value) {
            addCriterion("article_comment_account_id <", value, "articleCommentAccountId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment_account_id <=", value, "articleCommentAccountId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdIn(List<Integer> values) {
            addCriterion("article_comment_account_id in", values, "articleCommentAccountId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdNotIn(List<Integer> values) {
            addCriterion("article_comment_account_id not in", values, "articleCommentAccountId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_account_id between", value1, value2, "articleCommentAccountId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_account_id not between", value1, value2, "articleCommentAccountId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeIsNull() {
            addCriterion("article_comment_publish_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeIsNotNull() {
            addCriterion("article_comment_publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeEqualTo(Date value) {
            addCriterion("article_comment_publish_time =", value, "articleCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeNotEqualTo(Date value) {
            addCriterion("article_comment_publish_time <>", value, "articleCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeGreaterThan(Date value) {
            addCriterion("article_comment_publish_time >", value, "articleCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_comment_publish_time >=", value, "articleCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeLessThan(Date value) {
            addCriterion("article_comment_publish_time <", value, "articleCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("article_comment_publish_time <=", value, "articleCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeIn(List<Date> values) {
            addCriterion("article_comment_publish_time in", values, "articleCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeNotIn(List<Date> values) {
            addCriterion("article_comment_publish_time not in", values, "articleCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeBetween(Date value1, Date value2) {
            addCriterion("article_comment_publish_time between", value1, value2, "articleCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("article_comment_publish_time not between", value1, value2, "articleCommentPublishTime");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdIsNull() {
            addCriterion("article_comment_to_user_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdIsNotNull() {
            addCriterion("article_comment_to_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdEqualTo(Integer value) {
            addCriterion("article_comment_to_user_id =", value, "articleCommentToUserId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdNotEqualTo(Integer value) {
            addCriterion("article_comment_to_user_id <>", value, "articleCommentToUserId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdGreaterThan(Integer value) {
            addCriterion("article_comment_to_user_id >", value, "articleCommentToUserId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment_to_user_id >=", value, "articleCommentToUserId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdLessThan(Integer value) {
            addCriterion("article_comment_to_user_id <", value, "articleCommentToUserId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment_to_user_id <=", value, "articleCommentToUserId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdIn(List<Integer> values) {
            addCriterion("article_comment_to_user_id in", values, "articleCommentToUserId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdNotIn(List<Integer> values) {
            addCriterion("article_comment_to_user_id not in", values, "articleCommentToUserId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_to_user_id between", value1, value2, "articleCommentToUserId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentToUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_to_user_id not between", value1, value2, "articleCommentToUserId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberIsNull() {
            addCriterion("article_comment_top_number is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberIsNotNull() {
            addCriterion("article_comment_top_number is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberEqualTo(Integer value) {
            addCriterion("article_comment_top_number =", value, "articleCommentTopNumber");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberNotEqualTo(Integer value) {
            addCriterion("article_comment_top_number <>", value, "articleCommentTopNumber");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberGreaterThan(Integer value) {
            addCriterion("article_comment_top_number >", value, "articleCommentTopNumber");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment_top_number >=", value, "articleCommentTopNumber");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberLessThan(Integer value) {
            addCriterion("article_comment_top_number <", value, "articleCommentTopNumber");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment_top_number <=", value, "articleCommentTopNumber");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberIn(List<Integer> values) {
            addCriterion("article_comment_top_number in", values, "articleCommentTopNumber");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberNotIn(List<Integer> values) {
            addCriterion("article_comment_top_number not in", values, "articleCommentTopNumber");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_top_number between", value1, value2, "articleCommentTopNumber");
            return (Criteria) this;
        }

        public Criteria andArticleCommentTopNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_top_number not between", value1, value2, "articleCommentTopNumber");
            return (Criteria) this;
        }

        public Criteria andArticleCommentContentLikeInsensitive(String value) {
            addCriterion("upper(article_comment_content) like", value.toUpperCase(), "articleCommentContent");
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