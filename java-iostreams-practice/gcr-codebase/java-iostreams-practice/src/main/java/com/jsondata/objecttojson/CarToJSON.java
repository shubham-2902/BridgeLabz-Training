package com.jsondata.objecttojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

class Car {
    public String brand;
    public int year;
}

public class CarToJSON {
    public static void main(String[] args) {
        try {
            Car c = new Car();
            c.brand = "Toyota";
            c.year = 2022;

            new ObjectMapper().writeValue(new File("car.json"), c);
            System.out.println("car.json created successfully!");
        } catch (Exception e) {
            System.out.println("Error converting car to JSON.");
        }
    }
}
