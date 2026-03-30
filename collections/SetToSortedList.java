package BridgeLabz_Java.collections;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Convert Set → List
        List<Integer> list = new ArrayList<>(set);

        // Sort list in ascending order
        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}
