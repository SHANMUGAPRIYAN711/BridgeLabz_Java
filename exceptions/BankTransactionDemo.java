package BridgeLabz_Java.exceptions;

// ---------------- CUSTOM EXCEPTION ----------------

// Custom checked exception for insufficient balance
class InsufficientBalanceException extends Exception {

    // Constructor to pass message
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// ---------------- BANK ACCOUNT CLASS ----------------

class BankAccount {

    double balance = 1000; // Initial balance

    // Withdraw method
    // "throws" → declares custom checked exception
    void withdraw(double amount) throws InsufficientBalanceException {

        // ---- CASE 1: Negative amount ----
        if (amount < 0) {

            // Unchecked exception (no need to declare with throws)
            throw new IllegalArgumentException("Invalid amount!");
        }

        // ---- CASE 2: Insufficient balance ----
        if (amount > balance) {

            // Throw custom checked exception
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        // ---- CASE 3: Valid withdrawal ----
        balance -= amount;

        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

// ---------------- MAIN CLASS ----------------

public class BankTransactionDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            // Change values to test different cases
            account.withdraw(1500);  // Try: -100, 1500, 500

        } catch (InsufficientBalanceException e) {

            // Handling custom exception
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {

            // Handling invalid input
            System.out.println(e.getMessage());
        }
    }
}