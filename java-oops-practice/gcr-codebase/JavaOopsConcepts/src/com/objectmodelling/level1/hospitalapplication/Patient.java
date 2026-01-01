package com.objectmodelling.level1.hospitalapplication;

public class Patient {

	

	    private int patientId;
	    private String patientName;

	    Patient(int patientId, String patientName) {
	        this.patientId = patientId;
	        this.patientName = patientName;
	    }

	    String getPatientName() {
	        return patientName;
	    }
	}


