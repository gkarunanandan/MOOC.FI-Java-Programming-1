
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account gkAccount = new Account("GK account", 100.00);

        System.out.println("Initial state");
        System.out.println(gkAccount);

        gkAccount.deposit(20);

        System.out.println("End state");
        System.out.println(gkAccount);
    }
}
