package BridgeLabz_Java.Constructors.level1;

class LibraryBook {

    private String title;
    private String author;
    private double price;
    private boolean available;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {

        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void displayDetails() {

        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
        System.out.println("Available   : " + available);
    }

    public static void main(String[] args) {

        LibraryBook book = new LibraryBook("Java Basics", "James Gosling", 400);

        book.displayDetails();
        book.borrowBook();
        book.displayDetails();
    }
}
