package com.day1.FeedbackGuru;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeedbackAnalyzer<T> {

    private Map<String, List<Feedback<T>>> feedbackMap = new HashMap<>();

    public FeedbackAnalyzer() {
        feedbackMap.put("Positive", new ArrayList<>());
        feedbackMap.put("Neutral", new ArrayList<>());
        feedbackMap.put("Negative", new ArrayList<>());
    }

    private static final Pattern RATING_PATTERN =
            Pattern.compile("(\\d+)/10");

    public void analyzeFile(String fileName, T type) {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        getClass().getClassLoader().getResourceAsStream(fileName)))) {

            String line;
            while ((line = br.readLine()) != null) {
                processLine(line, type);
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + fileName);
        }
    }


    private void processLine(String line, T type) {
        try {
            Matcher matcher = RATING_PATTERN.matcher(line);

            if (matcher.find()) {
                int rating = Integer.parseInt(matcher.group(1));
                Feedback<T> feedback = new Feedback<>(type, line);

                if (rating >= 8)
                    feedbackMap.get("Positive").add(feedback);
                else if (rating >= 5)
                    feedbackMap.get("Neutral").add(feedback);
                else
                    feedbackMap.get("Negative").add(feedback);
            } else {
                throw new IllegalArgumentException("Invalid rating format");
            }

        } catch (Exception e) {
            System.out.println("Skipping invalid line: " + line);
        }
    }

    public void printSummary() {
        feedbackMap.forEach((category, list) -> {
            System.out.println("\n" + category + " Feedback:");
            list.forEach(System.out::println);
        });
    }
}
