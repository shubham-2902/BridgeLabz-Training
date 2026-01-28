package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIP {
	public static void main(String[] args) {
        String regex = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])(\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])){3}$";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter IP V4 Number");
		String input = sc.next();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			System.out.println("Valid IP V4 Number");
		} else {
			System.out.println("Invalid IP V4 Number");
		}
	}

}