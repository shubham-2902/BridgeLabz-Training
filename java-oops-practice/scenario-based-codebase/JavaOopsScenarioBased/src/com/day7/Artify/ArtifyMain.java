package com.day7.Artify;
import java.util.Scanner;

public class ArtifyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- User ----------
        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Wallet Balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        User user = new User(name, balance);

        // ---------- Artwork Selection ----------
        System.out.println("\nSelect Artwork Type:");
        System.out.println("1. Digital Art");
        System.out.println("2. Print Art");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Artwork Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Artist Name: ");
        String artist = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        Artwork artwork;

        if (choice == 1) {
            System.out.print("License Type (Personal / Commercial): ");
            String license = sc.nextLine();

            System.out.print("Preview Available? (true/false): ");
            boolean preview = sc.nextBoolean();

            artwork = new DigitalArt(title, artist, price, license, preview);
        } else {
            artwork = new PrintArt(title, artist, price, "Print-Only");
        }

        // ---------- Action ----------
        artwork.showDetails();

        System.out.println("\nChoose Action:");
        System.out.println("1. Purchase");
        System.out.println("2. License");
        int action = sc.nextInt();

        if (action == 1) {
            artwork.purchase(user);
        } else {
            artwork.license(user);
        }

        System.out.println("\nRemaining Wallet Balance: Rs " + user.getWalletBalance());

        sc.close();
    }
}
