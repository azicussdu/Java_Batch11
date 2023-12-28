package week10.recap.maps;

public class Book {

    private static int currentId = 1;
    private Integer id;
    private String title;
    private int pageNumber; // encapsulation

    public Book(String title, int pageNumber) {
        this.id = currentId;
        currentId++;
        this.title = title;
        this.pageNumber = pageNumber;
    }

    public String toString() {
        return "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", pageNumber=" + pageNumber;
    }

    public Integer getId() {
        return id;
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
