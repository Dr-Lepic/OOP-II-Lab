package Lab4;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CollectorXML implements BookCollector {

    @Override
    public ArrayList<Book> collect(String path) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        ArrayList<Book> books = new ArrayList<>();
        try {
             books = (ArrayList<Book>)xmlMapper.readValue(new File(path), new TypeReference<List<Book>>() {});

        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }

}
