package BridgeLabz_Java.Constructors.accessmodifier;

class Book {

    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    void displayBook() {
        System.out.println("ISBN  : " + ISBN);
        System.out.println("Title : " + title);
    }

    public static void main(String[] args) {

        EBook book = new EBook();

        book.ISBN = "978-12345";
        book.title = "Java Programming";
        book.setAuthor("James Gosling");

        book.displayBook();
        System.out.println("Author : " + book.getAuthor());
    }
}
