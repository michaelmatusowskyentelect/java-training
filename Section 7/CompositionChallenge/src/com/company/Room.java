package com.company;

import java.awt.*;

public class Room {

    private double width;
    private double height;
    private double length;

    private LightSource lightsource;
    private Door door;

    public Room(double width, double height, double length, LightSource lightsource, Door door) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.lightsource = lightsource;
        this.door = door;
    }

    public double getArea(){
        return width*length;
    }

    public double getVolume() {
        return width*length*height;
    }

    public void turnOnTheLights(){
        lightsource.turnLightOn();
    }

    public void turnOffTheLights(){
        lightsource.turnLightOff();
    }

    public void closeTheDoor(){
        door.closeDoor();
    }

    public void openTheDoor(){
        door.openDoor();
    }

}
