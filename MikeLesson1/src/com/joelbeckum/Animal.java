package com.joelbeckum;

public abstract class Animal {
    private String name;
    private int numberOfLegs;

    public Animal(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public abstract void speak();

    public abstract void feed();

    public void legCount() {
        System.out.println("I have " + numberOfLegs + " legs!");
    }
}
