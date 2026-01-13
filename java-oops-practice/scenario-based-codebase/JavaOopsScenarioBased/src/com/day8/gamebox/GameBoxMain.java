package com.day8.gamebox;
import java.util.Scanner;

public class GameBoxMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String name = sc.nextLine();
        User user = new User(name);

        System.out.println("Select Game Type:");
        System.out.println("1. Arcade\n2. Strategy");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Game Title: ");
        String title = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Rating: ");
        double rating = sc.nextDouble();

        Game game = (choice == 1)
                ? new ArcadeGame(title, price, rating)
                : new StrategyGame(title, price, rating);

        System.out.println("\nSelect Action:");
        System.out.println("1. Play Demo\n2. Download");
        int action = sc.nextInt();

        if (action == 1) {
            game.playDemo();
        } else {
            game.download(user);
        }

        System.out.println();
        user.showOwnedGames();

        sc.close();
    }
}
