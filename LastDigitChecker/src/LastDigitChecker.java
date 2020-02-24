public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (!isValid(x) || !isValid(y) || !isValid(z)) {
            return false;
        }
        int lastDigitOfX = x % 10;
        int lastDigitOfY = y % 10;
        int lastDigitOfZ = z % 10;
        if (lastDigitOfX == lastDigitOfY || lastDigitOfX == lastDigitOfZ || lastDigitOfY == lastDigitOfZ) {
            return true;
        }
        return false;
    }
    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }
}
