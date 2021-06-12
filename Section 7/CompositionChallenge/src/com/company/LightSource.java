package com.company;

public class LightSource {

    private String lightSourceType;
    private boolean lightStatus;

    public LightSource(String lightSourceType, boolean toggle) {
        this.lightSourceType = lightSourceType;
        this.lightStatus = toggle;
    }

    private void toggleLight(){
        lightStatus = !lightStatus;
    }

    public void turnLightOn(){
        System.out.println("Turning the lights on");
        if (!lightStatus)
            toggleLight();
        System.out.println("The lights are now on");

    }

    public  void turnLightOff(){
        System.out.println("Turning the lights off");
        if (lightStatus)
            toggleLight();
        System.out.println("The lights are now off");
    }
}
