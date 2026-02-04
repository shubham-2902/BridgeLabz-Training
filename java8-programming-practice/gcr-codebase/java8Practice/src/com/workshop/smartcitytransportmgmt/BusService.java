package com.workshop.smartcitytransportmgmt;
public class BusService implements TransportService {

    private FareCalculator fareCalculator;

    public BusService(FareCalculator fareCalculator) {
        this.fareCalculator = fareCalculator;
    }

    @Override
    public void startService() {
        System.out.println("Bus service started");
    }

    @Override
    public void stopService() {
        System.out.println("Bus service stopped");
    }

    @Override
    public double getFare(double distance) {
        return fareCalculator.calculateFare(distance);
    }
}
