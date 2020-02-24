package com.joelbeckum;

public class Turtle implements IFeedable {
    @Override
    public void feed() {
        System.out.println("I eat reptile meal and my own shit.");
    }
}
