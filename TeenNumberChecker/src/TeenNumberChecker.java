public class TeenNumberChecker {

    public static boolean hasTeen (int firstAge, int secondAge, int thirdAge) {

        if (firstAge >= 13 && firstAge <= 19) {
            return true;
        } else if (secondAge >= 13 && secondAge <= 19) {
            return true;
        } else if (thirdAge >= 13 && thirdAge <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen (int age) {

        if (age >= 13 && age <= 19) {
            return true;
        }
        return false;
    }
}
