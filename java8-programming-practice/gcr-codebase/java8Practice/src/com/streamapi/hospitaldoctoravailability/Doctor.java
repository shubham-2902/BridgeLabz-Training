package com.streamapi.hospitaldoctoravailability;
public class Doctor {
    private String name;
    private String specialty;
    private boolean weekendAvailable;

    public Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    public boolean isWeekendAvailable() { return weekendAvailable; }
    public String getSpecialty() { return specialty; }

    @Override
    public String toString() {
        return name + " - " + specialty;
    }
}
