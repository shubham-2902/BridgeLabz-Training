package com.workshop.smartcitytransportmgmt;
public class TaxiService implements TransportService {

    protected FareCalculator fareCalculator;

    public TaxiService(FareCalculator fareCalculator) {
        this.fareCalculator = fareCalculator;
    }

    @Override
    public void startService() {
        System.out.println("Taxi service started");
    }

    @Override
    public void stopService() {
        System.out.println("Taxi service stopped");
    }

    @Override
    public double getFare(double distance) {
        return fareCalculator.calculateFare(distance);
    }
}
