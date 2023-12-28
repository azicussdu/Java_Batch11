package week10.recap.maps;

public class TestLibrary {
    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook(new Book("One", 100));
        lib.addBook(new Book("Two", 200));
        lib.addBook(new Book("Three", 300));
        lib.addBook(new Book("Four", 400)); // Ctrl/Command + D

        lib.removeBook();

        lib.listAllBooks();

    }
}
