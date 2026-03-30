package BridgeLabz_Java.collections;

import java.util.*;

// Employee class
class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class GroupByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee emp : employees) {

            // Create list if not present
            map.putIfAbsent(emp.department, new ArrayList<>());

            // Add employee to that department
            map.get(emp.department).add(emp);
        }

        // Display result
        for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (Employee e : entry.getValue()) {
                System.out.print(e.name + " ");
            }
            System.out.println();
        }
    }
}