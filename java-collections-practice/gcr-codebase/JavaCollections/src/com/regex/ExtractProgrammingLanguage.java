package com.regex;

import java.util.Scanner;
import java.util.regex.*;

public class ExtractProgrammingLanguage {
	public static void main(String[] args) {

		String regex = "\\b(Java|Python|JavaScript|Go)\\b";

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
