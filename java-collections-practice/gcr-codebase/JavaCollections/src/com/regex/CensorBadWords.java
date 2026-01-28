package com.regex;

import java.util.regex.*;

public class CensorBadWords {
	public static void main(String[] args) {
		String badWords[] = { "damn", "stupid" };
		String inputs = "This is a Damn bad example with some stupid words.";
	
		for (String word : badWords) {
			String regex = "\\b" +word+"\\b";
			Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(inputs);
			
			inputs= matcher.replaceAll("****");
			

		}
		System.out.println(inputs);
	}
}