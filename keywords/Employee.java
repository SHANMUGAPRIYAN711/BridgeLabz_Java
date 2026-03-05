package BridgeLabz_Java.keywords;

class Employee {

    // Static variable shared by all employees
    static String companyName = "Tech Solutions Pvt Ltd";

    // Static variable to track total employees
    static int totalEmployees = 0;

    // Instance variables
    String name;
    String designation;

    // Final variable (cannot be changed once assigned)
    final int id;

    // Constructor
    Employee(String name, int id, String designation) {

        // Using 'this' to resolve ambiguity
        this.name = name;
        this.id = id;
        this.designation = designation;

        // Increment employee count
        totalEmployees++;
    }

    // Method to display employee details
    void displayEmployeeDetails() {

        System.out.println("Company Name : " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID  : " + id);
        System.out.println("Designation  : " + designation);
        System.out.println("------------------------------");
    }

    // Static method to display total employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {

        // Creating employee objects
        Employee e1 = new Employee("Shanmugapriyan", 101, "Software Developer");
        Employee e2 = new Employee("Arun", 102, "System Analyst");

        // Using instanceof operator
        if (e1 instanceof Employee) {
            e1.displayEmployeeDetails();
        }

        if (e2 instanceof Employee) {
            e2.displayEmployeeDetails();
        }

        // Calling static method
        Employee.displayTotalEmployees();
    }
}
