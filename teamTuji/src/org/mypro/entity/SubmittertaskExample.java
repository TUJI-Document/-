package org.mypro.entity;

import java.util.ArrayList;
import java.util.List;

public class SubmittertaskExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public SubmittertaskExample() {
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

		public Criteria andTaskIsNull() {
			addCriterion("task is null");
			return (Criteria) this;
		}

		public Criteria andTaskIsNotNull() {
			addCriterion("task is not null");
			return (Criteria) this;
		}

		public Criteria andTaskEqualTo(String value) {
			addCriterion("task =", value, "task");
			return (Criteria) this;
		}

		public Criteria andTaskNotEqualTo(String value) {
			addCriterion("task <>", value, "task");
			return (Criteria) this;
		}

		public Criteria andTaskGreaterThan(String value) {
			addCriterion("task >", value, "task");
			return (Criteria) this;
		}

		public Criteria andTaskGreaterThanOrEqualTo(String value) {
			addCriterion("task >=", value, "task");
			return (Criteria) this;
		}

		public Criteria andTaskLessThan(String value) {
			addCriterion("task <", value, "task");
			return (Criteria) this;
		}

		public Criteria andTaskLessThanOrEqualTo(String value) {
			addCriterion("task <=", value, "task");
			return (Criteria) this;
		}

		public Criteria andTaskLike(String value) {
			addCriterion("task like", value, "task");
			return (Criteria) this;
		}

		public Criteria andTaskNotLike(String value) {
			addCriterion("task not like", value, "task");
			return (Criteria) this;
		}

		public Criteria andTaskIn(List<String> values) {
			addCriterion("task in", values, "task");
			return (Criteria) this;
		}

		public Criteria andTaskNotIn(List<String> values) {
			addCriterion("task not in", values, "task");
			return (Criteria) this;
		}

		public Criteria andTaskBetween(String value1, String value2) {
			addCriterion("task between", value1, value2, "task");
			return (Criteria) this;
		}

		public Criteria andTaskNotBetween(String value1, String value2) {
			addCriterion("task not between", value1, value2, "task");
			return (Criteria) this;
		}

		public Criteria andTaskidIsNull() {
			addCriterion("taskid is null");
			return (Criteria) this;
		}

		public Criteria andTaskidIsNotNull() {
			addCriterion("taskid is not null");
			return (Criteria) this;
		}

