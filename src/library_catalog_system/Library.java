package library_catalog_system;

import java.util.ArrayList;
import java.util.List;

public class Library {
//    Fields
    private final List<Book> books;
    boolean idMatch = false;
    boolean checkOutList = false;

//    Constructor
    public Library(){
        this.books = new ArrayList<>();
    }
//    Methods
    public void addBook(Book newBook){
            books.add(newBook);
    }
    public void idMatching(int id){
        for (Book book : books){
            if (book.getId() == id){
                idMatch = true;
                break;
            }
        }
        if (idMatch){
            System.out.println("Book with ID: " + id + " already exists!\n");
        }
    }
    public void availableBookList(){
        System.out.println("Books Available: ");
        for(Book book : books){
            if (!book.isCheckOut()){
                System.out.println("Book ID: " + book.getId() + ", Book Title: " + book.getTitle());
            }
        }
        System.out.println("\n");
    }
    public void getBookInfo(int id){
        boolean idFound = false;
        for(Book book : books){
            if(book.getId() == id){
                book.bookInfo(id);
                idFound = true;
            }
        }
        if (!idFound){
            System.out.println("Book with ID: " + id + " not found!\n");
        }
    }
    public void checkOutBook(int id){
        boolean idFound = false;
        for(Book book : books){
            if(book.getId() == id){
                book.checkedOut();
                idFound = true;
                checkOutList = true;
            }
        }
        if (!idFound){
            System.out.println("Book with ID: " + id + " not found!\n");
        }
    }
    public void returnBook(int id){
        boolean idFound = false;
        for(Book book : books){
            if(book.getId() == id){
                book.returnBook();
                idFound = true;
            }
        }
        if (!idFound){
            System.out.println("Book with ID: " + id + " not found!\n");
        }
    }
    public void checkedOutBooksList(){
        if (checkOutList) {
            System.out.println("Books checked out:");
            for (Book book : books) {
                if (book.isCheckOut()) {
                    System.out.println("Book ID: " + book.getId() + ", Book Title: " + book.getTitle());
                }
            }
        }
        else {
            System.out.println("All books are available");
        }
        System.out.println("\n");
    }
}