package com.joelbeckum;

public class Cat implements IFeedable, IPlayable {
    public int numberOfLegs = 4;

    @Override
    public void feed() {
        System.out.println("I eat cat food.");
    }

    @Override
    public void play() {
        System.out.println("I knock shit under your fridge.");
    }
}
