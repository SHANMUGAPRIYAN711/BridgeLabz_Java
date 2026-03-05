package BridgeLabz_Java.keywords;

class BankAccount {

    // Static variable shared across all accounts
    static String bankName = "State Bank of India";

    // Static variable to count total accounts
    static int totalAccounts = 0;

    // Instance variables
    String accountHolderName;

    // Final variable (cannot be changed after initialization)
    final int accountNumber;

    double balance;

    // Constructor
    BankAccount(String accountHolderName, int accountNumber, double balance) {

        // 'this' resolves ambiguity between instance variable and parameter
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

        totalAccounts++;
    }

    // Method to display account details
    void displayAccountDetails() {

        System.out.println("Bank Name        : " + bankName);
        System.out.println("Account Holder   : " + accountHolderName);
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Balance          : " + balance);
        System.out.println("-----------------------------");
    }

    // Static method to display total accounts
    static void getTotalAccounts() {

        System.out.println("Total Accounts Created : " + totalAccounts);
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Shanmugapriyan", 101, 5000);
        BankAccount acc2 = new BankAccount("Arun", 102, 8000);

        // Using instanceof operator
        if (acc1 instanceof BankAccount) {
            acc1.displayAccountDetails();
        }

        if (acc2 instanceof BankAccount) {
            acc2.displayAccountDetails();
        }

        // Calling static method
        BankAccount.getTotalAccounts();
    }
}