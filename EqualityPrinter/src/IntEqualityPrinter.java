public class IntEqualityPrinter {

    public static void printEqual(int firstInt, int secondInt, int thirdInt) {

        if (firstInt < 0 || secondInt < 0 || thirdInt < 0) {

            System.out.println("Invalid Value");
        } else if (firstInt == secondInt && firstInt == thirdInt) {

            System.out.println("All numbers are equal");
        } else if (firstInt != secondInt && firstInt != thirdInt && secondInt != thirdInt) {

            System.out.println("All numbers are different");
        } else {

            System.out.println("Neither all are equal or different");
        }
    }
}
