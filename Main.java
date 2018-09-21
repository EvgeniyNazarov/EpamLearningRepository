/* Author Evgeniy Nazarov
   Second Epam training task
   Create traffic light with output color in the console.
   You input minute(from 0 to n) and get which light fires on the traffic light.
   First two minutes red light, after three minutes yellow light and five minutes green light.
   Class Main start the program. */

package com.trafficLightApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lights light = new Lights();
        TrafficLightMethods tlm = new TrafficLightMethods();
        int minute = tlm.getMinute(in);
        tlm.checkLight(light.getRed(), light.getYellow(), light.getGreen(), minute);
    }
}
