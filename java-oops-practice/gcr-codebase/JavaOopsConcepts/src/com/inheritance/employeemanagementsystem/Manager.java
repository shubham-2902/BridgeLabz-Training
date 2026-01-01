package com.inheritance.employeemanagementsystem;

//Manager.java
public class Manager extends Employee {

 int teamSize;

 public Manager(String name, int id, double salary, int teamSize) {
     super(name, id, salary);
     this.teamSize = teamSize;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Team Size : " + teamSize);
 }
}
