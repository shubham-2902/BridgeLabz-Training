package com.day7.Artify;
public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist,
                      double price, String licenseType, boolean preview) {
        super(title, artist, price, licenseType, preview);
    }

    @Override
    public void purchase(User user) {

        if (user.deductAmount(price)) {
            System.out.println("Digital artwork purchased successfully.");
        } else {
            System.out.println(" Insufficient wallet balance.");
        }
    }

    @Override
    public void license(User user) {

        double licenseFee = price * 0.30; // 30% licensing cost

        if (user.deductAmount(licenseFee)) {
            System.out.println("Digital license granted (" + getLicenseType() + ")");
        } else {
            System.out.println("Insufficient balance for license.");
        }
    }
}
