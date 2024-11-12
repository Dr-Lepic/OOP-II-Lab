package Lab7;

import java.io.FileNotFoundException;

public class PowerUser extends User{
    public PowerUser(String name, String email, String password, String id) {
        super(name, email, password, id, "Power");
    }

    void read() throws FileNotFoundException {
        Reader reader = new Reader();
        reader.read();
    }

    void modify(String oldWord, String newWord) throws FileNotFoundException {
        Modifier modifier = new Modifier();
        modifier.modify(oldWord, newWord);
    }
}
