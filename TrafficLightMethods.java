/* Second Epam training task.
 * Create traffic light with output color in the console.
 * You input minute(from 0 to n) and get which light fires on the traffic light.
 * First two minutes red light, after three minutes yellow light and five minutes green light.*/
package com.trafficLightApp;

import java.util.Scanner;

/**
 * Class TrafficLightMethods gives methods for working with traffic light.
 *
 * @version 1.0 18 Sep 2018  * @author
 * Evgeniy Nazarov
 */
public class TrafficLightMethods {

    /**
     * Check what light fires
     *
     * @red    red light
     * @yellow yellow light
     * @green  green light
     * @minute input minute
     */
    public static void checkLight(String red, String yellow, String green, int minute) {

        if ((minute >= 0 && minute <= 2) | (minute >= 11 && minute <= 13) | (minute > 10 && minute < 13) |
                (minute >= 23 && minute < 25) | (minute >= 44 && minute < 47) | (minute >= 55 && minute < 58)) {
            output(red);
        }

        if ((minute > 2 && minute < 6) | (minute > 13 && minute < 17) | (minute >= 25 && minute < 29) |
                (minute >= 34 && minute < 37) | (minute >= 47 && minute < 50) | (minute >= 58 && minute < 61)) {
            output(yellow);
        }

        if ((minute >= 6 && minute < 11) | (minute > 17 && minute < 23) | (minute >= 29 && minute < 34) |
                (minute >= 39 && minute < 44) | (minute >= 50 && minute < 55)) {
            output(green);
        }

    }


    /**
     * Get minutes
     *
     * @in intput minute
     */
    public static int getMinute(Scanner in) {
        int minute;
        System.out.print("Input minute in integer:");
        minute = in.nextInt();
        return minute;
    }

    /**
     * Output result
     *
     * @str output string
     */
    public static void output(String str) {
        System.out.println(str);
    }
}
