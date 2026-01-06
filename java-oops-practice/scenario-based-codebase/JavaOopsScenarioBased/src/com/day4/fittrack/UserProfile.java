package com.day4.fittrack;
public class UserProfile {

    private String name;
    private int age;
    private double weight;   // sensitive data
    private int dailyTarget;

    public UserProfile(String name, int age, double weight, int dailyTarget) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyTarget = dailyTarget;
    }

    public int getDailyTarget() {
        return dailyTarget;
    }

    public String getName() {
        return name;
    }
}
