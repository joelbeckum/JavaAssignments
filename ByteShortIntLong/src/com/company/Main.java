package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Value = " + myMinByteValue);
        System.out.println("Maximum Byte Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Short Value = " + myMinShortValue);
        System.out.println("Maximum Short Value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Minimum Long Value = " + myMinLongValue);
        System.out.println("Maximum Long Value = " + myMaxLongValue);


        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        byte testByteValue = 3;
        short testShortValue = 306;
        int testIntValue = 60000003;
        long testLongValue = 50000 + (10 * (testByteValue + testShortValue + testIntValue));
        System.out.println(testLongValue);

    }
}
