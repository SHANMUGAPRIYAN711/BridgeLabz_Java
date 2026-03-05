package BridgeLabz_Java.Constructors.InstanceandClass;

class Course {

    String courseName;
    int duration;
    double fee;

    static String instituteName = "Tech Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " months");
        System.out.println("Fee         : " + fee);
        System.out.println("Institute   : " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Java Full Stack", 6, 50000);
        Course c2 = new Course("Python AI", 5, 45000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Advanced Tech Academy");

        System.out.println("\nAfter Updating Institute Name\n");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
