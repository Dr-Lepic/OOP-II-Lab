package Lab2;

public class Book {
    String title;
    String author;
    int basicRentPeriod;
    double basicRent;
    double baseFine;
    double additionalFine;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.basicRentPeriod = 20;
        this.basicRent = 6;
    }

    public double getBasicRent() {
        return basicRent;
    }

    public double getBaseFine() {
        return baseFine;
    }

    public double getAdditionalFine() {
        return additionalFine;
    }
}
