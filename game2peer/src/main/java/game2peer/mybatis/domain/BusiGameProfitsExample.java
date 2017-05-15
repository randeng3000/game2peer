package game2peer.mybatis.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusiGameProfitsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public BusiGameProfitsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
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
     * This method corresponds to the database table busi_game_profits
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
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
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
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_game_profits
     *
     * @mbg.generated Mon May 15 08:36:44 CST 2017
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table busi_game_profits
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(String value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(String value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(String value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(String value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(String value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(String value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLike(String value) {
            addCriterion("game_id like", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotLike(String value) {
            addCriterion("game_id not like", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<String> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<String> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(String value1, String value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(String value1, String value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(BigDecimal value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(BigDecimal value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(BigDecimal value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(BigDecimal value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<BigDecimal> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<BigDecimal> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBeginIsNull() {
            addCriterion("profit_begin is null");
            return (Criteria) this;
        }

        public Criteria andProfitBeginIsNotNull() {
            addCriterion("profit_begin is not null");
            return (Criteria) this;
        }

        public Criteria andProfitBeginEqualTo(Date value) {
            addCriterion("profit_begin =", value, "profitBegin");
            return (Criteria) this;
        }

        public Criteria andProfitBeginNotEqualTo(Date value) {
            addCriterion("profit_begin <>", value, "profitBegin");
            return (Criteria) this;
        }

        public Criteria andProfitBeginGreaterThan(Date value) {
            addCriterion("profit_begin >", value, "profitBegin");
            return (Criteria) this;
        }

        public Criteria andProfitBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("profit_begin >=", value, "profitBegin");
            return (Criteria) this;
        }

        public Criteria andProfitBeginLessThan(Date value) {
            addCriterion("profit_begin <", value, "profitBegin");
            return (Criteria) this;
        }

        public Criteria andProfitBeginLessThanOrEqualTo(Date value) {
            addCriterion("profit_begin <=", value, "profitBegin");
            return (Criteria) this;
        }

        public Criteria andProfitBeginIn(List<Date> values) {
            addCriterion("profit_begin in", values, "profitBegin");
            return (Criteria) this;
        }

        public Criteria andProfitBeginNotIn(List<Date> values) {
            addCriterion("profit_begin not in", values, "profitBegin");
            return (Criteria) this;
        }

        public Criteria andProfitBeginBetween(Date value1, Date value2) {
            addCriterion("profit_begin between", value1, value2, "profitBegin");
            return (Criteria) this;
        }

        public Criteria andProfitBeginNotBetween(Date value1, Date value2) {
            addCriterion("profit_begin not between", value1, value2, "profitBegin");
            return (Criteria) this;
        }

        public Criteria andProfitEndIsNull() {
            addCriterion("profit_end is null");
            return (Criteria) this;
        }

        public Criteria andProfitEndIsNotNull() {
            addCriterion("profit_end is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEndEqualTo(Date value) {
            addCriterion("profit_end =", value, "profitEnd");
            return (Criteria) this;
        }

        public Criteria andProfitEndNotEqualTo(Date value) {
            addCriterion("profit_end <>", value, "profitEnd");
            return (Criteria) this;
        }

        public Criteria andProfitEndGreaterThan(Date value) {
            addCriterion("profit_end >", value, "profitEnd");
            return (Criteria) this;
        }

        public Criteria andProfitEndGreaterThanOrEqualTo(Date value) {
            addCriterion("profit_end >=", value, "profitEnd");
            return (Criteria) this;
        }

        public Criteria andProfitEndLessThan(Date value) {
            addCriterion("profit_end <", value, "profitEnd");
            return (Criteria) this;
        }

        public Criteria andProfitEndLessThanOrEqualTo(Date value) {
            addCriterion("profit_end <=", value, "profitEnd");
            return (Criteria) this;
        }

        public Criteria andProfitEndIn(List<Date> values) {
            addCriterion("profit_end in", values, "profitEnd");
            return (Criteria) this;
        }

        public Criteria andProfitEndNotIn(List<Date> values) {
            addCriterion("profit_end not in", values, "profitEnd");
            return (Criteria) this;
        }

        public Criteria andProfitEndBetween(Date value1, Date value2) {
            addCriterion("profit_end between", value1, value2, "profitEnd");
            return (Criteria) this;
        }

        public Criteria andProfitEndNotBetween(Date value1, Date value2) {
            addCriterion("profit_end not between", value1, value2, "profitEnd");
            return (Criteria) this;
        }

        public Criteria andModeIsNull() {
            addCriterion("mode is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("mode is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(Integer value) {
            addCriterion("mode =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(Integer value) {
            addCriterion("mode <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(Integer value) {
            addCriterion("mode >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mode >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(Integer value) {
            addCriterion("mode <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(Integer value) {
            addCriterion("mode <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<Integer> values) {
            addCriterion("mode in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<Integer> values) {
            addCriterion("mode not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(Integer value1, Integer value2) {
            addCriterion("mode between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(Integer value1, Integer value2) {
            addCriterion("mode not between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIsNull() {
            addCriterion("profit_type is null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIsNotNull() {
            addCriterion("profit_type is not null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeEqualTo(String value) {
            addCriterion("profit_type =", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotEqualTo(String value) {
            addCriterion("profit_type <>", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThan(String value) {
            addCriterion("profit_type >", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("profit_type >=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThan(String value) {
            addCriterion("profit_type <", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThanOrEqualTo(String value) {
            addCriterion("profit_type <=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLike(String value) {
            addCriterion("profit_type like", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotLike(String value) {
            addCriterion("profit_type not like", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIn(List<String> values) {
            addCriterion("profit_type in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotIn(List<String> values) {
            addCriterion("profit_type not in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeBetween(String value1, String value2) {
            addCriterion("profit_type between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotBetween(String value1, String value2) {
            addCriterion("profit_type not between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andShowDateIsNull() {
            addCriterion("show_date is null");
            return (Criteria) this;
        }

        public Criteria andShowDateIsNotNull() {
            addCriterion("show_date is not null");
            return (Criteria) this;
        }

        public Criteria andShowDateEqualTo(Date value) {
            addCriterion("show_date =", value, "showDate");
            return (Criteria) this;
        }

        public Criteria andShowDateNotEqualTo(Date value) {
            addCriterion("show_date <>", value, "showDate");
            return (Criteria) this;
        }

        public Criteria andShowDateGreaterThan(Date value) {
            addCriterion("show_date >", value, "showDate");
            return (Criteria) this;
        }

        public Criteria andShowDateGreaterThanOrEqualTo(Date value) {
            addCriterion("show_date >=", value, "showDate");
            return (Criteria) this;
        }

        public Criteria andShowDateLessThan(Date value) {
            addCriterion("show_date <", value, "showDate");
            return (Criteria) this;
        }

        public Criteria andShowDateLessThanOrEqualTo(Date value) {
            addCriterion("show_date <=", value, "showDate");
            return (Criteria) this;
        }

        public Criteria andShowDateIn(List<Date> values) {
            addCriterion("show_date in", values, "showDate");
            return (Criteria) this;
        }

        public Criteria andShowDateNotIn(List<Date> values) {
            addCriterion("show_date not in", values, "showDate");
            return (Criteria) this;
        }

        public Criteria andShowDateBetween(Date value1, Date value2) {
            addCriterion("show_date between", value1, value2, "showDate");
            return (Criteria) this;
        }

        public Criteria andShowDateNotBetween(Date value1, Date value2) {
            addCriterion("show_date not between", value1, value2, "showDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table busi_game_profits
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
     * This class corresponds to the database table busi_game_profits
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