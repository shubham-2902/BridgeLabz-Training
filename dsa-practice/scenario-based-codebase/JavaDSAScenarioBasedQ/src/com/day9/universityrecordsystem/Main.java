package com.day9.universityrecordsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentBST bst = new StudentBST();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== University Digital Record System (BST) =====");
            System.out.println("1. Enroll Student (Insert)");
            System.out.println("2. Remove Student (Delete)");
            System.out.println("3. Search Student");
            System.out.println("4. Display Sorted Student Roll Numbers (Attendance List)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    bst.insert(new Student(rollNo, name, dept));
                    System.out.println("Student enrolled successfully.");
                }

                case 2 -> {
                    System.out.print("Enter Roll No to remove: ");
                    int rollNo = sc.nextInt();
                    bst.delete(rollNo);
                    System.out.println("Delete operation attempted.");
                }

                case 3 -> {
                    System.out.print("Enter Roll No to search: ");
                    int rollNo = sc.nextInt();
                    Student found = bst.search(rollNo);

                    if (found == null) {
                        System.out.println("Student record not found.");
                    } else {
                        System.out.println("Student record found: " + found);
                    }
                }

                case 4 -> bst.displaySortedRollNumbers();

                case 5 -> {
                    System.out.println("Exiting system...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
