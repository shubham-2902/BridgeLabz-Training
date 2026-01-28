package com.regex;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateCreditCard {
	public static void main(String[] args) {
		String regex = "^(4[0-9]{15}|5[0-9]15)$";
		Pattern pattern = Pattern.compile(regex);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Credit Card Number");
		String  input= sc.next();
		Matcher matcher = pattern.matcher(input);
		if(matcher.matches()) {
			System.out.println("Valid Credit card Number");
		}
		else
		{
			System.out.println("Inavalid Credit Card Number");
		}
	}

}
