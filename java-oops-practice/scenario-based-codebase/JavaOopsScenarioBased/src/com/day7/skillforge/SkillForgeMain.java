package com.day7.skillforge;
import java.util.Scanner;

public class SkillForgeMain{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Instructor ----------
        System.out.println("=== Instructor Details ===");
        System.out.print("Name: ");
        String insName = sc.nextLine();

        System.out.print("Email: ");
        String insEmail = sc.nextLine();

        System.out.print("Expertise: ");
        String expertise = sc.nextLine();

        Instructor instructor =
                new Instructor(insName, insEmail, expertise);

        // ---------- Course ----------
        System.out.println("\n=== Course Creation ===");
        System.out.print("Course Title: ");
        String courseTitle = sc.nextLine();

        System.out.print("Number of Modules: ");
        int count = sc.nextInt();
        sc.nextLine();

        String[] modules = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Module " + (i + 1) + ": ");
            modules[i] = sc.nextLine();
        }

        Course course =
                new Course(courseTitle, instructor, modules);

        // ---------- Student ----------
        System.out.println("\n=== Student Enrollment ===");
        System.out.print("Student Name: ");
        String stuName = sc.nextLine();

        System.out.print("Student Email: ");
        String stuEmail = sc.nextLine();

        Student student =
                new Student(stuName, stuEmail);

        // ---------- Progress ----------
        System.out.print("Completed Modules: ");
        int completed = sc.nextInt();

        student.updateProgress(completed, course.getModuleCount());

        // ---------- Review ----------
        System.out.print("Give Course Rating (1–5): ");
        int stars = sc.nextInt();
        course.addReview(stars);

        // ---------- Output ----------
        System.out.println("\n--- Course Summary ---");
        course.showCourseDetails();

        System.out.println("\nStudent Progress: "
                + student.getProgressPercentage() + "%");

        student.generateCertificate();

        sc.close();
    }
}
