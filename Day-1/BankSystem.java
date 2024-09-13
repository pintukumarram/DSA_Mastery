
/**
 * InnerBankSystem
 */

class userDetail {
    String name;
    String address;
    int age;
    double contact;
    String email;

    public userDetail(String name, String address, int age, double contact, String email) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.contact = contact;
        this.email = email;
    }

    // Public method to add users

}

class BankAccount {
    // Private fields to protect sensitive data
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited amount Rs." + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount Rs." + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Public method to check the balance
    public double getBalance() {
        return balance;
    }

}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(60);
        account.withdraw(100);
        double currentBalance = account.getBalance();
        System.out.println("Current Balance Rs." + currentBalance);

        userDetail user = new userDetail("Mr Amit Kumar", "Tollygunge,Kolkata-40,West Bengal", 25, currentBalance,
                "amitkumar@gmail.com");
        System.out.println(user.name);
    }
}
