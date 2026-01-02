package com.day1.universitycourseenrollmentsystem;

public class Undergraduate extends Student {

    public Undergraduate(int studentId, String name) {
        super(studentId, name);
    }

    public Undergraduate(int studentId, String name, String elective) {
        super(studentId, name, elective);
    }
}
