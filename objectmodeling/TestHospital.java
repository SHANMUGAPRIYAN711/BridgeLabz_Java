package BridgeLabz_Java.objectmodeling;
class Doctor {

    String name;

    Doctor(String name) {
        this.name = name;
    }

    // Communication method
    void consult(Patient p) {

        System.out.println("Doctor " + name + " is consulting patient " + p.name);
    }
}

class Patient {

    String name;

    Patient(String name) {
        this.name = name;
    }
}

public class TestHospital {

    public static void main(String[] args) {

        Doctor d = new Doctor("Dr. Smith");
        Patient p = new Patient("Arun");

        d.consult(p);
    }
}
