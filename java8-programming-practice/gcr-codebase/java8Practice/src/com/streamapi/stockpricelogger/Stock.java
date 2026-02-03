package com.streamapi.stockpricelogger;
public class Stock {
    private String name;
    private double price;

    public Stock(String name , double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " : " + price;
    }
}
