package BridgeLabz_Java.stackqueuehashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // store all elements in the set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // check if this number can be the start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int length = 1;

                // keep checking next numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }

                // update maximum length
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(arr);

        System.out.println("Longest Consecutive Length: " + result);
    }
}
