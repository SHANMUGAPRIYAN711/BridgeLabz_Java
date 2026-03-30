package BridgeLabz_Java.collections;

import java.time.LocalDate;
import java.util.*;

// Policy class
class Policy {
    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(int policyNumber, String holderName, LocalDate expiryDate,
                  String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " +
                expiryDate + " | " + coverageType + " | " + premiumAmount;
    }
}

// Main System
public class InsurancePolicySystem {

    // 1. Different Map implementations
    static Map<Integer, Policy> hashMap = new HashMap<>();
    static Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();

    // TreeMap sorted by expiry date using Comparator
    static Map<Integer, Policy> treeMap = new TreeMap<>(
            (k1, k2) -> hashMap.get(k1).expiryDate.compareTo(hashMap.get(k2).expiryDate)
    );

    public static void main(String[] args) {

        // Sample policies
        addPolicy(new Policy(101, "John", LocalDate.now().plusDays(10), "Health", 5000));
        addPolicy(new Policy(102, "Alice", LocalDate.now().plusDays(40), "Auto", 3000));
        addPolicy(new Policy(103, "Bob", LocalDate.now().plusDays(20), "Home", 7000));
        addPolicy(new Policy(104, "John", LocalDate.now().minusDays(5), "Health", 4500)); // expired

        // Display all
        display(hashMap, "HashMap (No Order)");
        display(linkedHashMap, "LinkedHashMap (Insertion Order)");
        display(treeMap, "TreeMap (Sorted by Expiry)");

        // 2. Retrieve by policy number
        System.out.println("\nRetrieve Policy 102:");
        System.out.println(getPolicy(102));

        // Policies expiring within 30 days
        expiringSoon(hashMap);

        // Policies by holder
        policiesByHolder(hashMap, "John");

        // Remove expired policies
        removeExpired(hashMap);

        display(hashMap, "After Removing Expired Policies");
    }

    // Add policy to all maps
    static void addPolicy(Policy p) {
        hashMap.put(p.policyNumber, p);
        linkedHashMap.put(p.policyNumber, p);
        treeMap.put(p.policyNumber, p);
    }

    // Display policies
    static void display(Map<Integer, Policy> map, String title) {
        System.out.println("\n--- " + title + " ---");
        for (Policy p : map.values()) {
            System.out.println(p);
        }
    }

    // Retrieve by policy number
    static Policy getPolicy(int policyNumber) {
        return hashMap.get(policyNumber); // O(1)
    }

    // Policies expiring within 30 days
    static void expiringSoon(Map<Integer, Policy> map) {
        System.out.println("\nPolicies Expiring Within 30 Days:");
        LocalDate today = LocalDate.now();

        for (Policy p : map.values()) {
            if (!p.expiryDate.isBefore(today) &&
                    p.expiryDate.isBefore(today.plusDays(30))) {
                System.out.println(p);
            }
        }
    }

    // Policies by policyholder
    static void policiesByHolder(Map<Integer, Policy> map, String name) {
        System.out.println("\nPolicies for Holder: " + name);

        for (Policy p : map.values()) {
            if (p.holderName.equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    // Remove expired policies
    static void removeExpired(Map<Integer, Policy> map) {
        System.out.println("\nRemoving Expired Policies...");

        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<Integer, Policy>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Policy> entry = it.next();

            if (entry.getValue().expiryDate.isBefore(today)) {
                it.remove(); // safe removal
            }
        }
    }
}