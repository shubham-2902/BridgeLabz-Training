package com.streamapi.iotsensor;
public class Sensor {
    private double reading;

    public Sensor(double reading) {
        this.reading = reading;
    }

    public double getReading() { return reading; }
}
