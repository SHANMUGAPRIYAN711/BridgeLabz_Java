package BridgeLabz_Java.Inheritance;

// Superclass
class Book {

    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass
class Author extends Book {

    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main
public class LibraryTest {

    public static void main(String[] args) {

        Author a = new Author(
                "Java Programming",
                2020,
                "John Smith",
                "Software Developer");

        a.displayInfo();
    }
}
