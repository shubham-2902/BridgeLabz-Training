package com.day5.cropmonitor;
import java.time.LocalDateTime;

public class SensorRecord {
    private String sensorId;
    private LocalDateTime timestamp;
    private double soilTemperature;

    public SensorRecord(String sensorId, LocalDateTime timestamp, double soilTemperature) {
        this.sensorId = sensorId;
        this.timestamp = timestamp;
        this.soilTemperature = soilTemperature;
    }

    public String getSensorId() {
        return sensorId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public double getSoilTemperature() {
        return soilTemperature;
    }

    @Override
    public String toString() {
        return "Sensor: " + sensorId +
                ", Timestamp: " + timestamp +
                ", Temp: " + soilTemperature;
    }
}
