package Testing.Lab9;

import Lab9.*;
import org.junit.jupiter.api.Test;

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
        order.setServeType(new PaperCup());
        order.addFlavour(new ChocolateFudge(3));
        order.addTopping(new Sprinkles(2));
        order.calculate();

        assertEquals(9.60, order.getAmount());
        assertEquals(0.768, order.getTax());
    }

    @Test
    public void test_Order_Glass(){
        Order order = new Order();
        order.setServeType(new GlassJar());
        order.addFlavour(new ChocolateFudge(3));
        order.addTopping(new Sprinkles(2));
        order.calculate();

        assertEquals(14.60, order.getAmount());
        assertEquals(1.168, order.getTax());
    }

    @Test
    public void test_Order_Large(){
        Order order = new Order();
        order.setServeType(new GlassJar());
        order.addFlavour(new ChocolateFudge(1));
        order.addFlavour(new CookiesNCream(1));
        order.addFlavour(new PistachioDelight(1));
        order.addTopping(new Sprinkles(2));
        order.addTopping(new MixedChoppedNuts(2));
        order.addTopping(new CrushedGingerbread(2));
        order.addTopping(new FreshStrawberries(2));

        order.calculate();

        assertEquals(19.75, order.getAmount());
        assertEquals(1.58, order.getTax());

    }
}