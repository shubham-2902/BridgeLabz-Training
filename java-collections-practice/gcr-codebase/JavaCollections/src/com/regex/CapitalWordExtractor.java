package com.regex;

import java.util.*;
import java.util.regex.*;

public class CapitalWordExtractor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+\\b");
        Matcher matcher = pattern.matcher(text);

        List<String> words = new ArrayList<>();

        while (matcher.find()) {
            String word = matcher.group();

            if (word.equals("A") || word.equals("An") || word.equals("The")) {
                continue;
            }

            words.add(word);
        }

        System.out.println("Capitalized Words (excluding A, An, The):");

        if (words.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(String.join(", ", words));
        }

        sc.close();
    }
}