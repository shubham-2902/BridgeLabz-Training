package com.regex;

import java.util.*;
import java.util.regex.*;

public class DatesFormatExtractor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence:");
		String text = sc.nextLine();

		Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
		Matcher matcher = pattern.matcher(text);

		boolean found = false;

		System.out.println("Extracted Dates :");

		while (matcher.find()) {
			System.out.println(matcher.group());
			found = true;
		}

		if (!found) {
			System.out.println("No Date Formats are Found.");
		}

		sc.close();
	}

}
