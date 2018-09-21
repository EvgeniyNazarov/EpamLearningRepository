package com.trafficLightApp;

/**
 * Class Lights describe colors of traffic light.
 *
 * @version 1.0 18 Sep 2018  * @author
 * Evgeniy Nazarov
 */
public class Lights {

    private String green;
    private String red;
    private String yellow;

    public Lights() {
        green = "green";
        red = "red";
        yellow = "yellow";
    }

    /**
     * Red light
     */
    public String getRed() {
        return this.red = red;
    }
    
    /**
     * Red light
     * @red red light
     */
    public void setRed(String red) {
        this.red = red;
    }

    /**
     * Yellow light
     */
    public String getYellow() {
        return this.yellow = yellow;
    }    

    /**
     * Yellow light
     * @yellow yellow light
     */
    public void setYellow(String yellow) {
        this.yellow = yellow;
    }    

    /**
     * Green light
     */
    public String getGreen() {
        return this.green = green;
    }

    /**
     * Green light
     * @green green light
     */
    public void setGreen(String green) {
        this.green = green;
    }
}
