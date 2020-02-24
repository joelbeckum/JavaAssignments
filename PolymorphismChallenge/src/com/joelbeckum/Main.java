package com.joelbeckum;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

}

class Ferrari extends Car {
    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ferrari -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ferrari -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ferrari -> brake()";
    }
}

class Subaru extends Car {
    public Subaru(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Subaru -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Subaru -> accelerate()";
    }

    @Override
    public String brake() {
        return "Subaru -> brake()";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ferrari ferrari = new Ferrari("Testarossa", 10);
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelerate());
        System.out.println(ferrari.brake());

        Subaru subaru = new Subaru("Forrester", 6);
        System.out.println(subaru.startEngine());
        System.out.println(subaru.accelerate());
        System.out.println(subaru.brake());
    }
}
