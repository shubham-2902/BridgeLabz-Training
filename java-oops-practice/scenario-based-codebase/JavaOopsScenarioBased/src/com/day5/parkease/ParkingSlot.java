package com.day5.parkease;
public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;             // protected from outside
    private String vehicleTypeAllowed;
    private String location;

    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean canPark(Vehicle vehicle) {
        return !isOccupied &&
               vehicle.getVehicleType().equalsIgnoreCase(vehicleTypeAllowed);
    }

    public void parkVehicle() {
        isOccupied = true;
    }

    public void releaseSlot() {
        isOccupied = false;
    }

    public void showSlotInfo() {
        System.out.println("Slot ID: " + slotId);
        System.out.println("Location: " + location);
        System.out.println("Allowed Vehicle: " + vehicleTypeAllowed);
        System.out.println("Occupied: " + isOccupied);
    }
}
