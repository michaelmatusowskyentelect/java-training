package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000)
            System.out.println("Your score was 5000");

        gameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        if (gameOver) {
            int finalScore = newScore + (newLevelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
