package Lab5;

public class Furniture extends Product {
    public Furniture(String name, int stock, double unitPrice) {
        super(name, stock, unitPrice);
    }

    @Override
    double calculateTotalPrice() {
        return (unitPrice + unitPrice*0.08);
    }

}
