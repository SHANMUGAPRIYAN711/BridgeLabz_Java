package BridgeLabz_Java.Constructors.accessmodifier;

class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {

    void displayDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
    }

    public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent();

        pg.rollNumber = 101;
        pg.name = "Shanmugapriyan";
        pg.setCGPA(8.9);

        pg.displayDetails();
        System.out.println("CGPA : " + pg.getCGPA());
    }
}