		public Criteria andTaskidEqualTo(Integer value) {
			addCriterion("taskid =", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidNotEqualTo(Integer value) {
			addCriterion("taskid <>", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidGreaterThan(Integer value) {
			addCriterion("taskid >", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidGreaterThanOrEqualTo(Integer value) {
			addCriterion("taskid >=", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidLessThan(Integer value) {
			addCriterion("taskid <", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidLessThanOrEqualTo(Integer value) {
			addCriterion("taskid <=", value, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidIn(List<Integer> values) {
			addCriterion("taskid in", values, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidNotIn(List<Integer> values) {
			addCriterion("taskid not in", values, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidBetween(Integer value1, Integer value2) {
			addCriterion("taskid between", value1, value2, "taskid");
			return (Criteria) this;
		}

		public Criteria andTaskidNotBetween(Integer value1, Integer value2) {
			addCriterion("taskid not between", value1, value2, "taskid");
			return (Criteria) this;
		}

		public Criteria andSubmitterIsNull() {
			addCriterion("submitter is null");
			return (Criteria) this;
		}

		public Criteria andSubmitterIsNotNull() {
			addCriterion("submitter is not null");
			return (Criteria) this;
		}

		public Criteria andSubmitterEqualTo(String value) {
			addCriterion("submitter =", value, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitterNotEqualTo(String value) {
			addCriterion("submitter <>", value, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitterGreaterThan(String value) {
			addCriterion("submitter >", value, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitterGreaterThanOrEqualTo(String value) {
			addCriterion("submitter >=", value, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitterLessThan(String value) {
			addCriterion("submitter <", value, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitterLessThanOrEqualTo(String value) {
			addCriterion("submitter <=", value, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitterLike(String value) {
			addCriterion("submitter like", value, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitterNotLike(String value) {
			addCriterion("submitter not like", value, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitterIn(List<String> values) {
			addCriterion("submitter in", values, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitterNotIn(List<String> values) {
			addCriterion("submitter not in", values, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitterBetween(String value1, String value2) {
			addCriterion("submitter between", value1, value2, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitterNotBetween(String value1, String value2) {
			addCriterion("submitter not between", value1, value2, "submitter");
			return (Criteria) this;
		}

		public Criteria andSubmitteridIsNull() {
			addCriterion("submitterid is null");
			return (Criteria) this;
		}

		public Criteria andSubmitteridIsNotNull() {
			addCriterion("submitterid is not null");
			return (Criteria) this;
		}

		public Criteria andSubmitteridEqualTo(Integer value) {
			addCriterion("submitterid =", value, "submitterid");
			return (Criteria) this;
		}

		public Criteria andSubmitteridNotEqualTo(Integer value) {
			addCriterion("submitterid <>", value, "submitterid");
			return (Criteria) this;
		}

		public Criteria andSubmitteridGreaterThan(Integer value) {
			addCriterion("submitterid >", value, "submitterid");
			return (Criteria) this;
		}

		public Criteria andSubmitteridGreaterThanOrEqualTo(Integer value) {
			addCriterion("submitterid >=", value, "submitterid");
			return (Criteria) this;
		}

		public Criteria andSubmitteridLessThan(Integer value) {
			addCriterion("submitterid <", value, "submitterid");
			return (Criteria) this;
		}

		public Criteria andSubmitteridLessThanOrEqualTo(Integer value) {
			addCriterion("submitterid <=", value, "submitterid");
			return (Criteria) this;
		}

		public Criteria andSubmitteridIn(List<Integer> values) {
			addCriterion("submitterid in", values, "submitterid");
			return (Criteria) this;
		}

		public Criteria andSubmitteridNotIn(List<Integer> values) {
			addCriterion("submitterid not in", values, "submitterid");
			return (Criteria) this;
		}

		public Criteria andSubmitteridBetween(Integer value1, Integer value2) {
			addCriterion("submitterid between", value1, value2, "submitterid");
			return (Criteria) this;
		}

		public Criteria andSubmitteridNotBetween(Integer value1, Integer value2) {
			addCriterion("submitterid not between", value1, value2, "submitterid");
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

		public Criteria andTaskfileIsNull() {
			addCriterion("taskfile is null");
			return (Criteria) this;
		}

		public Criteria andTaskfileIsNotNull() {
			addCriterion("taskfile is not null");
			return (Criteria) this;
		}

		public Criteria andTaskfileEqualTo(String value) {
			addCriterion("taskfile =", value, "taskfile");
			return (Criteria) this;
		}

		public Criteria andTaskfileNotEqualTo(String value) {
			addCriterion("taskfile <>", value, "taskfile");
			return (Criteria) this;
		}

		public Criteria andTaskfileGreaterThan(String value) {
			addCriterion("taskfile >", value, "taskfile");
			return (Criteria) this;
		}

		public Criteria andTaskfileGreaterThanOrEqualTo(String value) {
			addCriterion("taskfile >=", value, "taskfile");
			return (Criteria) this;
		}

		public Criteria andTaskfileLessThan(String value) {
			addCriterion("taskfile <", value, "taskfile");
			return (Criteria) this;
		}

		public Criteria andTaskfileLessThanOrEqualTo(String value) {
			addCriterion("taskfile <=", value, "taskfile");
			return (Criteria) this;
		}

		public Criteria andTaskfileLike(String value) {
			addCriterion("taskfile like", value, "taskfile");
			return (Criteria) this;
		}

		public Criteria andTaskfileNotLike(String value) {
			addCriterion("taskfile not like", value, "taskfile");
			return (Criteria) this;
		}

		public Criteria andTaskfileIn(List<String> values) {
			addCriterion("taskfile in", values, "taskfile");
			return (Criteria) this;
		}

		public Criteria andTaskfileNotIn(List<String> values) {
			addCriterion("taskfile not in", values, "taskfile");
			return (Criteria) this;
		}

		public Criteria andTaskfileBetween(String value1, String value2) {
			addCriterion("taskfile between", value1, value2, "taskfile");
			return (Criteria) this;
		}

		public Criteria andTaskfileNotBetween(String value1, String value2) {
			addCriterion("taskfile not between", value1, value2, "taskfile");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(String value) {
			addCriterion("state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(String value) {
			addCriterion("state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(String value) {
			addCriterion("state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(String value) {
			addCriterion("state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(String value) {
			addCriterion("state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(String value) {
			addCriterion("state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLike(String value) {
			addCriterion("state like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotLike(String value) {
			addCriterion("state not like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<String> values) {
			addCriterion("state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<String> values) {
			addCriterion("state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(String value1, String value2) {
			addCriterion("state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(String value1, String value2) {
			addCriterion("state not between", value1, value2, "state");
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