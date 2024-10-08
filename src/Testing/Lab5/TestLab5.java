package Testing.Lab5;

import Lab5.Clothing;
import Lab5.Electronics;
import Lab5.Furniture;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class TestLab5 {

    @Test
    public void test_Electronic_creation_name() {
        Electronics test = new Electronics("Mouse", 20, 2.00);
        assertEquals("Mouse", test.getName());
    }

    @Test
    public void test_Electronic_creation_invalid() {

    }

    @Test
    public void test_Clothing_creation_name() {
        Clothing test = new Clothing("T-shirt", 10, 1.00);
        assertEquals("T-shirt", test.getName());
    }

    @Test
    public void test_Furniture_creation_name() {
        Furniture test = new Furniture("Table", 20, 200.00);
        assertEquals("Table", test.getName());
    }

    @Test
    public void test_total(){
        Furniture test = new Furniture("Table", 20, 200.00);
        assertEquals(216, test.getTotalPrice());
    }

}
