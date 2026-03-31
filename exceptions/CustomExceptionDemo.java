package BridgeLabz_Java.exceptions;

import java.util.Scanner;
// Creating a custom exception class
// Extending Exception → makes it a CHECKED exception
class InvalidAgeException extends Exception {

    // Constructor to pass custom message
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    // Method to validate age
    // "throws" → declares that this method may throw InvalidAgeException
    static void validateAge(int age) throws InvalidAgeException {

        // Business rule: age must be >= 18
        if (age < 18) {

            // "throw" → actually creates and throws exception
            throw new InvalidAgeException("Age must be 18 or above");
        }

        // If valid
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            // Calling method that may throw exception
            validateAge(age);

        } catch (InvalidAgeException e) {

            // Handling custom exception
            System.out.println(e.getMessage());
        }

        sc.close(); // Closing resource
    }
}
