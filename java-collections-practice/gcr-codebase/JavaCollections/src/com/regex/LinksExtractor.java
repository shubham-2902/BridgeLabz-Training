package com.regex;

import java.util.*;
import java.util.regex.*;

public class LinksExtractor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence:");
		String text = sc.nextLine();

		Pattern pattern = Pattern.compile("https?://[a-z]+[.a-z]+");
		Matcher matcher = pattern.matcher(text);

		boolean found = false;

		System.out.println("Extracted Links :");

		while (matcher.find()) {
			System.out.println(matcher.group());
			found = true;
		}

		if (!found) {
			System.out.println("No Links are Found.");
		}

		sc.close();
	}

}


