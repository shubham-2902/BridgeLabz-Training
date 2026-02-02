package com.functionalinterface.smartdevice;
public class HomeApp {
    public static void main(String[] args) {
        SmartDevice d1 = new Light();
        SmartDevice d2 = new AC();

        d1.turnOn();
        d2.turnOn();
    }
}
