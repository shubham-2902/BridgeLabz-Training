package com.inheritance.smarthomedevicesingleinheritance;

//SmartHomeTest.java
public class SmartHomeTest {

 public static void main(String[] args) {

     Thermostat thermostat =
             new Thermostat("THERMO-202", true, 22.0);

     thermostat.displayStatus();
 }
}
