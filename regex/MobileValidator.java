package BridgeLabz_Java.regex;

import java.util.regex.Pattern;

public class MobileValidator {

    // Regex: country code (2 digits) + space + 10 digits
    private static final String MOBILE_REGEX = "^[0-9]{2} [0-9]{10}$";

    public static boolean isValid(String mobile) {
        return Pattern.matches(MOBILE_REGEX, mobile);
    }

    public static void main(String[] args) {

        String mobile = "91 9919819801"; // change to test

        if (isValid(mobile)) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
    }
}
