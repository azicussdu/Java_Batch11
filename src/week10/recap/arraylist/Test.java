package week10.recap.arraylist;

public class Test {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Book One", 100);
        library.addBook(b1);

        library.addBook(new Book("Book Two", 200));
        library.addBook(new Book("Book Three", 300));
        library.addBook(new Book("Book Four", 400));

        library.listAllBooks();

        library.removeBook();

        library.listAllBooks();

    }
}
