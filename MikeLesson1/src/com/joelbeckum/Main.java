package com.joelbeckum;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalProvider = new AnimalFactory();

        Animal[] animals = animalProvider.getAnimals();

        for (Animal animal: animals) {
            animal.speak();
        }

        for (Animal animal : animals) {
            animal.feed();
        }

        for (Animal animal : animals) {
            animal.legCount();
        }
    }
}
