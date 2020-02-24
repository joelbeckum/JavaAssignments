package com.company;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//	    while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        System.out.println("************************************");
//	    count = 1;
//	    do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while(count != 6);
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }

        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
