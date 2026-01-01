package com.inheritance.vehiclemgmthybridinheritance;

//ElectricVehicle.java
public class ElectricVehicle extends Vehicle {

 public ElectricVehicle(int maxSpeed, String model) {
     super(maxSpeed, model);
 }

 public void charge() {
     System.out.println("Electric vehicle is charging.");
 }
}
