package BridgeLabz_Java.collections;
import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        // Check if set2 contains all elements of set1
        if (set2.containsAll(set1)) {
            System.out.println("Set1 is a subset of Set2: true");
        } else {
            System.out.println("Set1 is a subset of Set2: false");
        }
    }
}
