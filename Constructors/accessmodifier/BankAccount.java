package BridgeLabz_Java.Constructors.accessmodifier;

class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
    }

    public static void main(String[] args) {

        SavingsAccount acc = new SavingsAccount();

        acc.accountNumber = 1001;
        acc.accountHolder = "Shanmugapriyan";

        acc.deposit(5000);

        acc.displayAccountDetails();
        System.out.println("Balance : " + acc.getBalance());
    }
}
