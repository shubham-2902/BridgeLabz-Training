package com.day4.exmacell;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamRanker ranker = new ExamRanker();

        System.out.print("Enter number of exam centers: ");
        int centers = sc.nextInt();
        sc.nextLine();

        Student[] combined = new Student[0];

        for (int c = 1; c <= centers; c++) {
            System.out.println("\nCenter " + c + " details:");

            System.out.print("Enter Center Name: ");
            String centerName = sc.nextLine();

            System.out.print("Enter number of students in this center: ");
            int n = sc.nextInt();
            sc.nextLine();

            Student[] centerStudents = new Student[n];

            System.out.println("Enter students (preferably already sorted by Score DESC):");
            for (int i = 0; i < n; i++) {
                System.out.println("Student " + (i + 1) + ":");

                System.out.print("Roll No: ");
                String roll = sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Score: ");
                int score = sc.nextInt();
                sc.nextLine();

                centerStudents[i] = new Student(roll, name, score, centerName);
                System.out.println();
            }

            // If center data is not guaranteed sorted, uncomment this:
            // ranker.mergeSort(centerStudents, 0, centerStudents.length - 1);

            // Merge current center list into combined list
            combined = ranker.mergeTwoCenters(combined, centerStudents);
        }

        System.out.print("\nEnter how many top ranks to display: ");
        int topN = sc.nextInt();

        System.out.println("\nState Level Rank List:");
        ranker.printRankList(combined, topN);

        sc.close();
    }
}
