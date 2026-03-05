package BridgeLabz_Java.keywords;

class Vehicle {

    // Static variable shared across all vehicles
    static double registrationFee = 2000;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Final variable (cannot be changed once assigned)
    final String registrationNumber;

    // Constructor
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {

        // Using 'this' to resolve ambiguity
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Method to display vehicle details
    void displayVehicleDetails() {

        System.out.println("Owner Name          : " + ownerName);
        System.out.println("Vehicle Type        : " + vehicleType);
        System.out.println("Registration Number : " + registrationNumber);
        System.out.println("Registration Fee    : " + registrationFee);
        System.out.println("-----------------------------------");
    }

    // Static method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        // Creating vehicle objects
        Vehicle v1 = new Vehicle("Shanmugapriyan", "Car", "TN10AB1234");
        Vehicle v2 = new Vehicle("Arun", "Bike", "TN09XY5678");

        // Using instanceof to verify object type
        if (v1 instanceof Vehicle) {
            v1.displayVehicleDetails();
        }

        if (v2 instanceof Vehicle) {
            v2.displayVehicleDetails();
        }

        // Update registration fee
        Vehicle.updateRegistrationFee(2500);

        // Display details again after fee update
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
