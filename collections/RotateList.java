package BridgeLabz_Java.collections;

import java.util.*;

public class RotateList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int k = 2;

        int n = list.size();
        k = k % n; // handle large k

        List<Integer> result = new ArrayList<>();

        // Add elements from k to end
        for (int i = k; i < n; i++) {
            result.add(list.get(i));
        }

        // Add first k elements at end
        for (int i = 0; i < k; i++) {
            result.add(list.get(i));
        }

        System.out.println("Rotated List: " + result);
    }
}
