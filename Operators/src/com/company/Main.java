package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 90;
        if (topScore == 100) {
            System.out.println("You got the high score!");

        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || topScore <= 90) {
            System.out.println("Either or both conditions are true.");
        }

        int newValue = 50;
        boolean isCar = false;
        if (isCar) {
            System.out.println("Whoops no car mang");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double firstDouble = 20;
        double secondDouble = 80;
        double thirdDouble = (firstDouble + secondDouble) * 100;
        double doubleRemainder = thirdDouble % 40;
        System.out.println("doubleRemainder = " + doubleRemainder);

        boolean remainderTest = doubleRemainder == 0 ? true : false;
        System.out.println("The remainder test is " + remainderTest);

        if (!remainderTest) {
            System.out.println("Got some remainder");
        }
    }
}
