package com.generics.universitycoursemgmt;
public class AssignmentCourse extends CourseType {

    private int assignmentCount;
    private int maxMarksPerAssignment;

    public AssignmentCourse(int assignmentCount, int maxMarksPerAssignment) {
        super("Assignment-Based");
        this.assignmentCount = assignmentCount;
        this.maxMarksPerAssignment = maxMarksPerAssignment;
    }

    @Override
    public String evaluationDetails() {
        return "Assignments=" + assignmentCount + ", MaxMarksEach=" + maxMarksPerAssignment;
    }
}
