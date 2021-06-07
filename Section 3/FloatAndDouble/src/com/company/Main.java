package com.company;

public class Main {

    public static void main(String[] args) {
        
        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("myFloatMinValue = " + myFloatMinValue);
        System.out.println("myFloatMaxValue = " + myFloatMaxValue);

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("myDoubleMinValue = " + myDoubleMinValue);
        System.out.println("myDoubleMaxValue = " + myDoubleMaxValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double pounds = 20.0d;
        double kilograms = pounds*0.45359237d;
        System.out.println("Pounds = " + pounds);
        System.out.println("Kilograms = " + kilograms);

    }
}
