package com.workshop.smartcitytransportmgmt;
public class AmbulanceService extends TaxiService implements EmergencyService {

    public AmbulanceService(FareCalculator fareCalculator) {
        super(fareCalculator);
    }

    @Override
    public void startService() {
        System.out.println("Ambulance emergency service started");
    }
}
