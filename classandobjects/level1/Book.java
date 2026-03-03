package BridgeLabz_Java.classandobjects.level1;
class Book {

    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Title  : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 650);
        book.displayDetails();
    }
}
