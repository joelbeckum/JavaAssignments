public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int convertedMegaBytes = kiloBytes / 1024;
            int kiloBytesRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + convertedMegaBytes + " MB and " + kiloBytesRemainder + " KB");
        }
    }

}
