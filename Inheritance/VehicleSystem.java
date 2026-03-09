package BridgeLabz_Java.Inheritance;

// Interface
interface Refuelable {

    // Method for refueling
    void refuel();
}


// Superclass
class Vehicles {

    protected int maxSpeed;
    protected String model;

    // Constructor
    Vehicles(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Display vehicle info
    void displayVehicle() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}


// Electric vehicle subclass
class ElectricVehicle extends Vehicles {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Electric vehicles charge instead of refuel
    void charge() {
        System.out.println(model + " is charging its battery.");
    }
}


// Petrol vehicle subclass
class PetrolVehicle extends Vehicles implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Implement interface method
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}


// Main class
public class VehicleSystem {

    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(180, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(200, "Toyota Corolla");

        ev.displayVehicle();
        ev.charge();

        System.out.println();

        pv.displayVehicle();
        pv.refuel();
    }
}
