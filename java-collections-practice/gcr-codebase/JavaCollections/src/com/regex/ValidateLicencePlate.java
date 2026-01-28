package com.regex;

import java.util.*;

public class ValidateLicencePlate {
	public static boolean isValidateName(String nameplate) {
		String regex = "^[A-Z]{2}\\d{4}$";
		return nameplate.matches(regex);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nameplate");
		String name = sc.next();
		if (isValidateName(name)) {
			System.out.print("Valid NamePlate");

		} else {

			System.out.print("Invalid NamePlate");
		}
	}

}