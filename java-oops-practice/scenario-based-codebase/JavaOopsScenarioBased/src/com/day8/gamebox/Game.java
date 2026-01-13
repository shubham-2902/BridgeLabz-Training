package com.day8.gamebox;
public abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // seasonal offer
    protected double applyOffer(int offerPercent) {
        return price - (price * offerPercent / 100);
    }
}
