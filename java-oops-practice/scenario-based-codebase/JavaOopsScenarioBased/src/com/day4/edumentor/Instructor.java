package com.day4.edumentor;
public class Instructor extends User {

    private String expertise;
    private int experience; // years

    public Instructor(int userId, String name, String email,
                      String expertise, int experience) {
        super(userId, name, email);
        this.expertise = expertise;
        this.experience = experience;
    }

    // Polymorphism-ready method
    public void printDetails() {
        System.out.println("Instructor ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Expertise: " + expertise);
        System.out.println("Experience: " + experience + " years");
    }
}
