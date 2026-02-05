package com.day1.MarkMate;
public class Student {
    String name;
    int maths;
    int science;
    int english;
    int total;
    double average;
    String grade;

    public Student(String name, int maths, int science, int english) {
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.english = english;
        calculateResult();
    }

    private void calculateResult() {
        total = maths + science + english;
        average = total / 3.0;

        if (average >= 80) grade = "A";
        else if (average >= 60) grade = "B";
        else if (average >= 40) grade = "C";
        else grade = "Fail";
    }
}
