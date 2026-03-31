package BridgeLabz_Java.regex;

import java.util.regex.Pattern;

public class EmailValidationTest {

    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

    public static boolean isValid(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public static void main(String[] args) {

        // Sample test cases
        String[] emails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com",
                "abc",                 // invalid
                "abc@.com.my",         // invalid
                "abc123@gmail.a",      // invalid
                "abc123@.com",         // invalid
                "abc123@.com.com",     // invalid
                ".abc@abc.com",        // invalid
                "abc()*@gmail.com",    // invalid
                "abc@%*.com",          // invalid
                "abc..2002@gmail.com", // invalid
                "abc.@gmail.com",      // invalid
                "abc@abc@gmail.com"    // invalid
        };

        for (String email : emails) {

            if (isValid(email)) {
                System.out.println(email + " → Valid");
            } else {
                System.out.println(email + " → Invalid");
            }
        }
    }
}
