package com.TrafficLightApp;
import java.util.Scanner;

//Сделать светофор с выводом цвета в консоль.
// Вы вводите минуту (от нуля до n) и получаете какой свет горит на светофоре.
// Первые две минуты красный, потом три минуты желтый и пять минут зеленый.
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
