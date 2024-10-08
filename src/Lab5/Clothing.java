package Lab5;

public class Clothing extends Product{
    public Clothing(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    double calculateTotalPrice() {
        return (unitPrice + unitPrice*0.10);
    }
}
