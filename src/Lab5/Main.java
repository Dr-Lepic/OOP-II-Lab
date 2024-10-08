package Lab5;

public class Main {
    public static void main(String[] args) {

        MakeProduct makeProduct = new MakeProduct();

        OrderManager orderManager = new OrderManager(makeProduct.getCreatedProducts());
        orderManager.printOrderedList();
    }
}
