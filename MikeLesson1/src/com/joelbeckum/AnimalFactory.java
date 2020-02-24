package com.joelbeckum;

public class AnimalFactory {
    public Animal[] getAnimals() {
        Animal[] myAnimalArray = new Animal[5];

        myAnimalArray[0] = new Cat("Whiskers", 4);
        myAnimalArray[1] = new Cat("Limpy", 3);
        myAnimalArray[2] = new Cat("Bellyflop", 2);
        myAnimalArray[3] = new Bird("Tweety", 2);
        myAnimalArray[4] = new Bird("Scarface", 2);

        return myAnimalArray;
    }
}