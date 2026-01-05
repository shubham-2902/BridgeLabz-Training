package com.day3.campusconnect;
public class Faculty extends Person {

    private String department;

    public Faculty(int id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    @Override
    public void printDetails() {
        System.out.println("Faculty ID: " + id);
        System.out.println("Faculty Name: " + name);
        System.out.println("Department: " + department);
    }
}
