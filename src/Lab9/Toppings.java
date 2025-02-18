package Lab9;

public class Toppings extends Item{
    public Toppings(String name, int count, double price) {
        super(name, count, price);
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    double getPrice() {
        return price;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    double getCost() {
        return count * price;
    }
}
