package library_catalog_system;

public class Book {

    //  Fields
    private int id;
    private String title;
    private String author;
    private String genre;
    private String publisher;
    private boolean checkOut;

    //  Getter and setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public boolean isCheckOut() {
        return checkOut;
    }
    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    //  Constructor
    public Book(int id, String title, String author, String genre, String publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.checkOut = false;
    }

    //Methods
    public void bookInfo(int id) {
        System.out.println("Book ID: " + id + "\nTitle: " + title + " \nAuthor: " + author + "\nGenre: " + genre + "\nPublisher: " + publisher + "\n");
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