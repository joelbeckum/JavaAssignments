public class Main {
    public static void main(String[] args) {
//        BankAccount account = new BankAccount(55555, 450.60, "Sam McDude", "mcdude@email.com", "555-1234");

        VipCustomer defaultVip = new VipCustomer();
        System.out.println("Default name = " + defaultVip.getName());

        VipCustomer vip = new VipCustomer("Joel Beckum", 10000.00);
        System.out.println(vip.getCreditLimit());
        System.out.println("The default email value for this object is " + vip.getEmail());
    }
}
