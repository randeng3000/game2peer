package game2peer.mybatis.domain;

import java.util.ArrayList;
import java.util.List;

public class GlobalValueExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	public GlobalValueExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
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

		public Criteria andGKeyIsNull() {
			addCriterion("g_key is null");
			return (Criteria) this;
		}

		public Criteria andGKeyIsNotNull() {
			addCriterion("g_key is not null");
			return (Criteria) this;
		}

		public Criteria andGKeyEqualTo(String value) {
			addCriterion("g_key =", value, "gKey");
			return (Criteria) this;
		}

		public Criteria andGKeyNotEqualTo(String value) {
			addCriterion("g_key <>", value, "gKey");
			return (Criteria) this;
		}

		public Criteria andGKeyGreaterThan(String value) {
			addCriterion("g_key >", value, "gKey");
			return (Criteria) this;
		}

		public Criteria andGKeyGreaterThanOrEqualTo(String value) {
			addCriterion("g_key >=", value, "gKey");
			return (Criteria) this;
		}

		public Criteria andGKeyLessThan(String value) {
			addCriterion("g_key <", value, "gKey");
			return (Criteria) this;
		}

		public Criteria andGKeyLessThanOrEqualTo(String value) {
			addCriterion("g_key <=", value, "gKey");
			return (Criteria) this;
		}

		public Criteria andGKeyLike(String value) {
			addCriterion("g_key like", value, "gKey");
			return (Criteria) this;
		}

		public Criteria andGKeyNotLike(String value) {
			addCriterion("g_key not like", value, "gKey");
			return (Criteria) this;
		}

		public Criteria andGKeyIn(List<String> values) {
			addCriterion("g_key in", values, "gKey");
			return (Criteria) this;
		}

		public Criteria andGKeyNotIn(List<String> values) {
			addCriterion("g_key not in", values, "gKey");
			return (Criteria) this;
		}

		public Criteria andGKeyBetween(String value1, String value2) {
			addCriterion("g_key between", value1, value2, "gKey");
			return (Criteria) this;
		}

		public Criteria andGKeyNotBetween(String value1, String value2) {
			addCriterion("g_key not between", value1, value2, "gKey");
			return (Criteria) this;
		}

		public Criteria andGValueIsNull() {
			addCriterion("g_value is null");
			return (Criteria) this;
		}

		public Criteria andGValueIsNotNull() {
			addCriterion("g_value is not null");
			return (Criteria) this;
		}

		public Criteria andGValueEqualTo(String value) {
			addCriterion("g_value =", value, "gValue");
			return (Criteria) this;
		}

		public Criteria andGValueNotEqualTo(String value) {
			addCriterion("g_value <>", value, "gValue");
			return (Criteria) this;
		}

		public Criteria andGValueGreaterThan(String value) {
			addCriterion("g_value >", value, "gValue");
			return (Criteria) this;
		}

		public Criteria andGValueGreaterThanOrEqualTo(String value) {
			addCriterion("g_value >=", value, "gValue");
			return (Criteria) this;
		}

		public Criteria andGValueLessThan(String value) {
			addCriterion("g_value <", value, "gValue");
			return (Criteria) this;
		}

		public Criteria andGValueLessThanOrEqualTo(String value) {
			addCriterion("g_value <=", value, "gValue");
			return (Criteria) this;
		}

		public Criteria andGValueLike(String value) {
			addCriterion("g_value like", value, "gValue");
			return (Criteria) this;
		}

		public Criteria andGValueNotLike(String value) {
			addCriterion("g_value not like", value, "gValue");
			return (Criteria) this;
		}

		public Criteria andGValueIn(List<String> values) {
			addCriterion("g_value in", values, "gValue");
			return (Criteria) this;
		}

		public Criteria andGValueNotIn(List<String> values) {
			addCriterion("g_value not in", values, "gValue");
			return (Criteria) this;
		}

		public Criteria andGValueBetween(String value1, String value2) {
			addCriterion("g_value between", value1, value2, "gValue");
			return (Criteria) this;
		}

		public Criteria andGValueNotBetween(String value1, String value2) {
			addCriterion("g_value not between", value1, value2, "gValue");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table global_value
	 * @mbg.generated  Sat Apr 29 22:50:27 CST 2017
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
     * This class corresponds to the database table global_value
     *
     * @mbg.generated do_not_delete_during_merge Sat Apr 29 22:49:43 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}