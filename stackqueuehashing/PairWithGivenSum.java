package BridgeLabz_Java.stackqueuehashing;

import java.util.*;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {

        // HashSet to store visited numbers
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            int complement = target - num;

            // check if complement already seen
            if (set.contains(complement)) {
                return true;
            }

            // store current number
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};

        int target = 9;

        if (hasPair(arr, target)) {
            System.out.println("Pair found");
        } else {
            System.out.println("Pair not found");
        }
    }
}
