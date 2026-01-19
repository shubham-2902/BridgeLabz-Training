package com.generics.airesumescreening;
import java.util.Scanner;

public class ResumeScreeningApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ScreeningPipeline pipeline = new ScreeningPipeline();

        while (true) {
            System.out.println("\n===== AI-DRIVEN RESUME SCREENING SYSTEM =====");
            System.out.println("1. Add Resume");
            System.out.println("2. View All Resumes");
            System.out.println("3. View Job Roles In Pipeline (Wildcard)");
            System.out.println("4. Run Screening");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1:
                    addResume(sc, pipeline);
                    break;

                case 2:
                    viewResumes(pipeline);
                    break;

                case 3:
                    pipeline.displayRolesInPipeline();
                    break;

                case 4:
                    pipeline.runScreening();
                    break;

                case 5:
                    sc.close();
                    System.out.println("Exiting system.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addResume(Scanner sc, ScreeningPipeline pipeline) {

        System.out.println("\nSelect Job Role:");
        System.out.println("1. Software Engineer");
        System.out.println("2. Data Scientist");
        System.out.println("3. Product Manager");
        System.out.print("Enter role: ");
        int roleChoice = readInt(sc);

        System.out.print("Enter Candidate ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Candidate Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Experience (years): ");
        int exp = readInt(sc);

        System.out.print("Enter Skill Score (0-100): ");
        int skillScore = readInt(sc);

        System.out.print("How many skills to add? ");
        int n = readInt(sc);

        try {
            if (roleChoice == 1) {
                System.out.print("Min experience required for role: ");
                int minExp = readInt(sc);

                SoftwareEngineer role = new SoftwareEngineer(minExp);
                Resume<SoftwareEngineer> r = new Resume<>(id, name, exp, skillScore, role);
                addSkills(sc, r, n);

                AIScreeningEngine.validateResume(r);
                pipeline.addResume(r);
                System.out.println("Resume added successfully.");

            } else if (roleChoice == 2) {
                System.out.print("Min experience required for role: ");
                int minExp = readInt(sc);

                DataScientist role = new DataScientist(minExp);
                Resume<DataScientist> r = new Resume<>(id, name, exp, skillScore, role);
                addSkills(sc, r, n);

                AIScreeningEngine.validateResume(r);
                pipeline.addResume(r);
                System.out.println("Resume added successfully.");

            } else if (roleChoice == 3) {
                System.out.print("Min experience required for role: ");
                int minExp = readInt(sc);

                ProductManager role = new ProductManager(minExp);
                Resume<ProductManager> r = new Resume<>(id, name, exp, skillScore, role);
                addSkills(sc, r, n);

                AIScreeningEngine.validateResume(r);
                pipeline.addResume(r);
                System.out.println("Resume added successfully.");

            } else {
                System.out.println("Invalid role selection.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void addSkills(Scanner sc, Resume<? extends JobRole> r, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter skill " + i + ": ");
            String s = sc.nextLine();
            r.addSkill(s);
        }
    }

    private static void viewResumes(ScreeningPipeline pipeline) {

        if (pipeline.getAllResumes().isEmpty()) {
            System.out.println("No resumes available.");
            return;
        }

        System.out.println("\n--- RESUMES IN PIPELINE ---");
        for (Resume<? extends JobRole> r : pipeline.getAllResumes()) {
            System.out.println(r);
        }
    }

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
