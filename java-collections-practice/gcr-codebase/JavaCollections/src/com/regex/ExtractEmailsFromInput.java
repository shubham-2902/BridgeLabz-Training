package com.regex;
import java.util.Scanner;

import java.util.regex.Pattern;// Regex provide these two matcher and pattern class
import java.util.regex.Matcher;

public class ExtractEmailsFromInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        // Email regex
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        System.out.println("Extracted Emails:");

        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No email addresses found.");
        }

        sc.close();
    }
}