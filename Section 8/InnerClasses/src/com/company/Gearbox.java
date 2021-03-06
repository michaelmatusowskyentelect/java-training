package com.company;

import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        for (int i = 0; i < maxGears ; i++){
            addGear(i, i*5.3);
        }
    }

    private class Gear {
        private int gearNumber;
        private Double ratio;

        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;


        }

        public double getRatio(){
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * ( this.ratio);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int gearNumber, double ratio){
        if (gearNumber > 0 && gearNumber <= maxGears){
            this.gears.add(new Gear(gearNumber, ratio));
        }
    }

    public void changeGear(int newGear){
        if (newGear >= 0 && newGear < this.gears.size() && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        }else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (this.clutchIsIn){
            System.out.println("Scream!");
            return 0.0;
        } else {
            return revs * gears.get(currentGear).getRatio();
        }
    }


}
