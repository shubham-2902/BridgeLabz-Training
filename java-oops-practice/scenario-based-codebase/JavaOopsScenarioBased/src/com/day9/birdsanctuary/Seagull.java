package com.day9.birdsanctuary;
public class Seagull extends Bird implements Flyable, Swimmable {

    public Seagull(String name, String id) {
        super(name, id, "Seagull");
    }

    @Override
    public void fly() {
        System.out.println(getName() + "is flying");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming also");
    }
}
