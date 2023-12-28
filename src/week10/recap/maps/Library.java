package week10.recap.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    private HashMap<Integer, Book> booksMap = new HashMap<>();

    public void addBook(Book book){
        booksMap.put(book.getId(), book);
        System.out.println("The book: " + book.getTitle() + " was added");
    }

    public void listAllBooks(){
//        for(Map.Entry<Integer, Book> bookEntry : booksMap.entrySet()){
//            System.out.println("id: " + bookEntry.getKey() + ", book: " + bookEntry.getValue());
//        }

        for(Book books : booksMap.values()){
            System.out.println(books); //toString()
        }
    }

    public void removeBook(){
        Scanner scan = new Scanner(System.in);

        listAllBooks();
        System.out.print("choose id of a book to remove: ");
        int idToRemove = scan.nextInt();

        booksMap.remove(idToRemove);
        System.out.println("The book was removed");
    }
}
