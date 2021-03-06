package com.company;

public class Main {

    public static void main(String[] args) {

        int highscore = calculateScore(true, 5, 10, 3);
        System.out.println("Your final score was " + highscore);
        highscore = calculateScore(false, 3, 3, 3);
        System.out.println("Your final score was " + highscore);

        displayHighScorePosition("Michael", calculateHighScorePosition(1500));
        displayHighScorePosition("Joseph", calculateHighScorePosition(900));
        displayHighScorePosition("Renato", calculateHighScorePosition(400));
        displayHighScorePosition("Sasha", calculateHighScorePosition(50));
        displayHighScorePosition("Sasha", calculateHighScorePosition(1000));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}
