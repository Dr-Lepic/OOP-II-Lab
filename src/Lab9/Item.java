package Lab9;

public abstract class Item {
    String name;
    int count;
    double price;

    public Item(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }
    abstract int getCount();
    abstract double getPrice();
    abstract String getName();
    abstract double getCost();
}
