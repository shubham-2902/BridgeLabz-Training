package com.day1.ewalletapplication;

public class User {

    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayUser() {
        System.out.println("User ID: " + userId + ", Name: " + name);
    }
}
