package library_catalog_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for getting a list of books available");
        System.out.println("Enter 2 for getting a book info");
        System.out.println("Enter 3 for adding a book");
        System.out.println("Enter 4 for a book checkout");
        System.out.println("Enter 5 for returning a book");

        int options = sc.nextInt();

        switch (options){
            case 1:
                library.availableBookList();
                break;
            case 2:
        }
    }
}
