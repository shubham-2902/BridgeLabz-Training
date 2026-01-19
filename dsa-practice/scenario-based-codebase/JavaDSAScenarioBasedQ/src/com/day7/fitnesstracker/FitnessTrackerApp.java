package com.day7.fitnesstracker;
import java.util.Scanner;

public class FitnessTrackerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FitnessTrackerService service = new FitnessTrackerService();
        BubbleSortLeaderboard sorter = new BubbleSortLeaderboard();

        while (true) {
            System.out.println("\n=== FitnessTracker Daily Ranking ===");
            System.out.println("1. Add user");
            System.out.println("2. Update steps (sync steps)");
            System.out.println("3. Display all users");
            System.out.println("4. Generate leaderboard (Bubble Sort)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String username = readLine(sc);

                    System.out.print("Enter steps: ");
                    int steps = readInt(sc);

                    service.addUser(new UserSteps(username, steps));
                    System.out.println("User added.");
                    break;

                case 2:
                    System.out.print("Enter username to update: ");
                    String search = readLine(sc);

                    UserSteps user = service.findUser(search);
                    if (user == null) {
                        System.out.println("User not found.");
                        break;
                    }

                    System.out.print("Enter new steps: ");
                    int newSteps = readInt(sc);

                    user.setSteps(newSteps);
                    System.out.println("Steps updated.");
                    break;

                case 3:
                    service.printGroup();
                    break;

                case 4:
                    sorter.sort(service.getGroup());
                    service.printLeaderboard();
                    break;

                case 5:
                    System.out.println("Exiting FitnessTracker...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter a valid number: ");
        }
        int val = sc.nextInt();
        sc.nextLine();
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
