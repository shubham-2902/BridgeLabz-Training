package com.functionalinterface.smartvehicledashboard;

public class VehicleMain {
public static void main(String[] args) {
	VehicleDashboard v1 = new PetrolCar();
	VehicleDashboard v2 = new ElectricCar();
	v1.displayBattery();
	v2.displaySpeed();
	v2.displayBattery();
}
}
