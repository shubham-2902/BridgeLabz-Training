package com.inheritance.vehicleandtransportsystem;

//Motorcycle.java
public class Motorcycle extends Vehicle {

 boolean hasGear;

 public Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
     super(maxSpeed, fuelType);
     this.hasGear = hasGear;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Has Gear : " + hasGear);
 }
}
