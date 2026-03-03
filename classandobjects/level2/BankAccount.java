package BridgeLabz_Java.classandobjects.level2;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance : " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc =
                new BankAccount("Shanmugapriyan", 9876543210L, 10000);

        acc.displayBalance();
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.displayBalance();
    }
}
