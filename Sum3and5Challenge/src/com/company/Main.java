package com.company;

public class Main {

    public static void main(String[] args) {

        int challengeCount = 0;
        int challengeSum = 0;

        for(int i=1; i<1001; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                challengeCount++;
                challengeSum += i;
                System.out.println("Found number = " + i);
            }

            if (challengeCount == 5) {
                break;
            }
        }
        System.out.println("Sum = " + challengeSum);
    }
}
