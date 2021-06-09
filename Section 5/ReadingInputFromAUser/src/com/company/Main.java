package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character1992
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if (2021- yearOfBirth > 100 || 2021 - yearOfBirth < 0){
                System.out.println("Invalid year of birth");
            }else {
                System.out.println("Your name is: " + name);
                System.out.println("Your year of birth is: " + yearOfBirth);
                System.out.println("Your age is: " + (2021 - yearOfBirth));

                scanner.close();
            }
        }
    }
}
