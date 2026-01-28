package com.regex;

import java.util.*;
import java.util.regex.*;


public class ReplaceSpaces {
	public static void main(String[] args) {
		String regex = " +";
		Pattern pattern = Pattern.compile(regex);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String input = sc.nextLine();
		Matcher matcher = pattern.matcher(input);
		System.out.println(matcher.replaceAll(" "));
	}
}
