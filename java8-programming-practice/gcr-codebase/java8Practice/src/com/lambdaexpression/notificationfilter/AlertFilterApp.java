package com.lambdaexpression.notificationfilter;
import java.util.*;
import java.util.function.Predicate;

public class AlertFilterApp {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Heart Rate", 5),
                new Alert("Low Battery", 2),
                new Alert("Emergency", 10)
        );

        // Only for critical alerts
        Predicate<Alert> criticalOnly = alert -> alert.severity >= 5;

        System.out.println("Critical Alerts:");
        alerts.stream()
              .filter(criticalOnly)
              .forEach(System.out::println);

        // Only for device-related alerts
        Predicate<Alert> deviceAlerts = alert -> alert.type.contains("Battery");

        System.out.println("Device Alerts:");
        alerts.stream()
              .filter(deviceAlerts)
              .forEach(System.out::println);
    }
}
