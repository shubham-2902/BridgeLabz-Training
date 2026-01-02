package com.day1.smarthomeautomationsystem;

public class UserController {

    public void operateDevice(Controllable device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPowerConsumption() > a2.getPowerConsumption()) {
            System.out.println(a1.deviceName + " consumes more power than " + a2.deviceName);
        } else if (a1.getPowerConsumption() < a2.getPowerConsumption()) {
            System.out.println(a1.deviceName + " consumes less power than " + a2.deviceName);
        } else {
            System.out.println("Both devices consume equal power");
        }
    }
}
