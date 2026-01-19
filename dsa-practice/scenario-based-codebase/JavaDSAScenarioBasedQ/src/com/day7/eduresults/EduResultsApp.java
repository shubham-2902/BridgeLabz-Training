package com.day7.eduresults;
import java.util.Scanner;

public class EduResultsApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EduResultsService service = new EduResultsService();
        MergeSortRankList sorter = new MergeSortRankList();

        while (true) {
            System.out.println("\n=== EduResults Rank Sheet Generator ===");
            System.out.println("1. Add student marks");
            System.out.println("2. Display all students (unsorted input order)");
            System.out.println("3. Generate & display rank list (Merge Sort)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = readInt(sc);

                    System.out.print("Enter Student Name: ");
                    String name = readLine(sc);

                    System.out.print("Enter Score: ");
                    int score = readInt(sc);

                    System.out.print("Enter District: ");
                    String district = readLine(sc);

                    service.addStudent(new Student(roll, name, score, district));
                    System.out.println("Student added.");
                    break;

                case 2:
                    service.printAllStudents();
                    break;

                case 3:
                    sorter.sort(service.getStudents());
                    service.printRankList();
                    break;

                case 4:
                    System.out.println("Exiting EduResults...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next(); // discard invalid input
            System.out.print("Enter a valid number: ");
        }
        int val = sc.nextInt();
        sc.nextLine(); // consume newline
        return val;
    }

    private static String readLine(Scanner sc) {
        String line = sc.nextLine();
        while (line.trim().isEmpty()) {
            line = sc.nextLine();
        }
        return line;
    }
}
