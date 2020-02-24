public class SharedDigit {

    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || y < 10 || x > 99 || y > 99) {
            return false;
        }
        int firstDigitOfX = x / 10;
        int lastDigitOfX = x % 10;
        int firstDigitOfY = y / 10;
        int lastDigitOfY = y % 10;
        if (firstDigitOfX == firstDigitOfY || firstDigitOfX == lastDigitOfY || lastDigitOfX == firstDigitOfY || lastDigitOfX == lastDigitOfY) {
            return true;
        }
        return false;
    }
}
