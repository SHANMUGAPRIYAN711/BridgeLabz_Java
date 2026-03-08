package BridgeLabz_Java.objectmodeling;
import java.util.ArrayList;
class Courses{
    String courseName;
    ArrayList<Students> students = new ArrayList<>();
    Courses(String courseName){
        this.courseName = courseName;
    }
    void addStudent(Students s1){
        students.add(s1);
    }
    void showStudent(){
        System.out.println( "Course Name :  " +" "+ courseName );
        for(Students s : students){
            System.out.println("Student  : " + " " + s.name);
        }
    }
}
class Students{
    String name;
    ArrayList<Courses> course = new ArrayList<>();
    Students(String name){
        this.name = name;
    }
    void enrolledCourse(Courses c1){
        course.add(c1);
        c1.addStudent(this);
    }
    void showCourse(){
        System.out.println("Student : " + name);
        System.out.println("Courses Enrolled : ");
        for(Courses c : course){
            System.out.println(c.courseName);
        }
    }
}
class School{
    String schoolName;
    ArrayList<Students> student = new ArrayList<>();
    School(String schoolName){
        this.schoolName = schoolName;
    }
    void addStudent(Students s){
        student.add(s);
    }
    void displayStudents(){
        System.out.println("School : " + " "+ schoolName);
        for(Students s : student){
            System.out.println("Student : " + " " + s.name);
        }
    }
}

public class TestSchool {
    public static void main(String[] args) {
        School school = new School("SRM Public School");
        Students s1 = new Students("Shanmugapriyan");
        Students s2 = new Students("Rajkumar");

        Courses course1 = new Courses("Java Programmming");
        Courses course2 = new Courses("Python");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrolledCourse(course1);
        s2.enrolledCourse(course2);

        school.displayStudents();
        System.out.println();
        s1.showCourse();
        System.out.println();
        course1.showStudent();
    }
}
