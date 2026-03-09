package BridgeLabz_Java.Inheritance;


class Device {


    protected String deviceId;
    protected String status;


    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }


    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}



class Thermostat extends Device {


    private double temperatureSetting;

    // Constructor
    Thermostat(String deviceId, String status, double temperatureSetting) {


        super(deviceId, status);

        this.temperatureSetting = temperatureSetting;
    }


    @Override
    void displayStatus() {

        // Call the parent method
        super.displayStatus();


        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}



public class SmartHomeSystem {

    public static void main(String[] args) {


        Thermostat thermostat1 = new Thermostat("TH101", "ON", 24.5);

        thermostat1.displayStatus();
    }
}
