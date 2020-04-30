package com.pseudorandomguy;

import java.util.ArrayList;

public class Customer {
    private static int accoutsCount = 0;
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private int accountNo;
    private int balance;

    public Customer(int balance) {
        this.accountNo = accoutsCount;
        accoutsCount++;
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int deposit){
        balance+=deposit;
        Transaction newTrans = new Transaction(deposit, true);
        transactions.add(newTrans);
        System.out.println("new deposit. id = "+newTrans.getTransactionid());
    }

    public void withdraw(int withdraw){
        if(withdraw<=balance){
            balance-=withdraw;
            Transaction newTrans = new Transaction(withdraw, false);
            transactions.add(newTrans);
            System.out.println("new withdraw. id =  "+newTrans.getTransactionid());
        }
    }
}
