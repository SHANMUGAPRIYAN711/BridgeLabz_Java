package BridgeLabz_Java.classandobjects.level1;

class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Employee Name   : " + name);
        System.out.println("Employee ID     : " + id);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Shanmugapriyan", 101, 45000);
        emp.displayDetails();
    }
}
