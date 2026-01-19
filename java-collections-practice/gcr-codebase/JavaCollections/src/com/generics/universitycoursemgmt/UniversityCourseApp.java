package com.generics.universitycoursemgmt;
import java.util.Scanner;

public class UniversityCourseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UniversityCourseManager manager = new UniversityCourseManager();

        while (true) {
            System.out.println("\n===== UNIVERSITY COURSE MANAGEMENT =====");
            System.out.println("1. Add Course");
            System.out.println("2. View All Courses");
            System.out.println("3. View Only Course Types (Wildcard)");
            System.out.println("4. Find Course by Code");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1:
                    addCourse(sc, manager);
                    break;

                case 2:
                    viewAllCourses(manager);
                    break;

                case 3:
                    manager.displayAllCourseTypes();
                    break;

                case 4:
                    findCourse(sc, manager);
                    break;

                case 5:
                    sc.close();
                    System.out.println("Exiting University Course Management System.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addCourse(Scanner sc, UniversityCourseManager manager) {

        System.out.println("\nSelect Course Evaluation Type:");
        System.out.println("1. Exam-Based");
        System.out.println("2. Assignment-Based");
        System.out.println("3. Research-Based");
        System.out.print("Enter type: ");

        int type = readInt(sc);

        System.out.print("Enter Course Code: ");
        String code = sc.nextLine();

        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        if (type == 1) {
            System.out.print("Enter Total Marks: ");
            int total = readInt(sc);

            System.out.print("Enter Passing Marks: ");
            int passing = readInt(sc);

            Course<ExamCourse> course = new Course<>(code, name, dept, new ExamCourse(total, passing));
            manager.addCourse(course);
            System.out.println("Exam-based course added.");

        } else if (type == 2) {
            System.out.print("Enter Assignment Count: ");
            int count = readInt(sc);

            System.out.print("Enter Max Marks per Assignment: ");
            int maxEach = readInt(sc);

            Course<AssignmentCourse> course = new Course<>(code, name, dept, new AssignmentCourse(count, maxEach));
            manager.addCourse(course);
            System.out.println("Assignment-based course added.");

        } else if (type == 3) {
            System.out.print("Enter Research Topic: ");
            String topic = sc.nextLine();

            System.out.print("Enter Paper Submission Count: ");
            int papers = readInt(sc);

            Course<ResearchCourse> course = new Course<>(code, name, dept, new ResearchCourse(topic, papers));
            manager.addCourse(course);
            System.out.println("Research-based course added.");

        } else {
            System.out.println("Invalid evaluation type.");
        }
    }

    private static void viewAllCourses(UniversityCourseManager manager) {

        if (manager.getAllCourses().isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.println("\n--- COURSE CATALOG ---");
        for (Course<? extends CourseType> c : manager.getAllCourses()) {
            System.out.println(c);
        }
    }

    private static void findCourse(Scanner sc, UniversityCourseManager manager) {

        System.out.print("\nEnter course code: ");
        String code = sc.nextLine();

        Course<? extends CourseType> course = manager.findCourseByCode(code);

        if (course == null) {
            System.out.println("Course not found.");
        } else {
            System.out.println("Course Found:");
            System.out.println(course);
        }
    }

    // Input helper method for integers
    private static int readInt(Scanner sc) {
        while (true) {
            try {
                String s = sc.nextLine();
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Enter again: ");
            }
        }
    }
}
