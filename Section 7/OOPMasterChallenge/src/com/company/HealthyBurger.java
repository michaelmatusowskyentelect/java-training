package com.company;

public class HealthyBurger extends BaseBurger{

    public HealthyBurger() {
        super("Healthy Burger", "Brown Rye Bread Roll", "Veggie pattie", 5.99);
    }

    @Override
    public void addLettuce() {
        if (getAdditions() < 6) {
            setAdditions(getAdditions() + 1);
            setAmountOfLettuce(getAmountOfLettuce() + 1);
            setPrice(getPrice() + 0.5);
            System.out.println("Adding 1 Extra Lettuce to your order.");
        } else {
            System.out.println("You can only have a maximum of 6 additions to your order!");
        }
        System.out.println(currentOrderItems());
    }

    @Override
    public void addCheese() {
        if (getAdditions() < 6) {
            setAdditions(getAdditions() + 1);
            setAmountOfCheese(getAmountOfCheese() + 1);
            setPrice(getPrice() + 1.2);
            System.out.println("Adding 1 Extra Cheese to your order.");
        } else {
            System.out.println("You can only have a maximum of 6 additions to your order!");
        }
        System.out.println(currentOrderItems());
    }

    @Override
    public void addTomato() {
        if (getAdditions() < 6) {
            setAdditions(getAdditions() + 1);
            setAmountOfTomato(getAmountOfTomato() + 1);
            setPrice(getPrice() + 0.7);
            System.out.println("Adding 1 Extra Tomato to your order.");
        } else {
            System.out.println("You can only have a maximum of 6 additions to your order!");
        }
        System.out.println(currentOrderItems());
    }

    @Override
    public void addOnion() {
        if (getAdditions() < 6) {
            setAdditions(getAdditions() + 1);
            setAmountOfOnion(getAmountOfOnion() + 1);
            setPrice(getPrice() + 0.5);
            System.out.println("Adding 1 Extra Onion to your order.");
        } else {
            System.out.println("You can only have a maximum of 6 additions to your order!");
        }
        System.out.println(currentOrderItems());
    }
}
