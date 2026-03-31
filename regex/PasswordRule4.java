package BridgeLabz_Java.regex;

import java.util.regex.Pattern;

public class PasswordRule4 {

    // Regex: min 8 chars + 1 uppercase + 1 digit + exactly 1 special character
    private static final String PASSWORD_REGEX =
            "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$).{8,}$";

    public static boolean isValid(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    public static void main(String[] args) {

        String password = "Abcd123@"; // change to test

        if (isValid(password)) {
            System.out.println("Valid Password (Rule 4)");
        } else {
            System.out.println("Invalid Password (Rule 4)");
        }
    }
}
