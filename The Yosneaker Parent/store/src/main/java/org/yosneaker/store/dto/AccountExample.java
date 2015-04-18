package org.yosneaker.store.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.yosneaker.store.common.Page;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public AccountExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameIsNull() {
            addCriterion("account_username is null");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameIsNotNull() {
            addCriterion("account_username is not null");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameEqualTo(String value) {
            addCriterion("account_username =", value, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameNotEqualTo(String value) {
            addCriterion("account_username <>", value, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameGreaterThan(String value) {
            addCriterion("account_username >", value, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("account_username >=", value, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameLessThan(String value) {
            addCriterion("account_username <", value, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameLessThanOrEqualTo(String value) {
            addCriterion("account_username <=", value, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameLike(String value) {
            addCriterion("account_username like", value, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameNotLike(String value) {
            addCriterion("account_username not like", value, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameIn(List<String> values) {
            addCriterion("account_username in", values, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameNotIn(List<String> values) {
            addCriterion("account_username not in", values, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameBetween(String value1, String value2) {
            addCriterion("account_username between", value1, value2, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameNotBetween(String value1, String value2) {
            addCriterion("account_username not between", value1, value2, "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkIsNull() {
            addCriterion("account_remark is null");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkIsNotNull() {
            addCriterion("account_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkEqualTo(String value) {
            addCriterion("account_remark =", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkNotEqualTo(String value) {
            addCriterion("account_remark <>", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkGreaterThan(String value) {
            addCriterion("account_remark >", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("account_remark >=", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkLessThan(String value) {
            addCriterion("account_remark <", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkLessThanOrEqualTo(String value) {
            addCriterion("account_remark <=", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkLike(String value) {
            addCriterion("account_remark like", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkNotLike(String value) {
            addCriterion("account_remark not like", value, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkIn(List<String> values) {
            addCriterion("account_remark in", values, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkNotIn(List<String> values) {
            addCriterion("account_remark not in", values, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkBetween(String value1, String value2) {
            addCriterion("account_remark between", value1, value2, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkNotBetween(String value1, String value2) {
            addCriterion("account_remark not between", value1, value2, "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountQqIsNull() {
            addCriterion("account_qq is null");
            return (Criteria) this;
        }

        public Criteria andAccountQqIsNotNull() {
            addCriterion("account_qq is not null");
            return (Criteria) this;
        }

        public Criteria andAccountQqEqualTo(String value) {
            addCriterion("account_qq =", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqNotEqualTo(String value) {
            addCriterion("account_qq <>", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqGreaterThan(String value) {
            addCriterion("account_qq >", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqGreaterThanOrEqualTo(String value) {
            addCriterion("account_qq >=", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqLessThan(String value) {
            addCriterion("account_qq <", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqLessThanOrEqualTo(String value) {
            addCriterion("account_qq <=", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqLike(String value) {
            addCriterion("account_qq like", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqNotLike(String value) {
            addCriterion("account_qq not like", value, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqIn(List<String> values) {
            addCriterion("account_qq in", values, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqNotIn(List<String> values) {
            addCriterion("account_qq not in", values, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqBetween(String value1, String value2) {
            addCriterion("account_qq between", value1, value2, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountQqNotBetween(String value1, String value2) {
            addCriterion("account_qq not between", value1, value2, "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneIsNull() {
            addCriterion("account_telephone is null");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneIsNotNull() {
            addCriterion("account_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneEqualTo(String value) {
            addCriterion("account_telephone =", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneNotEqualTo(String value) {
            addCriterion("account_telephone <>", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneGreaterThan(String value) {
            addCriterion("account_telephone >", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("account_telephone >=", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneLessThan(String value) {
            addCriterion("account_telephone <", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneLessThanOrEqualTo(String value) {
            addCriterion("account_telephone <=", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneLike(String value) {
            addCriterion("account_telephone like", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneNotLike(String value) {
            addCriterion("account_telephone not like", value, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneIn(List<String> values) {
            addCriterion("account_telephone in", values, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneNotIn(List<String> values) {
            addCriterion("account_telephone not in", values, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneBetween(String value1, String value2) {
            addCriterion("account_telephone between", value1, value2, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneNotBetween(String value1, String value2) {
            addCriterion("account_telephone not between", value1, value2, "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIsNull() {
            addCriterion("account_email is null");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIsNotNull() {
            addCriterion("account_email is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEmailEqualTo(String value) {
            addCriterion("account_email =", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotEqualTo(String value) {
            addCriterion("account_email <>", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThan(String value) {
            addCriterion("account_email >", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailGreaterThanOrEqualTo(String value) {
            addCriterion("account_email >=", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThan(String value) {
            addCriterion("account_email <", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLessThanOrEqualTo(String value) {
            addCriterion("account_email <=", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLike(String value) {
            addCriterion("account_email like", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotLike(String value) {
            addCriterion("account_email not like", value, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailIn(List<String> values) {
            addCriterion("account_email in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotIn(List<String> values) {
            addCriterion("account_email not in", values, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailBetween(String value1, String value2) {
            addCriterion("account_email between", value1, value2, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountEmailNotBetween(String value1, String value2) {
            addCriterion("account_email not between", value1, value2, "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountSexIsNull() {
            addCriterion("account_sex is null");
            return (Criteria) this;
        }

        public Criteria andAccountSexIsNotNull() {
            addCriterion("account_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSexEqualTo(Integer value) {
            addCriterion("account_sex =", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexNotEqualTo(Integer value) {
            addCriterion("account_sex <>", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexGreaterThan(Integer value) {
            addCriterion("account_sex >", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_sex >=", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexLessThan(Integer value) {
            addCriterion("account_sex <", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexLessThanOrEqualTo(Integer value) {
            addCriterion("account_sex <=", value, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexIn(List<Integer> values) {
            addCriterion("account_sex in", values, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexNotIn(List<Integer> values) {
            addCriterion("account_sex not in", values, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexBetween(Integer value1, Integer value2) {
            addCriterion("account_sex between", value1, value2, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountSexNotBetween(Integer value1, Integer value2) {
            addCriterion("account_sex not between", value1, value2, "accountSex");
            return (Criteria) this;
        }

        public Criteria andAccountImagesIsNull() {
            addCriterion("account_images is null");
            return (Criteria) this;
        }

        public Criteria andAccountImagesIsNotNull() {
            addCriterion("account_images is not null");
            return (Criteria) this;
        }

        public Criteria andAccountImagesEqualTo(String value) {
            addCriterion("account_images =", value, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountImagesNotEqualTo(String value) {
            addCriterion("account_images <>", value, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountImagesGreaterThan(String value) {
            addCriterion("account_images >", value, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountImagesGreaterThanOrEqualTo(String value) {
            addCriterion("account_images >=", value, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountImagesLessThan(String value) {
            addCriterion("account_images <", value, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountImagesLessThanOrEqualTo(String value) {
            addCriterion("account_images <=", value, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountImagesLike(String value) {
            addCriterion("account_images like", value, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountImagesNotLike(String value) {
            addCriterion("account_images not like", value, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountImagesIn(List<String> values) {
            addCriterion("account_images in", values, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountImagesNotIn(List<String> values) {
            addCriterion("account_images not in", values, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountImagesBetween(String value1, String value2) {
            addCriterion("account_images between", value1, value2, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountImagesNotBetween(String value1, String value2) {
            addCriterion("account_images not between", value1, value2, "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountAreaIsNull() {
            addCriterion("account_area is null");
            return (Criteria) this;
        }

        public Criteria andAccountAreaIsNotNull() {
            addCriterion("account_area is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAreaEqualTo(String value) {
            addCriterion("account_area =", value, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountAreaNotEqualTo(String value) {
            addCriterion("account_area <>", value, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountAreaGreaterThan(String value) {
            addCriterion("account_area >", value, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountAreaGreaterThanOrEqualTo(String value) {
            addCriterion("account_area >=", value, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountAreaLessThan(String value) {
            addCriterion("account_area <", value, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountAreaLessThanOrEqualTo(String value) {
            addCriterion("account_area <=", value, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountAreaLike(String value) {
            addCriterion("account_area like", value, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountAreaNotLike(String value) {
            addCriterion("account_area not like", value, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountAreaIn(List<String> values) {
            addCriterion("account_area in", values, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountAreaNotIn(List<String> values) {
            addCriterion("account_area not in", values, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountAreaBetween(String value1, String value2) {
            addCriterion("account_area between", value1, value2, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountAreaNotBetween(String value1, String value2) {
            addCriterion("account_area not between", value1, value2, "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIsNull() {
            addCriterion("account_password is null");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIsNotNull() {
            addCriterion("account_password is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordEqualTo(String value) {
            addCriterion("account_password =", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotEqualTo(String value) {
            addCriterion("account_password <>", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordGreaterThan(String value) {
            addCriterion("account_password >", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("account_password >=", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLessThan(String value) {
            addCriterion("account_password <", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLessThanOrEqualTo(String value) {
            addCriterion("account_password <=", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLike(String value) {
            addCriterion("account_password like", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotLike(String value) {
            addCriterion("account_password not like", value, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordIn(List<String> values) {
            addCriterion("account_password in", values, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotIn(List<String> values) {
            addCriterion("account_password not in", values, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordBetween(String value1, String value2) {
            addCriterion("account_password between", value1, value2, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordNotBetween(String value1, String value2) {
            addCriterion("account_password not between", value1, value2, "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIsNull() {
            addCriterion("account_province is null");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIsNotNull() {
            addCriterion("account_province is not null");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceEqualTo(String value) {
            addCriterion("account_province =", value, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceNotEqualTo(String value) {
            addCriterion("account_province <>", value, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceGreaterThan(String value) {
            addCriterion("account_province >", value, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("account_province >=", value, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceLessThan(String value) {
            addCriterion("account_province <", value, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceLessThanOrEqualTo(String value) {
            addCriterion("account_province <=", value, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceLike(String value) {
            addCriterion("account_province like", value, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceNotLike(String value) {
            addCriterion("account_province not like", value, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIn(List<String> values) {
            addCriterion("account_province in", values, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceNotIn(List<String> values) {
            addCriterion("account_province not in", values, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceBetween(String value1, String value2) {
            addCriterion("account_province between", value1, value2, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceNotBetween(String value1, String value2) {
            addCriterion("account_province not between", value1, value2, "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountCityIsNull() {
            addCriterion("account_city is null");
            return (Criteria) this;
        }

        public Criteria andAccountCityIsNotNull() {
            addCriterion("account_city is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCityEqualTo(String value) {
            addCriterion("account_city =", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityNotEqualTo(String value) {
            addCriterion("account_city <>", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityGreaterThan(String value) {
            addCriterion("account_city >", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityGreaterThanOrEqualTo(String value) {
            addCriterion("account_city >=", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityLessThan(String value) {
            addCriterion("account_city <", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityLessThanOrEqualTo(String value) {
            addCriterion("account_city <=", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityLike(String value) {
            addCriterion("account_city like", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityNotLike(String value) {
            addCriterion("account_city not like", value, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityIn(List<String> values) {
            addCriterion("account_city in", values, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityNotIn(List<String> values) {
            addCriterion("account_city not in", values, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityBetween(String value1, String value2) {
            addCriterion("account_city between", value1, value2, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityNotBetween(String value1, String value2) {
            addCriterion("account_city not between", value1, value2, "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdIsNull() {
            addCriterion("account_city_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdIsNotNull() {
            addCriterion("account_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdEqualTo(Integer value) {
            addCriterion("account_city_id =", value, "accountCityId");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdNotEqualTo(Integer value) {
            addCriterion("account_city_id <>", value, "accountCityId");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdGreaterThan(Integer value) {
            addCriterion("account_city_id >", value, "accountCityId");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_city_id >=", value, "accountCityId");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdLessThan(Integer value) {
            addCriterion("account_city_id <", value, "accountCityId");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_city_id <=", value, "accountCityId");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdIn(List<Integer> values) {
            addCriterion("account_city_id in", values, "accountCityId");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdNotIn(List<Integer> values) {
            addCriterion("account_city_id not in", values, "accountCityId");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdBetween(Integer value1, Integer value2) {
            addCriterion("account_city_id between", value1, value2, "accountCityId");
            return (Criteria) this;
        }

        public Criteria andAccountCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_city_id not between", value1, value2, "accountCityId");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdIsNull() {
            addCriterion("account_province_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdIsNotNull() {
            addCriterion("account_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdEqualTo(Integer value) {
            addCriterion("account_province_id =", value, "accountProvinceId");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdNotEqualTo(Integer value) {
            addCriterion("account_province_id <>", value, "accountProvinceId");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdGreaterThan(Integer value) {
            addCriterion("account_province_id >", value, "accountProvinceId");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_province_id >=", value, "accountProvinceId");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdLessThan(Integer value) {
            addCriterion("account_province_id <", value, "accountProvinceId");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_province_id <=", value, "accountProvinceId");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdIn(List<Integer> values) {
            addCriterion("account_province_id in", values, "accountProvinceId");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdNotIn(List<Integer> values) {
            addCriterion("account_province_id not in", values, "accountProvinceId");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("account_province_id between", value1, value2, "accountProvinceId");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_province_id not between", value1, value2, "accountProvinceId");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeIsNull() {
            addCriterion("account_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeIsNotNull() {
            addCriterion("account_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeEqualTo(Date value) {
            addCriterion("account_create_time =", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeNotEqualTo(Date value) {
            addCriterion("account_create_time <>", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeGreaterThan(Date value) {
            addCriterion("account_create_time >", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("account_create_time >=", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeLessThan(Date value) {
            addCriterion("account_create_time <", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("account_create_time <=", value, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeIn(List<Date> values) {
            addCriterion("account_create_time in", values, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeNotIn(List<Date> values) {
            addCriterion("account_create_time not in", values, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeBetween(Date value1, Date value2) {
            addCriterion("account_create_time between", value1, value2, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("account_create_time not between", value1, value2, "accountCreateTime");
            return (Criteria) this;
        }

        public Criteria andAccountStatureIsNull() {
            addCriterion("account_stature is null");
            return (Criteria) this;
        }

        public Criteria andAccountStatureIsNotNull() {
            addCriterion("account_stature is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStatureEqualTo(Float value) {
            addCriterion("account_stature =", value, "accountStature");
            return (Criteria) this;
        }

        public Criteria andAccountStatureNotEqualTo(Float value) {
            addCriterion("account_stature <>", value, "accountStature");
            return (Criteria) this;
        }

        public Criteria andAccountStatureGreaterThan(Float value) {
            addCriterion("account_stature >", value, "accountStature");
            return (Criteria) this;
        }

        public Criteria andAccountStatureGreaterThanOrEqualTo(Float value) {
            addCriterion("account_stature >=", value, "accountStature");
            return (Criteria) this;
        }

        public Criteria andAccountStatureLessThan(Float value) {
            addCriterion("account_stature <", value, "accountStature");
            return (Criteria) this;
        }

        public Criteria andAccountStatureLessThanOrEqualTo(Float value) {
            addCriterion("account_stature <=", value, "accountStature");
            return (Criteria) this;
        }

        public Criteria andAccountStatureIn(List<Float> values) {
            addCriterion("account_stature in", values, "accountStature");
            return (Criteria) this;
        }

        public Criteria andAccountStatureNotIn(List<Float> values) {
            addCriterion("account_stature not in", values, "accountStature");
            return (Criteria) this;
        }

        public Criteria andAccountStatureBetween(Float value1, Float value2) {
            addCriterion("account_stature between", value1, value2, "accountStature");
            return (Criteria) this;
        }

        public Criteria andAccountStatureNotBetween(Float value1, Float value2) {
            addCriterion("account_stature not between", value1, value2, "accountStature");
            return (Criteria) this;
        }

        public Criteria andAccountAgeIsNull() {
            addCriterion("account_age is null");
            return (Criteria) this;
        }

        public Criteria andAccountAgeIsNotNull() {
            addCriterion("account_age is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAgeEqualTo(Integer value) {
            addCriterion("account_age =", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeNotEqualTo(Integer value) {
            addCriterion("account_age <>", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeGreaterThan(Integer value) {
            addCriterion("account_age >", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_age >=", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeLessThan(Integer value) {
            addCriterion("account_age <", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeLessThanOrEqualTo(Integer value) {
            addCriterion("account_age <=", value, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeIn(List<Integer> values) {
            addCriterion("account_age in", values, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeNotIn(List<Integer> values) {
            addCriterion("account_age not in", values, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeBetween(Integer value1, Integer value2) {
            addCriterion("account_age between", value1, value2, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("account_age not between", value1, value2, "accountAge");
            return (Criteria) this;
        }

        public Criteria andAccountWeightIsNull() {
            addCriterion("account_weight is null");
            return (Criteria) this;
        }

        public Criteria andAccountWeightIsNotNull() {
            addCriterion("account_weight is not null");
            return (Criteria) this;
        }

        public Criteria andAccountWeightEqualTo(Float value) {
            addCriterion("account_weight =", value, "accountWeight");
            return (Criteria) this;
        }

        public Criteria andAccountWeightNotEqualTo(Float value) {
            addCriterion("account_weight <>", value, "accountWeight");
            return (Criteria) this;
        }

        public Criteria andAccountWeightGreaterThan(Float value) {
            addCriterion("account_weight >", value, "accountWeight");
            return (Criteria) this;
        }

        public Criteria andAccountWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("account_weight >=", value, "accountWeight");
            return (Criteria) this;
        }

        public Criteria andAccountWeightLessThan(Float value) {
            addCriterion("account_weight <", value, "accountWeight");
            return (Criteria) this;
        }

        public Criteria andAccountWeightLessThanOrEqualTo(Float value) {
            addCriterion("account_weight <=", value, "accountWeight");
            return (Criteria) this;
        }

        public Criteria andAccountWeightIn(List<Float> values) {
            addCriterion("account_weight in", values, "accountWeight");
            return (Criteria) this;
        }

        public Criteria andAccountWeightNotIn(List<Float> values) {
            addCriterion("account_weight not in", values, "accountWeight");
            return (Criteria) this;
        }

        public Criteria andAccountWeightBetween(Float value1, Float value2) {
            addCriterion("account_weight between", value1, value2, "accountWeight");
            return (Criteria) this;
        }

        public Criteria andAccountWeightNotBetween(Float value1, Float value2) {
            addCriterion("account_weight not between", value1, value2, "accountWeight");
            return (Criteria) this;
        }

        public Criteria andAccountBounceIsNull() {
            addCriterion("account_bounce is null");
            return (Criteria) this;
        }

        public Criteria andAccountBounceIsNotNull() {
            addCriterion("account_bounce is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBounceEqualTo(Float value) {
            addCriterion("account_bounce =", value, "accountBounce");
            return (Criteria) this;
        }

        public Criteria andAccountBounceNotEqualTo(Float value) {
            addCriterion("account_bounce <>", value, "accountBounce");
            return (Criteria) this;
        }

        public Criteria andAccountBounceGreaterThan(Float value) {
            addCriterion("account_bounce >", value, "accountBounce");
            return (Criteria) this;
        }

        public Criteria andAccountBounceGreaterThanOrEqualTo(Float value) {
            addCriterion("account_bounce >=", value, "accountBounce");
            return (Criteria) this;
        }

        public Criteria andAccountBounceLessThan(Float value) {
            addCriterion("account_bounce <", value, "accountBounce");
            return (Criteria) this;
        }

        public Criteria andAccountBounceLessThanOrEqualTo(Float value) {
            addCriterion("account_bounce <=", value, "accountBounce");
            return (Criteria) this;
        }

        public Criteria andAccountBounceIn(List<Float> values) {
            addCriterion("account_bounce in", values, "accountBounce");
            return (Criteria) this;
        }

        public Criteria andAccountBounceNotIn(List<Float> values) {
            addCriterion("account_bounce not in", values, "accountBounce");
            return (Criteria) this;
        }

        public Criteria andAccountBounceBetween(Float value1, Float value2) {
            addCriterion("account_bounce between", value1, value2, "accountBounce");
            return (Criteria) this;
        }

        public Criteria andAccountBounceNotBetween(Float value1, Float value2) {
            addCriterion("account_bounce not between", value1, value2, "accountBounce");
            return (Criteria) this;
        }

        public Criteria andAccountPositionIsNull() {
            addCriterion("account_position is null");
            return (Criteria) this;
        }

        public Criteria andAccountPositionIsNotNull() {
            addCriterion("account_position is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPositionEqualTo(String value) {
            addCriterion("account_position =", value, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountPositionNotEqualTo(String value) {
            addCriterion("account_position <>", value, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountPositionGreaterThan(String value) {
            addCriterion("account_position >", value, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountPositionGreaterThanOrEqualTo(String value) {
            addCriterion("account_position >=", value, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountPositionLessThan(String value) {
            addCriterion("account_position <", value, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountPositionLessThanOrEqualTo(String value) {
            addCriterion("account_position <=", value, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountPositionLike(String value) {
            addCriterion("account_position like", value, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountPositionNotLike(String value) {
            addCriterion("account_position not like", value, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountPositionIn(List<String> values) {
            addCriterion("account_position in", values, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountPositionNotIn(List<String> values) {
            addCriterion("account_position not in", values, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountPositionBetween(String value1, String value2) {
            addCriterion("account_position between", value1, value2, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountPositionNotBetween(String value1, String value2) {
            addCriterion("account_position not between", value1, value2, "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityIsNull() {
            addCriterion("account_ability is null");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityIsNotNull() {
            addCriterion("account_ability is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityEqualTo(String value) {
            addCriterion("account_ability =", value, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityNotEqualTo(String value) {
            addCriterion("account_ability <>", value, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityGreaterThan(String value) {
            addCriterion("account_ability >", value, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("account_ability >=", value, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityLessThan(String value) {
            addCriterion("account_ability <", value, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityLessThanOrEqualTo(String value) {
            addCriterion("account_ability <=", value, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityLike(String value) {
            addCriterion("account_ability like", value, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityNotLike(String value) {
            addCriterion("account_ability not like", value, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityIn(List<String> values) {
            addCriterion("account_ability in", values, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityNotIn(List<String> values) {
            addCriterion("account_ability not in", values, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityBetween(String value1, String value2) {
            addCriterion("account_ability between", value1, value2, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityNotBetween(String value1, String value2) {
            addCriterion("account_ability not between", value1, value2, "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdIsNull() {
            addCriterion("account_thrid_part_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdIsNotNull() {
            addCriterion("account_thrid_part_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdEqualTo(String value) {
            addCriterion("account_thrid_part_id =", value, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdNotEqualTo(String value) {
            addCriterion("account_thrid_part_id <>", value, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdGreaterThan(String value) {
            addCriterion("account_thrid_part_id >", value, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_thrid_part_id >=", value, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdLessThan(String value) {
            addCriterion("account_thrid_part_id <", value, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdLessThanOrEqualTo(String value) {
            addCriterion("account_thrid_part_id <=", value, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdLike(String value) {
            addCriterion("account_thrid_part_id like", value, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdNotLike(String value) {
            addCriterion("account_thrid_part_id not like", value, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdIn(List<String> values) {
            addCriterion("account_thrid_part_id in", values, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdNotIn(List<String> values) {
            addCriterion("account_thrid_part_id not in", values, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdBetween(String value1, String value2) {
            addCriterion("account_thrid_part_id between", value1, value2, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdNotBetween(String value1, String value2) {
            addCriterion("account_thrid_part_id not between", value1, value2, "accountThridPartId");
            return (Criteria) this;
        }

        public Criteria andAccountNameLikeInsensitive(String value) {
            addCriterion("upper(account_name) like", value.toUpperCase(), "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountUsernameLikeInsensitive(String value) {
            addCriterion("upper(account_username) like", value.toUpperCase(), "accountUsername");
            return (Criteria) this;
        }

        public Criteria andAccountRemarkLikeInsensitive(String value) {
            addCriterion("upper(account_remark) like", value.toUpperCase(), "accountRemark");
            return (Criteria) this;
        }

        public Criteria andAccountQqLikeInsensitive(String value) {
            addCriterion("upper(account_qq) like", value.toUpperCase(), "accountQq");
            return (Criteria) this;
        }

        public Criteria andAccountTelephoneLikeInsensitive(String value) {
            addCriterion("upper(account_telephone) like", value.toUpperCase(), "accountTelephone");
            return (Criteria) this;
        }

        public Criteria andAccountEmailLikeInsensitive(String value) {
            addCriterion("upper(account_email) like", value.toUpperCase(), "accountEmail");
            return (Criteria) this;
        }

        public Criteria andAccountImagesLikeInsensitive(String value) {
            addCriterion("upper(account_images) like", value.toUpperCase(), "accountImages");
            return (Criteria) this;
        }

        public Criteria andAccountAreaLikeInsensitive(String value) {
            addCriterion("upper(account_area) like", value.toUpperCase(), "accountArea");
            return (Criteria) this;
        }

        public Criteria andAccountPasswordLikeInsensitive(String value) {
            addCriterion("upper(account_password) like", value.toUpperCase(), "accountPassword");
            return (Criteria) this;
        }

        public Criteria andAccountProvinceLikeInsensitive(String value) {
            addCriterion("upper(account_province) like", value.toUpperCase(), "accountProvince");
            return (Criteria) this;
        }

        public Criteria andAccountCityLikeInsensitive(String value) {
            addCriterion("upper(account_city) like", value.toUpperCase(), "accountCity");
            return (Criteria) this;
        }

        public Criteria andAccountPositionLikeInsensitive(String value) {
            addCriterion("upper(account_position) like", value.toUpperCase(), "accountPosition");
            return (Criteria) this;
        }

        public Criteria andAccountAbilityLikeInsensitive(String value) {
            addCriterion("upper(account_ability) like", value.toUpperCase(), "accountAbility");
            return (Criteria) this;
        }

        public Criteria andAccountThridPartIdLikeInsensitive(String value) {
            addCriterion("upper(account_thrid_part_id) like", value.toUpperCase(), "accountThridPartId");
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