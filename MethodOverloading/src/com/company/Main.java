package com.company;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Joel", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(54));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0) {
            return -1;
        } else if (inches < 0 || inches > 12) {
            return -1;
        }
        return ((feet * 30.48) + (inches * 2.54));
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }

        double convertedFeet = ((int) inches) / 12;
        double inchesRemainder = inches % 12;

        return calcFeetAndInchesToCentimeters(convertedFeet, inchesRemainder);

    }
}
