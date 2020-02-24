package com.company;

public class Car extends Vehicle {

    private int doors;

    public Car(String name, String color, int speed, int doors) {
        super(name, color, speed);
        this.doors = doors;
    }
}
