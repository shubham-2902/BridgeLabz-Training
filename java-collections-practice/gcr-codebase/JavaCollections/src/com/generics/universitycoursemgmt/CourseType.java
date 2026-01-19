package com.generics.universitycoursemgmt;
public abstract class CourseType {

    private String evaluationType;

    public CourseType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    public String getEvaluationType() {
        return evaluationType;
    }

    // Each evaluation type must provide its own evaluation details
    public abstract String evaluationDetails();

    @Override
    public String toString() {
        return "EvaluationType=" + evaluationType + ", " + evaluationDetails();
    }
}
