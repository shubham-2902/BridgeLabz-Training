package com.inheritance.smarthomedevicesingleinheritance;

//Device.java
public class Device {

 String deviceId;
 boolean status;   // true = ON, false = OFF

 // Constructor
 public Device(String deviceId, boolean status) {
     this.deviceId = deviceId;
     this.status = status;
 }

 // Method to display device status
 public void displayStatus() {
     System.out.println("Device ID : " + deviceId);
     System.out.println("Status    : " + (status ? "ON" : "OFF"));
 }
}
