package BridgeLabz_Java.keywords;

class Patient {

    // Static variable shared by all patients
    static String hospitalName = "City Care Hospital";

    // Static variable to count total patients
    static int totalPatients = 0;

    // Instance variables
    String name;
    int age;
    String ailment;

    // Final variable (cannot be changed once assigned)
    final int patientID;

    // Constructor
    Patient(String name, int age, String ailment, int patientID) {

        // Using 'this' to resolve ambiguity
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        // Increase total patient count
        totalPatients++;
    }

    // Method to display patient details
    void displayPatientDetails() {

        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Patient Name  : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Ailment       : " + ailment);
        System.out.println("Patient ID    : " + patientID);
        System.out.println("--------------------------------");
    }

    // Static method to display total patients
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted : " + totalPatients);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        // Creating patient objects
        Patient p1 = new Patient("Shanmugapriyan", 22, "Fever", 1001);
        Patient p2 = new Patient("Arun", 25, "Cold", 1002);

        // Using instanceof to verify object type
        if (p1 instanceof Patient) {
            p1.displayPatientDetails();
        }

        if (p2 instanceof Patient) {
            p2.displayPatientDetails();
        }

        // Display total number of patients
        Patient.getTotalPatients();
    }
}
