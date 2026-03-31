package BridgeLabz_Java.regex;

import java.util.regex.Pattern;

public class PasswordRule1 {

    // Regex: minimum 8 characters
    private static final String PASSWORD_REGEX = "^.{8,}$";

    public static boolean isValid(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    public static void main(String[] args) {

        String password = "abc12345"; // change to test

        if (isValid(password)) {
            System.out.println("Valid Password (Rule 1)");
        } else {
            System.out.println("Invalid Password (Rule 1)");
        }
    }
}