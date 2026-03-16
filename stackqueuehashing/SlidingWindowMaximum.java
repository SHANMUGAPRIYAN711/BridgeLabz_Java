package BridgeLabz_Java.stackqueuehashing;

import java.util.*;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new LinkedList<>();

        int index = 0;

        for (int i = 0; i < n; i++) {

            // remove elements outside the window
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            // remove smaller elements from the back
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }

            // add current index
            deque.offerLast(i);

            // window becomes valid
            if (i >= k - 1) {
                result[index++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        int[] ans = maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximum:");

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}