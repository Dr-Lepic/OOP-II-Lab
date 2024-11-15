package Lab7;

import java.io.*;

public class RegularUser  extends User implements Iuser{
    public RegularUser(String id, String name, String email, String password) {
        super( id, name, email, password, "Regular");
    }



    public void do_something(){
        System.out.println("Do something");
    }

    @Override
    public void details() {
        System.out.println(this);
    }

    public StringBuilder read() throws FileNotFoundException {
        IReader reader = new ReaderCSV();
        return reader.read();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
