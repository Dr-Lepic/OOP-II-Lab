package Lab5;

public abstract class Product {
    String name;
    int stock;
    double unitPrice;
    double totalPrice;

    public Product(String name, int stock, double unitPrice) {
        if (stock<0 || unitPrice<0){
            throw new IllegalArgumentException("Stock or Unit Price cannot be less than zero");
        }
        this.name = name;
        this.stock = stock;
        this.unitPrice = unitPrice;
        this.totalPrice = this.calculateTotalPrice();
    }

    abstract double calculateTotalPrice();

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
