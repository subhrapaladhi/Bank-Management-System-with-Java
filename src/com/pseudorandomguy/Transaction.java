package com.pseudorandomguy;

public class Transaction {
    private static int trans = 0;
    private int transactionid;
    private int amount;
    //    depost: deposit =true else false
    private boolean deposit;

    public Transaction(int amount, boolean deposit) {
        this.transactionid = trans;
        trans++;
        this.amount = amount;
        this.deposit = deposit;
    }

    public int getTransactionid() {
        return transactionid;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isDeposit() {
        return deposit;
    }
}