package com.functionalinterface.stringlengthchecker;

import java.util.Scanner;
import java.util.function.Function;

public class MessageChecker {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter msg");
			String msg = sc.nextLine();

			Function<String, Integer> lengthChecker = String::length;

			int length = lengthChecker.apply(msg);

			if (length > 30) {
				System.out.println("Message exceeds character limit");
			} else {
				System.out.println("Message within limit");
			}
		}
	}
}
