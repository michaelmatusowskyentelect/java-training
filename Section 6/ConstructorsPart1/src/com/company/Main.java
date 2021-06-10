package com.company;

import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        BankAccount personA = new BankAccount(1, 100000, "Hugo van der Westhuizen", "hugo@Westhuizen.co.za", "082222222");
        BankAccount personB = new BankAccount(2, 300, "Linda van der Westhuizen", "Linda@Westhuizen.co.za", "081111111");
        BankAccount personC = new BankAccount();
        printDetails(personA);
        printDetails(personB);
        personA.withdraw(4000);
        personB.deposit(4000);
        personB.withdraw(8000);
        printDetails(personA);
        printDetails(personB);
        printDetails(personC);

        VipCustomer vipA = new VipCustomer();
        VipCustomer vipB = new VipCustomer("YOLOSWAG", "YO@MA.COM");
        VipCustomer vipC = new VipCustomer(92.0, "SE@DOGGO");
        VipCustomer vipD = new VipCustomer("SWAG MAN", 1000.0);
        VipCustomer vipE = new VipCustomer("Tigole", 435743.0, "It's Ya Boy Email Address");

        printDetails(vipA);
        printDetails(vipB);
        printDetails(vipC);
        printDetails(vipD);
        printDetails(vipE);
    }


    public static void printDetails(@NotNull BankAccount account) {
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Customer name: " + account.getCustomerName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println();
    }

    public static void printDetails(@NotNull VipCustomer customer){
        System.out.println("customerName: " + customer.getCustomerName());
        System.out.println("creditLimit: " + customer.getCreditLimit());
        System.out.println("emailAddress: " + customer.getEmailAddress());
        System.out.println();
    }
}
