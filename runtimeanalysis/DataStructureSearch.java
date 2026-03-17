package BridgeLabz_Java.runtimeanalysis;

import java.util.*;

class DataStructureSearch {

    public static void main(String[] args) {

        int target = 30;

        // Array -> O(N)
        int[] arr = {10, 20, 30, 40};

        long start1 = System.nanoTime();
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }
        long end1 = System.nanoTime();
        System.out.println("Array Found: " + found + " Time: " + (end1 - start1));

        // HashSet -> O(1)
        HashSet<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40));

        long start2 = System.nanoTime();
        boolean foundSet = set.contains(target);
        long end2 = System.nanoTime();
        System.out.println("HashSet Found: " + foundSet + " Time: " + (end2 - start2));

        // TreeSet -> O(log N)
        TreeSet<Integer> tree = new TreeSet<>(Arrays.asList(10, 20, 30, 40));

        long start3 = System.nanoTime();
        boolean foundTree = tree.contains(target);
        long end3 = System.nanoTime();
        System.out.println("TreeSet Found: " + foundTree + " Time: " + (end3 - start3));
    }
}