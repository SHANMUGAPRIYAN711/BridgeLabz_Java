package BridgeLabz_Java.collections;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));

        System.out.println("Original Queue: " + queue);

        reverse(queue);

        System.out.println("Reversed Queue: " + queue);
    }

    // Reverse using recursion (only queue operations)
    static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) return;

        // Remove front element
        int front = q.remove();

        // Recursively reverse remaining queue
        reverse(q);

        // Add removed element to rear
        q.add(front);
    }
}
