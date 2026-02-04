package com.day1.ExamScanner;

import java.util.List;

public class AnswerSheet<T> {
    private String studentName;
    private List<T> answers;

    public AnswerSheet(String studentName, List<T> answers) {
        this.studentName = studentName;
        this.answers = answers;
    }

    public String getStudentName() { return studentName; }
    public List<T> getAnswers() { return answers; }
}
