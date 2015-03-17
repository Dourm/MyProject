package org.yosneaker.store.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.yosneaker.store.common.Page;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ArticleExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionIsNull() {
            addCriterion("article_description is null");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionIsNotNull() {
            addCriterion("article_description is not null");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionEqualTo(String value) {
            addCriterion("article_description =", value, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionNotEqualTo(String value) {
            addCriterion("article_description <>", value, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionGreaterThan(String value) {
            addCriterion("article_description >", value, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("article_description >=", value, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionLessThan(String value) {
            addCriterion("article_description <", value, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionLessThanOrEqualTo(String value) {
            addCriterion("article_description <=", value, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionLike(String value) {
            addCriterion("article_description like", value, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionNotLike(String value) {
            addCriterion("article_description not like", value, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionIn(List<String> values) {
            addCriterion("article_description in", values, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionNotIn(List<String> values) {
            addCriterion("article_description not in", values, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionBetween(String value1, String value2) {
            addCriterion("article_description between", value1, value2, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionNotBetween(String value1, String value2) {
            addCriterion("article_description not between", value1, value2, "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIsNull() {
            addCriterion("article_comment is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIsNotNull() {
            addCriterion("article_comment is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentEqualTo(String value) {
            addCriterion("article_comment =", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentNotEqualTo(String value) {
            addCriterion("article_comment <>", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentGreaterThan(String value) {
            addCriterion("article_comment >", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentGreaterThanOrEqualTo(String value) {
            addCriterion("article_comment >=", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLessThan(String value) {
            addCriterion("article_comment <", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLessThanOrEqualTo(String value) {
            addCriterion("article_comment <=", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLike(String value) {
            addCriterion("article_comment like", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentNotLike(String value) {
            addCriterion("article_comment not like", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIn(List<String> values) {
            addCriterion("article_comment in", values, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentNotIn(List<String> values) {
            addCriterion("article_comment not in", values, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentBetween(String value1, String value2) {
            addCriterion("article_comment between", value1, value2, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentNotBetween(String value1, String value2) {
            addCriterion("article_comment not between", value1, value2, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleLevelIsNull() {
            addCriterion("article_level is null");
            return (Criteria) this;
        }

        public Criteria andArticleLevelIsNotNull() {
            addCriterion("article_level is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLevelEqualTo(Integer value) {
            addCriterion("article_level =", value, "articleLevel");
            return (Criteria) this;
        }

        public Criteria andArticleLevelNotEqualTo(Integer value) {
            addCriterion("article_level <>", value, "articleLevel");
            return (Criteria) this;
        }

        public Criteria andArticleLevelGreaterThan(Integer value) {
            addCriterion("article_level >", value, "articleLevel");
            return (Criteria) this;
        }

        public Criteria andArticleLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_level >=", value, "articleLevel");
            return (Criteria) this;
        }

        public Criteria andArticleLevelLessThan(Integer value) {
            addCriterion("article_level <", value, "articleLevel");
            return (Criteria) this;
        }

        public Criteria andArticleLevelLessThanOrEqualTo(Integer value) {
            addCriterion("article_level <=", value, "articleLevel");
            return (Criteria) this;
        }

        public Criteria andArticleLevelIn(List<Integer> values) {
            addCriterion("article_level in", values, "articleLevel");
            return (Criteria) this;
        }

        public Criteria andArticleLevelNotIn(List<Integer> values) {
            addCriterion("article_level not in", values, "articleLevel");
            return (Criteria) this;
        }

        public Criteria andArticleLevelBetween(Integer value1, Integer value2) {
            addCriterion("article_level between", value1, value2, "articleLevel");
            return (Criteria) this;
        }

        public Criteria andArticleLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("article_level not between", value1, value2, "articleLevel");
            return (Criteria) this;
        }

        public Criteria andArticleImagesIsNull() {
            addCriterion("article_images is null");
            return (Criteria) this;
        }

        public Criteria andArticleImagesIsNotNull() {
            addCriterion("article_images is not null");
            return (Criteria) this;
        }

        public Criteria andArticleImagesEqualTo(String value) {
            addCriterion("article_images =", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesNotEqualTo(String value) {
            addCriterion("article_images <>", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesGreaterThan(String value) {
            addCriterion("article_images >", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesGreaterThanOrEqualTo(String value) {
            addCriterion("article_images >=", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesLessThan(String value) {
            addCriterion("article_images <", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesLessThanOrEqualTo(String value) {
            addCriterion("article_images <=", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesLike(String value) {
            addCriterion("article_images like", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesNotLike(String value) {
            addCriterion("article_images not like", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesIn(List<String> values) {
            addCriterion("article_images in", values, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesNotIn(List<String> values) {
            addCriterion("article_images not in", values, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesBetween(String value1, String value2) {
            addCriterion("article_images between", value1, value2, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesNotBetween(String value1, String value2) {
            addCriterion("article_images not between", value1, value2, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdIsNull() {
            addCriterion("article_author_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdIsNotNull() {
            addCriterion("article_author_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdEqualTo(Integer value) {
            addCriterion("article_author_id =", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdNotEqualTo(Integer value) {
            addCriterion("article_author_id <>", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdGreaterThan(Integer value) {
            addCriterion("article_author_id >", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_author_id >=", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdLessThan(Integer value) {
            addCriterion("article_author_id <", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_author_id <=", value, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdIn(List<Integer> values) {
            addCriterion("article_author_id in", values, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdNotIn(List<Integer> values) {
            addCriterion("article_author_id not in", values, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("article_author_id between", value1, value2, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_author_id not between", value1, value2, "articleAuthorId");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeIsNull() {
            addCriterion("article_create_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeIsNotNull() {
            addCriterion("article_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeEqualTo(Date value) {
            addCriterion("article_create_time =", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeNotEqualTo(Date value) {
            addCriterion("article_create_time <>", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeGreaterThan(Date value) {
            addCriterion("article_create_time >", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_create_time >=", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeLessThan(Date value) {
            addCriterion("article_create_time <", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("article_create_time <=", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeIn(List<Date> values) {
            addCriterion("article_create_time in", values, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeNotIn(List<Date> values) {
            addCriterion("article_create_time not in", values, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("article_create_time between", value1, value2, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("article_create_time not between", value1, value2, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountIsNull() {
            addCriterion("article_read_count is null");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountIsNotNull() {
            addCriterion("article_read_count is not null");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountEqualTo(Integer value) {
            addCriterion("article_read_count =", value, "articleReadCount");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountNotEqualTo(Integer value) {
            addCriterion("article_read_count <>", value, "articleReadCount");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountGreaterThan(Integer value) {
            addCriterion("article_read_count >", value, "articleReadCount");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_read_count >=", value, "articleReadCount");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountLessThan(Integer value) {
            addCriterion("article_read_count <", value, "articleReadCount");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("article_read_count <=", value, "articleReadCount");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountIn(List<Integer> values) {
            addCriterion("article_read_count in", values, "articleReadCount");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountNotIn(List<Integer> values) {
            addCriterion("article_read_count not in", values, "articleReadCount");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountBetween(Integer value1, Integer value2) {
            addCriterion("article_read_count between", value1, value2, "articleReadCount");
            return (Criteria) this;
        }

        public Criteria andArticleReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("article_read_count not between", value1, value2, "articleReadCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountIsNull() {
            addCriterion("article_comment_count is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountIsNotNull() {
            addCriterion("article_comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountEqualTo(Integer value) {
            addCriterion("article_comment_count =", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountNotEqualTo(Integer value) {
            addCriterion("article_comment_count <>", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountGreaterThan(Integer value) {
            addCriterion("article_comment_count >", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment_count >=", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountLessThan(Integer value) {
            addCriterion("article_comment_count <", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment_count <=", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountIn(List<Integer> values) {
            addCriterion("article_comment_count in", values, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountNotIn(List<Integer> values) {
            addCriterion("article_comment_count not in", values, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_count between", value1, value2, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_count not between", value1, value2, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountIsNull() {
            addCriterion("article_comment_like_count is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountIsNotNull() {
            addCriterion("article_comment_like_count is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountEqualTo(Integer value) {
            addCriterion("article_comment_like_count =", value, "articleCommentLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountNotEqualTo(Integer value) {
            addCriterion("article_comment_like_count <>", value, "articleCommentLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountGreaterThan(Integer value) {
            addCriterion("article_comment_like_count >", value, "articleCommentLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment_like_count >=", value, "articleCommentLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountLessThan(Integer value) {
            addCriterion("article_comment_like_count <", value, "articleCommentLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment_like_count <=", value, "articleCommentLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountIn(List<Integer> values) {
            addCriterion("article_comment_like_count in", values, "articleCommentLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountNotIn(List<Integer> values) {
            addCriterion("article_comment_like_count not in", values, "articleCommentLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_like_count between", value1, value2, "articleCommentLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_like_count not between", value1, value2, "articleCommentLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyIsNull() {
            addCriterion("article_last_modify is null");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyIsNotNull() {
            addCriterion("article_last_modify is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyEqualTo(Date value) {
            addCriterion("article_last_modify =", value, "articleLastModify");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyNotEqualTo(Date value) {
            addCriterion("article_last_modify <>", value, "articleLastModify");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyGreaterThan(Date value) {
            addCriterion("article_last_modify >", value, "articleLastModify");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("article_last_modify >=", value, "articleLastModify");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyLessThan(Date value) {
            addCriterion("article_last_modify <", value, "articleLastModify");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyLessThanOrEqualTo(Date value) {
            addCriterion("article_last_modify <=", value, "articleLastModify");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyIn(List<Date> values) {
            addCriterion("article_last_modify in", values, "articleLastModify");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyNotIn(List<Date> values) {
            addCriterion("article_last_modify not in", values, "articleLastModify");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyBetween(Date value1, Date value2) {
            addCriterion("article_last_modify between", value1, value2, "articleLastModify");
            return (Criteria) this;
        }

        public Criteria andArticleLastModifyNotBetween(Date value1, Date value2) {
            addCriterion("article_last_modify not between", value1, value2, "articleLastModify");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdIsNull() {
            addCriterion("article_trademark_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdIsNotNull() {
            addCriterion("article_trademark_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdEqualTo(Integer value) {
            addCriterion("article_trademark_id =", value, "articleTrademarkId");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdNotEqualTo(Integer value) {
            addCriterion("article_trademark_id <>", value, "articleTrademarkId");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdGreaterThan(Integer value) {
            addCriterion("article_trademark_id >", value, "articleTrademarkId");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_trademark_id >=", value, "articleTrademarkId");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdLessThan(Integer value) {
            addCriterion("article_trademark_id <", value, "articleTrademarkId");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_trademark_id <=", value, "articleTrademarkId");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdIn(List<Integer> values) {
            addCriterion("article_trademark_id in", values, "articleTrademarkId");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdNotIn(List<Integer> values) {
            addCriterion("article_trademark_id not in", values, "articleTrademarkId");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdBetween(Integer value1, Integer value2) {
            addCriterion("article_trademark_id between", value1, value2, "articleTrademarkId");
            return (Criteria) this;
        }

        public Criteria andArticleTrademarkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_trademark_id not between", value1, value2, "articleTrademarkId");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdIsNull() {
            addCriterion("article_model_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdIsNotNull() {
            addCriterion("article_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdEqualTo(Integer value) {
            addCriterion("article_model_id =", value, "articleModelId");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdNotEqualTo(Integer value) {
            addCriterion("article_model_id <>", value, "articleModelId");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdGreaterThan(Integer value) {
            addCriterion("article_model_id >", value, "articleModelId");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_model_id >=", value, "articleModelId");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdLessThan(Integer value) {
            addCriterion("article_model_id <", value, "articleModelId");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_model_id <=", value, "articleModelId");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdIn(List<Integer> values) {
            addCriterion("article_model_id in", values, "articleModelId");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdNotIn(List<Integer> values) {
            addCriterion("article_model_id not in", values, "articleModelId");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdBetween(Integer value1, Integer value2) {
            addCriterion("article_model_id between", value1, value2, "articleModelId");
            return (Criteria) this;
        }

        public Criteria andArticleModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_model_id not between", value1, value2, "articleModelId");
            return (Criteria) this;
        }

        public Criteria andArticleBrandIsNull() {
            addCriterion("article_brand is null");
            return (Criteria) this;
        }

        public Criteria andArticleBrandIsNotNull() {
            addCriterion("article_brand is not null");
            return (Criteria) this;
        }

        public Criteria andArticleBrandEqualTo(String value) {
            addCriterion("article_brand =", value, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleBrandNotEqualTo(String value) {
            addCriterion("article_brand <>", value, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleBrandGreaterThan(String value) {
            addCriterion("article_brand >", value, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleBrandGreaterThanOrEqualTo(String value) {
            addCriterion("article_brand >=", value, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleBrandLessThan(String value) {
            addCriterion("article_brand <", value, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleBrandLessThanOrEqualTo(String value) {
            addCriterion("article_brand <=", value, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleBrandLike(String value) {
            addCriterion("article_brand like", value, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleBrandNotLike(String value) {
            addCriterion("article_brand not like", value, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleBrandIn(List<String> values) {
            addCriterion("article_brand in", values, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleBrandNotIn(List<String> values) {
            addCriterion("article_brand not in", values, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleBrandBetween(String value1, String value2) {
            addCriterion("article_brand between", value1, value2, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleBrandNotBetween(String value1, String value2) {
            addCriterion("article_brand not between", value1, value2, "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleModelIsNull() {
            addCriterion("article_model is null");
            return (Criteria) this;
        }

        public Criteria andArticleModelIsNotNull() {
            addCriterion("article_model is not null");
            return (Criteria) this;
        }

        public Criteria andArticleModelEqualTo(String value) {
            addCriterion("article_model =", value, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleModelNotEqualTo(String value) {
            addCriterion("article_model <>", value, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleModelGreaterThan(String value) {
            addCriterion("article_model >", value, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleModelGreaterThanOrEqualTo(String value) {
            addCriterion("article_model >=", value, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleModelLessThan(String value) {
            addCriterion("article_model <", value, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleModelLessThanOrEqualTo(String value) {
            addCriterion("article_model <=", value, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleModelLike(String value) {
            addCriterion("article_model like", value, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleModelNotLike(String value) {
            addCriterion("article_model not like", value, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleModelIn(List<String> values) {
            addCriterion("article_model in", values, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleModelNotIn(List<String> values) {
            addCriterion("article_model not in", values, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleModelBetween(String value1, String value2) {
            addCriterion("article_model between", value1, value2, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleModelNotBetween(String value1, String value2) {
            addCriterion("article_model not between", value1, value2, "articleModel");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLikeInsensitive(String value) {
            addCriterion("upper(article_title) like", value.toUpperCase(), "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleDescriptionLikeInsensitive(String value) {
            addCriterion("upper(article_description) like", value.toUpperCase(), "articleDescription");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLikeInsensitive(String value) {
            addCriterion("upper(article_comment) like", value.toUpperCase(), "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleImagesLikeInsensitive(String value) {
            addCriterion("upper(article_images) like", value.toUpperCase(), "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleBrandLikeInsensitive(String value) {
            addCriterion("upper(article_brand) like", value.toUpperCase(), "articleBrand");
            return (Criteria) this;
        }

        public Criteria andArticleModelLikeInsensitive(String value) {
            addCriterion("upper(article_model) like", value.toUpperCase(), "articleModel");
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