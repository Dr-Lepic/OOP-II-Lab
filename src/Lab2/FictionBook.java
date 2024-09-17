package Lab2;

public class FictionBook extends Book {

    public FictionBook(String title, String author) {
        super(title, author);
        this.baseFine = 1.0;
        this.additionalFine = 1.50;
    }
}
