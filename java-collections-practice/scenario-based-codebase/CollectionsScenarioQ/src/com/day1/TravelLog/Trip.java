package com.day1.TravelLog;

import java.io.Serializable;

public class Trip implements Serializable {
    private String city;
    private String country;
    private int days;
    private String notes;

    public Trip(String city, String country, int days, String notes) {
        this.city = city;
        this.country = country;
        this.days = days;
        this.notes = notes;
    }

    public String getCity() { return city; }
    public String getCountry() { return country; }
    public int getDays() { return days; }
    public String getNotes() { return notes; }

    @Override
    public String toString() {
        return city + ", " + country + " (" + days + " days)";
    }
}
