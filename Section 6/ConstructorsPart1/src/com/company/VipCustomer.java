package com.company;

public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer(double creditLimit, String emailAddress) {
        this("Noname", creditLimit, emailAddress);
    }

    public VipCustomer(String customerName, String emailAddress) {
        this(customerName, 0.0, emailAddress);
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "None@none.com");
    }

    public VipCustomer() {
        this("Noname", 0.0, "None@none.com");
    }

    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = (creditLimit > 0) ? creditLimit : 0;
        this.emailAddress = emailAddress;
    }
}
