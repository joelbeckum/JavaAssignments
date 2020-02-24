public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int sumKg = (bigCount * 5) + smallCount;
        if (sumKg >= goal) {
            if (goal == bigCount) {
                return true;
            } else if (goal % 5 <= smallCount) {
                return true;
            }
        }
        return false;
    }
}
