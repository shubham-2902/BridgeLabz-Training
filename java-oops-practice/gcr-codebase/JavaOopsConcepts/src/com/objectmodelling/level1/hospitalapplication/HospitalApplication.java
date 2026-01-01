package com.objectmodelling.level1.hospitalapplication;

public class HospitalApplication {

	

	    public static void main(String[] args) {

	        Hospital hospital = new Hospital("City Care Hospital");

	        Doctor d1 = new Doctor(1, "Sharma");
	        Doctor d2 = new Doctor(2, "Mehta");

	        Patient p1 = new Patient(101, "Aman");
	        Patient p2 = new Patient(102, "Neha");

	        hospital.addDoctor(d1);
	        hospital.addDoctor(d2);

	        hospital.addPatient(p1);
	        hospital.addPatient(p2);

	        hospital.displayHospitalInfo();

	        System.out.println();

	        // Communication + Association
	        d1.consult(p1);
	        d1.consult(p2);

	        d2.consult(p2);

	        System.out.println();
	        d1.displayPatients();
	        System.out.println();
	        d2.displayPatients();
	    }
	}


