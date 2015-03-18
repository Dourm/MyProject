package org.yosneaker.store.dto;

import java.util.ArrayList;
import java.util.List;

import org.yosneaker.store.common.Page;

public class ArticleItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ArticleItemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemTitleIsNull() {
            addCriterion("item_title is null");
            return (Criteria) this;
        }

        public Criteria andItemTitleIsNotNull() {
            addCriterion("item_title is not null");
            return (Criteria) this;
        }

        public Criteria andItemTitleEqualTo(String value) {
            addCriterion("item_title =", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotEqualTo(String value) {
            addCriterion("item_title <>", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleGreaterThan(String value) {
            addCriterion("item_title >", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleGreaterThanOrEqualTo(String value) {
            addCriterion("item_title >=", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLessThan(String value) {
            addCriterion("item_title <", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLessThanOrEqualTo(String value) {
            addCriterion("item_title <=", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLike(String value) {
            addCriterion("item_title like", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotLike(String value) {
            addCriterion("item_title not like", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleIn(List<String> values) {
            addCriterion("item_title in", values, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotIn(List<String> values) {
            addCriterion("item_title not in", values, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleBetween(String value1, String value2) {
            addCriterion("item_title between", value1, value2, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotBetween(String value1, String value2) {
            addCriterion("item_title not between", value1, value2, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemLevelIsNull() {
            addCriterion("item_level is null");
            return (Criteria) this;
        }

        public Criteria andItemLevelIsNotNull() {
            addCriterion("item_level is not null");
            return (Criteria) this;
        }

        public Criteria andItemLevelEqualTo(Integer value) {
            addCriterion("item_level =", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelNotEqualTo(Integer value) {
            addCriterion("item_level <>", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelGreaterThan(Integer value) {
            addCriterion("item_level >", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_level >=", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelLessThan(Integer value) {
            addCriterion("item_level <", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelLessThanOrEqualTo(Integer value) {
            addCriterion("item_level <=", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelIn(List<Integer> values) {
            addCriterion("item_level in", values, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelNotIn(List<Integer> values) {
            addCriterion("item_level not in", values, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelBetween(Integer value1, Integer value2) {
            addCriterion("item_level between", value1, value2, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("item_level not between", value1, value2, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemContentIsNull() {
            addCriterion("item_content is null");
            return (Criteria) this;
        }

        public Criteria andItemContentIsNotNull() {
            addCriterion("item_content is not null");
            return (Criteria) this;
        }

        public Criteria andItemContentEqualTo(String value) {
            addCriterion("item_content =", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentNotEqualTo(String value) {
            addCriterion("item_content <>", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentGreaterThan(String value) {
            addCriterion("item_content >", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentGreaterThanOrEqualTo(String value) {
            addCriterion("item_content >=", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentLessThan(String value) {
            addCriterion("item_content <", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentLessThanOrEqualTo(String value) {
            addCriterion("item_content <=", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentLike(String value) {
            addCriterion("item_content like", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentNotLike(String value) {
            addCriterion("item_content not like", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentIn(List<String> values) {
            addCriterion("item_content in", values, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentNotIn(List<String> values) {
            addCriterion("item_content not in", values, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentBetween(String value1, String value2) {
            addCriterion("item_content between", value1, value2, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentNotBetween(String value1, String value2) {
            addCriterion("item_content not between", value1, value2, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemImagesIsNull() {
            addCriterion("item_images is null");
            return (Criteria) this;
        }

        public Criteria andItemImagesIsNotNull() {
            addCriterion("item_images is not null");
            return (Criteria) this;
        }

        public Criteria andItemImagesEqualTo(String value) {
            addCriterion("item_images =", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesNotEqualTo(String value) {
            addCriterion("item_images <>", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesGreaterThan(String value) {
            addCriterion("item_images >", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesGreaterThanOrEqualTo(String value) {
            addCriterion("item_images >=", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesLessThan(String value) {
            addCriterion("item_images <", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesLessThanOrEqualTo(String value) {
            addCriterion("item_images <=", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesLike(String value) {
            addCriterion("item_images like", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesNotLike(String value) {
            addCriterion("item_images not like", value, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesIn(List<String> values) {
            addCriterion("item_images in", values, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesNotIn(List<String> values) {
            addCriterion("item_images not in", values, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesBetween(String value1, String value2) {
            addCriterion("item_images between", value1, value2, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemImagesNotBetween(String value1, String value2) {
            addCriterion("item_images not between", value1, value2, "itemImages");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdIsNull() {
            addCriterion("item_article_id is null");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdIsNotNull() {
            addCriterion("item_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdEqualTo(Integer value) {
            addCriterion("item_article_id =", value, "itemArticleId");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdNotEqualTo(Integer value) {
            addCriterion("item_article_id <>", value, "itemArticleId");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdGreaterThan(Integer value) {
            addCriterion("item_article_id >", value, "itemArticleId");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_article_id >=", value, "itemArticleId");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdLessThan(Integer value) {
            addCriterion("item_article_id <", value, "itemArticleId");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_article_id <=", value, "itemArticleId");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdIn(List<Integer> values) {
            addCriterion("item_article_id in", values, "itemArticleId");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdNotIn(List<Integer> values) {
            addCriterion("item_article_id not in", values, "itemArticleId");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("item_article_id between", value1, value2, "itemArticleId");
            return (Criteria) this;
        }

        public Criteria andItemArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_article_id not between", value1, value2, "itemArticleId");
            return (Criteria) this;
        }

        public Criteria andItemTitleLikeInsensitive(String value) {
            addCriterion("upper(item_title) like", value.toUpperCase(), "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemContentLikeInsensitive(String value) {
            addCriterion("upper(item_content) like", value.toUpperCase(), "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemImagesLikeInsensitive(String value) {
            addCriterion("upper(item_images) like", value.toUpperCase(), "itemImages");
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