package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        System.out.println(getDurationString(63, 45));
        System.out.println(getDurationString(63, 83));

        System.out.println(getDurationString(3800));
        System.out.println(getDurationString(63218));
        System.out.println(getDurationString(-63218));


    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {

            return INVALID_VALUE_MESSAGE;

        }

        int convertedHours = minutes / 60;
        int convertedMinutes = minutes % 60;

        String hoursString = convertedHours + "h";
            if (convertedHours < 10) {
                hoursString = "0" + hoursString;
            }
        String minutesString = convertedMinutes + "m";
                if (convertedMinutes < 10) {
                    minutesString = "0" + minutesString;
            }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;

    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {

            return INVALID_VALUE_MESSAGE;
        }

        int convertedMinutes = seconds / 60;
        int convertedSeconds = seconds % 60;

        return getDurationString(convertedMinutes, convertedSeconds);
    }
}
