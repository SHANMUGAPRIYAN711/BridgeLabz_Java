package BridgeLabz_Java.exceptions;

import java.util.HashSet;
import java.util.Set;

// Custom exception: user already exists
class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

// Custom exception: user not found
class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

class UserService {

    private Set<String> users = new HashSet<>();

    // Registers user
    public void registerUser(String username) throws UserAlreadyExistsException {
        if (users.contains(username)) {
            throw new UserAlreadyExistsException("User already exists: " + username);
        }
        users.add(username);
        System.out.println("User registered: " + username);
    }

    // Checks if user exists
    public void checkUserExistence(String username) throws UserNotFoundException {
        if (!users.contains(username)) {
            throw new UserNotFoundException("User not found: " + username);
        }
        System.out.println("User exists: " + username);
    }
}

// Main class named based on problem
public class UserServiceSystem {

    public static void main(String[] args) {

        UserService service = new UserService();

        try {
            service.registerUser("john");
            service.registerUser("john"); // duplicate
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.checkUserExistence("alice"); // not present
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
