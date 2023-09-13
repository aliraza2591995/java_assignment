package library_catalog_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "Harry Potter", "J.K. Rowling", "Fantasy",  "Bloomsbury"));
        library.addBook(new Book(2, "A Song of Ice and Fire", "George R. R. Martin", "Epic fantasy", "Bantam Books"));
        library.addBook(new Book(3, "Fundamentals of Wavelets", "Goswami, Jaideva", "Signal Processing", "Wiley"));
        library.addBook(new Book(4, "God Created the Integers", "Hawking, Stephen", "Mathematics", "Penguin"));
        library.addBook(new Book(5, "Jurassic Park", "Crichton, Michael", "Fiction", "Random House"));
        library.addBook(new Book(6, "The Last Mughal", "Dalrymple, William", "History", "Penguin"));
        library.addBook(new Book(7, "Theory of Everything", "Hawking, Stephen", "Science", "Jaico"));
        library.addBook(new Book(8, "Don't Make Me Think", "Steve Krug", "Web Design and Usability", "New Riders Press"));
        library.addBook(new Book(9, "Introduction to Algorithms", "Cormen, Thomas", "Tech, Computer Science", "MIT Press"));
        library.addBook(new Book(10, "The Alchemist", "Paulo Coelho", "Quest, adventure, fantasy", "HarperTorch"));

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to the library catalog system\nBelow is the list of books available in the library");
        library.availableBookList();

        int options;

        do{
            System.out.println("Enter 1 for getting a list of books available");
            System.out.println("Enter 2 for getting a book info");
            System.out.println("Enter 3 for adding a book");
            System.out.println("Enter 4 for a book checkout");
            System.out.println("Enter 5 for returning a book");
            System.out.println("Enter 6 for getting the list of books checked out");
            System.out.println("Press 0 to quit");

            options = sc.nextInt();
            switch (options) {
                case 1 -> {
                    library.availableBookList();
                }
                case 2 -> {
                    System.out.println("Enter the book ID");
                    int bookId = sc.nextInt();
                    library.getBookInfo(bookId);
                }
                case 3 -> {
                    System.out.println("Enter the book ID");
                    int id = sc.nextInt();
                    System.out.println("Enter the book title");
                    String title = sc.next();
                    System.out.println("Enter the book author");
                    String author = sc.next();
                    System.out.println("Enter the book publisher");
                    String publisher = sc.next();
                    System.out.println("Enter the book genre");
                    String genre = sc.next();
                    library.addBook(new Book(id, title, author, publisher, genre));
                }
                case 4 -> {
                    System.out.println("Enter book ID that you want to checkout");
                    library.checkOutBook(sc.nextInt());
                }
                case 5 -> {
                    System.out.println("Enter book ID that you want to return");
                    library.returnBook(sc.nextInt());
                }
                case 6 -> {
                    library.checkedOutBooksList();
                }
                case 0 ->{}
                default -> System.out.println("Invalid input");
            }
        } while (options != 0);
    }
}
