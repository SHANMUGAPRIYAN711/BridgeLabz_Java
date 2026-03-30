package BridgeLabz_Java.collections;

import java.util.*;

public class VotingSystem {

    // 1. Store vote count (Candidate → Votes)
    static Map<String, Integer> voteCount = new HashMap<>();

    // 2. Maintain order of voting
    static Map<Integer, String> voteOrder = new LinkedHashMap<>();

    static int voteNumber = 1; // to track order

    public static void main(String[] args) {

        // Casting votes
        castVote("Alice");
        castVote("Bob");
        castVote("Alice");
        castVote("Charlie");
        castVote("Bob");
        castVote("Alice");

        // Display vote order
        displayVoteOrder();

        // Display vote count
        displayVoteCount();

        // Display sorted results
        displaySortedResults();

        // Find winner
        findWinner();
    }

    // Method to cast vote
    static void castVote(String candidate) {

        // Update vote count (HashMap)
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);

        // Maintain voting order (LinkedHashMap)
        voteOrder.put(voteNumber++, candidate);
    }

    // Display vote order
    static void displayVoteOrder() {
        System.out.println("\nVote Order (LinkedHashMap):");

        for (Map.Entry<Integer, String> entry : voteOrder.entrySet()) {
            System.out.println("Vote " + entry.getKey() + " → " + entry.getValue());
        }
    }

    // Display vote count
    static void displayVoteCount() {
        System.out.println("\nVote Count (HashMap):");

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // Display sorted results using TreeMap
    static void displaySortedResults() {

        System.out.println("\nSorted Results (TreeMap):");

        // Sort by candidate name (default TreeMap behavior)
        Map<String, Integer> sortedMap = new TreeMap<>(voteCount);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // Find winner (max votes)
    static void findWinner() {

        String winner = null;
        int maxVotes = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {

            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes");
    }
}
