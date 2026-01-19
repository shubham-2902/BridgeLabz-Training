package com.day7.eduresults;
public class Student {
    private int rollNo;
    private String name;
    private int score;
    private String district;

    public Student(int rollNo, String name, int score, String district) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
        this.district = district;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return "Roll: " + rollNo + ", Name: " + name + ", Score: " + score + ", District: " + district;
    }
}
