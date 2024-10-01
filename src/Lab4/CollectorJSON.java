package Lab4;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class CollectorJSON implements BookCollector {


    @Override
    public ArrayList<Book> collect(String path) throws IOException{
        ArrayList<Book> result = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();

        result = (ArrayList<Book>) mapper.readValue(new File(path) , new TypeReference<List<Book>>() {});


        return result;
    }

}
