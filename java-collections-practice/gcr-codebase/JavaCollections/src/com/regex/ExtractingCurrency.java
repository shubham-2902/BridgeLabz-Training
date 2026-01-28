package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingCurrency {
	public static void main(String[] args) {
		String regex = "\\$?\\d+\\.\\d{2}";
		Pattern pattern = Pattern.compile(regex);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentence ");

		String input = sc.nextLine();

		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {

			System.out.println(matcher.group());
	}

}
}
