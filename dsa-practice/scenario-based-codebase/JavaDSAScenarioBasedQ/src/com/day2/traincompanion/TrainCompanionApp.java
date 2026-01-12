package com.day2.traincompanion;
import java.util.Scanner;

public class TrainCompanionApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrainCompartment train = new TrainCompartment();

        // default compartments
        train.addLast("C1");
        train.addLast("C2");
        train.addLast("Pantry");
        train.addLast("C3");

        while (true) {
            System.out.println("\n------ Train Companion ------");
            System.out.println("1. Display Train");
            System.out.println("2. Move Next");
            System.out.println("3. Move Previous");
            System.out.println("4. Show Adjacent Compartments");
            System.out.println("5. Add Compartment at End");
            System.out.println("6. Insert Compartment After");
            System.out.println("7. Remove Compartment");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    train.display();
                    break;

                case 2:
                    train.next();
                    break;

                case 3:
                    train.prev();
                    break;

                case 4:
                    train.showAdjacent();
                    break;

                case 5:
                    System.out.print("Enter compartment name: ");
                    String name = sc.nextLine();
                    train.addLast(name);
                    break;

                case 6:
                    System.out.print("Insert after which compartment: ");
                    String after = sc.nextLine();

                    System.out.print("Enter new compartment name: ");
                    String newComp = sc.nextLine();

                    train.insertAfter(after, newComp);
                    break;

                case 7:
                    System.out.print("Enter compartment name to remove: ");
                    String removeName = sc.nextLine();
                    train.remove(removeName);
                    break;

                case 8:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
