package org.yosneaker.store.dto;

import java.util.ArrayList;
import java.util.List;
import org.yosneaker.store.common.Page;

public class ModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public ModelExample() {
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

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("model_name is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("model_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_name >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("model_name <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("model_name like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("model_name not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelSeriesIsNull() {
            addCriterion("model_series is null");
            return (Criteria) this;
        }

        public Criteria andModelSeriesIsNotNull() {
            addCriterion("model_series is not null");
            return (Criteria) this;
        }

        public Criteria andModelSeriesEqualTo(String value) {
            addCriterion("model_series =", value, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andModelSeriesNotEqualTo(String value) {
            addCriterion("model_series <>", value, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andModelSeriesGreaterThan(String value) {
            addCriterion("model_series >", value, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andModelSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("model_series >=", value, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andModelSeriesLessThan(String value) {
            addCriterion("model_series <", value, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andModelSeriesLessThanOrEqualTo(String value) {
            addCriterion("model_series <=", value, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andModelSeriesLike(String value) {
            addCriterion("model_series like", value, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andModelSeriesNotLike(String value) {
            addCriterion("model_series not like", value, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andModelSeriesIn(List<String> values) {
            addCriterion("model_series in", values, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andModelSeriesNotIn(List<String> values) {
            addCriterion("model_series not in", values, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andModelSeriesBetween(String value1, String value2) {
            addCriterion("model_series between", value1, value2, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andModelSeriesNotBetween(String value1, String value2) {
            addCriterion("model_series not between", value1, value2, "modelSeries");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andArtNoIsNull() {
            addCriterion("Art_No is null");
            return (Criteria) this;
        }

        public Criteria andArtNoIsNotNull() {
            addCriterion("Art_No is not null");
            return (Criteria) this;
        }

        public Criteria andArtNoEqualTo(String value) {
            addCriterion("Art_No =", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoNotEqualTo(String value) {
            addCriterion("Art_No <>", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoGreaterThan(String value) {
            addCriterion("Art_No >", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoGreaterThanOrEqualTo(String value) {
            addCriterion("Art_No >=", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoLessThan(String value) {
            addCriterion("Art_No <", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoLessThanOrEqualTo(String value) {
            addCriterion("Art_No <=", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoLike(String value) {
            addCriterion("Art_No like", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoNotLike(String value) {
            addCriterion("Art_No not like", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoIn(List<String> values) {
            addCriterion("Art_No in", values, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoNotIn(List<String> values) {
            addCriterion("Art_No not in", values, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoBetween(String value1, String value2) {
            addCriterion("Art_No between", value1, value2, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoNotBetween(String value1, String value2) {
            addCriterion("Art_No not between", value1, value2, "artNo");
            return (Criteria) this;
        }

        public Criteria andModelNameLikeInsensitive(String value) {
            addCriterion("upper(model_name) like", value.toUpperCase(), "modelName");
            return (Criteria) this;
        }

        public Criteria andModelSeriesLikeInsensitive(String value) {
            addCriterion("upper(model_series) like", value.toUpperCase(), "modelSeries");
            return (Criteria) this;
        }

        public Criteria andArtNoLikeInsensitive(String value) {
            addCriterion("upper(Art_No) like", value.toUpperCase(), "artNo");
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