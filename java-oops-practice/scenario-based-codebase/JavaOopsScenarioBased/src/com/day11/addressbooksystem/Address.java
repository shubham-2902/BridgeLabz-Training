package com.day11.addressbooksystem;
public class Address {
    private String city;
    private String state;
    private String zip;

    public Address(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }

    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setZip(String zip) { this.zip = zip; }

    @Override
    public String toString() {
        return "City: " + city + ", State: " + state + ", Zip: " + zip;
    }
}
