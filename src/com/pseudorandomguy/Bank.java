package com.pseudorandomguy;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();
    private String branchName;

    public Bank(String branchName) {
        this.branchName = branchName;
        System.out.println("new bank created");
    }

    public String getbranchName() {
        return branchName;
    }

    public void addBranch(){
        Branch newBranch = new Branch();
        branches.add(newBranch);
        System.out.println("new branch added with id = "+ newBranch.getBranchid());
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addTransaction(int branchid, boolean deposit, int cusid, int amount){
        Branch branch = findBranch(branchid);

        if(branch!=null){
            branch.addTransaction(deposit, cusid, amount);
        }
        else{
            System.out.println("branch not found");
        }
    }

    public void addCustomer(int branchid, int balance){
        Branch branch = findBranch(branchid);

        if(branch!=null){
            branch.addCustomer(balance);
        } else {
            System.out.println("branch not found");
        }
    }

    public Branch findBranch(int branchid){
        for (Branch branch: branches) {
            if(branch.getBranchid() == branchid){
                return branch;
            }
        }
        return null;
    }

}
