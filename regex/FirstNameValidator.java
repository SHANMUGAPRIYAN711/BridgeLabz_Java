package BridgeLabz_Java.regex;

import java.util.regex.Pattern;

public class FirstNameValidator {

    // Regex: First letter capital, min 3 letters
    private static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    public static boolean isValid(String name) {
        return Pattern.matches(NAME_REGEX, name);
    }

    public static void main(String[] args) {

        String name = "John"; // change to test

        if (isValid(name)) {
            System.out.println("Valid First Name");
        } else {
            System.out.println("Invalid First Name");
        }
    }
}
