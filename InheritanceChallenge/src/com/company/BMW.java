package com.company;

public class BMW extends Car{
    private int gears;

    public BMW(String name, String color, int speed, int doors, int gears) {
        super(name, color, speed, doors);
        this.gears = gears;
    }
}
