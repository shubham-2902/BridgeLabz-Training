package com.day4.edumentor;
import java.util.*;
public class EduMentorMain {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // ---------- Instructor ----------
	        System.out.println("=== Instructor Details ===");
	        System.out.print("ID: ");
	        int insId = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Name: ");
	        String insName = sc.nextLine();

	        System.out.print("Email: ");
	        String insEmail = sc.nextLine();

	        System.out.print("Expertise: ");
	        String expertise = sc.nextLine();

	        System.out.print("Experience (years): ");
	        int exp = sc.nextInt();
	        sc.nextLine();

	        Instructor instructor =
	                new Instructor(insId, insName, insEmail, expertise, exp);

	        // ---------- Learner ----------
	        System.out.println("\n=== Learner Details ===");
	        System.out.print("ID: ");
	        int learnerId = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Name: ");
	        String learnerName = sc.nextLine();

	        System.out.print("Email: ");
	        String learnerEmail = sc.nextLine();

	        System.out.print("Course Type (Short / FullTime): ");
	        String courseType = sc.nextLine();

	        Learner learner =
	                new Learner(learnerId, learnerName, learnerEmail, courseType);

	        // ---------- Java Quiz ----------
	        System.out.print("\nSelect Java Quiz Difficulty (Easy / Hard): ");
	        String difficulty = sc.nextLine();

	        Quiz quiz = new Quiz(difficulty);

	        System.out.println("\n Java Quiz Started");
	        quiz.attemptQuiz();

	        double percentage = quiz.getPercentage();

	        // ---------- Result ----------
	        System.out.println("\n Quiz Result");
	        System.out.println("Java Quiz Percentage: " + percentage + "%");

	        learner.generateCertificate(percentage);

	        System.out.println("\n Instructor Assigned");
	        instructor.printDetails();

	        sc.close();
	    }
	}
