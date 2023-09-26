package library_catalog_system;

public class Book {

    //  Fields
    private final int id;
    private final String title;
    private final String author;
    private final String genre;
    private final String publisher;
    private boolean checkOut;

    //  Getter and setter
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public boolean isCheckOut() {
        return checkOut;
    }

    //  Constructor
    public Book(int id, String title, String author, String publisher, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.checkOut = false;
    }

    //Methods
    public void bookInfo(int id) {
        System.out.println("Book ID: " + id + "\nTitle: " + title + " \nAuthor: " + author + "\nPublisher: " + publisher + "\nGenre: " + genre);
        if (checkOut){
            System.out.println("Availability status: Not available\n");
        }
        else {
            System.out.println("Availability status: Available\n");
        }
    }
    public void checkedOut() {
        if (!checkOut) {
            checkOut = true;
            System.out.println("Book checked out: " + title + "\n");
        } else {
            System.out.println("Sorry, this book is already checked out\n");
        }
    }
    public void returnBook() {
        if (checkOut) {
            checkOut = false;
            System.out.println("Thank you for returning the book: " + title + "\n");
        } else {
            System.out.println("This book is not currently checked out\n");
        }
    }
}