package com.pseudorandomguy;

import java.util.ArrayList;

public class Branch {
    private static int branchCount = 0;
    ArrayList<Customer> customers = new ArrayList<Customer>();
    private int branchid;

    public Branch() {
        this.branchid = branchCount;
        branchCount++;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public int getBranchid() {
        return branchid;
    }

    public void addCustomer(int balance){
        Customer newCus = new Customer(balance);
        customers.add(newCus);
        System.out.println("new customent added with id = "+newCus.getAccountNo()+ " balance = " + newCus.getBalance());
    }

    public void addTransaction(boolean deposit, int cusID, int amount){
        if(deposit){
            Customer cus = findCustomer(cusID);

            if(cus !=null){
                cus.deposit(amount);
            } else {
                System.out.println("account not found");
            }
        }

        else{
            Customer cus = findCustomer(cusID);

            if(cus !=null){
                cus.withdraw(amount);
            } else {
                System.out.println("account not found");
            }
        }
    }

    public Customer findCustomer(int cusid){
        for (Customer cus: customers) {
            if(cus.getAccountNo() == cusid){
                return cus;
            }
        }

        return null;
    }
}
