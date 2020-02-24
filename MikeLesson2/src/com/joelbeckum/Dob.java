package com.joelbeckum;

public class Dob implements IFeedable, IPlayable{

    @Override
    public void feed() {
        System.out.println("I eat dob food.");
    }

    @Override
    public void play() {
        System.out.println("I like playing fetch..");
    }
}
