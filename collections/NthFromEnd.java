package BridgeLabz_Java.collections;

import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(
                Arrays.asList("A", "B", "C", "D", "E"));

        int n = 2;

        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                System.out.println("N is larger than list size");
                return;
            }
        }

        // Move both pointers
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        // slow now points to nth element from end
        System.out.println("Nth element from end: " + slow.next());
    }
}
