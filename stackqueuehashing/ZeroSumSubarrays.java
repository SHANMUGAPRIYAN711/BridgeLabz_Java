package BridgeLabz_Java.stackqueuehashing;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findSubarrays(int[] arr) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // if sum becomes 0, subarray starts from index 0
            if (sum == 0) {
                System.out.println("Subarray found from 0 to " + i);
            }

            // if sum already exists in map
            if (map.containsKey(sum)) {

                List<Integer> list = map.get(sum);

                for (int start : list) {
                    System.out.println("Subarray found from " + (start + 1) + " to " + i);
                }
            }

            // store index in map
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {

        int[] arr = {6, 3, -1, -3, 4, -2, 2};

        findSubarrays(arr);
    }
}
