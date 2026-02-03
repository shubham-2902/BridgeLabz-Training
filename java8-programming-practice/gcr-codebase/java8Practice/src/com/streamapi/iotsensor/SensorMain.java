package com.streamapi.iotsensor;
import java.util.*;

public class SensorMain {
    public static void main(String[] args) {
        List<Sensor> sensors = Arrays.asList(
            new Sensor(45.2),
            new Sensor(78.5),
            new Sensor(30.0),
            new Sensor(90.1)
        );

        double threshold = 50;

        sensors.stream()
               .filter(s -> s.getReading() > threshold)
               .forEach(s -> System.out.println("High Reading: " + s.getReading()));
    }
}
