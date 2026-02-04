package com.workshop.smartcitytransportmgmt;
public class Trip {

    private String route;
    private double fare;
    private boolean peakTime;

    public Trip(String route, double fare, boolean peakTime) {
        this.route = route;
        this.fare = fare;
        this.peakTime = peakTime;
    }

    public double getFare() {
        return fare;
    }

    public boolean isPeakTime() {
        return peakTime;
    }

    public String getRoute() {
        return route;
    }
}
