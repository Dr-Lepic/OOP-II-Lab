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

    interface QueryProvider {
        String getAllBooksQuery();
        String getBookByIdQuery();
        String deleteBookByIdQuery();
        String addBookQuery();
        String updateBookQtyByIdQuery();
    }

    class FirstQueryProvider implements QueryProvider {
        public String getAllBooksQuery() {
            return "SELECT * FROM " + BooksDBConstants.TABLE_BOOK;
        }
        public String getBookByIdQuery() {
            return "SELECT * FROM " + BooksDBConstants.TABLE_BOOK + " WHERE " + BooksDBConstants.COLUMN_BARCODE + " = ?";
        }
        public String deleteBookByIdQuery() {
            return "";
        }
        public String addBookQuery() {
            return "";
        }
        public String updateBookQtyByIdQuery() {
            return "";
        }
    }

    public class Address {
        private String addressLine1;
        private String city;
        private String state;
        private String country;
        private String address;
    }

    QueryProvider queryProvider = new FirstQueryProvider();
}
