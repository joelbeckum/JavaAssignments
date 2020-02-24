package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(54321));
        System.out.println(sumDigits(999));
        System.out.println(sumDigits(55));
        System.out.println(sumDigits(8));
        System.out.println(sumDigits(-34));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        int input = number;
        while (input > 0) {
            int lastDigit = input % 10;
            sum += lastDigit;
            input /= 10;
        }
        return sum;
    }
}
