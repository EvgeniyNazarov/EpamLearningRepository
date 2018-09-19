// Author Evgeniy Nazarov
// Second Epam training task 
// Create traffic light with output color in the console.
// You input minute(from 0 to n) and get which light fires on the traffic light.
// First two minutes red light, after three minutes yellow light and five minutes green light.
// Class Main start the program.


package com.TrafficLightApp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        Lights light = new Lights();
        TrafficLightMethods TLM = new TrafficLightMethods();
        int minute = TLM.getMinute(in);
        TLM.CheckLight(light.getRed(), light.getYellow(), light.getGreen(), minute);
   }
}
