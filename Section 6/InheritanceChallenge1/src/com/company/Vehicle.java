package com.company;

public class Vehicle {

    private double speed;
    private int gear;
    protected int steering;

    public Vehicle(double speed, int gear, int steering) {
        this.speed = speed;
        this.gear = gear;
        this.steering = steering;
    }

    public Vehicle(double speed, int gear){
        this(speed, gear, 0);
    }

    public Vehicle(int gear, int steering){
        this(0, gear, steering);
    }

    public Vehicle(double speed){
        this(speed, 0);
    }

    public Vehicle(int gear){
        this(gear, 0);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if ((speed + getSpeed()) < 0 || (speed+getSpeed()) > 240){
            System.out.println("Invalid input");
            return;
        }
        this.speed += speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        System.out.println("Changing to gear: " + gear);
        if (gear < 1 || gear > 8){
            System.out.println("Invalid input.");
            this.gear = 1;
            return;
        }
        this.gear = gear;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        if (steering < -900 || steering > 900){
            System.out.println("Invalid input");
            return;
        }
        this.steering = steering;
    }

    public void accelerate(double speed){

    }
    public void decelerate(double speed){

    }


}
