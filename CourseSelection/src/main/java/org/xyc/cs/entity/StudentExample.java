package org.xyc.cs.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNull() {
            addCriterion("stu_password is null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNotNull() {
            addCriterion("stu_password is not null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordEqualTo(String value) {
            addCriterion("stu_password =", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotEqualTo(String value) {
            addCriterion("stu_password <>", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThan(String value) {
            addCriterion("stu_password >", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("stu_password >=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThan(String value) {
            addCriterion("stu_password <", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThanOrEqualTo(String value) {
            addCriterion("stu_password <=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLike(String value) {
            addCriterion("stu_password like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotLike(String value) {
            addCriterion("stu_password not like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIn(List<String> values) {
            addCriterion("stu_password in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotIn(List<String> values) {
            addCriterion("stu_password not in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordBetween(String value1, String value2) {
            addCriterion("stu_password between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotBetween(String value1, String value2) {
            addCriterion("stu_password not between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNull() {
            addCriterion("stu_class is null");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNotNull() {
            addCriterion("stu_class is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassEqualTo(String value) {
            addCriterion("stu_class =", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotEqualTo(String value) {
            addCriterion("stu_class <>", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThan(String value) {
            addCriterion("stu_class >", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThanOrEqualTo(String value) {
            addCriterion("stu_class >=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThan(String value) {
            addCriterion("stu_class <", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThanOrEqualTo(String value) {
            addCriterion("stu_class <=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLike(String value) {
            addCriterion("stu_class like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotLike(String value) {
            addCriterion("stu_class not like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassIn(List<String> values) {
            addCriterion("stu_class in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotIn(List<String> values) {
            addCriterion("stu_class not in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassBetween(String value1, String value2) {
            addCriterion("stu_class between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotBetween(String value1, String value2) {
            addCriterion("stu_class not between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(Integer value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(Integer value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(Integer value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(Integer value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(Integer value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<Integer> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<Integer> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(Integer value1, Integer value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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