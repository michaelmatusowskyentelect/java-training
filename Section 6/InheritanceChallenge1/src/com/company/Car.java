package com.company;

public class Car extends Vehicle {

    public Car(double speed, int gear, int steering) {
        super(speed, gear, steering);
    }

    public Car(double speed, int gear) {
        super(speed, gear);
    }

    public Car(int gear, int steering) {
        super(gear, steering);
    }

    public Car(double speed) {
        super(speed);
    }

    public Car(int gear) {
        super(gear);
    }

    public void steerLeft(int degrees) {
        if (degrees < 0) {
            System.out.println("Invalid input.");
            return;
        }
        if (this.steering - degrees < -900) {
            this.steering = -900;
        } else {
            this.steering -= degrees;
        }
    }

    public void steerRight(int degrees) {
        if (degrees > 900) {
            System.out.println("Invalid input.");
            return;
        }
        if (this.steering + degrees > 900) {
            this.steering = 900;
        } else {
            this.steering += degrees;
        }
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Current speed: " + getSpeed() + " km/h");
        double oldSpeed = getSpeed();
        System.out.println("Attempting to accelerate by: " + speed + " km/h");
        setSpeed(speed);
        System.out.println("New speed: " + getSpeed() + " km/h");
        double currentSpeed = getSpeed();

        int oldGear = (int) oldSpeed / 30;
        int newGear = (int) currentSpeed / 30;
        int gearChanges = newGear - oldGear;

        System.out.println("Current gear: " + getGear());
        System.out.println("Gearing up " + gearChanges + " times");
        for (int i = 0; i < gearChanges; i++) {
            System.out.println("Gear change " + (i + 1) + ".");
            gearUp();
        }
        System.out.println("New gear: " + getGear());
        System.out.println();
    }

    @Override
    public void decelerate(double speed) {
        System.out.println("Current speed: " + getSpeed() + " km/h");
        double oldSpeed = getSpeed();
        System.out.println("Attempting to decelerate by: " + speed + " km/h");
        setSpeed(speed*-1);
        System.out.println("New speed: " + getSpeed() + " km/h");
        double currentSpeed = getSpeed();

        int oldGear = (int) oldSpeed / 30;
        int newGear = (int) currentSpeed / 30;
        int gearChanges = oldGear - newGear;

        System.out.println("Current gear: " + getGear());
        System.out.println("Gearing down " + gearChanges + " times");
        for (int i = 0; i < gearChanges; i++) {
            System.out.println("Gear change " + (i + 1) + ".");
            gearDown();
        }
        System.out.println("New gear: " + getGear());
        System.out.println();
    }

    private void gearUp() {
        setGear(getGear() + 1);
    }

    private void gearDown() {
        setGear(getGear() - 1);
    }


}
