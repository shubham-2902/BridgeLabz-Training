package com.day9.musicapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TrackIdBST trackIdBST = new TrackIdBST();
        TitleBST titleBST = new TitleBST();

        // Insert sample tracks
        addTrack(trackIdBST, titleBST, new Track(501, "Believer", "Imagine Dragons", 3.24));
        addTrack(trackIdBST, titleBST, new Track(205, "Alone", "Alan Walker", 2.41));
        addTrack(trackIdBST, titleBST, new Track(310, "Faded", "Alan Walker", 3.12));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Music App (BST) =====");
            System.out.println("1. Search Track by TrackID");
            System.out.println("2. Insert New Track");
            System.out.println("3. Show Playlist Alphabetically (by Title)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter TrackID: ");
                    int id = sc.nextInt();
                    Track found = trackIdBST.search(id);

                    if (found == null) System.out.println("Track not found.");
                    else System.out.println("Found: " + found);
                }

                case 2 -> {
                    System.out.print("Enter TrackID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Artist: ");
                    String artist = sc.nextLine();

                    System.out.print("Enter Duration (minutes): ");
                    double dur = sc.nextDouble();

                    addTrack(trackIdBST, titleBST, new Track(id, title, artist, dur));
                    System.out.println("Track inserted.");
                }

                case 3 -> titleBST.displayPlaylistAlphabetically();

                case 4 -> {
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void addTrack(TrackIdBST trackIdBST, TitleBST titleBST, Track track) {
        trackIdBST.insert(track);
        titleBST.insert(track);
    }
}
