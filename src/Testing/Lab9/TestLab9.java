package Testing.Lab9;

import Lab7.ReaderCSV;
import Lab9.*;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class TestLab9 {

    @Test
    public void test_flavour() {
        Flavour flavour = new ChocolateFudge(3);
        assertEquals(9.00, flavour.getCost());
    }

    @Test
    public void test_Toppings() {
        Toppings toppings = new Sprinkles(2);
        assertEquals(0.60, toppings.getCost());
    }

    @Test
    public void test_Order(){
        Order order = new Order();
        order.setServeType(new PaperCup(1));
        order.addFlavour(new ChocolateFudge(3));
        order.addTopping(new Sprinkles(2));

        assertEquals(9.60, order.getAmount());
        assertEquals(0.768, order.getTax());
    }

    @Test
    public void test_Order_Glass(){
        Order order = new Order();
        order.setServeType(new GlassJar(1));
        order.addFlavour(new ChocolateFudge(3));
        order.addTopping(new Sprinkles(2));
//        order.calculate();

//        TextInvoice invoice = new TextInvoice(order);
//        invoice.generateInvoice();
        CSVInvoice invoice = new CSVInvoice(order);
        invoice.generateInvoice();

        assertEquals(14.60, order.getAmount());
        assertEquals(1.168, order.getTax());
    }
}