package com.company;

import java.util.ArrayList;

public class Bank {
    // write code here
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        if (findBranch(name) == null){
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String customerBranch, String customerName, double transaction){
        Branch branch = findBranch(customerBranch);
        if (branch != null)
            return branch.newCustomer(customerName, transaction);
        return false;
    }

    public boolean addCustomerTransaction(String customerBranch, String customerName, double transaction){
        Branch branch = findBranch(customerBranch);
        if (branch != null)
            return branch.addCustomerTransaction(customerName, transaction);
        return false;
    }
    private Branch findBranch(String name){
        for (int i = 0; i < branches.size(); i++){
            if (branches.get(i).getName().equals(name)){
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String name, boolean doPrint){
        Branch branch = findBranch(name);
        if (branch != null){
            ArrayList<Customer> customers = branch.getCustomers();
            if (doPrint){
                System.out.println("Customer details for branch " + branch.getName());
                for (int i = 0; i < customers.size(); i++){
                    System.out.println("Customer: " + customers.get(i).getName() + "[" + i+1 + "]");
                    ArrayList<Double> transactions = customers.get(i).getTransactions();
                    for (int j = 0; j < transactions.size(); j++){
                        System.out.println("["+j+1+"] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}