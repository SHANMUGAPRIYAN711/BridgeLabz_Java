package BridgeLabz_Java.collections;

import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {

        String text = "Hello world, hello Java!";

        // Convert to lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = text.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Word Frequency: " + map);
    }
}