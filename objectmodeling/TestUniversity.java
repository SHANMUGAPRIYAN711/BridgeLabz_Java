package BridgeLabz_Java.objectmodeling;
class Course{
    String courseName;
    Course(String courseName){
        this.courseName = courseName;
    }
}
class Professor{
    String name;
    Professor(String name){
        this.name = name;
    }
    void assignedCourse(Course c){
        System.out.println(name + " " + "teaches " + " "+ c.courseName);
    }
}
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    void enrolledCourse(Course c){
        System.out.println(name + " " + "Enrolled in Course " + " " + c.courseName);
    }
}
public class TestUniversity {
    public static void main(String[] args) {
        Course course = new Course("Java Full Stack");
        Professor p1 = new Professor("Karthikeyan");
        Student s1 = new Student("Shanmugapriyan");
        p1.assignedCourse(course);
        s1.enrolledCourse(course);
    }
}
