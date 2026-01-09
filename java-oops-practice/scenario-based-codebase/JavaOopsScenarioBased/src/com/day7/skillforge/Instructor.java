package com.day7.skillforge;
public class Instructor extends User {

    private String expertise;

    public Instructor(String name, String email, String expertise) {
        super(name, email);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }
}
