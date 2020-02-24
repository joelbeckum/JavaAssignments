public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int input = number;

        while (input != 0) {
            int lastDigit = input % 10;
            reverse *= 10;
            reverse += lastDigit;
            input /= 10;

        }
        if (number == reverse) {
            return true;
        }
        return false;
    }
}
