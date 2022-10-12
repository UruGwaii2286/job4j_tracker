package pojo;

public class Book {
    private String titleBook;
    private int numberOfPages;

    public Book(String titleBook, int numberOfPages) {
        this.titleBook = titleBook;
        this.numberOfPages = numberOfPages;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
