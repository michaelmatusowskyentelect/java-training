package com.company;

public class DeluxeBurger extends BaseBurger{
    @Override
    public void addLettuce() {
        System.out.println("You cannot add items to your order.");
    }

    @Override
    public void addCheese() {
        System.out.println("You cannot add items to your order");
    }

    @Override
    public void addTomato() {
        System.out.println("You cannot add items to your order");
    }

    @Override
    public void addOnion() {
        System.out.println("You cannot add items to your order");
    }

    @Override
    public String currentOrderItems() {
        String string = "\nYour order is: \n";
        string += "- x1 " + getBurgerName() + " Soda and Chips\t " + getPrice();

        return string;
    }

    public DeluxeBurger() {
        super("Deluxe Burger", "Panini Bun", "Wagyu", 20.99);
    }


}
