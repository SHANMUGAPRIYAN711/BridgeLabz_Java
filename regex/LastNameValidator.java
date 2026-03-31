package BridgeLabz_Java.regex;

import java.util.regex.Pattern;

public class LastNameValidator {

    // Same pattern as first name
    private static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    public static boolean isValid(String name) {
        return Pattern.matches(NAME_REGEX, name);
    }

    public static void main(String[] args) {

        String lastName = "Kumar"; // change to test

        if (isValid(lastName)) {
            System.out.println("Valid Last Name");
        } else {
            System.out.println("Invalid Last Name");
        }
    }
}