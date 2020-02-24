package com.joelbeckum;

import java.util.ArrayList;

public class Branch {
    String name;

    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public void addCustomer(String name, double amount) {
        Customer customer = new Customer(name, amount);
        customers.add(customer);
    }

    public void addTransaction(String name, double amount) throws Exception {
        Customer customer = getCustomer(name);
        customer.addTransaction(amount);
    }

    public void printCustomerList(boolean printTransactions) {
        System.out.println("Customers for " + name + ":");
        for(int i=0; i<customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println(customer.name);
            if(printTransactions) {
                customer.printTransactionList();
            }
        }
    }

    private Customer getCustomer(String name) throws Exception {
        int foundIndex = findCustomer(name);

        if(foundIndex <0) {
            throw new Exception("Error: Customer " + name + " not on file");
        }
        return customers.get(foundIndex);
    }

    private int findCustomer(String name) {
        for(int i=0; i<customers.size(); i++) {
            Customer currentCustomer = customers.get(i);
            if(name.equals(currentCustomer.name)) {
                return i;
            }
        }

        return -1;
    }
}
