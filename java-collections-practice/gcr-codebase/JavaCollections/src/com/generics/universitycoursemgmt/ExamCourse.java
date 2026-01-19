package com.generics.universitycoursemgmt;
public class ExamCourse extends CourseType {

    private int totalMarks;
    private int passingMarks;

    public ExamCourse(int totalMarks, int passingMarks) {
        super("Exam-Based");
        this.totalMarks = totalMarks;
        this.passingMarks = passingMarks;
    }

    @Override
    public String evaluationDetails() {
        return "TotalMarks=" + totalMarks + ", PassingMarks=" + passingMarks;
    }
}
