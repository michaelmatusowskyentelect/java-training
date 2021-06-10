package com.company;

public class Ferrari extends Car{

    private String model;

    public Ferrari() {
        this("Unnamed");
    }
    public Ferrari(double speed, int gear, int steering, String model) {
        super(speed, gear, steering);
        this.model = model;
    }

    public Ferrari(String model) {
        super(0, 0, 0);
        this.model = model;
    }

    public Ferrari(double speed, int gear, String model) {
        super(speed, gear);
        this.model = model;
    }

    public Ferrari(int gear, int steering, String model) {
        super(gear, steering);
        this.model = model;
    }

    public Ferrari(double speed, String model) {
        super(speed);
        this.model = model;
    }

    public Ferrari(int gear, String model) {
        super(gear);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
