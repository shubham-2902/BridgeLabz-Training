package com.day6.icecreamrush;
public class Flavor {
    private String name;
    private int weeklySales;

    public Flavor(String name, int weeklySales) {
        this.name = name;
        this.weeklySales = weeklySales;
    }

    public String getName() {
        return name;
    }

    public int getWeeklySales() {
        return weeklySales;
    }

    @Override
    public String toString() {
        return name + " -> " + weeklySales + " sales";
    }
}
