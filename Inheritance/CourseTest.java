package BridgeLabz_Java.Inheritance;

// Base class
class Course {


    protected String courseName;
    protected int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }


    void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}



class OnlineCourse extends Course {


    protected String platform;
    protected boolean isRecorded;


    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {


        super(courseName, duration);

        this.platform = platform;
        this.isRecorded = isRecorded;
    }


    void displayOnlineCourse() {

        // Display base class details
        displayCourse();

        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}



class PaidOnlineCourse extends OnlineCourse {

    private double fee;
    private double discount;

    // Constructor
    PaidOnlineCourse(String courseName, int duration,
                     String platform, boolean isRecorded,
                     double fee, double discount) {

        super(courseName, duration, platform, isRecorded);

        this.fee = fee;
        this.discount = discount;
    }

    void displayPaidCourse() {

        // Display previous class details
        displayOnlineCourse();

        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");


        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Final Price After Discount: $" + finalPrice);
    }
}


public class CourseTest {

    public static void main(String[] args) {

        PaidOnlineCourse course1 =
                new PaidOnlineCourse(
                        "Java Programming",
                        8,
                        "Coursera",
                        true,
                        200,
                        20
                );
        course1.displayPaidCourse();
    }
}