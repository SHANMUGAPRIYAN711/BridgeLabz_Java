package BridgeLabz_Java.objectmodeling;

import java.util.ArrayList;

class Subject{
    String subjectName;
    int marks;
    Subject(String subjectName, int marks){
        this.subjectName = subjectName;
        this.marks = marks;
    }
}
class Student1{
    String name;
    ArrayList<Subject> subjects = new ArrayList<>();
    Student1(String name){
        this.name = name;
    }
    void addSubjects(Subject subject){
        subjects.add(subject);
    }
}
class GradeCalculator{
    double calculateAverage(Student1 student1){
        int total = 0;
        for (Subject s : student1.subjects){
            total += s.marks;
        }
        return total / student1.subjects.size();
    }
    String calculateGrade(double average){
        if(average >= 90){
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 65) {
            return "C";
        }
        else{
            return "D";
        }
    }
}
public class SchoolResultSystem {
    public static void main(String[] args) {
        Student1  student = new Student1("Shanmugapriyan");

        Subject maths = new Subject("Maths", 90);
        Subject Java = new Subject("Java", 95);

        student.addSubjects(maths);
        student.addSubjects(Java);

        GradeCalculator calculator = new GradeCalculator();
        double average = calculator.calculateAverage(student);
        String grade = calculator.calculateGrade(average);
        System.out.println("Student Name : " + student.name);
        System.out.println("Average marks : " + average);
        System.out.println("Grade : " + grade);
    }
}
