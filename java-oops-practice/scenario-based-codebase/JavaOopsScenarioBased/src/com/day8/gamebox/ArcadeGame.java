package com.day8.gamebox;
public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    @Override
    public void playDemo() {
        System.out.println("🕹 Arcade Demo: 60 seconds fast gameplay!");
    }

    @Override
    public void download(User user) {
        user.addGame(title);
        System.out.println(title + " downloaded for " + user.getName());
    }
}
