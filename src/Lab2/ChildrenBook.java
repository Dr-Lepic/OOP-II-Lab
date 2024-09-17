package Lab2;

public class ChildrenBook extends Book {

    public ChildrenBook(String title, String author) {
        super(title, author);
        super.baseFine = 0.50;
        super.additionalFine = 0.75;
    }
}
