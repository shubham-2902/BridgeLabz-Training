package com.lambdaexpression.smarthome;
public class HomeAutomation {
    public static void main(String[] args) {

        SmartLightSystem system = new SmartLightSystem();

        // Motion detected light pattern
        LightBehavior motionLight = () ->
                System.out.println("Motion detected → Lights ON at full brightness");

        // Night mode
        LightBehavior nightLight = () ->
                System.out.println("Night mode → Dim warm lights");

        // Voice command
        LightBehavior voiceLight = () ->
                System.out.println("Voice command → Party color lights");

        system.triggerLight(motionLight);
        system.triggerLight(nightLight);
        system.triggerLight(voiceLight);
    }
}
