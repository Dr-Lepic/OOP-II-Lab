package Testing.Lab5;

import Lab5.Clothing;
import Lab5.Electronics;
import Lab5.Furniture;
import Lab5.MakeProduct;
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
    public void test_Electronic_creation_price() {
        Electronics test = new Electronics("Mouse", 20, 2.00);
        assertEquals(2.00, test.getUnitPrice());
    }

    @Test
    public void test_Clothing_creation_name() {
        Clothing test = new Clothing("T-shirt", 10, 1.00);
        assertEquals("T-shirt", test.getName());
    }

    @Test
    public void test_Clothing_creation_price() {
        Clothing test = new Clothing("T-shirt", 10, 1.00);
        assertEquals(1.00, test.getUnitPrice());
    }


    @Test
    public void test_Furniture_creation_name() {
        Furniture test = new Furniture("Table", 20, 200.00);
        assertEquals("Table", test.getName());
    }

    @Test
    public void test_furniture_total(){
        Furniture test = new Furniture("Table", 20, 200.00);
        assertEquals(216, test.getTotalPrice());
    }

    @Test
    public void test_electronic_total(){
        Electronics test = new Electronics("Mouse", 20, 100.00);
        assertEquals(115, test.getTotalPrice());
    }

    @Test
    public void test_clothing_total(){
        Clothing test = new Clothing("Shirt", 20, 100.00);
        assertEquals(110, test.getTotalPrice());
    }

    @Test
    public void test_productCreation(){
        MakeProduct test = new MakeProduct();
        assertEquals(9, test.productCount());
    }

    @Test
    public void test_Furniture_creation_stock() {
        Furniture test = new Furniture("Table", 20, 200.00);
        assertEquals(20, test.getStock());
    }




}
