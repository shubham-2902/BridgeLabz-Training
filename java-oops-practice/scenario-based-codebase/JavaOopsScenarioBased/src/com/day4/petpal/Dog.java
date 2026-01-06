package com.day4.petpal;
public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void feed() {
        changeHunger(-20);
        changeEnergy(10);
        System.out.println(name + " had the food!");
    }

    @Override
    public void play() {
        changeEnergy(-15);
        changeMood(20);
        System.out.println(name + " is playing!");
    }

    @Override
    public void sleep() {
        changeEnergy(30);
        System.out.println(name + " is sleeping peacefully.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}
