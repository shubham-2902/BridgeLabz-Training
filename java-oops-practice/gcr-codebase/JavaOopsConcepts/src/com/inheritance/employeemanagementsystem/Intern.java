package com.inheritance.employeemanagementsystem;

//Intern.java
public class Intern extends Employee {

 int durationMonths;

 public Intern(String name, int id, double salary, int durationMonths) {
     super(name, id, salary);
     this.durationMonths = durationMonths;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Internship Duration : " + durationMonths + " months");
 }
}
