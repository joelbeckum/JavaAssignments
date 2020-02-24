package com.joelbeckum;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("NewBank");
        try {
            bank.addBranch("Branch One");
            bank.addCustomer("Branch One", "Joel", 55.55);
            bank.addCustomer("Branch One", "Mike", 43.43);
            bank.addTransaction("Branch One", "Mike", 12.15);

            bank.addBranch("Branch Two");
            bank.addCustomer("Branch Two", "Dave", 10.18);

            bank.printCustomerList("Branch One", true);

            //bank.addTransaction("Branch awefwaefwaefwaefwaef", "Joel", 12.15);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
