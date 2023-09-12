package library_catalog_system;

import java.util.ArrayList;
import java.util.List;

public class Library {
//    Fields
    private List<Book> books;
//    Constructor
    public Library(){
        this.books = new ArrayList<>();
    }
//    Methods
    public void addBook(Book newBook){
        books.add(newBook);
    }
    public void availableBookList(){
        System.out.println("Books Available: ");
        for(Book book : books){
            if (!book.isCheckOut()){
                System.out.println(book.getTitle());
            }
        }
    }
    public void getBookInfo(int id){
        for(Book book : books){
            if(book.getId() == id){
                book.bookInfo(id);
            }
        }
    }
}
