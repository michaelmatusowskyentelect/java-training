package com.company;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(0, 0.00, "Noob Saibot", "noob@saibot.com", "0000000000");
    }
    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
        this.setCustomerName(customerName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        if (amount > 0)
            this.balance += amount;
        System.out.println("You have " + this.balance + " in your account.");
    }

    public void withdraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
        }else{
            System.out.println("Cannot withdraw amount: " + amount);
        }
        System.out.println("You have " + this.balance + " in your account.");
    }
}
