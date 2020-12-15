package org.mypro.entity;

import java.util.ArrayList;
import java.util.List;

public class TaskExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TaskExample() {
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

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andIntroduceIsNull() {
			addCriterion("introduce is null");
			return (Criteria) this;
		}

		public Criteria andIntroduceIsNotNull() {
			addCriterion("introduce is not null");
			return (Criteria) this;
		}

		public Criteria andIntroduceEqualTo(String value) {
			addCriterion("introduce =", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceNotEqualTo(String value) {
			addCriterion("introduce <>", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceGreaterThan(String value) {
			addCriterion("introduce >", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
			addCriterion("introduce >=", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceLessThan(String value) {
			addCriterion("introduce <", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceLessThanOrEqualTo(String value) {
			addCriterion("introduce <=", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceLike(String value) {
			addCriterion("introduce like", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceNotLike(String value) {
			addCriterion("introduce not like", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceIn(List<String> values) {
			addCriterion("introduce in", values, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceNotIn(List<String> values) {
			addCriterion("introduce not in", values, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceBetween(String value1, String value2) {
			addCriterion("introduce between", value1, value2, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceNotBetween(String value1, String value2) {
			addCriterion("introduce not between", value1, value2, "introduce");
			return (Criteria) this;
		}

		public Criteria andClosingdateIsNull() {
			addCriterion("closingdate is null");
			return (Criteria) this;
		}

		public Criteria andClosingdateIsNotNull() {
			addCriterion("closingdate is not null");
			return (Criteria) this;
		}

		public Criteria andClosingdateEqualTo(String value) {
			addCriterion("closingdate =", value, "closingdate");
			return (Criteria) this;
		}

		public Criteria andClosingdateNotEqualTo(String value) {
			addCriterion("closingdate <>", value, "closingdate");
			return (Criteria) this;
		}

		public Criteria andClosingdateGreaterThan(String value) {
			addCriterion("closingdate >", value, "closingdate");
			return (Criteria) this;
		}

		public Criteria andClosingdateGreaterThanOrEqualTo(String value) {
			addCriterion("closingdate >=", value, "closingdate");
			return (Criteria) this;
		}

		public Criteria andClosingdateLessThan(String value) {
			addCriterion("closingdate <", value, "closingdate");
			return (Criteria) this;
		}

		public Criteria andClosingdateLessThanOrEqualTo(String value) {
			addCriterion("closingdate <=", value, "closingdate");
			return (Criteria) this;
		}

		public Criteria andClosingdateLike(String value) {
			addCriterion("closingdate like", value, "closingdate");
			return (Criteria) this;
		}

		public Criteria andClosingdateNotLike(String value) {
			addCriterion("closingdate not like", value, "closingdate");
			return (Criteria) this;
		}

		public Criteria andClosingdateIn(List<String> values) {
			addCriterion("closingdate in", values, "closingdate");
			return (Criteria) this;
		}

		public Criteria andClosingdateNotIn(List<String> values) {
			addCriterion("closingdate not in", values, "closingdate");
			return (Criteria) this;
		}

		public Criteria andClosingdateBetween(String value1, String value2) {
			addCriterion("closingdate between", value1, value2, "closingdate");
			return (Criteria) this;
		}

		public Criteria andClosingdateNotBetween(String value1, String value2) {
			addCriterion("closingdate not between", value1, value2, "closingdate");
			return (Criteria) this;
		}

		public Criteria andFileIsNull() {
			addCriterion("file is null");
			return (Criteria) this;
		}

		public Criteria andFileIsNotNull() {
			addCriterion("file is not null");
			return (Criteria) this;
		}

		public Criteria andFileEqualTo(String value) {
			addCriterion("file =", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileNotEqualTo(String value) {
			addCriterion("file <>", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileGreaterThan(String value) {
			addCriterion("file >", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileGreaterThanOrEqualTo(String value) {
			addCriterion("file >=", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileLessThan(String value) {
			addCriterion("file <", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileLessThanOrEqualTo(String value) {
			addCriterion("file <=", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileLike(String value) {
			addCriterion("file like", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileNotLike(String value) {
			addCriterion("file not like", value, "file");
			return (Criteria) this;
		}

		public Criteria andFileIn(List<String> values) {
			addCriterion("file in", values, "file");
			return (Criteria) this;
		}

		public Criteria andFileNotIn(List<String> values) {
			addCriterion("file not in", values, "file");
			return (Criteria) this;
		}

		public Criteria andFileBetween(String value1, String value2) {
			addCriterion("file between", value1, value2, "file");
			return (Criteria) this;
		}

		public Criteria andFileNotBetween(String value1, String value2) {
			addCriterion("file not between", value1, value2, "file");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberIsNull() {
			addCriterion("submitternumber is null");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberIsNotNull() {
			addCriterion("submitternumber is not null");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberEqualTo(String value) {
			addCriterion("submitternumber =", value, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberNotEqualTo(String value) {
			addCriterion("submitternumber <>", value, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberGreaterThan(String value) {
			addCriterion("submitternumber >", value, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberGreaterThanOrEqualTo(String value) {
			addCriterion("submitternumber >=", value, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberLessThan(String value) {
			addCriterion("submitternumber <", value, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberLessThanOrEqualTo(String value) {
			addCriterion("submitternumber <=", value, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberLike(String value) {
			addCriterion("submitternumber like", value, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberNotLike(String value) {
			addCriterion("submitternumber not like", value, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberIn(List<String> values) {
			addCriterion("submitternumber in", values, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberNotIn(List<String> values) {
			addCriterion("submitternumber not in", values, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberBetween(String value1, String value2) {
			addCriterion("submitternumber between", value1, value2, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andSubmitternumberNotBetween(String value1, String value2) {
			addCriterion("submitternumber not between", value1, value2, "submitternumber");
			return (Criteria) this;
		}

		public Criteria andCollectorIsNull() {
			addCriterion("collector is null");
			return (Criteria) this;
		}

		public Criteria andCollectorIsNotNull() {
			addCriterion("collector is not null");
			return (Criteria) this;
		}

		public Criteria andCollectorEqualTo(String value) {
			addCriterion("collector =", value, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectorNotEqualTo(String value) {
			addCriterion("collector <>", value, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectorGreaterThan(String value) {
			addCriterion("collector >", value, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectorGreaterThanOrEqualTo(String value) {
			addCriterion("collector >=", value, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectorLessThan(String value) {
			addCriterion("collector <", value, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectorLessThanOrEqualTo(String value) {
			addCriterion("collector <=", value, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectorLike(String value) {
			addCriterion("collector like", value, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectorNotLike(String value) {
			addCriterion("collector not like", value, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectorIn(List<String> values) {
			addCriterion("collector in", values, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectorNotIn(List<String> values) {
			addCriterion("collector not in", values, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectorBetween(String value1, String value2) {
			addCriterion("collector between", value1, value2, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectorNotBetween(String value1, String value2) {
			addCriterion("collector not between", value1, value2, "collector");
			return (Criteria) this;
		}

		public Criteria andCollectoridIsNull() {
			addCriterion("collectorid is null");
			return (Criteria) this;
		}

		public Criteria andCollectoridIsNotNull() {
			addCriterion("collectorid is not null");
			return (Criteria) this;
		}

		public Criteria andCollectoridEqualTo(Integer value) {
			addCriterion("collectorid =", value, "collectorid");
			return (Criteria) this;
		}

		public Criteria andCollectoridNotEqualTo(Integer value) {
			addCriterion("collectorid <>", value, "collectorid");
			return (Criteria) this;
		}

		public Criteria andCollectoridGreaterThan(Integer value) {
			addCriterion("collectorid >", value, "collectorid");
			return (Criteria) this;
		}

		public Criteria andCollectoridGreaterThanOrEqualTo(Integer value) {
			addCriterion("collectorid >=", value, "collectorid");
			return (Criteria) this;
		}

		public Criteria andCollectoridLessThan(Integer value) {
			addCriterion("collectorid <", value, "collectorid");
			return (Criteria) this;
		}

		public Criteria andCollectoridLessThanOrEqualTo(Integer value) {
			addCriterion("collectorid <=", value, "collectorid");
			return (Criteria) this;
		}

		public Criteria andCollectoridIn(List<Integer> values) {
			addCriterion("collectorid in", values, "collectorid");
			return (Criteria) this;
		}

		public Criteria andCollectoridNotIn(List<Integer> values) {
			addCriterion("collectorid not in", values, "collectorid");
			return (Criteria) this;
		}

		public Criteria andCollectoridBetween(Integer value1, Integer value2) {
			addCriterion("collectorid between", value1, value2, "collectorid");
			return (Criteria) this;
		}

		public Criteria andCollectoridNotBetween(Integer value1, Integer value2) {
			addCriterion("collectorid not between", value1, value2, "collectorid");
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