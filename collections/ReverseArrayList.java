package BridgeLabz_Java.collections;

import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int left = 0;
        int right = list.size() - 1;

        // Swap elements from both ends
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        System.out.println("Reversed ArrayList: " + list);
    }
}
