package com.day4.petpal;
public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        changeHunger(-15);
        System.out.println(name + " ate food.");
    }

    @Override
    public void play() {
        changeMood(15);
        changeEnergy(-10);
        System.out.println(name + " is playing with yarn.");
    }

    @Override
    public void sleep() {
        changeEnergy(40);
        System.out.println(name + " is taking a perfect nap");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}
