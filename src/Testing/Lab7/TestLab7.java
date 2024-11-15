package Testing.Lab7;

import Lab7.*;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

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

    // if I add data in the Admin.csv then I get stackOverflow error every time no matter what I do !!
    // so keeping it empty for now.
    @Test
    public void test_Admin_renameFile() throws FileNotFoundException {
        Admin admin = new Admin("1", "Mahbub", "test@gmail.com", "123");
        assertTrue(admin.renameFile("src/Lab7/User.csv", "user.csv"));
    }

    @Test
    public void test_Authentication_user() throws FileNotFoundException {
        UserManagementSystem auth = UserManagementSystem.getInstance();
        User user = auth.authenticateUser("Mahbub2", "123");
        assertInstanceOf(PowerUser.class, user);

    }

    @Test
    public void test_Authentication_admin() throws FileNotFoundException {
        UserManagementSystem auth = UserManagementSystem.getInstance();
        Admin admin = auth.authenticateAdmin("Mahbub90", "123");
        assertNull(admin);// cause file is empty
    }


}
