public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(11111, 0.00, "Default name", "default email", "default number");
        System.out.println("Default constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(11111, 10.00, customerName, email, phoneNumber);
    }


    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }
    public void setBalance(double number) {
        this.balance = number;
    }
    public void setCustomerName(String name) {
        this.customerName = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public void depositFunds(double amount) {
        this.balance = this.balance + amount;
        System.out.println("Your updated account balance is $" + this.balance);
    }
    public void withdrawFunds(double amount) {
        if (this.balance - amount >= 0) {
            System.out.println("Withdrawal of $" + amount + " complete:  Your new balance is $" + (this.balance - amount));
            this.balance = this.balance - amount;
        } else {
            System.out.println("Unable to complete transaction - insufficient funds");
        }
    }
}
