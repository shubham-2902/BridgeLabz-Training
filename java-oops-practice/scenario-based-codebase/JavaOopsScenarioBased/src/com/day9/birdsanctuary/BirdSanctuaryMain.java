package com.day9.birdsanctuary;
import java.util.Scanner;

public class BirdSanctuaryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sanctuary sanctuary = new Sanctuary();

        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display All Flying Birds");
            System.out.println("4. Display All Swimming Birds");
            System.out.println("5. Display Both Flying & Swimming Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> addBirdFlow(sc, sanctuary);
                case 2 -> sanctuary.displayAllBirds();
                case 3 -> sanctuary.displayFlyingBirds();
                case 4 -> sanctuary.displaySwimmingBirds();
                case 5 -> sanctuary.displayBothFlyAndSwimBirds();
                case 6 -> {
                    System.out.print("Enter Bird ID to delete: ");
                    String id = sc.nextLine();
                    sanctuary.deleteBirdById(id);
                }
                case 7 -> sanctuary.sanctuaryReport();
                case 8 -> {
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println(" Invalid choice. Try again.");
            }
        }
    }

    private static void addBirdFlow(Scanner sc, Sanctuary sanctuary) {

        System.out.println("\nSelect Bird Type:");
        System.out.println("1. Eagle (Fly)");
        System.out.println("2. Sparrow (Fly)");
        System.out.println("3. Duck (Swim)");
        System.out.println("4. Penguin (Swim)");
        System.out.println("5. Seagull (Fly + Swim)");
        System.out.println("6. Kiwi (Neither)");
        System.out.println("7. Ostrich (Neither)");

        System.out.print("Enter type: ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Bird Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Unique ID: ");
        String id = sc.nextLine();

        Bird bird = switch (type) {
            case 1 -> new Eagle(name, id);
            case 2 -> new Sparrow(name, id);
            case 3 -> new Duck(name, id);
            case 4 -> new Penguin(name, id);
            case 5 -> new Seagull(name, id);
            case 6 -> new Kiwi(name, id);
            default -> new Ostrich(name, id);
        };

        sanctuary.addBird(bird);
    }
}
