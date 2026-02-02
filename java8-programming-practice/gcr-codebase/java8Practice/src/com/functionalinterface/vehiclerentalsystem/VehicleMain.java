package com.functionalinterface.vehiclerentalsystem;

public class VehicleMain {
	public static void main(String[] args) {
		Rentable r1 = new Bike();
		Rentable r2 = new Car();
		Rentable r3 = new Bus();
		r1.rent();
		r3.returnVehicle();
		r2.rent();

	}
}
