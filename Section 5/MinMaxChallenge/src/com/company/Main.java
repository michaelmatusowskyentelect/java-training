package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MinAndMax();
    }

    public static void MinAndMax(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        if (scanner.hasNextInt()){
            int value = scanner.nextInt();
            int min = value;
            int max = value;

            while(true){
                System.out.println("Enter a number: ");
                if (scanner.hasNextInt()) {
                    value = scanner.nextInt();
                    min = Math.min(value, min);
                    max = Math.max(value, max);
                    scanner.nextLine();
                } else{
                    System.out.println("The minimum number is = " + min);
                    System.out.println("The maximum number is = " + max);
                    scanner.nextLine();
                    scanner.close();
                    break;
                }
            }
        }else{
            scanner.nextLine();
            System.out.println("An invalid value was entered, exiting.");
            scanner.close();
        }



    }
}
