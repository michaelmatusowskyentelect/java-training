package com.company;

public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.health = health > 0 && health <= 200 ? health : 100;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if (this.health <= 0)
            System.out.println("com.company.Player knocked out");
    }

    public int healthRemaining(){
        return health;
    }
}
