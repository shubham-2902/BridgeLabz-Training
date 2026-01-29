package com.JUnit;
public class UserRegistration {

    public void registerUser(String username, String email, String password) {

        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password too short");
        }

        // Registration success 
    }
}