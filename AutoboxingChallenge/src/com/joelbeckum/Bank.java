package com.joelbeckum;

import java.util.ArrayList;

public class Bank {
    String name;

    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public void addBranch(String name) {
        Branch branch = new Branch(name);
        branches.add(branch);
    }

    public void addCustomer(String branchName, String customerName, double amount) throws Exception {
        Branch branch = getBranch(branchName);
        branch.addCustomer(customerName, amount);
    }

    public void addTransaction(String branchName, String customerName, double amount) throws Exception {
        Branch branch = getBranch(branchName);
        branch.addTransaction(customerName, amount);
    }

    public void printCustomerList(String branchName, boolean printTransactions) throws Exception {
        Branch branch = getBranch(branchName);
        branch.printCustomerList(printTransactions);
    }

    private Branch getBranch(String name) throws Exception {
        int foundIndex = findBranch(name);

        if(foundIndex <0) {
            throw new Exception("Error: Branch " + name + " not on file");
        }

        return branches.get(foundIndex);
    }

    private int findBranch(String name) {
        for(int i=0; i<branches.size(); i++) {
            Branch currentBranch = branches.get(i);
            if(name.equals(currentBranch.name)) {
                return i;
            }
        }

        return -1;
    }
}
