package edu.ldcollege.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LdClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LdClassExample() {
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

        public Criteria andClassnameIsNull() {
            addCriterion("className is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("className is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("className =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("className <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("className >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("className >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("className <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("className <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("className like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("className not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("className in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("className not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("className between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("className not between", value1, value2, "classname");
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

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andMonitorNameIsNull() {
            addCriterion("monitor_name is null");
            return (Criteria) this;
        }

        public Criteria andMonitorNameIsNotNull() {
            addCriterion("monitor_name is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorNameEqualTo(String value) {
            addCriterion("monitor_name =", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotEqualTo(String value) {
            addCriterion("monitor_name <>", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameGreaterThan(String value) {
            addCriterion("monitor_name >", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_name >=", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameLessThan(String value) {
            addCriterion("monitor_name <", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameLessThanOrEqualTo(String value) {
            addCriterion("monitor_name <=", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameLike(String value) {
            addCriterion("monitor_name like", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotLike(String value) {
            addCriterion("monitor_name not like", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameIn(List<String> values) {
            addCriterion("monitor_name in", values, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotIn(List<String> values) {
            addCriterion("monitor_name not in", values, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameBetween(String value1, String value2) {
            addCriterion("monitor_name between", value1, value2, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotBetween(String value1, String value2) {
            addCriterion("monitor_name not between", value1, value2, "monitorName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameIsNull() {
            addCriterion("commissary_name is null");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameIsNotNull() {
            addCriterion("commissary_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameEqualTo(String value) {
            addCriterion("commissary_name =", value, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameNotEqualTo(String value) {
            addCriterion("commissary_name <>", value, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameGreaterThan(String value) {
            addCriterion("commissary_name >", value, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameGreaterThanOrEqualTo(String value) {
            addCriterion("commissary_name >=", value, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameLessThan(String value) {
            addCriterion("commissary_name <", value, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameLessThanOrEqualTo(String value) {
            addCriterion("commissary_name <=", value, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameLike(String value) {
            addCriterion("commissary_name like", value, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameNotLike(String value) {
            addCriterion("commissary_name not like", value, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameIn(List<String> values) {
            addCriterion("commissary_name in", values, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameNotIn(List<String> values) {
            addCriterion("commissary_name not in", values, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameBetween(String value1, String value2) {
            addCriterion("commissary_name between", value1, value2, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCommissaryNameNotBetween(String value1, String value2) {
            addCriterion("commissary_name not between", value1, value2, "commissaryName");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsIsNull() {
            addCriterion("curNormalStudents is null");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsIsNotNull() {
            addCriterion("curNormalStudents is not null");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsEqualTo(Integer value) {
            addCriterion("curNormalStudents =", value, "curnormalstudents");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsNotEqualTo(Integer value) {
            addCriterion("curNormalStudents <>", value, "curnormalstudents");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsGreaterThan(Integer value) {
            addCriterion("curNormalStudents >", value, "curnormalstudents");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("curNormalStudents >=", value, "curnormalstudents");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsLessThan(Integer value) {
            addCriterion("curNormalStudents <", value, "curnormalstudents");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsLessThanOrEqualTo(Integer value) {
            addCriterion("curNormalStudents <=", value, "curnormalstudents");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsIn(List<Integer> values) {
            addCriterion("curNormalStudents in", values, "curnormalstudents");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsNotIn(List<Integer> values) {
            addCriterion("curNormalStudents not in", values, "curnormalstudents");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsBetween(Integer value1, Integer value2) {
            addCriterion("curNormalStudents between", value1, value2, "curnormalstudents");
            return (Criteria) this;
        }

        public Criteria andCurnormalstudentsNotBetween(Integer value1, Integer value2) {
            addCriterion("curNormalStudents not between", value1, value2, "curnormalstudents");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsIsNull() {
            addCriterion("cur_arrearaged_students is null");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsIsNotNull() {
            addCriterion("cur_arrearaged_students is not null");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsEqualTo(Integer value) {
            addCriterion("cur_arrearaged_students =", value, "curArrearagedStudents");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsNotEqualTo(Integer value) {
            addCriterion("cur_arrearaged_students <>", value, "curArrearagedStudents");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsGreaterThan(Integer value) {
            addCriterion("cur_arrearaged_students >", value, "curArrearagedStudents");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_arrearaged_students >=", value, "curArrearagedStudents");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsLessThan(Integer value) {
            addCriterion("cur_arrearaged_students <", value, "curArrearagedStudents");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsLessThanOrEqualTo(Integer value) {
            addCriterion("cur_arrearaged_students <=", value, "curArrearagedStudents");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsIn(List<Integer> values) {
            addCriterion("cur_arrearaged_students in", values, "curArrearagedStudents");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsNotIn(List<Integer> values) {
            addCriterion("cur_arrearaged_students not in", values, "curArrearagedStudents");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsBetween(Integer value1, Integer value2) {
            addCriterion("cur_arrearaged_students between", value1, value2, "curArrearagedStudents");
            return (Criteria) this;
        }

        public Criteria andCurArrearagedStudentsNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_arrearaged_students not between", value1, value2, "curArrearagedStudents");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsIsNull() {
            addCriterion("droped_students is null");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsIsNotNull() {
            addCriterion("droped_students is not null");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsEqualTo(Integer value) {
            addCriterion("droped_students =", value, "dropedStudents");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsNotEqualTo(Integer value) {
            addCriterion("droped_students <>", value, "dropedStudents");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsGreaterThan(Integer value) {
            addCriterion("droped_students >", value, "dropedStudents");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("droped_students >=", value, "dropedStudents");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsLessThan(Integer value) {
            addCriterion("droped_students <", value, "dropedStudents");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsLessThanOrEqualTo(Integer value) {
            addCriterion("droped_students <=", value, "dropedStudents");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsIn(List<Integer> values) {
            addCriterion("droped_students in", values, "dropedStudents");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsNotIn(List<Integer> values) {
            addCriterion("droped_students not in", values, "dropedStudents");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsBetween(Integer value1, Integer value2) {
            addCriterion("droped_students between", value1, value2, "dropedStudents");
            return (Criteria) this;
        }

        public Criteria andDropedStudentsNotBetween(Integer value1, Integer value2) {
            addCriterion("droped_students not between", value1, value2, "dropedStudents");
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