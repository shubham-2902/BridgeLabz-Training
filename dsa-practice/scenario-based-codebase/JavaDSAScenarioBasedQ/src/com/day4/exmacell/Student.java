package com.day4.exmacell;
public class Student {
    private String rollNo;
    private String name;
    private int score;
    private String centerName;

    public Student(String rollNo, String name, int score, String centerName) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
        this.centerName = centerName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getCenterName() {
        return centerName;
    }

    @Override
    public String toString() {
        return "Roll: " + rollNo + ", Name: " + name +
                ", Score: " + score + ", Center: " + centerName;
    }
}
