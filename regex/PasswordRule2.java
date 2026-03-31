package BridgeLabz_Java.regex;

import java.util.regex.Pattern;

public class PasswordRule2 {

    // Regex: min 8 chars + at least 1 uppercase
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z]).{8,}$";

    public static boolean isValid(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    public static void main(String[] args) {

        String password = "Abcd1234"; // change to test

        if (isValid(password)) {
            System.out.println("Valid Password (Rule 2)");
        } else {
            System.out.println("Invalid Password (Rule 2)");
        }
    }
}
