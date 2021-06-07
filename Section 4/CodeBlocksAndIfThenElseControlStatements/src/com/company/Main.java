package com.company;

public class Main {

    public static void main(String[] args) {

        int highscore = calculateScore(true, 5, 10, 3);
        System.out.println("Your final score was " + highscore);
        highscore = calculateScore(false, 3, 3, 3);
        System.out.println("Your final score was " + highscore);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }
}
