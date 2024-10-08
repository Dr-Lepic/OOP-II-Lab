package Lab5;

public class Electronics extends Product{
    public Electronics(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    double calculateTotalPrice() {
        return (unitPrice + unitPrice*0.15);
    }


}
