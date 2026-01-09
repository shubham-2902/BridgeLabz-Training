package com.day7.Artify;
public class PrintArt extends Artwork {

    public PrintArt(String title, String artist,
                    double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void purchase(User user) {

        double printCost = price + 500; // printing charge

        if (user.deductAmount(printCost)) {
            System.out.println(" Print artwork purchased (with delivery).");
        } else {
            System.out.println(" Insufficient wallet balance.");
        }
    }

    @Override
    public void license(User user) {

        System.out.println("Licensing not available for print art.");
    }
}
