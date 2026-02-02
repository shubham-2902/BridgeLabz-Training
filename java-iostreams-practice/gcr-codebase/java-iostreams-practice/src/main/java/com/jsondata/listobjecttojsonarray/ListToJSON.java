package com.jsondata.listobjecttojsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.*;

class Car {
    public String brand;
    public int year;

    Car(String b, int y) { brand=b; year=y; }
}

public class ListToJSON {
    public static void main(String[] args) {
        try {
            List<Car> cars = Arrays.asList(
                new Car("BMW", 2020),
                new Car("Audi", 2022)
            );

            new ObjectMapper().writeValue(new File("cars.json"), cars);
            System.out.println("cars.json created successfully!");
        } catch (Exception e) {
            System.out.println("Error creating JSON array.");
        }
    }
}
