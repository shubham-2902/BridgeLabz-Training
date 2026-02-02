package com.functionalinterface.temperaturealertsystem;
import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Temperature");
			double currentTemp = sc.nextDouble();

			Predicate<Double> highTempAlert = temp -> temp > 37.0;

			if (highTempAlert.test(currentTemp)) {
			    System.out.println(" High Temperature Alert!");
			} else {
			    System.out.println("Temperature Normal");
			}
		}
    }
}
