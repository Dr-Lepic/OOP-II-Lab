package Lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class BookList {
    private ArrayList<Book> books;
    public BookList(String path) {
        books = new ArrayList<>();
        setBooks(path);
    }

    public void setBooks(String path){
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split(",");
                Book tempBook = new Book(data[0], data[1], data[2], Integer.parseInt(data[3]), new Date(data[4]));
                books.add(tempBook);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getBooks() {
        for(Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void booksByYear(int year){
        int bookCount = 0;
        for(Book book : books){
            if(book.dateFinished.year == year){
                bookCount++;
            }
        }
        System.out.println("Finished " + bookCount + " book/s in " + year);
    }

    public void bookByMonth(){
        int month = 1;

        while(month <= 12){
            int bookCount = 0;

            for(Book book : books){
                if(book.dateFinished.month == month){
                    bookCount++;
                }
            }
            System.out.println("Finished " + bookCount + " books in the month number " + month);
            month++;
        }
    }

    public void longestBooks(){
        ArrayList<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(Comparator.comparing(Book::getPages).reversed());

        for(Book book : sortedBooks){
            System.out.println(book.title + ":- " + book.pages);
        }
    }


    public void mostReadGenre(){
        for(Book bookOuter : books){
            int count = 0;
            for(Book bookInner : books){
                if(bookOuter.title.equals(bookInner.title)){
                    continue;
                } else if (bookOuter.genre.equals(bookInner.genre)) {
                    count++;
                }
            }
            System.out.println(bookOuter.genre + ":" + count);
        }
    }

    public void averageLength(){
        int length = 0;
        for(Book book : books){
            length+= book.pages;
        }
        int averageLength = length/books.size();
        System.out.println("Average Pages: " + averageLength);
    }


}
