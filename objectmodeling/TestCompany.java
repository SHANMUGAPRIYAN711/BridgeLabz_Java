package BridgeLabz_Java.objectmodeling;
import java.util.ArrayList;

// Employee class
class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

// Department class
class Department {

    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showEmployees() {

        System.out.println("Department: " + deptName);

        for (Employee e : employees) {
            e.display();
        }
    }
}

// Company class
class Company {

    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void displayCompany() {

        System.out.println("Company: " + companyName);

        for (Department d : departments) {
            d.showEmployees();
        }
    }
}

public class TestCompany {

    public static void main(String[] args) {

        Company c = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));

        c.addDepartment(d1);

        c.displayCompany();
    }
}
