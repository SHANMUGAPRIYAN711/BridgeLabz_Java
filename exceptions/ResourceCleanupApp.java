package BridgeLabz_Java.exceptions;

// Simulated resource (like DB connection)
class Connection {

    public void open() {
        System.out.println("Connection opened");
    }

    public void use() {
        // Simulating an error during usage
        throw new RuntimeException("Error while using connection");
    }

    public void close() {
        System.out.println("Connection closed");
    }
}

class ResourceManager {

    public void process() {

        Connection conn = new Connection();

        try {
            conn.open();
            conn.use(); // may throw exception

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            // Ensures cleanup always happens
            conn.close();
        }
    }
}

// Main class named based on problem
public class ResourceCleanupApp {

    public static void main(String[] args) {

        ResourceManager manager = new ResourceManager();
        manager.process();
    }
}
