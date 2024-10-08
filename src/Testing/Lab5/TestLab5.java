package Testing.Lab5;

import Lab5.Electronics;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestLab5 {
    @Test
    public void test_Electronic_creation() {
        Electronics test = new Electronics("Mouse", 20, 2.00);
        assertEquals("Mouse", test.getName());
    }

    @Test
    public void test_Electronic_creation2() {}
}
