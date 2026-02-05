package com.day1.ExamResultUploader;
public class ExamType<T> {
    T examName;

    public ExamType(T examName) {
        this.examName = examName;
    }

    public T getExamName() {
        return examName;
    }
}
