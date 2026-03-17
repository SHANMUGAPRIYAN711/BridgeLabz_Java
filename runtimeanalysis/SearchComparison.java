package BridgeLabz_Java.runtimeanalysis;

import java.util.Arrays;

class SearchComparison {

    // Linear Search -> O(N)
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // found
            }
        }
        return -1;
    }

    // Binary Search -> O(log N)
    static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] < target)
                left = mid + 1;   // go right
            else
                right = mid - 1; // go left
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {40, 10, 30, 20, 50};
        int target = 30;

        // Linear Search
        int lin = linearSearch(arr, target);
        System.out.println("Linear Search Index: " + lin);

        // Binary Search needs sorted array
        Arrays.sort(arr);

        int bin = binarySearch(arr, target);
        System.out.println("Binary Search Index: " + bin);
    }
}
