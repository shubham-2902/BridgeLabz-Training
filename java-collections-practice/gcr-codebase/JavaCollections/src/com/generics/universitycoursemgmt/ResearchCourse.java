package com.generics.universitycoursemgmt;
public class ResearchCourse extends CourseType {

    private String researchTopic;
    private int paperSubmissionCount;

    public ResearchCourse(String researchTopic, int paperSubmissionCount) {
        super("Research-Based");
        this.researchTopic = researchTopic;
        this.paperSubmissionCount = paperSubmissionCount;
    }

    @Override
    public String evaluationDetails() {
        return "Topic=" + researchTopic + ", PapersToSubmit=" + paperSubmissionCount;
    }
}
