package edu.ldcollege.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LdHomeWorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LdHomeWorkExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andLessionIdIsNull() {
            addCriterion("lession_id is null");
            return (Criteria) this;
        }

        public Criteria andLessionIdIsNotNull() {
            addCriterion("lession_id is not null");
            return (Criteria) this;
        }

        public Criteria andLessionIdEqualTo(Integer value) {
            addCriterion("lession_id =", value, "lessionId");
            return (Criteria) this;
        }

        public Criteria andLessionIdNotEqualTo(Integer value) {
            addCriterion("lession_id <>", value, "lessionId");
            return (Criteria) this;
        }

        public Criteria andLessionIdGreaterThan(Integer value) {
            addCriterion("lession_id >", value, "lessionId");
            return (Criteria) this;
        }

        public Criteria andLessionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lession_id >=", value, "lessionId");
            return (Criteria) this;
        }

        public Criteria andLessionIdLessThan(Integer value) {
            addCriterion("lession_id <", value, "lessionId");
            return (Criteria) this;
        }

        public Criteria andLessionIdLessThanOrEqualTo(Integer value) {
            addCriterion("lession_id <=", value, "lessionId");
            return (Criteria) this;
        }

        public Criteria andLessionIdIn(List<Integer> values) {
            addCriterion("lession_id in", values, "lessionId");
            return (Criteria) this;
        }

        public Criteria andLessionIdNotIn(List<Integer> values) {
            addCriterion("lession_id not in", values, "lessionId");
            return (Criteria) this;
        }

        public Criteria andLessionIdBetween(Integer value1, Integer value2) {
            addCriterion("lession_id between", value1, value2, "lessionId");
            return (Criteria) this;
        }

        public Criteria andLessionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lession_id not between", value1, value2, "lessionId");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathIsNull() {
            addCriterion("homework_file_path is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathIsNotNull() {
            addCriterion("homework_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathEqualTo(String value) {
            addCriterion("homework_file_path =", value, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathNotEqualTo(String value) {
            addCriterion("homework_file_path <>", value, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathGreaterThan(String value) {
            addCriterion("homework_file_path >", value, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("homework_file_path >=", value, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathLessThan(String value) {
            addCriterion("homework_file_path <", value, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathLessThanOrEqualTo(String value) {
            addCriterion("homework_file_path <=", value, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathLike(String value) {
            addCriterion("homework_file_path like", value, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathNotLike(String value) {
            addCriterion("homework_file_path not like", value, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathIn(List<String> values) {
            addCriterion("homework_file_path in", values, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathNotIn(List<String> values) {
            addCriterion("homework_file_path not in", values, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathBetween(String value1, String value2) {
            addCriterion("homework_file_path between", value1, value2, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFilePathNotBetween(String value1, String value2) {
            addCriterion("homework_file_path not between", value1, value2, "homeworkFilePath");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameIsNull() {
            addCriterion("homework_file_name is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameIsNotNull() {
            addCriterion("homework_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameEqualTo(String value) {
            addCriterion("homework_file_name =", value, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameNotEqualTo(String value) {
            addCriterion("homework_file_name <>", value, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameGreaterThan(String value) {
            addCriterion("homework_file_name >", value, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("homework_file_name >=", value, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameLessThan(String value) {
            addCriterion("homework_file_name <", value, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameLessThanOrEqualTo(String value) {
            addCriterion("homework_file_name <=", value, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameLike(String value) {
            addCriterion("homework_file_name like", value, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameNotLike(String value) {
            addCriterion("homework_file_name not like", value, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameIn(List<String> values) {
            addCriterion("homework_file_name in", values, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameNotIn(List<String> values) {
            addCriterion("homework_file_name not in", values, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameBetween(String value1, String value2) {
            addCriterion("homework_file_name between", value1, value2, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andHomeworkFileNameNotBetween(String value1, String value2) {
            addCriterion("homework_file_name not between", value1, value2, "homeworkFileName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagIsNull() {
            addCriterion("correct_flag is null");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagIsNotNull() {
            addCriterion("correct_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagEqualTo(Boolean value) {
            addCriterion("correct_flag =", value, "correctFlag");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagNotEqualTo(Boolean value) {
            addCriterion("correct_flag <>", value, "correctFlag");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagGreaterThan(Boolean value) {
            addCriterion("correct_flag >", value, "correctFlag");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("correct_flag >=", value, "correctFlag");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagLessThan(Boolean value) {
            addCriterion("correct_flag <", value, "correctFlag");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("correct_flag <=", value, "correctFlag");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagIn(List<Boolean> values) {
            addCriterion("correct_flag in", values, "correctFlag");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagNotIn(List<Boolean> values) {
            addCriterion("correct_flag not in", values, "correctFlag");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("correct_flag between", value1, value2, "correctFlag");
            return (Criteria) this;
        }

        public Criteria andCorrectFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("correct_flag not between", value1, value2, "correctFlag");
            return (Criteria) this;
        }

        public Criteria andStartCountIsNull() {
            addCriterion("start_count is null");
            return (Criteria) this;
        }

        public Criteria andStartCountIsNotNull() {
            addCriterion("start_count is not null");
            return (Criteria) this;
        }

        public Criteria andStartCountEqualTo(Integer value) {
            addCriterion("start_count =", value, "startCount");
            return (Criteria) this;
        }

        public Criteria andStartCountNotEqualTo(Integer value) {
            addCriterion("start_count <>", value, "startCount");
            return (Criteria) this;
        }

        public Criteria andStartCountGreaterThan(Integer value) {
            addCriterion("start_count >", value, "startCount");
            return (Criteria) this;
        }

        public Criteria andStartCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_count >=", value, "startCount");
            return (Criteria) this;
        }

        public Criteria andStartCountLessThan(Integer value) {
            addCriterion("start_count <", value, "startCount");
            return (Criteria) this;
        }

        public Criteria andStartCountLessThanOrEqualTo(Integer value) {
            addCriterion("start_count <=", value, "startCount");
            return (Criteria) this;
        }

        public Criteria andStartCountIn(List<Integer> values) {
            addCriterion("start_count in", values, "startCount");
            return (Criteria) this;
        }

        public Criteria andStartCountNotIn(List<Integer> values) {
            addCriterion("start_count not in", values, "startCount");
            return (Criteria) this;
        }

        public Criteria andStartCountBetween(Integer value1, Integer value2) {
            addCriterion("start_count between", value1, value2, "startCount");
            return (Criteria) this;
        }

        public Criteria andStartCountNotBetween(Integer value1, Integer value2) {
            addCriterion("start_count not between", value1, value2, "startCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountIsNull() {
            addCriterion("negative_count is null");
            return (Criteria) this;
        }

        public Criteria andNegativeCountIsNotNull() {
            addCriterion("negative_count is not null");
            return (Criteria) this;
        }

        public Criteria andNegativeCountEqualTo(Integer value) {
            addCriterion("negative_count =", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountNotEqualTo(Integer value) {
            addCriterion("negative_count <>", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountGreaterThan(Integer value) {
            addCriterion("negative_count >", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("negative_count >=", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountLessThan(Integer value) {
            addCriterion("negative_count <", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountLessThanOrEqualTo(Integer value) {
            addCriterion("negative_count <=", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountIn(List<Integer> values) {
            addCriterion("negative_count in", values, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountNotIn(List<Integer> values) {
            addCriterion("negative_count not in", values, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountBetween(Integer value1, Integer value2) {
            addCriterion("negative_count between", value1, value2, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("negative_count not between", value1, value2, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andBestFlagIsNull() {
            addCriterion("best_flag is null");
            return (Criteria) this;
        }

        public Criteria andBestFlagIsNotNull() {
            addCriterion("best_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBestFlagEqualTo(Boolean value) {
            addCriterion("best_flag =", value, "bestFlag");
            return (Criteria) this;
        }

        public Criteria andBestFlagNotEqualTo(Boolean value) {
            addCriterion("best_flag <>", value, "bestFlag");
            return (Criteria) this;
        }

        public Criteria andBestFlagGreaterThan(Boolean value) {
            addCriterion("best_flag >", value, "bestFlag");
            return (Criteria) this;
        }

        public Criteria andBestFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("best_flag >=", value, "bestFlag");
            return (Criteria) this;
        }

        public Criteria andBestFlagLessThan(Boolean value) {
            addCriterion("best_flag <", value, "bestFlag");
            return (Criteria) this;
        }

        public Criteria andBestFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("best_flag <=", value, "bestFlag");
            return (Criteria) this;
        }

        public Criteria andBestFlagIn(List<Boolean> values) {
            addCriterion("best_flag in", values, "bestFlag");
            return (Criteria) this;
        }

        public Criteria andBestFlagNotIn(List<Boolean> values) {
            addCriterion("best_flag not in", values, "bestFlag");
            return (Criteria) this;
        }

        public Criteria andBestFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("best_flag between", value1, value2, "bestFlag");
            return (Criteria) this;
        }

        public Criteria andBestFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("best_flag not between", value1, value2, "bestFlag");
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