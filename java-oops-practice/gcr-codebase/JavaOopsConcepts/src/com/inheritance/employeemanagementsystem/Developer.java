package com.inheritance.employeemanagementsystem;

//Developer.java
public class Developer extends Employee {

 String programmingLanguage;

 public Developer(String name, int id, double salary, String programmingLanguage) {
     super(name, id, salary);
     this.programmingLanguage = programmingLanguage;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Programming Language : " + programmingLanguage);
 }
}
