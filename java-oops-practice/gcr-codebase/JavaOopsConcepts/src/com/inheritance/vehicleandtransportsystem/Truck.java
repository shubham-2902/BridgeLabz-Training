package com.inheritance.vehicleandtransportsystem;

//Truck.java
public class Truck extends Vehicle {

 double loadCapacity; // in tons

 public Truck(int maxSpeed, String fuelType, double loadCapacity) {
     super(maxSpeed, fuelType);
     this.loadCapacity = loadCapacity;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Load Capacity : " + loadCapacity + " tons");
 }
}
