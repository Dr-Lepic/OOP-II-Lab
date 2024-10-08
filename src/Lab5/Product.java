package Lab5;

public abstract class Product {
    String name;
    int stock;
    double unitPrice;

    public Product(String name, int stock, double unitPrice) {
        this.name = name;
        this.stock = stock;
        this.unitPrice = unitPrice;
    }

    abstract double calculateTotalPrice();

}
