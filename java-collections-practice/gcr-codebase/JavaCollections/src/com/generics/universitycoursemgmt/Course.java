package com.generics.universitycoursemgmt;
public class Course<T extends CourseType> {

    private String courseCode;
    private String courseName;
    private String department;
    private T courseType;

    public Course(String courseCode, String courseName, String department, T courseType) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "Course{Code=" + courseCode +
                ", Name=" + courseName +
                ", Department=" + department +
                ", " + courseType +
                "}";
    }
}
