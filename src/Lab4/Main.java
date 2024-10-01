package Lab4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BookCollector bookCollector = new CollectorJSON();
        BookCollector bookCollector2 = new CollectorCSV();
        BookCollector bookCollector3 = new CollectorXML();
        BookList bookList = new BookList("src/Lab4/data.JSON", bookCollector);
        //bookList.getBooks();

        BookList bookList2 = new BookList("src/Lab4/data.csv", bookCollector2);
        //bookList2.getBooks();

        BookList bookList3 = new BookList("src/Lab4/data.xml", bookCollector3);
        bookList3.getBooks();


//        bookList.bookByMonth();
//        bookList.booksByYear(2023);
//        bookList.booksByYear(2021);
//        bookList.averageLength();
//        bookList.longestBooks();
//        bookList.mostReadGenre();

    }
}
