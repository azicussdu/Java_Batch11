package week10.recap.arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("The book was added");
    }

    public void listAllBooks(){
        for(Book b : books){
            System.out.println(b); // prints toString() from each book object
        }
    }

    public void removeBook(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the title of book you want to remove: ");
        String bookTitle = scan.nextLine();

        for(Book b : books){
            if(b.getTitle().equalsIgnoreCase(bookTitle)){
                books.remove(b);
                System.out.println("The book was removed");
                break;
            }
        }
    }

}
