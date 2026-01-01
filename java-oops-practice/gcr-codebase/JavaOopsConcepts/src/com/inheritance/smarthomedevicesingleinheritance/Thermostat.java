package com.inheritance.smarthomedevicesingleinheritance;

//Thermostat.java
public class Thermostat extends Device {

 double temperatureSetting;

 // Constructor
 public Thermostat(String deviceId, boolean status, double temperatureSetting) {
     super(deviceId, status);
     this.temperatureSetting = temperatureSetting;
 }

 // Overriding method
 @Override
 public void displayStatus() {
     super.displayStatus();
     System.out.println("Temperature Setting : " + temperatureSetting + " °C");
 }
}
