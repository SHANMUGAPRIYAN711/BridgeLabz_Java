package BridgeLabz_Java.Constructors.accessmodifier;

class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    void displayDetails() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        m.employeeID = 5001;
        m.department = "IT";
        m.setSalary(80000);

        m.displayDetails();
        System.out.println("Salary : " + m.getSalary());
    }
}