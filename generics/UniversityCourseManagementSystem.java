package BridgeLabz_Java.generics;
import java.util.ArrayList;
import java.util.List;

// Base class for course types
abstract class CourseType {
    String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public void display() {
        System.out.println("Course: " + courseName);
    }
}

// Different course types
class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }
}


// Generic Course class
class Course<T extends CourseType> {   // bounded generic

    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}


// Utility class
class CourseUtils {

    // Wildcard method to handle any course type
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.display();
        }
    }
}


// Main class (Question Name)
public class UniversityCourseManagementSystem {

    public static void main(String[] args) {

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Java Programming"));
        assignmentCourses.addCourse(new AssignmentCourse("Data Structures"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing"));

        System.out.println("Exam Courses:");
        CourseUtils.displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment Courses:");
        CourseUtils.displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch Courses:");
        CourseUtils.displayCourses(researchCourses.getCourses());
    }
}
