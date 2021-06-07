package com.company;

public class Main {

    public static void main(String[] args) {
        
        byte myByteVariable = 127;
        short myShortVariable = 32187;
        int myIntVariable = 21029;
        long myLongVariable = 50000L + 10L*(myByteVariable + myShortVariable + myIntVariable);
        System.out.println(myLongVariable);
    }
}
