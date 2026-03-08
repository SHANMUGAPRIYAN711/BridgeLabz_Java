package BridgeLabz_Java.objectmodeling;

import java.util.ArrayList;

// Book class
class Book {

    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class
class Library {

    String libraryName;

    // Library contains multiple books
    ArrayList<Book> books = new ArrayList<>();

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    // Method to add book
    void addBook(Book book) {
        books.add(book);
    }

    // Display books
    void displayBooks() {

        System.out.println("Library: " + libraryName);

        for (Book b : books) {
            b.displayBook();
        }
    }
}

// Main class
public class TestLibrary {

    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Data Structures", "Mark Allen");

        Library lib = new Library("City Library");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayBooks();
    }
}
