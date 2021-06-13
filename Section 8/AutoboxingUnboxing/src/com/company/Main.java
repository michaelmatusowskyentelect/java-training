package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code her
        Bank bank = new Bank("Poes");
        System.out.println(bank.addBranch("Nigga"));
        System.out.println(bank.addBranch("Nigga"));
        System.out.println(bank.addBranch("Pretoria"));
        bank.addCustomer("Pretoria", "Mike", 22.00);
        bank.addCustomerTransaction("Pretoria", "Mike", 44);
        bank.addCustomerTransaction("Pretoria", "Mike", 41273);
        bank.addCustomerTransaction("Pretoria", "Mike", 33);
        bank.addCustomer("Pretoria", "Joe", 22.00);
        bank.addCustomerTransaction("Pretoria", "Joe", 11);
        bank.listCustomers("Pretoria", true);




    }
}
