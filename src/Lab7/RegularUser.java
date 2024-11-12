package Lab7;

import java.io.*;

public class RegularUser  extends User implements Iuser, IReader{
    public RegularUser(String name, String email, String password, String id) {
        super(name, email, password, id, "Regular");
    }


    public void do_something(){
        System.out.println("Do something");
    }

    @Override
    public void details() {
        System.out.println(this);
    }

    @Override
    public void read() throws FileNotFoundException {
        Reader reader = new Reader();
        reader.read();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
