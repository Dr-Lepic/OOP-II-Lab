package Lab5;

public class Clothing extends Product{
    public Clothing(String name, double price, int quantity) {
        super(name, quantity, price);
    }

    @Override
    double calculateTotalPrice() {
        return (unitPrice + unitPrice*0.10);
    }
}
