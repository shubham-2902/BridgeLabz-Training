package com.day4.petpal;
public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        changeHunger(-10);
        System.out.println(name + " pecked some seeds.");
    }

    @Override
    public void play() {
        changeEnergy(-10);
        changeMood(10);
        System.out.println(name + " is flying around!");
    }

    @Override
    public void sleep() {
        changeEnergy(25);
        System.out.println(name + " is resting.");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Tweek Tweek!");
    }
}
