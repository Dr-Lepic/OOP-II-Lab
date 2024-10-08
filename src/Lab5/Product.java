package Lab5;

public abstract class Product {
    String name;
    int stock;
    double unitPrice;
    double totalPrice;

    public Product(String name, int stock, double unitPrice) {
        this.name = name;
        this.stock = stock;
        this.unitPrice = unitPrice;
        this.totalPrice = this.calculateTotalPrice();
    }

    abstract double calculateTotalPrice();

}
