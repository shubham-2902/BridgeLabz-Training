package com.extra.stringmanipulation;
import java.util.Scanner;

public class LexicalTwist {
	public static boolean validationCheck(String str) {
		String[] check = str.split("\s");
		if (check[1] == null) {
	         return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First word");
		String firstWord = sc.nextLine();
		//validationCheck(firstWord);
		if(validationCheck(firstWord)) {
		System.out.println("Enter the Second word");
		//String secondWord = sc.nextLine();
		}
		String secondWord = sc.nextLine();
		validationCheck(secondWord);
			
	}

}
