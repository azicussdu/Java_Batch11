package week10.recap.arraylist;

public class Book {
    private String title;
    private int pageNumber; // encapsulation

    public Book(String title, int pageNumber) {
        this.title = title;
        this.pageNumber = pageNumber;
    }

    public Book(){

    }

    public String toString() {
        return "title='" + title + '\'' +
                ", pageNumber=" + pageNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if(pageNumber > 0)
            this.pageNumber = pageNumber;
    }
}
