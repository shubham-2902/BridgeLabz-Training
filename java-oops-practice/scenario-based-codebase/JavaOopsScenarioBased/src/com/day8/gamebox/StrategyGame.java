package com.day8.gamebox;
public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void playDemo() {
        System.out.println("♟ Strategy Demo: 1 level planning mode!");
    }

    @Override
    public void download(User user) {
        user.addGame(title);
        System.out.println(title + " downloaded for " + user.getName());
    }
}
