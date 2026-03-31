package BridgeLabz_Java.regex;

import java.util.regex.Pattern;

public class EmailValidator {

    // Regex for email validation
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

    public static boolean isValid(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public static void main(String[] args) {

        String email = "abc.xyz@bl.co.in"; // change to test

        if (isValid(email)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
