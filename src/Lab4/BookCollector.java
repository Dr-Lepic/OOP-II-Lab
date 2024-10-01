package Lab4;

import java.io.IOException;
import java.util.ArrayList;

public interface BookCollector {
    public ArrayList<Book> collect(String path) throws IOException;
}
