package com.inheritance.vehiclemgmthybridinheritance;

//PetrolVehicle.java
public class PetrolVehicle extends Vehicle implements Refuelable {

 public PetrolVehicle(int maxSpeed, String model) {
     super(maxSpeed, model);
 }

 @Override
 public void refuel() {
     System.out.println("Petrol vehicle is being refueled.");
 }
}
