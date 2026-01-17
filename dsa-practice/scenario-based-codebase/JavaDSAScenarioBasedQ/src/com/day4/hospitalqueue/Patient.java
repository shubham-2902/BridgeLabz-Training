package com.day4.hospitalqueue;

public class Patient {

	private int patientId;
	private String name;
	private int criticality;
	private int arrivalTime;
	public Patient(int patientId, String name, int criticality, int arrivalTime) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.criticality = criticality;
		this.arrivalTime = arrivalTime;
	}
	  public int getPatientId() {
		    
		  return patientId;
		  
	  }

	  public String getName() {
		  return name;
	  }

	  public int getCriticality() {
		  return criticality;
	  }

	  public int getArrivalTime() {
		  return arrivalTime;
	  }
	  @Override
	  public String toString() {
		  return "Patient [patientId=" + patientId + ", name=" + name + ", criticality=" + criticality
				  + ", arrivalTime=" + arrivalTime + "]";
	  }
	  
	  
}
