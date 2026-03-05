package BridgeLabz_Java.Constructors.level1;
class Book {

    private String title;
    private String author;
    private double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBookDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James Gosling", 500);

        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}