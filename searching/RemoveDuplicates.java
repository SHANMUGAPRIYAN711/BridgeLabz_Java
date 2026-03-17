package BridgeLabz_Java.searching;

import java.util.HashSet;

class RemoveDuplicates {

    static String removeDuplicates(String str) {

        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        // go character by character
        for (char ch : str.toCharArray()) {

            // only add if we haven't seen it before
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String input = "programming";

        System.out.println("After removing duplicates: " + removeDuplicates(input));
    }
}
