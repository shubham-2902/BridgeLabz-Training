package com.day1.smarthomeautomationsystem;

public class SmartHomeApp {

    public static void main(String[] args) {

        Appliance light = new Light("Living Room");
        Appliance fan = new Fan("Bedroom");
        Appliance ac = new AC("Hall");

        UserController controller = new UserController();

        // Polymorphic control
        controller.operateDevice(light, true);
        controller.operateDevice(fan, true);
        controller.operateDevice(ac, true);

        System.out.println();

        // Energy comparison
        controller.compareEnergy(ac, fan);
        controller.compareEnergy(light, fan);

        System.out.println();

        controller.operateDevice(ac, false);
    }
}
