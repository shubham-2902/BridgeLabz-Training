package com.inheritance.schoolsystemhierarchicalinheritance;

//Person.java
public class Person {

 String name;
 int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Common method
 public void displayPersonDetails() {
     System.out.println("Name : " + name);
     System.out.println("Age  : " + age);
 }
}
