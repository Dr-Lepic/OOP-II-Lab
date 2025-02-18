package Lab9;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setServeType(new GlassJar());
        order.addFlavour(new ChocolateFudge(3));
        order.addTopping(new Sprinkles(2));
        order.checkOut();
    }
}
