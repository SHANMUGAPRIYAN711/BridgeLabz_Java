package BridgeLabz_Java.Inheritance;

class BankAccount {

    protected int accountNumber;
    protected double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {

    // Unique attribute
    private double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // call parent constructor
        this.interestRate = interestRate;
    }

    // Method specific to this subclass
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


// Subclass: Checking Account
class CheckingAccount extends BankAccount {

    // Unique attribute
    private double withdrawalLimit;

    // Constructor
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}


// Subclass: Fixed Deposit Account
class FixedDepositAccount extends BankAccount {

    // Unique attribute
    private int depositTerm; // months

    // Constructor
    FixedDepositAccount(int accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}


// Main class to test the program
public class BankSystem {

    public static void main(String[] args) {

        // Creating objects of each subclass
        SavingsAccount savings = new SavingsAccount(101, 5000, 4.5);
        CheckingAccount checking = new CheckingAccount(102, 3000, 1000);
        FixedDepositAccount fixed = new FixedDepositAccount(103, 10000, 12);

        // Display details
        savings.displayAccountDetails();
        savings.displayAccountType();

        System.out.println();

        checking.displayAccountDetails();
        checking.displayAccountType();

        System.out.println();

        fixed.displayAccountDetails();
        fixed.displayAccountType();
    }
}