package com.functionalinterface.smartdevice;
class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light turned ON");
    }
    public void turnOff() {
        System.out.println("Light turned OFF");
    }
}

class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC started cooling");
    }
    public void turnOff() {
        System.out.println("AC stopped");
    }
}

class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV switched ON");
    }
    public void turnOff() {
        System.out.println("TV switched OFF");
    }
}
