public class Main {

    public static void main(String[] args) {
        boolean testOne = BarkingDog.shouldWakeUp(false, 2);
        boolean testTwo = BarkingDog.shouldWakeUp(true, 8);

        System.out.println(testOne);
        System.out.println(testTwo);
    }
}
