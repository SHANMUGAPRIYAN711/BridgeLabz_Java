package BridgeLabz_Java.fourPillars;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}
interface Department {
    void assignDepartment(String dept);
    void getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department {

    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}
class PartTimeEmployee extends Employee implements Department {

    private int hours;
    private String department;

    public PartTimeEmployee(int id, String name, double salary, int hours) {
        super(id, name, salary);
        this.hours = hours;
    }

    public double calculateSalary() {
        return getBaseSalary() * hours;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(1,"John",50000);
        Employee e2 = new PartTimeEmployee(2,"Mike",200,20);

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}