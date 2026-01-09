package com.day7.Artify;
public abstract class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;

    private String licenseType;   // protected licensing terms
    private boolean hasPreview;

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this(title, artist, price, licenseType, false);
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price,
                   String licenseType, boolean hasPreview) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.hasPreview = hasPreview;
    }

    protected String getLicenseType() {
        return licenseType;
    }

    public void showDetails() {
        System.out.println("Artwork: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Price: Rs " + price);
        System.out.println("Preview Available: " + hasPreview);
    }
}
