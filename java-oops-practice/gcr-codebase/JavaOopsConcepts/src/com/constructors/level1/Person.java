package com.constructors.level1;

public class Person {

    // Attributes
    String name;
    int age;
    String city;

    // Parameterized Constructor
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.city = other.city;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("City : " + city);
    }

    // Main method
    public static void main(String[] args) {

        // Original object
        Person p1 = new Person("Rahul", 25, "Delhi");

        // Clone object using copy constructor
        Person p2 = new Person(p1);

        System.out.println("Original Person:");
        p1.displayDetails();

        System.out.println();

        System.out.println("Cloned Person:");
        p2.displayDetails();
    }
}
