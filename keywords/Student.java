package BridgeLabz_Java.keywords;

class Student {

    // Static variable shared by all students
    static String universityName = "SRM Institute of Science and Technology";

    // Static variable to count total students
    static int totalStudents = 0;

    // Instance variables
    String name;
    String grade;

    // Final variable (cannot be changed once assigned)
    final int rollNumber;

    // Constructor
    Student(String name, int rollNumber, String grade) {

        // Using 'this' to resolve ambiguity
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        // Increase student count whenever a new student object is created
        totalStudents++;
    }

    // Method to display student details
    void displayStudentDetails() {

        System.out.println("University Name : " + universityName);
        System.out.println("Student Name    : " + name);
        System.out.println("Roll Number     : " + rollNumber);
        System.out.println("Grade           : " + grade);
        System.out.println("-----------------------------");
    }

    // Method to update student grade
    void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    // Static method to display total students
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled : " + totalStudents);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {

        // Creating student objects
        Student s1 = new Student("Shanmugapriyan", 101, "A");
        Student s2 = new Student("Arun", 102, "B");

        // Using instanceof operator before performing operations
        if (s1 instanceof Student) {
            s1.displayStudentDetails();
        }

        if (s2 instanceof Student) {
            s2.displayStudentDetails();
        }

        // Updating grade after verifying instance
        if (s1 instanceof Student) {
            s1.updateGrade("A+");
            System.out.println("Updated Grade for " + s1.name);
            s1.displayStudentDetails();
        }

        // Display total number of students
        Student.displayTotalStudents();
    }
}
