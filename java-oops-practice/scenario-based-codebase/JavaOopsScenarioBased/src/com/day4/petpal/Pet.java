package com.day4.petpal;
public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    private int hunger;  // Scale 0–100
    private int energy;  // Scale 0–100
    private int mood;    //  Scale 0–100

    // Constructor with random defaults
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 50;
        this.energy = 50;
        this.mood = 50;
    }

    protected void changeHunger(int value) {
        hunger += value;
    }

    protected void changeEnergy(int value) {
        energy += value;
    }

    protected void changeMood(int value) {
        mood += value;
    }

    public void showStatus() {
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
    }

    public abstract void makeSound();
}
