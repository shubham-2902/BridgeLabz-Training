package com.day7.fitnesstracker;
public class UserSteps {
    private String username;
    private int steps;

    public UserSteps(String username, int steps) {
        this.username = username;
        this.steps = steps;
    }

    public String getUsername() {
        return username;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return username + " -> " + steps + " steps";
    }
}
