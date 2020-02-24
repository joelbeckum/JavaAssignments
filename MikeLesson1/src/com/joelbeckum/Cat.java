package com.joelbeckum;

public class Cat extends Animal {

    public Cat(String name, int numberOfLegs) {
        super(name, numberOfLegs);
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void feed() {
        System.out.println("I eat cat food!");
    }
}
