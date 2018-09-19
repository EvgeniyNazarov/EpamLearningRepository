// Class TrafficLightMethods gives methods for working with traffic light

package com.TrafficLightApp;

import java.util.Scanner;

public class trafficLightMethods {

    // Check what light fires
    public static void CheckLight(String red, String yellow, String green, int minute) {

        if ((minute >= 0 && minute <= 2) | (minute >= 11 && minute <= 13) | (minute > 10 && minute < 13) |
                (minute >= 23 && minute < 25) | (minute >= 44 && minute < 47) | (minute >= 55 && minute < 58)) {
            Output(red);
        }

        if ((minute > 2 && minute < 6) | (minute > 13 && minute < 17) | (minute >= 25 && minute < 29) |
                (minute >= 34 && minute < 37) | (minute >= 47 && minute < 50) | (minute >= 58 && minute < 61)) {
            Output(yellow);
        }

        if ((minute >= 6 && minute < 11) | (minute > 17 && minute < 23) | (minute >= 29 && minute < 34) |
                (minute >= 39 && minute < 44) | (minute >= 50 && minute < 55)) {
            Output(green);
        }

    }

    // Get minutes
    public static int getMinute(Scanner in) {
        int minute;
        System.out.print("Введите минуту как целое число:");
        minute = in.nextInt();
        return minute;
    }

    // Output result
    public static void Output(String a) {
        System.out.println(a);
    }
}
