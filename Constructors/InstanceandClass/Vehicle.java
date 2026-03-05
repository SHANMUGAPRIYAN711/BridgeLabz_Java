package BridgeLabz_Java.Constructors.InstanceandClass;

class Vehicle {

    String ownerName;
    String vehicleType;

    static double registrationFee = 2000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Shanmugapriyan", "Car");
        Vehicle v2 = new Vehicle("Arun", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(2500);

        System.out.println("\nUpdated Registration Fee\n");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
