package com.functionalinterface.passwordstrengthvalidator;

import java.util.Scanner;

public class InsurancePortal {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Password");

			String pwd = sc.next();

			if (StrengthValidator.isStrongPassword(pwd)) {
				System.out.println("Strong Password");
			} else {
				System.out.println("Weak Password");
			}
		}
	}
}
