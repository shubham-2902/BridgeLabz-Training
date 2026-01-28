package com.regex;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
	public static void main(String[] args) {

		String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
		Pattern pattern = Pattern.compile(regex);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Sentence ");

		String input = sc.nextLine();

		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {

			System.out.println("Valid SSN are:- "+matcher.group());
		}

	}

}
