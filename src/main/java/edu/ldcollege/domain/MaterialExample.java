package edu.ldcollege.domain;

import java.util.ArrayList;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andMaterialnameIsNull() {
            addCriterion("materialName is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIsNotNull() {
            addCriterion("materialName is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnameEqualTo(String value) {
            addCriterion("materialName =", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotEqualTo(String value) {
            addCriterion("materialName <>", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThan(String value) {
            addCriterion("materialName >", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameGreaterThanOrEqualTo(String value) {
            addCriterion("materialName >=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThan(String value) {
            addCriterion("materialName <", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLessThanOrEqualTo(String value) {
            addCriterion("materialName <=", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameLike(String value) {
            addCriterion("materialName like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotLike(String value) {
            addCriterion("materialName not like", value, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameIn(List<String> values) {
            addCriterion("materialName in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotIn(List<String> values) {
            addCriterion("materialName not in", values, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameBetween(String value1, String value2) {
            addCriterion("materialName between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andMaterialnameNotBetween(String value1, String value2) {
            addCriterion("materialName not between", value1, value2, "materialname");
            return (Criteria) this;
        }

        public Criteria andVideonameIsNull() {
            addCriterion("videoName is null");
            return (Criteria) this;
        }

        public Criteria andVideonameIsNotNull() {
            addCriterion("videoName is not null");
            return (Criteria) this;
        }

        public Criteria andVideonameEqualTo(String value) {
            addCriterion("videoName =", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotEqualTo(String value) {
            addCriterion("videoName <>", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThan(String value) {
            addCriterion("videoName >", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThanOrEqualTo(String value) {
            addCriterion("videoName >=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThan(String value) {
            addCriterion("videoName <", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThanOrEqualTo(String value) {
            addCriterion("videoName <=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLike(String value) {
            addCriterion("videoName like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotLike(String value) {
            addCriterion("videoName not like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameIn(List<String> values) {
            addCriterion("videoName in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotIn(List<String> values) {
            addCriterion("videoName not in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameBetween(String value1, String value2) {
            addCriterion("videoName between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotBetween(String value1, String value2) {
            addCriterion("videoName not between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNull() {
            addCriterion("videoUrl is null");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNotNull() {
            addCriterion("videoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVideourlEqualTo(String value) {
            addCriterion("videoUrl =", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotEqualTo(String value) {
            addCriterion("videoUrl <>", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThan(String value) {
            addCriterion("videoUrl >", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThanOrEqualTo(String value) {
            addCriterion("videoUrl >=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThan(String value) {
            addCriterion("videoUrl <", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThanOrEqualTo(String value) {
            addCriterion("videoUrl <=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLike(String value) {
            addCriterion("videoUrl like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotLike(String value) {
            addCriterion("videoUrl not like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlIn(List<String> values) {
            addCriterion("videoUrl in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotIn(List<String> values) {
            addCriterion("videoUrl not in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlBetween(String value1, String value2) {
            addCriterion("videoUrl between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotBetween(String value1, String value2) {
            addCriterion("videoUrl not between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andTaskurlIsNull() {
            addCriterion("taskUrl is null");
            return (Criteria) this;
        }

        public Criteria andTaskurlIsNotNull() {
            addCriterion("taskUrl is not null");
            return (Criteria) this;
        }

        public Criteria andTaskurlEqualTo(String value) {
            addCriterion("taskUrl =", value, "taskurl");
            return (Criteria) this;
        }

        public Criteria andTaskurlNotEqualTo(String value) {
            addCriterion("taskUrl <>", value, "taskurl");
            return (Criteria) this;
        }

        public Criteria andTaskurlGreaterThan(String value) {
            addCriterion("taskUrl >", value, "taskurl");
            return (Criteria) this;
        }

        public Criteria andTaskurlGreaterThanOrEqualTo(String value) {
            addCriterion("taskUrl >=", value, "taskurl");
            return (Criteria) this;
        }

        public Criteria andTaskurlLessThan(String value) {
            addCriterion("taskUrl <", value, "taskurl");
            return (Criteria) this;
        }

        public Criteria andTaskurlLessThanOrEqualTo(String value) {
            addCriterion("taskUrl <=", value, "taskurl");
            return (Criteria) this;
        }

        public Criteria andTaskurlLike(String value) {
            addCriterion("taskUrl like", value, "taskurl");
            return (Criteria) this;
        }

        public Criteria andTaskurlNotLike(String value) {
            addCriterion("taskUrl not like", value, "taskurl");
            return (Criteria) this;
        }

        public Criteria andTaskurlIn(List<String> values) {
            addCriterion("taskUrl in", values, "taskurl");
            return (Criteria) this;
        }

        public Criteria andTaskurlNotIn(List<String> values) {
            addCriterion("taskUrl not in", values, "taskurl");
            return (Criteria) this;
        }

        public Criteria andTaskurlBetween(String value1, String value2) {
            addCriterion("taskUrl between", value1, value2, "taskurl");
            return (Criteria) this;
        }

        public Criteria andTaskurlNotBetween(String value1, String value2) {
            addCriterion("taskUrl not between", value1, value2, "taskurl");
            return (Criteria) this;
        }

        public Criteria andExtra1IsNull() {
            addCriterion("extra1 is null");
            return (Criteria) this;
        }

        public Criteria andExtra1IsNotNull() {
            addCriterion("extra1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra1EqualTo(String value) {
            addCriterion("extra1 =", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotEqualTo(String value) {
            addCriterion("extra1 <>", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1GreaterThan(String value) {
            addCriterion("extra1 >", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1GreaterThanOrEqualTo(String value) {
            addCriterion("extra1 >=", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1LessThan(String value) {
            addCriterion("extra1 <", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1LessThanOrEqualTo(String value) {
            addCriterion("extra1 <=", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1Like(String value) {
            addCriterion("extra1 like", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotLike(String value) {
            addCriterion("extra1 not like", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1In(List<String> values) {
            addCriterion("extra1 in", values, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotIn(List<String> values) {
            addCriterion("extra1 not in", values, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1Between(String value1, String value2) {
            addCriterion("extra1 between", value1, value2, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotBetween(String value1, String value2) {
            addCriterion("extra1 not between", value1, value2, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra2IsNull() {
            addCriterion("extra2 is null");
            return (Criteria) this;
        }

        public Criteria andExtra2IsNotNull() {
            addCriterion("extra2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra2EqualTo(String value) {
            addCriterion("extra2 =", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotEqualTo(String value) {
            addCriterion("extra2 <>", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2GreaterThan(String value) {
            addCriterion("extra2 >", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2GreaterThanOrEqualTo(String value) {
            addCriterion("extra2 >=", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2LessThan(String value) {
            addCriterion("extra2 <", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2LessThanOrEqualTo(String value) {
            addCriterion("extra2 <=", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2Like(String value) {
            addCriterion("extra2 like", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotLike(String value) {
            addCriterion("extra2 not like", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2In(List<String> values) {
            addCriterion("extra2 in", values, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotIn(List<String> values) {
            addCriterion("extra2 not in", values, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2Between(String value1, String value2) {
            addCriterion("extra2 between", value1, value2, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotBetween(String value1, String value2) {
            addCriterion("extra2 not between", value1, value2, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra3IsNull() {
            addCriterion("extra3 is null");
            return (Criteria) this;
        }

        public Criteria andExtra3IsNotNull() {
            addCriterion("extra3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra3EqualTo(String value) {
            addCriterion("extra3 =", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotEqualTo(String value) {
            addCriterion("extra3 <>", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3GreaterThan(String value) {
            addCriterion("extra3 >", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3GreaterThanOrEqualTo(String value) {
            addCriterion("extra3 >=", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3LessThan(String value) {
            addCriterion("extra3 <", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3LessThanOrEqualTo(String value) {
            addCriterion("extra3 <=", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3Like(String value) {
            addCriterion("extra3 like", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotLike(String value) {
            addCriterion("extra3 not like", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3In(List<String> values) {
            addCriterion("extra3 in", values, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotIn(List<String> values) {
            addCriterion("extra3 not in", values, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3Between(String value1, String value2) {
            addCriterion("extra3 between", value1, value2, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotBetween(String value1, String value2) {
            addCriterion("extra3 not between", value1, value2, "extra3");
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