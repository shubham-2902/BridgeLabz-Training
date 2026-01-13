package com.day8.gamebox;
import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<String> ownedGames = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addGame(String gameTitle) {
        ownedGames.add(gameTitle);
    }

    public void showOwnedGames() {
        System.out.println("Owned Games: " + ownedGames);
    }

    public String getName() {
        return name;
    }
}
