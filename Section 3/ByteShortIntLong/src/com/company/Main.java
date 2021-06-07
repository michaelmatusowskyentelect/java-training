package com.company;

public class Main {

    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myShortMinValue);
        System.out.println("Short Maximum Value = " + myShortMaxValue);

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myLongMinValue);
        System.out.println("Long Maximum Value = " + myLongMaxValue);

        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short) (myShortMinValue / 2);
    }
}
