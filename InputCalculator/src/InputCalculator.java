import java.util.Scanner;

public class InputCalculator {
    Scanner scanner = new Scanner(System.in);

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        int number = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        long average = Math.round((double)sum / (double)count);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }

}
