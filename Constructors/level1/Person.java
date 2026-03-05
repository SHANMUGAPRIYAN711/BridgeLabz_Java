package BridgeLabz_Java.Constructors.level1;

class Person {

    private String name;
    private int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {

        Person p1 = new Person("Shanmugapriyan", 22);
        Person p2 = new Person(p1);

        p1.displayDetails();
        p2.displayDetails();
    }
}
