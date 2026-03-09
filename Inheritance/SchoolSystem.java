package BridgeLabz_Java.Inheritance;

// Superclass
class Person {

    // Common attributes
    protected String name;
    protected int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display common information
    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


// Subclass: Teacher
class Teacher extends Person {

    // Unique attribute
    private String subject;

    // Constructor
    Teacher(String name, int age, String subject) {
        super(name, age); // call superclass constructor
        this.subject = subject;
    }

    // Method describing role
    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject Taught: " + subject);
    }
}


// Subclass: Student
class Student extends Person {

    // Unique attribute
    private String grade;

    // Constructor
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}


// Subclass: Staff
class Staff extends Person {

    // Unique attribute
    private String department;

    // Constructor
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}


// Main class
public class SchoolSystem {

    public static void main(String[] args) {

        // Creating objects
        Teacher teacher = new Teacher("Mr. Kumar", 40, "Mathematics");
        Student student = new Student("Anita", 16, "10th Grade");
        Staff staff = new Staff("Ramesh", 35, "Administration");

        // Teacher details
        teacher.displayPersonInfo();
        teacher.displayRole();

        System.out.println();

        // Student details
        student.displayPersonInfo();
        student.displayRole();

        System.out.println();

        // Staff details
        staff.displayPersonInfo();
        staff.displayRole();
    }
}
