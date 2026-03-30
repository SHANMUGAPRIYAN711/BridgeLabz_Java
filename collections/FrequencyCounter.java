package BridgeLabz_Java.collections;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> map = new HashMap<>();

        for (String item : list) {
            // If key exists → increment, else initialize with 1
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        System.out.println("Frequency Map: " + map);
    }
}