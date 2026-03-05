package BridgeLabz_Java.Constructors.level1;

class Circle {

    private double radius;

    // Default constructor
    Circle() {
        this(1.0);
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void displayDetails() {
        System.out.println("Radius : " + radius);
        System.out.println("Area   : " + calculateArea());
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        c1.displayDetails();
        c2.displayDetails();
    }
}