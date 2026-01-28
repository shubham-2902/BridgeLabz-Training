package com.regex;

import java.util.Scanner;

public class ValidateHexColor {
	public static boolean isHex(String hexName) {
		String regex = "^#[0-9A-Fa-f]{6}$";
		return hexName.matches(regex);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hex color code");
		String name = sc.next();
		if (isHex(name)) {
			System.out.println("Valid Hex Color");
		} else {
			System.out.println("Invalid Hex Color");
		}

	}

}
