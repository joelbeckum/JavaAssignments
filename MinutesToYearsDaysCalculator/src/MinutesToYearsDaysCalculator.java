public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else if (minutes >= 0) {

            long convertedYears = minutes / 525600;
            long convertedDays = (minutes % 525600) / 1440;

            System.out.println(minutes + " min = " + convertedYears + " y and " + convertedDays + " d");
        }
    }
}
