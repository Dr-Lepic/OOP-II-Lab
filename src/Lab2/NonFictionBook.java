package Lab2;

public class NonFictionBook extends Book {

    public NonFictionBook(String title, String author) {
        super(title, author);
        super.baseFine = 1.50;
        super.additionalFine = 2.50;
    }
}
