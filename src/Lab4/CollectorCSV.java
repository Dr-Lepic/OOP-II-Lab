package Lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CollectorCSV implements BookCollector {
    @Override
    public ArrayList<Book> collect(String path) {
        ArrayList<Book> books = new ArrayList<>();
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
        return books;
    }
}
