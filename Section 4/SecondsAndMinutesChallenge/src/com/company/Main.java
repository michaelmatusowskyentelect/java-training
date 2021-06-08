package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(549));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (!(minutes >= 0) || !(seconds >= 0) || !(seconds <= 59))
            return "Invalid value";

        int hours = (minutes - minutes % 60) / 60;
        minutes = minutes % 60;
        String time = "";

        if (hours < 10) {
            time = time + "0" + hours + "h ";
        } else {
            time = time + hours + "h ";
        }

        if (minutes < 10) {
            time = time + "0" + minutes + "m ";
        } else {
            time = time + minutes + "m ";
        }

        if (seconds < 10) {
            time = time + "0" + seconds + "s";
        } else {
            time = time + seconds + "s";
        }
        return time;
    }

    public static String getDurationString(int seconds) {
        if (!(seconds >= 0))
            return "Invalid value";
        int minutes = (seconds - seconds % 60) / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }
}
