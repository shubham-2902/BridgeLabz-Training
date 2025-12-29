package com.constructors.level1;

class Student {

    // Least privilege
    private int rollNumber;
    protected String name;      // needed for subclass
    private double cgpa;

    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Controlled access
    public int getRollNumber() {
        return rollNumber;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

public class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    void displayDetails() {
        System.out.println("Roll No : " + getRollNumber());
        System.out.println("Name    : " + name);
        System.out.println("CGPA    : " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent pg =
                new PostgraduateStudent(101, "Rahul", 8.6);
        pg.displayDetails();
    }
}
