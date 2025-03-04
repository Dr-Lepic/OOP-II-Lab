package Lab11;

import java.util.ArrayList;

public class Solve {

    private ArrayList<Book> books;

    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(int index) {
        books.remove(index);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }
}
