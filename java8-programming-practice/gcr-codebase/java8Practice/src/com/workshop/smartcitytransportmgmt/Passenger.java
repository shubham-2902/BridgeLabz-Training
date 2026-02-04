package com.workshop.smartcitytransportmgmt;
public class Passenger {

    private String name;
    private String route;

    public Passenger(String name, String route) {
        this.name = name;
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public String getName() {
        return name;
    }
}
