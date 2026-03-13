package BridgeLabz_Java.linkedlist;

class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {

    Student head = null;

    // Add student at beginning
    void addAtBeginning(int rollNumber, String name, int age, char grade) {

        Student newStudent = new Student(rollNumber, name, age, grade);

        newStudent.next = head;
        head = newStudent;
    }

    // Add student at end
    void addAtEnd(int rollNumber, String name, int age, char grade) {

        Student newStudent = new Student(rollNumber, name, age, grade);

        if (head == null) {
            head = newStudent;
            return;
        }

        Student temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newStudent;
    }

    // Add student at specific position
    void addAtPosition(int pos, int rollNumber, String name, int age, char grade) {

        Student newStudent = new Student(rollNumber, name, age, grade);

        if (pos == 1) {
            newStudent.next = head;
            head = newStudent;
            return;
        }

        Student temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    // Delete student by roll number
    void deleteByRoll(int rollNumber) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }

        Student temp = head;

        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
            return;
        }

        temp.next = temp.next.next;
    }

    // Search student by roll number
    void search(int rollNumber) {

        Student temp = head;

        while (temp != null) {

            if (temp.rollNumber == rollNumber) {

                System.out.println("Student Found:");
                System.out.println(
                        "Roll: " + temp.rollNumber +
                                " Name: " + temp.name +
                                " Age: " + temp.age +
                                " Grade: " + temp.grade
                );

                return;
            }

            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // Update grade
    void updateGrade(int rollNumber, char newGrade) {

        Student temp = head;

        while (temp != null) {

            if (temp.rollNumber == rollNumber) {

                temp.grade = newGrade;
                System.out.println("Grade Updated Successfully");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Student not found");
    }

    // Display student records
    void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Student temp = head;

        while (temp != null) {

            System.out.println(
                    "Roll: " + temp.rollNumber +
                            " Name: " + temp.name +
                            " Age: " + temp.age +
                            " Grade: " + temp.grade
            );

            temp = temp.next;
        }
    }
}

public class StudentRecordManagement {

    public static void main(String[] args) {

        StudentList list = new StudentList();

        // Insert students
        list.addAtBeginning(101, "Shanmugapriyan", 21, 'A');
        list.addAtEnd(105, "DhivyaDhana", 21, 'B');
        list.addAtPosition(2, 102, "Kadhir", 21, 'A');

        System.out.println("Student Records:");
        list.display();

        System.out.println("\nSearching Student:");
        list.search(105);

        System.out.println("\nUpdating Grade:");
        list.updateGrade(105, 'A');

        System.out.println("\nDeleting Student:");
        list.deleteByRoll(102);

        System.out.println("\nFinal Student List:");
        list.display();
    }
}