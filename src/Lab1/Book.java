package Lab1;

public class Book {
    public String title;
    public String author;
    public String genre;
    public int pages;
    public Date dateFinished;
    public Book(String title, String author, String genre, int pages, Date dateFinished) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.dateFinished = dateFinished;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Title: " + title + " Author: "
                + author + " Genre: " + genre + " Pages: " + pages;
    }
}
