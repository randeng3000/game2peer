package game2peer.mybatis.domain;

import java.util.ArrayList;
import java.util.List;

public class RoleUrlExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public RoleUrlExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andGetRightIsNull() {
            addCriterion("get_right is null");
            return (Criteria) this;
        }

        public Criteria andGetRightIsNotNull() {
            addCriterion("get_right is not null");
            return (Criteria) this;
        }

        public Criteria andGetRightEqualTo(Integer value) {
            addCriterion("get_right =", value, "getRight");
            return (Criteria) this;
        }

        public Criteria andGetRightNotEqualTo(Integer value) {
            addCriterion("get_right <>", value, "getRight");
            return (Criteria) this;
        }

        public Criteria andGetRightGreaterThan(Integer value) {
            addCriterion("get_right >", value, "getRight");
            return (Criteria) this;
        }

        public Criteria andGetRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_right >=", value, "getRight");
            return (Criteria) this;
        }

        public Criteria andGetRightLessThan(Integer value) {
            addCriterion("get_right <", value, "getRight");
            return (Criteria) this;
        }

        public Criteria andGetRightLessThanOrEqualTo(Integer value) {
            addCriterion("get_right <=", value, "getRight");
            return (Criteria) this;
        }

        public Criteria andGetRightIn(List<Integer> values) {
            addCriterion("get_right in", values, "getRight");
            return (Criteria) this;
        }

        public Criteria andGetRightNotIn(List<Integer> values) {
            addCriterion("get_right not in", values, "getRight");
            return (Criteria) this;
        }

        public Criteria andGetRightBetween(Integer value1, Integer value2) {
            addCriterion("get_right between", value1, value2, "getRight");
            return (Criteria) this;
        }

        public Criteria andGetRightNotBetween(Integer value1, Integer value2) {
            addCriterion("get_right not between", value1, value2, "getRight");
            return (Criteria) this;
        }

        public Criteria andPutRightIsNull() {
            addCriterion("put_right is null");
            return (Criteria) this;
        }

        public Criteria andPutRightIsNotNull() {
            addCriterion("put_right is not null");
            return (Criteria) this;
        }

        public Criteria andPutRightEqualTo(Integer value) {
            addCriterion("put_right =", value, "putRight");
            return (Criteria) this;
        }

        public Criteria andPutRightNotEqualTo(Integer value) {
            addCriterion("put_right <>", value, "putRight");
            return (Criteria) this;
        }

        public Criteria andPutRightGreaterThan(Integer value) {
            addCriterion("put_right >", value, "putRight");
            return (Criteria) this;
        }

        public Criteria andPutRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("put_right >=", value, "putRight");
            return (Criteria) this;
        }

        public Criteria andPutRightLessThan(Integer value) {
            addCriterion("put_right <", value, "putRight");
            return (Criteria) this;
        }

        public Criteria andPutRightLessThanOrEqualTo(Integer value) {
            addCriterion("put_right <=", value, "putRight");
            return (Criteria) this;
        }

        public Criteria andPutRightIn(List<Integer> values) {
            addCriterion("put_right in", values, "putRight");
            return (Criteria) this;
        }

        public Criteria andPutRightNotIn(List<Integer> values) {
            addCriterion("put_right not in", values, "putRight");
            return (Criteria) this;
        }

        public Criteria andPutRightBetween(Integer value1, Integer value2) {
            addCriterion("put_right between", value1, value2, "putRight");
            return (Criteria) this;
        }

        public Criteria andPutRightNotBetween(Integer value1, Integer value2) {
            addCriterion("put_right not between", value1, value2, "putRight");
            return (Criteria) this;
        }

        public Criteria andDelRightIsNull() {
            addCriterion("del_right is null");
            return (Criteria) this;
        }

        public Criteria andDelRightIsNotNull() {
            addCriterion("del_right is not null");
            return (Criteria) this;
        }

        public Criteria andDelRightEqualTo(Integer value) {
            addCriterion("del_right =", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightNotEqualTo(Integer value) {
            addCriterion("del_right <>", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightGreaterThan(Integer value) {
            addCriterion("del_right >", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_right >=", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightLessThan(Integer value) {
            addCriterion("del_right <", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightLessThanOrEqualTo(Integer value) {
            addCriterion("del_right <=", value, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightIn(List<Integer> values) {
            addCriterion("del_right in", values, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightNotIn(List<Integer> values) {
            addCriterion("del_right not in", values, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightBetween(Integer value1, Integer value2) {
            addCriterion("del_right between", value1, value2, "delRight");
            return (Criteria) this;
        }

        public Criteria andDelRightNotBetween(Integer value1, Integer value2) {
            addCriterion("del_right not between", value1, value2, "delRight");
            return (Criteria) this;
        }

        public Criteria andModiRightIsNull() {
            addCriterion("modi_right is null");
            return (Criteria) this;
        }

        public Criteria andModiRightIsNotNull() {
            addCriterion("modi_right is not null");
            return (Criteria) this;
        }

        public Criteria andModiRightEqualTo(Integer value) {
            addCriterion("modi_right =", value, "modiRight");
            return (Criteria) this;
        }

        public Criteria andModiRightNotEqualTo(Integer value) {
            addCriterion("modi_right <>", value, "modiRight");
            return (Criteria) this;
        }

        public Criteria andModiRightGreaterThan(Integer value) {
            addCriterion("modi_right >", value, "modiRight");
            return (Criteria) this;
        }

        public Criteria andModiRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("modi_right >=", value, "modiRight");
            return (Criteria) this;
        }

        public Criteria andModiRightLessThan(Integer value) {
            addCriterion("modi_right <", value, "modiRight");
            return (Criteria) this;
        }

        public Criteria andModiRightLessThanOrEqualTo(Integer value) {
            addCriterion("modi_right <=", value, "modiRight");
            return (Criteria) this;
        }

        public Criteria andModiRightIn(List<Integer> values) {
            addCriterion("modi_right in", values, "modiRight");
            return (Criteria) this;
        }

        public Criteria andModiRightNotIn(List<Integer> values) {
            addCriterion("modi_right not in", values, "modiRight");
            return (Criteria) this;
        }

        public Criteria andModiRightBetween(Integer value1, Integer value2) {
            addCriterion("modi_right between", value1, value2, "modiRight");
            return (Criteria) this;
        }

        public Criteria andModiRightNotBetween(Integer value1, Integer value2) {
            addCriterion("modi_right not between", value1, value2, "modiRight");
            return (Criteria) this;
        }

        public Criteria andOperRightIsNull() {
            addCriterion("oper_right is null");
            return (Criteria) this;
        }

        public Criteria andOperRightIsNotNull() {
            addCriterion("oper_right is not null");
            return (Criteria) this;
        }

        public Criteria andOperRightEqualTo(Integer value) {
            addCriterion("oper_right =", value, "operRight");
            return (Criteria) this;
        }

        public Criteria andOperRightNotEqualTo(Integer value) {
            addCriterion("oper_right <>", value, "operRight");
            return (Criteria) this;
        }

        public Criteria andOperRightGreaterThan(Integer value) {
            addCriterion("oper_right >", value, "operRight");
            return (Criteria) this;
        }

        public Criteria andOperRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("oper_right >=", value, "operRight");
            return (Criteria) this;
        }

        public Criteria andOperRightLessThan(Integer value) {
            addCriterion("oper_right <", value, "operRight");
            return (Criteria) this;
        }

        public Criteria andOperRightLessThanOrEqualTo(Integer value) {
            addCriterion("oper_right <=", value, "operRight");
            return (Criteria) this;
        }

        public Criteria andOperRightIn(List<Integer> values) {
            addCriterion("oper_right in", values, "operRight");
            return (Criteria) this;
        }

        public Criteria andOperRightNotIn(List<Integer> values) {
            addCriterion("oper_right not in", values, "operRight");
            return (Criteria) this;
        }

        public Criteria andOperRightBetween(Integer value1, Integer value2) {
            addCriterion("oper_right between", value1, value2, "operRight");
            return (Criteria) this;
        }

        public Criteria andOperRightNotBetween(Integer value1, Integer value2) {
            addCriterion("oper_right not between", value1, value2, "operRight");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table role_url
     *
     * @mbg.generated do_not_delete_during_merge Mon May 15 08:36:44 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table role_url
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
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