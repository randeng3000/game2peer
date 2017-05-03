package game2peer.mybatis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusiGameExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	public BusiGameExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
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

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andGameNameIsNull() {
			addCriterion("game_name is null");
			return (Criteria) this;
		}

		public Criteria andGameNameIsNotNull() {
			addCriterion("game_name is not null");
			return (Criteria) this;
		}

		public Criteria andGameNameEqualTo(String value) {
			addCriterion("game_name =", value, "gameName");
			return (Criteria) this;
		}

		public Criteria andGameNameNotEqualTo(String value) {
			addCriterion("game_name <>", value, "gameName");
			return (Criteria) this;
		}

		public Criteria andGameNameGreaterThan(String value) {
			addCriterion("game_name >", value, "gameName");
			return (Criteria) this;
		}

		public Criteria andGameNameGreaterThanOrEqualTo(String value) {
			addCriterion("game_name >=", value, "gameName");
			return (Criteria) this;
		}

		public Criteria andGameNameLessThan(String value) {
			addCriterion("game_name <", value, "gameName");
			return (Criteria) this;
		}

		public Criteria andGameNameLessThanOrEqualTo(String value) {
			addCriterion("game_name <=", value, "gameName");
			return (Criteria) this;
		}

		public Criteria andGameNameLike(String value) {
			addCriterion("game_name like", value, "gameName");
			return (Criteria) this;
		}

		public Criteria andGameNameNotLike(String value) {
			addCriterion("game_name not like", value, "gameName");
			return (Criteria) this;
		}

		public Criteria andGameNameIn(List<String> values) {
			addCriterion("game_name in", values, "gameName");
			return (Criteria) this;
		}

		public Criteria andGameNameNotIn(List<String> values) {
			addCriterion("game_name not in", values, "gameName");
			return (Criteria) this;
		}

		public Criteria andGameNameBetween(String value1, String value2) {
			addCriterion("game_name between", value1, value2, "gameName");
			return (Criteria) this;
		}

		public Criteria andGameNameNotBetween(String value1, String value2) {
			addCriterion("game_name not between", value1, value2, "gameName");
			return (Criteria) this;
		}

		public Criteria andLangIsNull() {
			addCriterion("lang is null");
			return (Criteria) this;
		}

		public Criteria andLangIsNotNull() {
			addCriterion("lang is not null");
			return (Criteria) this;
		}

		public Criteria andLangEqualTo(String value) {
			addCriterion("lang =", value, "lang");
			return (Criteria) this;
		}

		public Criteria andLangNotEqualTo(String value) {
			addCriterion("lang <>", value, "lang");
			return (Criteria) this;
		}

		public Criteria andLangGreaterThan(String value) {
			addCriterion("lang >", value, "lang");
			return (Criteria) this;
		}

		public Criteria andLangGreaterThanOrEqualTo(String value) {
			addCriterion("lang >=", value, "lang");
			return (Criteria) this;
		}

		public Criteria andLangLessThan(String value) {
			addCriterion("lang <", value, "lang");
			return (Criteria) this;
		}

		public Criteria andLangLessThanOrEqualTo(String value) {
			addCriterion("lang <=", value, "lang");
			return (Criteria) this;
		}

		public Criteria andLangLike(String value) {
			addCriterion("lang like", value, "lang");
			return (Criteria) this;
		}

		public Criteria andLangNotLike(String value) {
			addCriterion("lang not like", value, "lang");
			return (Criteria) this;
		}

		public Criteria andLangIn(List<String> values) {
			addCriterion("lang in", values, "lang");
			return (Criteria) this;
		}

		public Criteria andLangNotIn(List<String> values) {
			addCriterion("lang not in", values, "lang");
			return (Criteria) this;
		}

		public Criteria andLangBetween(String value1, String value2) {
			addCriterion("lang between", value1, value2, "lang");
			return (Criteria) this;
		}

		public Criteria andLangNotBetween(String value1, String value2) {
			addCriterion("lang not between", value1, value2, "lang");
			return (Criteria) this;
		}

		public Criteria andBaseProfitIsNull() {
			addCriterion("base_profit is null");
			return (Criteria) this;
		}

		public Criteria andBaseProfitIsNotNull() {
			addCriterion("base_profit is not null");
			return (Criteria) this;
		}

		public Criteria andBaseProfitEqualTo(Long value) {
			addCriterion("base_profit =", value, "baseProfit");
			return (Criteria) this;
		}

		public Criteria andBaseProfitNotEqualTo(Long value) {
			addCriterion("base_profit <>", value, "baseProfit");
			return (Criteria) this;
		}

		public Criteria andBaseProfitGreaterThan(Long value) {
			addCriterion("base_profit >", value, "baseProfit");
			return (Criteria) this;
		}

		public Criteria andBaseProfitGreaterThanOrEqualTo(Long value) {
			addCriterion("base_profit >=", value, "baseProfit");
			return (Criteria) this;
		}

		public Criteria andBaseProfitLessThan(Long value) {
			addCriterion("base_profit <", value, "baseProfit");
			return (Criteria) this;
		}

		public Criteria andBaseProfitLessThanOrEqualTo(Long value) {
			addCriterion("base_profit <=", value, "baseProfit");
			return (Criteria) this;
		}

		public Criteria andBaseProfitIn(List<Long> values) {
			addCriterion("base_profit in", values, "baseProfit");
			return (Criteria) this;
		}

		public Criteria andBaseProfitNotIn(List<Long> values) {
			addCriterion("base_profit not in", values, "baseProfit");
			return (Criteria) this;
		}

		public Criteria andBaseProfitBetween(Long value1, Long value2) {
			addCriterion("base_profit between", value1, value2, "baseProfit");
			return (Criteria) this;
		}

		public Criteria andBaseProfitNotBetween(Long value1, Long value2) {
			addCriterion("base_profit not between", value1, value2, "baseProfit");
			return (Criteria) this;
		}

		public Criteria andAddProfitIsNull() {
			addCriterion("add_profit is null");
			return (Criteria) this;
		}

		public Criteria andAddProfitIsNotNull() {
			addCriterion("add_profit is not null");
			return (Criteria) this;
		}

		public Criteria andAddProfitEqualTo(Long value) {
			addCriterion("add_profit =", value, "addProfit");
			return (Criteria) this;
		}

		public Criteria andAddProfitNotEqualTo(Long value) {
			addCriterion("add_profit <>", value, "addProfit");
			return (Criteria) this;
		}

		public Criteria andAddProfitGreaterThan(Long value) {
			addCriterion("add_profit >", value, "addProfit");
			return (Criteria) this;
		}

		public Criteria andAddProfitGreaterThanOrEqualTo(Long value) {
			addCriterion("add_profit >=", value, "addProfit");
			return (Criteria) this;
		}

		public Criteria andAddProfitLessThan(Long value) {
			addCriterion("add_profit <", value, "addProfit");
			return (Criteria) this;
		}

		public Criteria andAddProfitLessThanOrEqualTo(Long value) {
			addCriterion("add_profit <=", value, "addProfit");
			return (Criteria) this;
		}

		public Criteria andAddProfitIn(List<Long> values) {
			addCriterion("add_profit in", values, "addProfit");
			return (Criteria) this;
		}

		public Criteria andAddProfitNotIn(List<Long> values) {
			addCriterion("add_profit not in", values, "addProfit");
			return (Criteria) this;
		}

		public Criteria andAddProfitBetween(Long value1, Long value2) {
			addCriterion("add_profit between", value1, value2, "addProfit");
			return (Criteria) this;
		}

		public Criteria andAddProfitNotBetween(Long value1, Long value2) {
			addCriterion("add_profit not between", value1, value2, "addProfit");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginIsNull() {
			addCriterion("add_profit_begin is null");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginIsNotNull() {
			addCriterion("add_profit_begin is not null");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginEqualTo(Date value) {
			addCriterion("add_profit_begin =", value, "addProfitBegin");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginNotEqualTo(Date value) {
			addCriterion("add_profit_begin <>", value, "addProfitBegin");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginGreaterThan(Date value) {
			addCriterion("add_profit_begin >", value, "addProfitBegin");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginGreaterThanOrEqualTo(Date value) {
			addCriterion("add_profit_begin >=", value, "addProfitBegin");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginLessThan(Date value) {
			addCriterion("add_profit_begin <", value, "addProfitBegin");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginLessThanOrEqualTo(Date value) {
			addCriterion("add_profit_begin <=", value, "addProfitBegin");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginIn(List<Date> values) {
			addCriterion("add_profit_begin in", values, "addProfitBegin");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginNotIn(List<Date> values) {
			addCriterion("add_profit_begin not in", values, "addProfitBegin");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginBetween(Date value1, Date value2) {
			addCriterion("add_profit_begin between", value1, value2, "addProfitBegin");
			return (Criteria) this;
		}

		public Criteria andAddProfitBeginNotBetween(Date value1, Date value2) {
			addCriterion("add_profit_begin not between", value1, value2, "addProfitBegin");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndIsNull() {
			addCriterion("add_profit_end is null");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndIsNotNull() {
			addCriterion("add_profit_end is not null");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndEqualTo(Date value) {
			addCriterion("add_profit_end =", value, "addProfitEnd");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndNotEqualTo(Date value) {
			addCriterion("add_profit_end <>", value, "addProfitEnd");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndGreaterThan(Date value) {
			addCriterion("add_profit_end >", value, "addProfitEnd");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndGreaterThanOrEqualTo(Date value) {
			addCriterion("add_profit_end >=", value, "addProfitEnd");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndLessThan(Date value) {
			addCriterion("add_profit_end <", value, "addProfitEnd");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndLessThanOrEqualTo(Date value) {
			addCriterion("add_profit_end <=", value, "addProfitEnd");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndIn(List<Date> values) {
			addCriterion("add_profit_end in", values, "addProfitEnd");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndNotIn(List<Date> values) {
			addCriterion("add_profit_end not in", values, "addProfitEnd");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndBetween(Date value1, Date value2) {
			addCriterion("add_profit_end between", value1, value2, "addProfitEnd");
			return (Criteria) this;
		}

		public Criteria andAddProfitEndNotBetween(Date value1, Date value2) {
			addCriterion("add_profit_end not between", value1, value2, "addProfitEnd");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledIsNull() {
			addCriterion("add_profit_enabled is null");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledIsNotNull() {
			addCriterion("add_profit_enabled is not null");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledEqualTo(Short value) {
			addCriterion("add_profit_enabled =", value, "addProfitEnabled");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledNotEqualTo(Short value) {
			addCriterion("add_profit_enabled <>", value, "addProfitEnabled");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledGreaterThan(Short value) {
			addCriterion("add_profit_enabled >", value, "addProfitEnabled");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledGreaterThanOrEqualTo(Short value) {
			addCriterion("add_profit_enabled >=", value, "addProfitEnabled");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledLessThan(Short value) {
			addCriterion("add_profit_enabled <", value, "addProfitEnabled");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledLessThanOrEqualTo(Short value) {
			addCriterion("add_profit_enabled <=", value, "addProfitEnabled");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledIn(List<Short> values) {
			addCriterion("add_profit_enabled in", values, "addProfitEnabled");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledNotIn(List<Short> values) {
			addCriterion("add_profit_enabled not in", values, "addProfitEnabled");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledBetween(Short value1, Short value2) {
			addCriterion("add_profit_enabled between", value1, value2, "addProfitEnabled");
			return (Criteria) this;
		}

		public Criteria andAddProfitEnabledNotBetween(Short value1, Short value2) {
			addCriterion("add_profit_enabled not between", value1, value2, "addProfitEnabled");
			return (Criteria) this;
		}

		public Criteria andLogoIsNull() {
			addCriterion("logo is null");
			return (Criteria) this;
		}

		public Criteria andLogoIsNotNull() {
			addCriterion("logo is not null");
			return (Criteria) this;
		}

		public Criteria andLogoEqualTo(String value) {
			addCriterion("logo =", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoNotEqualTo(String value) {
			addCriterion("logo <>", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoGreaterThan(String value) {
			addCriterion("logo >", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoGreaterThanOrEqualTo(String value) {
			addCriterion("logo >=", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoLessThan(String value) {
			addCriterion("logo <", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoLessThanOrEqualTo(String value) {
			addCriterion("logo <=", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoLike(String value) {
			addCriterion("logo like", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoNotLike(String value) {
			addCriterion("logo not like", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoIn(List<String> values) {
			addCriterion("logo in", values, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoNotIn(List<String> values) {
			addCriterion("logo not in", values, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoBetween(String value1, String value2) {
			addCriterion("logo between", value1, value2, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoNotBetween(String value1, String value2) {
			addCriterion("logo not between", value1, value2, "logo");
			return (Criteria) this;
		}

		public Criteria andImageIsNull() {
			addCriterion("image is null");
			return (Criteria) this;
		}

		public Criteria andImageIsNotNull() {
			addCriterion("image is not null");
			return (Criteria) this;
		}

		public Criteria andImageEqualTo(String value) {
			addCriterion("image =", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotEqualTo(String value) {
			addCriterion("image <>", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageGreaterThan(String value) {
			addCriterion("image >", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageGreaterThanOrEqualTo(String value) {
			addCriterion("image >=", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLessThan(String value) {
			addCriterion("image <", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLessThanOrEqualTo(String value) {
			addCriterion("image <=", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLike(String value) {
			addCriterion("image like", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotLike(String value) {
			addCriterion("image not like", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageIn(List<String> values) {
			addCriterion("image in", values, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotIn(List<String> values) {
			addCriterion("image not in", values, "image");
			return (Criteria) this;
		}

		public Criteria andImageBetween(String value1, String value2) {
			addCriterion("image between", value1, value2, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotBetween(String value1, String value2) {
			addCriterion("image not between", value1, value2, "image");
			return (Criteria) this;
		}

		public Criteria andSummaryIsNull() {
			addCriterion("summary is null");
			return (Criteria) this;
		}

		public Criteria andSummaryIsNotNull() {
			addCriterion("summary is not null");
			return (Criteria) this;
		}

		public Criteria andSummaryEqualTo(String value) {
			addCriterion("summary =", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotEqualTo(String value) {
			addCriterion("summary <>", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryGreaterThan(String value) {
			addCriterion("summary >", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryGreaterThanOrEqualTo(String value) {
			addCriterion("summary >=", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryLessThan(String value) {
			addCriterion("summary <", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryLessThanOrEqualTo(String value) {
			addCriterion("summary <=", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryLike(String value) {
			addCriterion("summary like", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotLike(String value) {
			addCriterion("summary not like", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryIn(List<String> values) {
			addCriterion("summary in", values, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotIn(List<String> values) {
			addCriterion("summary not in", values, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryBetween(String value1, String value2) {
			addCriterion("summary between", value1, value2, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotBetween(String value1, String value2) {
			addCriterion("summary not between", value1, value2, "summary");
			return (Criteria) this;
		}

		public Criteria andCoverImageIsNull() {
			addCriterion("cover_image is null");
			return (Criteria) this;
		}

		public Criteria andCoverImageIsNotNull() {
			addCriterion("cover_image is not null");
			return (Criteria) this;
		}

		public Criteria andCoverImageEqualTo(String value) {
			addCriterion("cover_image =", value, "coverImage");
			return (Criteria) this;
		}

		public Criteria andCoverImageNotEqualTo(String value) {
			addCriterion("cover_image <>", value, "coverImage");
			return (Criteria) this;
		}

		public Criteria andCoverImageGreaterThan(String value) {
			addCriterion("cover_image >", value, "coverImage");
			return (Criteria) this;
		}

		public Criteria andCoverImageGreaterThanOrEqualTo(String value) {
			addCriterion("cover_image >=", value, "coverImage");
			return (Criteria) this;
		}

		public Criteria andCoverImageLessThan(String value) {
			addCriterion("cover_image <", value, "coverImage");
			return (Criteria) this;
		}

		public Criteria andCoverImageLessThanOrEqualTo(String value) {
			addCriterion("cover_image <=", value, "coverImage");
			return (Criteria) this;
		}

		public Criteria andCoverImageLike(String value) {
			addCriterion("cover_image like", value, "coverImage");
			return (Criteria) this;
		}

		public Criteria andCoverImageNotLike(String value) {
			addCriterion("cover_image not like", value, "coverImage");
			return (Criteria) this;
		}

		public Criteria andCoverImageIn(List<String> values) {
			addCriterion("cover_image in", values, "coverImage");
			return (Criteria) this;
		}

		public Criteria andCoverImageNotIn(List<String> values) {
			addCriterion("cover_image not in", values, "coverImage");
			return (Criteria) this;
		}

		public Criteria andCoverImageBetween(String value1, String value2) {
			addCriterion("cover_image between", value1, value2, "coverImage");
			return (Criteria) this;
		}

		public Criteria andCoverImageNotBetween(String value1, String value2) {
			addCriterion("cover_image not between", value1, value2, "coverImage");
			return (Criteria) this;
		}

		public Criteria andRecommendedIsNull() {
			addCriterion("recommended is null");
			return (Criteria) this;
		}

		public Criteria andRecommendedIsNotNull() {
			addCriterion("recommended is not null");
			return (Criteria) this;
		}

		public Criteria andRecommendedEqualTo(Integer value) {
			addCriterion("recommended =", value, "recommended");
			return (Criteria) this;
		}

		public Criteria andRecommendedNotEqualTo(Integer value) {
			addCriterion("recommended <>", value, "recommended");
			return (Criteria) this;
		}

		public Criteria andRecommendedGreaterThan(Integer value) {
			addCriterion("recommended >", value, "recommended");
			return (Criteria) this;
		}

		public Criteria andRecommendedGreaterThanOrEqualTo(Integer value) {
			addCriterion("recommended >=", value, "recommended");
			return (Criteria) this;
		}

		public Criteria andRecommendedLessThan(Integer value) {
			addCriterion("recommended <", value, "recommended");
			return (Criteria) this;
		}

		public Criteria andRecommendedLessThanOrEqualTo(Integer value) {
			addCriterion("recommended <=", value, "recommended");
			return (Criteria) this;
		}

		public Criteria andRecommendedIn(List<Integer> values) {
			addCriterion("recommended in", values, "recommended");
			return (Criteria) this;
		}

		public Criteria andRecommendedNotIn(List<Integer> values) {
			addCriterion("recommended not in", values, "recommended");
			return (Criteria) this;
		}

		public Criteria andRecommendedBetween(Integer value1, Integer value2) {
			addCriterion("recommended between", value1, value2, "recommended");
			return (Criteria) this;
		}

		public Criteria andRecommendedNotBetween(Integer value1, Integer value2) {
			addCriterion("recommended not between", value1, value2, "recommended");
			return (Criteria) this;
		}

		public Criteria andGameCodeIsNull() {
			addCriterion("game_code is null");
			return (Criteria) this;
		}

		public Criteria andGameCodeIsNotNull() {
			addCriterion("game_code is not null");
			return (Criteria) this;
		}

		public Criteria andGameCodeEqualTo(String value) {
			addCriterion("game_code =", value, "gameCode");
			return (Criteria) this;
		}

		public Criteria andGameCodeNotEqualTo(String value) {
			addCriterion("game_code <>", value, "gameCode");
			return (Criteria) this;
		}

		public Criteria andGameCodeGreaterThan(String value) {
			addCriterion("game_code >", value, "gameCode");
			return (Criteria) this;
		}

		public Criteria andGameCodeGreaterThanOrEqualTo(String value) {
			addCriterion("game_code >=", value, "gameCode");
			return (Criteria) this;
		}

		public Criteria andGameCodeLessThan(String value) {
			addCriterion("game_code <", value, "gameCode");
			return (Criteria) this;
		}

		public Criteria andGameCodeLessThanOrEqualTo(String value) {
			addCriterion("game_code <=", value, "gameCode");
			return (Criteria) this;
		}

		public Criteria andGameCodeLike(String value) {
			addCriterion("game_code like", value, "gameCode");
			return (Criteria) this;
		}

		public Criteria andGameCodeNotLike(String value) {
			addCriterion("game_code not like", value, "gameCode");
			return (Criteria) this;
		}

		public Criteria andGameCodeIn(List<String> values) {
			addCriterion("game_code in", values, "gameCode");
			return (Criteria) this;
		}

		public Criteria andGameCodeNotIn(List<String> values) {
			addCriterion("game_code not in", values, "gameCode");
			return (Criteria) this;
		}

		public Criteria andGameCodeBetween(String value1, String value2) {
			addCriterion("game_code between", value1, value2, "gameCode");
			return (Criteria) this;
		}

		public Criteria andGameCodeNotBetween(String value1, String value2) {
			addCriterion("game_code not between", value1, value2, "gameCode");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table busi_game
	 * @mbg.generated  Mon Apr 17 10:22:25 CST 2017
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table busi_game
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 17 09:36:01 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}