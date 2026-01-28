package com.regex;
import java.util.Scanner;
import java.util.regex.*;//matcher and pattern are in this package


public class ValidateUsername {


	    public static boolean isValidUsername(String username) {
	        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
	        return username.matches(regex);// matches belongs to String class 
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter username: ");
	        String username = sc.nextLine();

	        if (isValidUsername(username)) {
	            System.out.println("Valid Username");
	        } else {
	            System.out.println(" Invalid Username");
	        }

	        sc.close();
	    }
	}


