package com.company;

public class Main {

    public static void main(String[] args) {
	Car car = new Car(0, 1, 0);
	Car truck = new Car(100, 3, 5);
	car.accelerate(89);
	car.decelerate(30);
	car.accelerate(100);
	car.decelerate(20);
	car.accelerate(200);
	car.accelerate(42);
	car.steerLeft(33);
	car.steerRight(72);
	System.out.println(car.getSteering());
	truck.accelerate(30);

	Ferrari NineOneOne = new Ferrari("911");
	Ferrari slowFerrari = new Ferrari("slow");
	NineOneOne.accelerate(200);
	slowFerrari.accelerate(69);
	NineOneOne.decelerate(100);
	slowFerrari.accelerate(69);
	slowFerrari.decelerate(150);

    }
}
