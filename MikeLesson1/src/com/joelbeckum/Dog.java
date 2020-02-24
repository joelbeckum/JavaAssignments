package com.joelbeckum;

public class Dog extends Animal {
    public Dog(String name, int numberOfLegs) {
        super(name, numberOfLegs);
    }

    @Override
    public void speak() {
        System.out.println("Bark!");
    }

    @Override
    public void feed() {
        System.out.println("I eat dog food and garbage!");
    }
}
