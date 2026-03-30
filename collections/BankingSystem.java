package BridgeLabz_Java.collections;

import java.util.*;

// Withdrawal request class
class WithdrawalRequest {
    int accountNumber;
    double amount;

    public WithdrawalRequest(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}

public class BankingSystem {

    // 1. Store accounts (AccountNumber → Balance)
    static Map<Integer, Double> accounts = new HashMap<>();

    // 2. Queue for withdrawal requests
    static Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    public static void main(String[] args) {

        // Create accounts
        accounts.put(101, 5000.0);
        accounts.put(102, 10000.0);
        accounts.put(103, 7000.0);
        accounts.put(104, 3000.0);

        // Add withdrawal requests
        requestWithdrawal(101, 2000);
        requestWithdrawal(102, 12000); // insufficient balance
        requestWithdrawal(103, 3000);
        requestWithdrawal(104, 1000);

        // Process withdrawals
        processWithdrawals();

        // Display accounts sorted by balance
        displaySortedByBalance();
    }

    // Add withdrawal request to queue
    static void requestWithdrawal(int accNo, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accNo, amount));
    }

    // Process queue (FIFO)
    static void processWithdrawals() {

        System.out.println("\nProcessing Withdrawals:");

        while (!withdrawalQueue.isEmpty()) {

            WithdrawalRequest req = withdrawalQueue.remove();

            double balance = accounts.getOrDefault(req.accountNumber, 0.0);

            if (balance >= req.amount) {
                accounts.put(req.accountNumber, balance - req.amount);
                System.out.println("Withdrawal SUCCESS → Account: " +
                        req.accountNumber + ", Amount: " + req.amount);
            } else {
                System.out.println("Withdrawal FAILED (Insufficient Balance) → Account: " +
                        req.accountNumber);
            }
        }
    }

    // Display accounts sorted by balance using TreeMap
    static void displaySortedByBalance() {

        System.out.println("\nAccounts Sorted by Balance:");

        // Custom TreeMap to sort by balance
        TreeMap<Integer, Double> sorted = new TreeMap<>(
                (a1, a2) -> {
                    int cmp = accounts.get(a1).compareTo(accounts.get(a2));
                    return (cmp != 0) ? cmp : a1 - a2; // avoid duplicate issue
                }
        );

        sorted.putAll(accounts);

        for (Map.Entry<Integer, Double> entry : sorted.entrySet()) {
            System.out.println("Account: " + entry.getKey() +
                    " → Balance: " + entry.getValue());
        }
    }
}
