package org.xyc.cs.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SelectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SelectionExample() {
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

        public Criteria andSelectionIdIsNull() {
            addCriterion("selection_id is null");
            return (Criteria) this;
        }

        public Criteria andSelectionIdIsNotNull() {
            addCriterion("selection_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionIdEqualTo(Integer value) {
            addCriterion("selection_id =", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdNotEqualTo(Integer value) {
            addCriterion("selection_id <>", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdGreaterThan(Integer value) {
            addCriterion("selection_id >", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("selection_id >=", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdLessThan(Integer value) {
            addCriterion("selection_id <", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("selection_id <=", value, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdIn(List<Integer> values) {
            addCriterion("selection_id in", values, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdNotIn(List<Integer> values) {
            addCriterion("selection_id not in", values, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdBetween(Integer value1, Integer value2) {
            addCriterion("selection_id between", value1, value2, "selectionId");
            return (Criteria) this;
        }

        public Criteria andSelectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("selection_id not between", value1, value2, "selectionId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andClassroomIsNull() {
            addCriterion("classroom is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIsNotNull() {
            addCriterion("classroom is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomEqualTo(String value) {
            addCriterion("classroom =", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotEqualTo(String value) {
            addCriterion("classroom <>", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomGreaterThan(String value) {
            addCriterion("classroom >", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomGreaterThanOrEqualTo(String value) {
            addCriterion("classroom >=", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomLessThan(String value) {
            addCriterion("classroom <", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomLessThanOrEqualTo(String value) {
            addCriterion("classroom <=", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomLike(String value) {
            addCriterion("classroom like", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotLike(String value) {
            addCriterion("classroom not like", value, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomIn(List<String> values) {
            addCriterion("classroom in", values, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotIn(List<String> values) {
            addCriterion("classroom not in", values, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomBetween(String value1, String value2) {
            addCriterion("classroom between", value1, value2, "classroom");
            return (Criteria) this;
        }

        public Criteria andClassroomNotBetween(String value1, String value2) {
            addCriterion("classroom not between", value1, value2, "classroom");
            return (Criteria) this;
        }

        public Criteria andClasstimeIsNull() {
            addCriterion("classtime is null");
            return (Criteria) this;
        }

        public Criteria andClasstimeIsNotNull() {
            addCriterion("classtime is not null");
            return (Criteria) this;
        }

        public Criteria andClasstimeEqualTo(String value) {
            addCriterion("classtime =", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeNotEqualTo(String value) {
            addCriterion("classtime <>", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeGreaterThan(String value) {
            addCriterion("classtime >", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeGreaterThanOrEqualTo(String value) {
            addCriterion("classtime >=", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeLessThan(String value) {
            addCriterion("classtime <", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeLessThanOrEqualTo(String value) {
            addCriterion("classtime <=", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeLike(String value) {
            addCriterion("classtime like", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeNotLike(String value) {
            addCriterion("classtime not like", value, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeIn(List<String> values) {
            addCriterion("classtime in", values, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeNotIn(List<String> values) {
            addCriterion("classtime not in", values, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeBetween(String value1, String value2) {
            addCriterion("classtime between", value1, value2, "classtime");
            return (Criteria) this;
        }

        public Criteria andClasstimeNotBetween(String value1, String value2) {
            addCriterion("classtime not between", value1, value2, "classtime");
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