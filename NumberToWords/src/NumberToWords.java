public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {

    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 1;
        int input = number;
        while(input / 10 != 0) {
            count++;
            input /= 10;
        }
        return count;
    }
}
