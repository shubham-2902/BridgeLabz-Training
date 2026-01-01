package com.inheritance.vehiclemgmthybridinheritance;

//Vehicle.java
public class Vehicle {

 int maxSpeed;
 String model;

 public Vehicle(int maxSpeed, String model) {
     this.maxSpeed = maxSpeed;
     this.model = model;
 }

 public void displayInfo() {
     System.out.println("Model     : " + model);
     System.out.println("Max Speed : " + maxSpeed + " km/h");
 }
}
