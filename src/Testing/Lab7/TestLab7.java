package Testing.Lab7;

import Lab7.*;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestLab7 {

    @Test
    public void test_reader() throws FileNotFoundException {
        ReaderCSV reader = new ReaderCSV();
        assertEquals("1,mahbub,test@gmail.com,123,Regular\n", reader.read().toString());
    }

    @Test
    public void test_modifier() throws FileNotFoundException {
        ModifierCSV modifier = new ModifierCSV();
        modifier.modify("mahbub", "Mahbub");
        ReaderCSV reader = new ReaderCSV();
        assertEquals("1,Mahbub,test@gmail.com,123,Regular\n", reader.read().toString());
    }

    @Test
    public void test_RegularUser() throws FileNotFoundException {
        RegularUser user = new RegularUser("1", "Mahbub", "test@gmail.com", "123");
        assertEquals("1,Mahbub,test@gmail.com,123,Regular\n", user.read().toString());

    }

    @Test
    public void test_PowerUser() throws FileNotFoundException {
        PowerUser user = new PowerUser("1", "Mahbub", "test@gmail.com", "123");
        user.modify("Mahbub", "Mahbub2");
        assertEquals("1,Mahbub2,test@gmail.com,123,Regular\n", user.read().toString());
    }

    @Test
    public void test_AdminPrivilege_modify() throws FileNotFoundException {
        AdminPrivilegesCSV adminPrivileges = new AdminPrivilegesCSV();
        adminPrivileges.modifyPrivilege("Mahbub2", "Power");
        ReaderCSV reader = new ReaderCSV();
        assertEquals("1,Mahbub2,test@gmail.com,123,Power\n", reader.read().toString());
    }

    @Test
    public void test_Admin_addUser() throws FileNotFoundException {
        Admin admin = new Admin("1", "Mahbub", "test@gmail.com", "123");
        admin.addUser("2", "Mahbub90", "test@gmail.com", "123", "Power");
        //ReaderCSV reader = new ReaderCSV();
        assertEquals("1,Mahbub2,test@gmail.com,123,Power\n" +
               "2,Mahbub90,test@gmail.com,123,Power\n" , admin.readUser().toString());

    }

    @Test
    public void test_Admin_addAdmin() throws FileNotFoundException {
        Admin admin = new Admin("1", "Mahbub", "test@gmail.com", "123");
        admin.addAdmin("2", "Mahbub90", "test@gmail.com", "123");
        assertEquals("2,Mahbub90,test@gmail.com,123\n", admin.readAdmin().toString());
    }


}
