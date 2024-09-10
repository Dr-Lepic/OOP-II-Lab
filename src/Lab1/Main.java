package Lab1;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList("src/Lab1/data.csv");
        bookList.getBooks();
        bookList.bookByMonth();
        bookList.booksByYear(2023);
        bookList.booksByYear(2021);
        bookList.averageLength();
        bookList.longestBooks();
        bookList.mostReadGenre();

    }
}
