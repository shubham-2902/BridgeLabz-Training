package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
	public static void main(String[] args) {

		String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String input = sc.nextLine();
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			System.out.println("Repeated Words are:- " + matcher.group(1));
		}

	}

}
