package BridgeLabz_Java.Inheritance;

// Interface
interface Worker {

    // Abstract method
    void performDuties();
}


// Superclass
class Persons {

    protected String name;
    protected int id;

    // Constructor
    Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display person information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


// Chef class
class Chef extends Persons implements Worker {

    // Constructor
    Chef(String name, int id) {
        super(name, id);
    }

    // Implement interface method
    public void performDuties() {
        System.out.println("Role: Chef");
        System.out.println(name + " is cooking delicious meals.");
    }
}


// Waiter class
class Waiter extends Persons implements Worker {

    // Constructor
    Waiter(String name, int id) {
        super(name, id);
    }

    // Implement interface method
    public void performDuties() {
        System.out.println("Role: Waiter");
        System.out.println(name + " is taking orders and serving food.");
    }
}


// Main class
public class RestaurantSystem {

    public static void main(String[] args) {

        Chef chef = new Chef("Ravi", 101);
        Waiter waiter = new Waiter("Arjun", 102);

        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
