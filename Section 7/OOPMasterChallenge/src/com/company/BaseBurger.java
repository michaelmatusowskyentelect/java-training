package com.company;

public class BaseBurger {

    private String burgerName;
    private String breadRollType;
    private String meat;
    private double price;
    private int additions;
    private int amountOfLettuce;
    private int amountOfCheese;
    private int amountOfTomato;
    private int amountOfOnion;

    public BaseBurger(String burgerName, String breadRollType, String meat, double price) {
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 2.99;
        additions = 0;
        amountOfCheese = 0;
        amountOfLettuce = 0;
        amountOfOnion = 0;
        amountOfTomato = 0;
    }

    public void addLettuce() {
        if (additions < 4) {
            additions += 1;
            price += 0.5;
            setAmountOfLettuce(getAmountOfLettuce() + 1);
            System.out.println("Adding 1 Extra Lettuce to your order.");
        } else {
            System.out.println("You can only have a maximum of 4 additions to your order!");
        }
        System.out.println(currentOrderItems());

    }

    public void addCheese() {
        if (additions < 4) {
            additions += 1;
            price += 1.2;
            setAmountOfCheese(getAmountOfCheese() + 1);
            System.out.println("Adding 1 Extra Cheese to your order.");
        } else {
            System.out.println("You can only have a maximum of 4 additions to your order!");
        }
        System.out.println(currentOrderItems());

    }

    public void addTomato() {
        if (additions < 4) {
            additions += 1;
            price += 0.7;
            setAmountOfTomato(getAmountOfTomato() + 1);
            System.out.println("Adding 1 Extra Tomato to your order.");
        } else {
            System.out.println("You can only have a maximum of 4 additions to your order!");
        }
        System.out.println(currentOrderItems());

    }

    public void addOnion() {
        if (additions < 4) {
            additions += 1;
            price += 0.5;
            setAmountOfOnion(getAmountOfOnion() + 1);
            System.out.println("Adding 1 Extra Onion to your order.");
        } else {
            System.out.println("You can only have a maximum of 4 additions to your order!");
        }

        System.out.println(currentOrderItems());
    }

    public String currentOrderItems() {
        String string = "\nYour order is: \n";
        string += "- x1 " + burgerName + "\t " + (price - 1.2 * amountOfCheese - 0.7 * amountOfTomato - 0.5 * amountOfOnion - 0.5 * amountOfLettuce);
        if (amountOfCheese > 0)
            string += "\n- x" + amountOfCheese + " Extra Cheese\t " + 1.2 * amountOfCheese;
        if (amountOfTomato > 0)
            string += "\n- x" + amountOfTomato + " Extra Tomato\t " + 0.7 * amountOfTomato;
        if (amountOfOnion > 0)
            string += "\n- x" + amountOfOnion + " Extra Onion\t " + 0.5 * amountOfOnion;
        if (amountOfLettuce > 0)
            string += "\n- x" + amountOfLettuce + " Extra Lettuce\t " + 0.5 * amountOfLettuce;
        string += "\nOrder Total = " + price;

        return string;
    }

    public String getBurgerName(){
        return burgerName;
    }

    public int getAdditions() {
        return additions;
    }

    public int getAmountOfLettuce() {
        return amountOfLettuce;
    }

    public int getAmountOfCheese() {
        return amountOfCheese;
    }

    public int getAmountOfTomato() {
        return amountOfTomato;
    }

    public int getAmountOfOnion() {
        return amountOfOnion;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public void setAdditions(int additions) {
        this.additions = additions;
    }

    public void setAmountOfLettuce(int amountOfLettuce) {
        this.amountOfLettuce = amountOfLettuce;
    }

    public void setAmountOfCheese(int amountOfCheese) {
        this.amountOfCheese = amountOfCheese;
    }

    public void setAmountOfTomato(int amountOfTomato) {
        this.amountOfTomato = amountOfTomato;
    }

    public void setAmountOfOnion(int amountOfOnion) {
        this.amountOfOnion = amountOfOnion;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
