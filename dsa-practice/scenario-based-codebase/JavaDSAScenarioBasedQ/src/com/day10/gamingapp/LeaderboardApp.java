package com.day10.gamingapp;
import java.util.*;

public class LeaderboardApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AVLTree avl = new AVLTree();

        // Stores latest points for each player
        HashMap<String, Integer> playerPoints = new HashMap<>();

        while (true) {
            System.out.println("\n===== LEADERBOARD MENU =====");
            System.out.println("1. Add New Player");
            System.out.println("2. Update Player Points");
            System.out.println("3. Remove Player (Ban/Exit)");
            System.out.println("4. Show Top K Players");
            System.out.println("5. Show Full Leaderboard");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1: {
                    System.out.print("Enter player name: ");
                    String name = sc.nextLine();

                    if (playerPoints.containsKey(name)) {
                        System.out.println("Player already exists. Use Update option.");
                        break;
                    }

                    System.out.print("Enter points: ");
                    int points = sc.nextInt();

                    playerPoints.put(name, points);
                    avl.insert(points, name);

                    System.out.println("Player added successfully.");
                    break;
                }

                case 2: {
                    System.out.print("Enter player name: ");
                    String name = sc.nextLine();

                    if (!playerPoints.containsKey(name)) {
                        System.out.println("Player not found!");
                        break;
                    }

                    int oldPoints = playerPoints.get(name);

                    System.out.print("Enter NEW points: ");
                    int newPoints = sc.nextInt();

                    // Remove old entry from AVL
                    avl.delete(oldPoints, name);

                    // Insert new entry
                    avl.insert(newPoints, name);

                    // update map
                    playerPoints.put(name, newPoints);

                    System.out.println("Points updated successfully.");
                    break;
                }

                case 3: {
                    System.out.print("Enter player name to remove: ");
                    String name = sc.nextLine();

                    if (!playerPoints.containsKey(name)) {
                        System.out.println("Player not found!");
                        break;
                    }

                    int points = playerPoints.get(name);

                    // remove from AVL + map
                    avl.delete(points, name);
                    playerPoints.remove(name);

                    System.out.println("Player removed successfully.");
                    break;
                }

                case 4: {
                    System.out.print("Enter K: ");
                    int k = sc.nextInt();
                    avl.displayTopK(k);
                    break;
                }

                case 5: {
                    avl.displayAllSorted();
                    break;
                }

                case 6:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
