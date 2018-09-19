//Class Lights describe colors of traffic light

package com.trafficLightApp;

public class Lights {

    private String green;
    private String red;
    private String yellow;

    //Constructor
    public Lights() {
        green = "green";
        red = "red";
        yellow = "yellow";
    }

    // Red light
    public String getRed() {
        return this.red = red;
    }

    // Red light
    public void setRed(String red) {
        this.red = red;
    }

    // Yellow light
    public String getYellow() {
        return this.yellow = yellow;
    }
    
    // Yellow light
    public void setYellow(String yellow) {
        this.yellow = yellow;
    }
    
    //Green light
    public String getGreen() {
        return this.green = green;
    }

    //Green light
    public void setGreen(String green) {
        this.green = green;
    }
}
