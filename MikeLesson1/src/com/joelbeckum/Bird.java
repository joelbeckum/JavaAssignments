package com.joelbeckum;

public class Bird extends Animal {

    public Bird(String name, int numberOfLegs) {
        super(name, numberOfLegs);
    }

    @Override
    public void speak() {
        System.out.println("Tweet!");
    }

    @Override
    public void feed() {
        System.out.println("I eat birdseed!");
    }
}
