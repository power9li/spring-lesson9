package edu.ldcollege.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlayCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayCodeExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchIsNull() {
            addCriterion("encryptionBatch is null");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchIsNotNull() {
            addCriterion("encryptionBatch is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchEqualTo(String value) {
            addCriterion("encryptionBatch =", value, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchNotEqualTo(String value) {
            addCriterion("encryptionBatch <>", value, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchGreaterThan(String value) {
            addCriterion("encryptionBatch >", value, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchGreaterThanOrEqualTo(String value) {
            addCriterion("encryptionBatch >=", value, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchLessThan(String value) {
            addCriterion("encryptionBatch <", value, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchLessThanOrEqualTo(String value) {
            addCriterion("encryptionBatch <=", value, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchLike(String value) {
            addCriterion("encryptionBatch like", value, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchNotLike(String value) {
            addCriterion("encryptionBatch not like", value, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchIn(List<String> values) {
            addCriterion("encryptionBatch in", values, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchNotIn(List<String> values) {
            addCriterion("encryptionBatch not in", values, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchBetween(String value1, String value2) {
            addCriterion("encryptionBatch between", value1, value2, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andEncryptionbatchNotBetween(String value1, String value2) {
            addCriterion("encryptionBatch not between", value1, value2, "encryptionbatch");
            return (Criteria) this;
        }

        public Criteria andMachinecodeIsNull() {
            addCriterion("machineCode is null");
            return (Criteria) this;
        }

        public Criteria andMachinecodeIsNotNull() {
            addCriterion("machineCode is not null");
            return (Criteria) this;
        }

        public Criteria andMachinecodeEqualTo(String value) {
            addCriterion("machineCode =", value, "machinecode");
            return (Criteria) this;
        }

        public Criteria andMachinecodeNotEqualTo(String value) {
            addCriterion("machineCode <>", value, "machinecode");
            return (Criteria) this;
        }

        public Criteria andMachinecodeGreaterThan(String value) {
            addCriterion("machineCode >", value, "machinecode");
            return (Criteria) this;
        }

        public Criteria andMachinecodeGreaterThanOrEqualTo(String value) {
            addCriterion("machineCode >=", value, "machinecode");
            return (Criteria) this;
        }

        public Criteria andMachinecodeLessThan(String value) {
            addCriterion("machineCode <", value, "machinecode");
            return (Criteria) this;
        }

        public Criteria andMachinecodeLessThanOrEqualTo(String value) {
            addCriterion("machineCode <=", value, "machinecode");
            return (Criteria) this;
        }

        public Criteria andMachinecodeLike(String value) {
            addCriterion("machineCode like", value, "machinecode");
            return (Criteria) this;
        }

        public Criteria andMachinecodeNotLike(String value) {
            addCriterion("machineCode not like", value, "machinecode");
            return (Criteria) this;
        }

        public Criteria andMachinecodeIn(List<String> values) {
            addCriterion("machineCode in", values, "machinecode");
            return (Criteria) this;
        }

        public Criteria andMachinecodeNotIn(List<String> values) {
            addCriterion("machineCode not in", values, "machinecode");
            return (Criteria) this;
        }

        public Criteria andMachinecodeBetween(String value1, String value2) {
            addCriterion("machineCode between", value1, value2, "machinecode");
            return (Criteria) this;
        }

        public Criteria andMachinecodeNotBetween(String value1, String value2) {
            addCriterion("machineCode not between", value1, value2, "machinecode");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andValidityperiodIsNull() {
            addCriterion("ValidityPeriod is null");
            return (Criteria) this;
        }

        public Criteria andValidityperiodIsNotNull() {
            addCriterion("ValidityPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andValidityperiodEqualTo(Integer value) {
            addCriterion("ValidityPeriod =", value, "validityperiod");
            return (Criteria) this;
        }

        public Criteria andValidityperiodNotEqualTo(Integer value) {
            addCriterion("ValidityPeriod <>", value, "validityperiod");
            return (Criteria) this;
        }

        public Criteria andValidityperiodGreaterThan(Integer value) {
            addCriterion("ValidityPeriod >", value, "validityperiod");
            return (Criteria) this;
        }

        public Criteria andValidityperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("ValidityPeriod >=", value, "validityperiod");
            return (Criteria) this;
        }

        public Criteria andValidityperiodLessThan(Integer value) {
            addCriterion("ValidityPeriod <", value, "validityperiod");
            return (Criteria) this;
        }

        public Criteria andValidityperiodLessThanOrEqualTo(Integer value) {
            addCriterion("ValidityPeriod <=", value, "validityperiod");
            return (Criteria) this;
        }

        public Criteria andValidityperiodIn(List<Integer> values) {
            addCriterion("ValidityPeriod in", values, "validityperiod");
            return (Criteria) this;
        }

        public Criteria andValidityperiodNotIn(List<Integer> values) {
            addCriterion("ValidityPeriod not in", values, "validityperiod");
            return (Criteria) this;
        }

        public Criteria andValidityperiodBetween(Integer value1, Integer value2) {
            addCriterion("ValidityPeriod between", value1, value2, "validityperiod");
            return (Criteria) this;
        }

        public Criteria andValidityperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("ValidityPeriod not between", value1, value2, "validityperiod");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
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