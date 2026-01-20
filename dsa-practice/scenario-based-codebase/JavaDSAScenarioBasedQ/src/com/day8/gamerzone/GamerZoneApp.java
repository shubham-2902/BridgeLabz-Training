package com.day8.gamerzone;
import java.util.Scanner;

public class GamerZoneApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GamerZoneService service = new GamerZoneService();
        QuickSortPlayersByScore sorter = new QuickSortPlayersByScore();

        while (true) {
            System.out.println("\n=== GamerZone High Score Ranking ===");
            System.out.println("1. Add player");
            System.out.println("2. Update player score");
            System.out.println("3. Display all players");
            System.out.println("4. Sort leaderboard (Quick Sort)");
            System.out.println("5. Show Top-K players");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt(sc);

            switch (choice) {
                case 1:
                    System.out.print("Enter player ID: ");
                    String id = readLine(sc);

                    System.out.print("Enter player name: ");
                    String name = readLine(sc);

                    System.out.print("Enter score: ");
                    int score = readInt(sc);

                    service.addPlayer(new Player(id, name, score));
                    System.out.println("Player added.");
                    break;

                case 2:
                    System.out.print("Enter player ID to update: ");
                    String search = readLine(sc);

                    Player player = service.findById(search);
                    if (player == null) {
                        System.out.println("Player not found.");
                        break;
                    }

                    System.out.print("Enter new score: ");
                    int newScore = readInt(sc);

                    player.setScore(newScore);
                    System.out.println("Score updated.");
                    break;

                case 3:
                    service.printAll();
                    break;

                case 4:
                    sorter.sort(service.getPlayers());
                    System.out.println("Leaderboard sorted by score (DESC).");
                    break;

                case 5:
                    sorter.sort(service.getPlayers()); // ensure sorted before top-K
                    System.out.print("Enter K: ");
                    int k = readInt(sc);
                    service.printTopK(k);
                    break;

                case 6:
                    System.out.println("Exiting GamerZone...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
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
        while (line.trim().isEmpty()) line = sc.nextLine();
        return line;
    }
}
