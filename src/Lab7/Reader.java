package Lab7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader implements IReader{
    @Override
    public void read() throws FileNotFoundException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Lab7/User.csv"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
