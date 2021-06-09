package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readAndPrintNumbers();
    }

    public static void readAndPrintNumbers(){
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (count < 10){
            System.out.println("Enter number " + (count+1) + ":");
            if (scanner.hasNextInt()){
                int input = scanner.nextInt();

                sum += input;
                count++;
            } else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The total sum of the numbers is = " + sum);
    }
}
