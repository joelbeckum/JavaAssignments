public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int input = number;
        while (input != 0) {
            int lastDigit = input % 10;
            if(lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            input /= 10;
        }
        return sum;
    }
}
