package com.joelbeckum;

import java.util.ArrayList;

public class Customer {
    String name;

    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double initialAmount) {
        this.name = name;

        transactions.add(initialAmount);
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public void printTransactionList() {
        System.out.println("Transaction history for " + name + ":");

        for(int i=0; i<transactions.size(); i++) {
            double amount = transactions.get(i);
            System.out.println("\t$" + amount);
        }

        System.out.println("");
    }
}


