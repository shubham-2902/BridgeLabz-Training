package com.inheritance.employeemanagementsystem;

//Employee.java
public class Employee {

 String name;
 int id;
 double salary;

 // Constructor
 public Employee(String name, int id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 // Method to display details
 public void displayDetails() {
     System.out.println("Name   : " + name);
     System.out.println("ID     : " + id);
     System.out.println("Salary : " + salary);
 }
}
