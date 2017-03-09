package cn.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOssAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOssAccountExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdpterIdIsNull() {
            addCriterion("adpter_id is null");
            return (Criteria) this;
        }

        public Criteria andAdpterIdIsNotNull() {
            addCriterion("adpter_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdpterIdEqualTo(String value) {
            addCriterion("adpter_id =", value, "adpterId");
            return (Criteria) this;
        }

        public Criteria andAdpterIdNotEqualTo(String value) {
            addCriterion("adpter_id <>", value, "adpterId");
            return (Criteria) this;
        }

        public Criteria andAdpterIdGreaterThan(String value) {
            addCriterion("adpter_id >", value, "adpterId");
            return (Criteria) this;
        }

        public Criteria andAdpterIdGreaterThanOrEqualTo(String value) {
            addCriterion("adpter_id >=", value, "adpterId");
            return (Criteria) this;
        }

        public Criteria andAdpterIdLessThan(String value) {
            addCriterion("adpter_id <", value, "adpterId");
            return (Criteria) this;
        }

        public Criteria andAdpterIdLessThanOrEqualTo(String value) {
            addCriterion("adpter_id <=", value, "adpterId");
            return (Criteria) this;
        }

        public Criteria andAdpterIdLike(String value) {
            addCriterion("adpter_id like", value, "adpterId");
            return (Criteria) this;
        }

        public Criteria andAdpterIdNotLike(String value) {
            addCriterion("adpter_id not like", value, "adpterId");
            return (Criteria) this;
        }

        public Criteria andAdpterIdIn(List<String> values) {
            addCriterion("adpter_id in", values, "adpterId");
            return (Criteria) this;
        }

        public Criteria andAdpterIdNotIn(List<String> values) {
            addCriterion("adpter_id not in", values, "adpterId");
            return (Criteria) this;
        }

        public Criteria andAdpterIdBetween(String value1, String value2) {
            addCriterion("adpter_id between", value1, value2, "adpterId");
            return (Criteria) this;
        }

        public Criteria andAdpterIdNotBetween(String value1, String value2) {
            addCriterion("adpter_id not between", value1, value2, "adpterId");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("u_phone =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("u_phone <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("u_phone like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("u_phone not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("u_phone in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumIsNull() {
            addCriterion("enterprise_num is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumIsNotNull() {
            addCriterion("enterprise_num is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumEqualTo(String value) {
            addCriterion("enterprise_num =", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumNotEqualTo(String value) {
            addCriterion("enterprise_num <>", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumGreaterThan(String value) {
            addCriterion("enterprise_num >", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_num >=", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumLessThan(String value) {
            addCriterion("enterprise_num <", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumLessThanOrEqualTo(String value) {
            addCriterion("enterprise_num <=", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumLike(String value) {
            addCriterion("enterprise_num like", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumNotLike(String value) {
            addCriterion("enterprise_num not like", value, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumIn(List<String> values) {
            addCriterion("enterprise_num in", values, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumNotIn(List<String> values) {
            addCriterion("enterprise_num not in", values, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumBetween(String value1, String value2) {
            addCriterion("enterprise_num between", value1, value2, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNumNotBetween(String value1, String value2) {
            addCriterion("enterprise_num not between", value1, value2, "enterpriseNum");
            return (Criteria) this;
        }

        public Criteria andMPhoneIsNull() {
            addCriterion("m_phone is null");
            return (Criteria) this;
        }

        public Criteria andMPhoneIsNotNull() {
            addCriterion("m_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMPhoneEqualTo(String value) {
            addCriterion("m_phone =", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneNotEqualTo(String value) {
            addCriterion("m_phone <>", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneGreaterThan(String value) {
            addCriterion("m_phone >", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("m_phone >=", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneLessThan(String value) {
            addCriterion("m_phone <", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneLessThanOrEqualTo(String value) {
            addCriterion("m_phone <=", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneLike(String value) {
            addCriterion("m_phone like", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneNotLike(String value) {
            addCriterion("m_phone not like", value, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneIn(List<String> values) {
            addCriterion("m_phone in", values, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneNotIn(List<String> values) {
            addCriterion("m_phone not in", values, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneBetween(String value1, String value2) {
            addCriterion("m_phone between", value1, value2, "mPhone");
            return (Criteria) this;
        }

        public Criteria andMPhoneNotBetween(String value1, String value2) {
            addCriterion("m_phone not between", value1, value2, "mPhone");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(Integer value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(Integer value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(Integer value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(Integer value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<Integer> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<Integer> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIsNull() {
            addCriterion("enterprise_code is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIsNotNull() {
            addCriterion("enterprise_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeEqualTo(String value) {
            addCriterion("enterprise_code =", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotEqualTo(String value) {
            addCriterion("enterprise_code <>", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeGreaterThan(String value) {
            addCriterion("enterprise_code >", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_code >=", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLessThan(String value) {
            addCriterion("enterprise_code <", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_code <=", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLike(String value) {
            addCriterion("enterprise_code like", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotLike(String value) {
            addCriterion("enterprise_code not like", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIn(List<String> values) {
            addCriterion("enterprise_code in", values, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotIn(List<String> values) {
            addCriterion("enterprise_code not in", values, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeBetween(String value1, String value2) {
            addCriterion("enterprise_code between", value1, value2, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotBetween(String value1, String value2) {
            addCriterion("enterprise_code not between", value1, value2, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(String value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(String value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(String value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(String value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(String value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLike(String value) {
            addCriterion("bill_type like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotLike(String value) {
            addCriterion("bill_type not like", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<String> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<String> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(String value1, String value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(String value1, String value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIsNull() {
            addCriterion("license_type is null");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIsNotNull() {
            addCriterion("license_type is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeEqualTo(String value) {
            addCriterion("license_type =", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotEqualTo(String value) {
            addCriterion("license_type <>", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeGreaterThan(String value) {
            addCriterion("license_type >", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("license_type >=", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLessThan(String value) {
            addCriterion("license_type <", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLessThanOrEqualTo(String value) {
            addCriterion("license_type <=", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLike(String value) {
            addCriterion("license_type like", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotLike(String value) {
            addCriterion("license_type not like", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIn(List<String> values) {
            addCriterion("license_type in", values, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotIn(List<String> values) {
            addCriterion("license_type not in", values, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeBetween(String value1, String value2) {
            addCriterion("license_type between", value1, value2, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotBetween(String value1, String value2) {
            addCriterion("license_type not between", value1, value2, "licenseType");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseIsNull() {
            addCriterion("yqt_license is null");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseIsNotNull() {
            addCriterion("yqt_license is not null");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseEqualTo(Integer value) {
            addCriterion("yqt_license =", value, "yqtLicense");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseNotEqualTo(Integer value) {
            addCriterion("yqt_license <>", value, "yqtLicense");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseGreaterThan(Integer value) {
            addCriterion("yqt_license >", value, "yqtLicense");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseGreaterThanOrEqualTo(Integer value) {
            addCriterion("yqt_license >=", value, "yqtLicense");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseLessThan(Integer value) {
            addCriterion("yqt_license <", value, "yqtLicense");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseLessThanOrEqualTo(Integer value) {
            addCriterion("yqt_license <=", value, "yqtLicense");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseIn(List<Integer> values) {
            addCriterion("yqt_license in", values, "yqtLicense");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseNotIn(List<Integer> values) {
            addCriterion("yqt_license not in", values, "yqtLicense");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseBetween(Integer value1, Integer value2) {
            addCriterion("yqt_license between", value1, value2, "yqtLicense");
            return (Criteria) this;
        }

        public Criteria andYqtLicenseNotBetween(Integer value1, Integer value2) {
            addCriterion("yqt_license not between", value1, value2, "yqtLicense");
            return (Criteria) this;
        }

        public Criteria andRestAmountIsNull() {
            addCriterion("rest_amount is null");
            return (Criteria) this;
        }

        public Criteria andRestAmountIsNotNull() {
            addCriterion("rest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRestAmountEqualTo(Integer value) {
            addCriterion("rest_amount =", value, "restAmount");
            return (Criteria) this;
        }

        public Criteria andRestAmountNotEqualTo(Integer value) {
            addCriterion("rest_amount <>", value, "restAmount");
            return (Criteria) this;
        }

        public Criteria andRestAmountGreaterThan(Integer value) {
            addCriterion("rest_amount >", value, "restAmount");
            return (Criteria) this;
        }

        public Criteria andRestAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("rest_amount >=", value, "restAmount");
            return (Criteria) this;
        }

        public Criteria andRestAmountLessThan(Integer value) {
            addCriterion("rest_amount <", value, "restAmount");
            return (Criteria) this;
        }

        public Criteria andRestAmountLessThanOrEqualTo(Integer value) {
            addCriterion("rest_amount <=", value, "restAmount");
            return (Criteria) this;
        }

        public Criteria andRestAmountIn(List<Integer> values) {
            addCriterion("rest_amount in", values, "restAmount");
            return (Criteria) this;
        }

        public Criteria andRestAmountNotIn(List<Integer> values) {
            addCriterion("rest_amount not in", values, "restAmount");
            return (Criteria) this;
        }

        public Criteria andRestAmountBetween(Integer value1, Integer value2) {
            addCriterion("rest_amount between", value1, value2, "restAmount");
            return (Criteria) this;
        }

        public Criteria andRestAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("rest_amount not between", value1, value2, "restAmount");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseIsNull() {
            addCriterion("adr_license is null");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseIsNotNull() {
            addCriterion("adr_license is not null");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseEqualTo(Integer value) {
            addCriterion("adr_license =", value, "adrLicense");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseNotEqualTo(Integer value) {
            addCriterion("adr_license <>", value, "adrLicense");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseGreaterThan(Integer value) {
            addCriterion("adr_license >", value, "adrLicense");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseGreaterThanOrEqualTo(Integer value) {
            addCriterion("adr_license >=", value, "adrLicense");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseLessThan(Integer value) {
            addCriterion("adr_license <", value, "adrLicense");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseLessThanOrEqualTo(Integer value) {
            addCriterion("adr_license <=", value, "adrLicense");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseIn(List<Integer> values) {
            addCriterion("adr_license in", values, "adrLicense");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseNotIn(List<Integer> values) {
            addCriterion("adr_license not in", values, "adrLicense");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseBetween(Integer value1, Integer value2) {
            addCriterion("adr_license between", value1, value2, "adrLicense");
            return (Criteria) this;
        }

        public Criteria andAdrLicenseNotBetween(Integer value1, Integer value2) {
            addCriterion("adr_license not between", value1, value2, "adrLicense");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsIsNull() {
            addCriterion("is_open_sms is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsIsNotNull() {
            addCriterion("is_open_sms is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsEqualTo(String value) {
            addCriterion("is_open_sms =", value, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsNotEqualTo(String value) {
            addCriterion("is_open_sms <>", value, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsGreaterThan(String value) {
            addCriterion("is_open_sms >", value, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsGreaterThanOrEqualTo(String value) {
            addCriterion("is_open_sms >=", value, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsLessThan(String value) {
            addCriterion("is_open_sms <", value, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsLessThanOrEqualTo(String value) {
            addCriterion("is_open_sms <=", value, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsLike(String value) {
            addCriterion("is_open_sms like", value, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsNotLike(String value) {
            addCriterion("is_open_sms not like", value, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsIn(List<String> values) {
            addCriterion("is_open_sms in", values, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsNotIn(List<String> values) {
            addCriterion("is_open_sms not in", values, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsBetween(String value1, String value2) {
            addCriterion("is_open_sms between", value1, value2, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andIsOpenSmsNotBetween(String value1, String value2) {
            addCriterion("is_open_sms not between", value1, value2, "isOpenSms");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeIsNull() {
            addCriterion("boss_machine_type is null");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeIsNotNull() {
            addCriterion("boss_machine_type is not null");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeEqualTo(String value) {
            addCriterion("boss_machine_type =", value, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeNotEqualTo(String value) {
            addCriterion("boss_machine_type <>", value, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeGreaterThan(String value) {
            addCriterion("boss_machine_type >", value, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeGreaterThanOrEqualTo(String value) {
            addCriterion("boss_machine_type >=", value, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeLessThan(String value) {
            addCriterion("boss_machine_type <", value, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeLessThanOrEqualTo(String value) {
            addCriterion("boss_machine_type <=", value, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeLike(String value) {
            addCriterion("boss_machine_type like", value, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeNotLike(String value) {
            addCriterion("boss_machine_type not like", value, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeIn(List<String> values) {
            addCriterion("boss_machine_type in", values, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeNotIn(List<String> values) {
            addCriterion("boss_machine_type not in", values, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeBetween(String value1, String value2) {
            addCriterion("boss_machine_type between", value1, value2, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossMachineTypeNotBetween(String value1, String value2) {
            addCriterion("boss_machine_type not between", value1, value2, "bossMachineType");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeIsNull() {
            addCriterion("boss_area_code is null");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeIsNotNull() {
            addCriterion("boss_area_code is not null");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeEqualTo(String value) {
            addCriterion("boss_area_code =", value, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeNotEqualTo(String value) {
            addCriterion("boss_area_code <>", value, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeGreaterThan(String value) {
            addCriterion("boss_area_code >", value, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("boss_area_code >=", value, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeLessThan(String value) {
            addCriterion("boss_area_code <", value, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("boss_area_code <=", value, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeLike(String value) {
            addCriterion("boss_area_code like", value, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeNotLike(String value) {
            addCriterion("boss_area_code not like", value, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeIn(List<String> values) {
            addCriterion("boss_area_code in", values, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeNotIn(List<String> values) {
            addCriterion("boss_area_code not in", values, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeBetween(String value1, String value2) {
            addCriterion("boss_area_code between", value1, value2, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossAreaCodeNotBetween(String value1, String value2) {
            addCriterion("boss_area_code not between", value1, value2, "bossAreaCode");
            return (Criteria) this;
        }

        public Criteria andBossNumberIsNull() {
            addCriterion("boss_number is null");
            return (Criteria) this;
        }

        public Criteria andBossNumberIsNotNull() {
            addCriterion("boss_number is not null");
            return (Criteria) this;
        }

        public Criteria andBossNumberEqualTo(String value) {
            addCriterion("boss_number =", value, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andBossNumberNotEqualTo(String value) {
            addCriterion("boss_number <>", value, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andBossNumberGreaterThan(String value) {
            addCriterion("boss_number >", value, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andBossNumberGreaterThanOrEqualTo(String value) {
            addCriterion("boss_number >=", value, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andBossNumberLessThan(String value) {
            addCriterion("boss_number <", value, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andBossNumberLessThanOrEqualTo(String value) {
            addCriterion("boss_number <=", value, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andBossNumberLike(String value) {
            addCriterion("boss_number like", value, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andBossNumberNotLike(String value) {
            addCriterion("boss_number not like", value, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andBossNumberIn(List<String> values) {
            addCriterion("boss_number in", values, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andBossNumberNotIn(List<String> values) {
            addCriterion("boss_number not in", values, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andBossNumberBetween(String value1, String value2) {
            addCriterion("boss_number between", value1, value2, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andBossNumberNotBetween(String value1, String value2) {
            addCriterion("boss_number not between", value1, value2, "bossNumber");
            return (Criteria) this;
        }

        public Criteria andOutboundIsNull() {
            addCriterion("outbound is null");
            return (Criteria) this;
        }

        public Criteria andOutboundIsNotNull() {
            addCriterion("outbound is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundEqualTo(String value) {
            addCriterion("outbound =", value, "outbound");
            return (Criteria) this;
        }

        public Criteria andOutboundNotEqualTo(String value) {
            addCriterion("outbound <>", value, "outbound");
            return (Criteria) this;
        }

        public Criteria andOutboundGreaterThan(String value) {
            addCriterion("outbound >", value, "outbound");
            return (Criteria) this;
        }

        public Criteria andOutboundGreaterThanOrEqualTo(String value) {
            addCriterion("outbound >=", value, "outbound");
            return (Criteria) this;
        }

        public Criteria andOutboundLessThan(String value) {
            addCriterion("outbound <", value, "outbound");
            return (Criteria) this;
        }

        public Criteria andOutboundLessThanOrEqualTo(String value) {
            addCriterion("outbound <=", value, "outbound");
            return (Criteria) this;
        }

        public Criteria andOutboundLike(String value) {
            addCriterion("outbound like", value, "outbound");
            return (Criteria) this;
        }

        public Criteria andOutboundNotLike(String value) {
            addCriterion("outbound not like", value, "outbound");
            return (Criteria) this;
        }

        public Criteria andOutboundIn(List<String> values) {
            addCriterion("outbound in", values, "outbound");
            return (Criteria) this;
        }

        public Criteria andOutboundNotIn(List<String> values) {
            addCriterion("outbound not in", values, "outbound");
            return (Criteria) this;
        }

        public Criteria andOutboundBetween(String value1, String value2) {
            addCriterion("outbound between", value1, value2, "outbound");
            return (Criteria) this;
        }

        public Criteria andOutboundNotBetween(String value1, String value2) {
            addCriterion("outbound not between", value1, value2, "outbound");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberIsNull() {
            addCriterion("ChinaMobile_boss_number is null");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberIsNotNull() {
            addCriterion("ChinaMobile_boss_number is not null");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberEqualTo(String value) {
            addCriterion("ChinaMobile_boss_number =", value, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberNotEqualTo(String value) {
            addCriterion("ChinaMobile_boss_number <>", value, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberGreaterThan(String value) {
            addCriterion("ChinaMobile_boss_number >", value, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ChinaMobile_boss_number >=", value, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberLessThan(String value) {
            addCriterion("ChinaMobile_boss_number <", value, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberLessThanOrEqualTo(String value) {
            addCriterion("ChinaMobile_boss_number <=", value, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberLike(String value) {
            addCriterion("ChinaMobile_boss_number like", value, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberNotLike(String value) {
            addCriterion("ChinaMobile_boss_number not like", value, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberIn(List<String> values) {
            addCriterion("ChinaMobile_boss_number in", values, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberNotIn(List<String> values) {
            addCriterion("ChinaMobile_boss_number not in", values, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberBetween(String value1, String value2) {
            addCriterion("ChinaMobile_boss_number between", value1, value2, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileBossNumberNotBetween(String value1, String value2) {
            addCriterion("ChinaMobile_boss_number not between", value1, value2, "chinamobileBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberIsNull() {
            addCriterion("ChinaMobile_relay_number is null");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberIsNotNull() {
            addCriterion("ChinaMobile_relay_number is not null");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberEqualTo(String value) {
            addCriterion("ChinaMobile_relay_number =", value, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberNotEqualTo(String value) {
            addCriterion("ChinaMobile_relay_number <>", value, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberGreaterThan(String value) {
            addCriterion("ChinaMobile_relay_number >", value, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ChinaMobile_relay_number >=", value, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberLessThan(String value) {
            addCriterion("ChinaMobile_relay_number <", value, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberLessThanOrEqualTo(String value) {
            addCriterion("ChinaMobile_relay_number <=", value, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberLike(String value) {
            addCriterion("ChinaMobile_relay_number like", value, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberNotLike(String value) {
            addCriterion("ChinaMobile_relay_number not like", value, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberIn(List<String> values) {
            addCriterion("ChinaMobile_relay_number in", values, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberNotIn(List<String> values) {
            addCriterion("ChinaMobile_relay_number not in", values, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberBetween(String value1, String value2) {
            addCriterion("ChinaMobile_relay_number between", value1, value2, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinamobileRelayNumberNotBetween(String value1, String value2) {
            addCriterion("ChinaMobile_relay_number not between", value1, value2, "chinamobileRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberIsNull() {
            addCriterion("ChinaUnicom_boss_number is null");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberIsNotNull() {
            addCriterion("ChinaUnicom_boss_number is not null");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberEqualTo(String value) {
            addCriterion("ChinaUnicom_boss_number =", value, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberNotEqualTo(String value) {
            addCriterion("ChinaUnicom_boss_number <>", value, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberGreaterThan(String value) {
            addCriterion("ChinaUnicom_boss_number >", value, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ChinaUnicom_boss_number >=", value, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberLessThan(String value) {
            addCriterion("ChinaUnicom_boss_number <", value, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberLessThanOrEqualTo(String value) {
            addCriterion("ChinaUnicom_boss_number <=", value, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberLike(String value) {
            addCriterion("ChinaUnicom_boss_number like", value, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberNotLike(String value) {
            addCriterion("ChinaUnicom_boss_number not like", value, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberIn(List<String> values) {
            addCriterion("ChinaUnicom_boss_number in", values, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberNotIn(List<String> values) {
            addCriterion("ChinaUnicom_boss_number not in", values, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberBetween(String value1, String value2) {
            addCriterion("ChinaUnicom_boss_number between", value1, value2, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomBossNumberNotBetween(String value1, String value2) {
            addCriterion("ChinaUnicom_boss_number not between", value1, value2, "chinaunicomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberIsNull() {
            addCriterion("ChinaUnicom_relay_number is null");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberIsNotNull() {
            addCriterion("ChinaUnicom_relay_number is not null");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberEqualTo(String value) {
            addCriterion("ChinaUnicom_relay_number =", value, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberNotEqualTo(String value) {
            addCriterion("ChinaUnicom_relay_number <>", value, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberGreaterThan(String value) {
            addCriterion("ChinaUnicom_relay_number >", value, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ChinaUnicom_relay_number >=", value, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberLessThan(String value) {
            addCriterion("ChinaUnicom_relay_number <", value, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberLessThanOrEqualTo(String value) {
            addCriterion("ChinaUnicom_relay_number <=", value, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberLike(String value) {
            addCriterion("ChinaUnicom_relay_number like", value, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberNotLike(String value) {
            addCriterion("ChinaUnicom_relay_number not like", value, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberIn(List<String> values) {
            addCriterion("ChinaUnicom_relay_number in", values, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberNotIn(List<String> values) {
            addCriterion("ChinaUnicom_relay_number not in", values, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberBetween(String value1, String value2) {
            addCriterion("ChinaUnicom_relay_number between", value1, value2, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinaunicomRelayNumberNotBetween(String value1, String value2) {
            addCriterion("ChinaUnicom_relay_number not between", value1, value2, "chinaunicomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberIsNull() {
            addCriterion("ChinaTelecom_boss_number is null");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberIsNotNull() {
            addCriterion("ChinaTelecom_boss_number is not null");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberEqualTo(String value) {
            addCriterion("ChinaTelecom_boss_number =", value, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberNotEqualTo(String value) {
            addCriterion("ChinaTelecom_boss_number <>", value, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberGreaterThan(String value) {
            addCriterion("ChinaTelecom_boss_number >", value, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ChinaTelecom_boss_number >=", value, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberLessThan(String value) {
            addCriterion("ChinaTelecom_boss_number <", value, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberLessThanOrEqualTo(String value) {
            addCriterion("ChinaTelecom_boss_number <=", value, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberLike(String value) {
            addCriterion("ChinaTelecom_boss_number like", value, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberNotLike(String value) {
            addCriterion("ChinaTelecom_boss_number not like", value, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberIn(List<String> values) {
            addCriterion("ChinaTelecom_boss_number in", values, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberNotIn(List<String> values) {
            addCriterion("ChinaTelecom_boss_number not in", values, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberBetween(String value1, String value2) {
            addCriterion("ChinaTelecom_boss_number between", value1, value2, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomBossNumberNotBetween(String value1, String value2) {
            addCriterion("ChinaTelecom_boss_number not between", value1, value2, "chinatelecomBossNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberIsNull() {
            addCriterion("ChinaTelecom_relay_number is null");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberIsNotNull() {
            addCriterion("ChinaTelecom_relay_number is not null");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberEqualTo(String value) {
            addCriterion("ChinaTelecom_relay_number =", value, "chinatelecomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberNotEqualTo(String value) {
            addCriterion("ChinaTelecom_relay_number <>", value, "chinatelecomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberGreaterThan(String value) {
            addCriterion("ChinaTelecom_relay_number >", value, "chinatelecomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ChinaTelecom_relay_number >=", value, "chinatelecomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberLessThan(String value) {
            addCriterion("ChinaTelecom_relay_number <", value, "chinatelecomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberLessThanOrEqualTo(String value) {
            addCriterion("ChinaTelecom_relay_number <=", value, "chinatelecomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberLike(String value) {
            addCriterion("ChinaTelecom_relay_number like", value, "chinatelecomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberNotLike(String value) {
            addCriterion("ChinaTelecom_relay_number not like", value, "chinatelecomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberIn(List<String> values) {
            addCriterion("ChinaTelecom_relay_number in", values, "chinatelecomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberNotIn(List<String> values) {
            addCriterion("ChinaTelecom_relay_number not in", values, "chinatelecomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberBetween(String value1, String value2) {
            addCriterion("ChinaTelecom_relay_number between", value1, value2, "chinatelecomRelayNumber");
            return (Criteria) this;
        }

        public Criteria andChinatelecomRelayNumberNotBetween(String value1, String value2) {
            addCriterion("ChinaTelecom_relay_number not between", value1, value2, "chinatelecomRelayNumber");
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