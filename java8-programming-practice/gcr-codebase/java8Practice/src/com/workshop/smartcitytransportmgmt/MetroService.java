package com.workshop.smartcitytransportmgmt;
public class MetroService implements TransportService {

    private FareCalculator fareCalculator;

    public MetroService(FareCalculator fareCalculator) {
        this.fareCalculator = fareCalculator;
    }

    @Override
    public void startService() {
        System.out.println("Metro service started");
    }

    @Override
    public void stopService() {
        System.out.println("Metro service stopped");
    }

    @Override
    public double getFare(double distance) {
        return fareCalculator.calculateFare(distance);
    }
}
