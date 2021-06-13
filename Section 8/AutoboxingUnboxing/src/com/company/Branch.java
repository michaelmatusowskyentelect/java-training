package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String name, double transaction){
        if (findCustomer(name) != null)
            return false;
        Customer customer = new Customer(name);
        customer.addTransaction(transaction);
        customers.add(customer);
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer customer = findCustomer(name);
        if (customer != null){
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for (int i = 0; i < customers.size(); i++){
            if (customers.get(i).getName().equals(name)){
                return customers.get(i);
            }
        }
        return null;
    }
}