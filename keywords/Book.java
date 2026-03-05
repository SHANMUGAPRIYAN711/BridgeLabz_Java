package BridgeLabz_Java.keywords;

class Book {

    // Static variable shared by all books
    static String libraryName = "SRM Central Library";

    // Instance variables
    String title;
    String author;

    // Final variable (cannot be changed after initialization)
    final String isbn;

    // Constructor
    Book(String title, String author, String isbn) {

        // Using 'this' to resolve ambiguity
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    void displayBookDetails() {

        System.out.println("Library Name : " + libraryName);
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("ISBN         : " + isbn);
        System.out.println("------------------------------");
    }

    // Static method to display library name
    static void displayLibraryName() {
        System.out.println("Library Name : " + libraryName);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {

        // Creating objects
        Book b1 = new Book("Java Programming", "Shanmugapriyan", "ISBN101");
        Book b2 = new Book("Data Structures", "Mark Allen", "ISBN102");

        // Calling static method
        Book.displayLibraryName();

        // Using instanceof to verify object type
        if (b1 instanceof Book) {
            b1.displayBookDetails();
        }

        if (b2 instanceof Book) {
            b2.displayBookDetails();
        }
    }
}
