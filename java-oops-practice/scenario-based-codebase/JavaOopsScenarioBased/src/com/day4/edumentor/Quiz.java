package com.day4.edumentor;
import java.util.Scanner;

public class Quiz {

    private String[] questions;      // private question bank
    private String[] correctAnswers; // encapsulated answers
    private int score;

    // Constructor decides questions based on difficulty
    public Quiz(String difficulty) {

        if (difficulty.equalsIgnoreCase("Easy")) {

            questions = new String[]{
                "1) Which keyword is used to create an object in Java?",
                "2) Which method is the entry point of a Java program?"
            };

            correctAnswers = new String[]{
                "new",
                "main"
            };

        } else { // Hard

            questions = new String[]{
                "1) Which OOP concept is achieved using interfaces?",
                "2) Which keyword is used to prevent inheritance in Java?"
            };

            correctAnswers = new String[]{
                "abstraction",
                "final"
            };
        }
    }

    // Ask Java questions
    public void attemptQuiz() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your Answer: ");
            String userAnswer = sc.nextLine().toLowerCase();

            if (userAnswer.equals(correctAnswers[i])) {
                score += 10;
            }
        }
    }

    // Percentage calculation
    public double getPercentage() {
        return (score * 100.0) / (questions.length * 10);
    }
}
