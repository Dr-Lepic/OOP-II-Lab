package Lab9;

public class Toppings extends Item{
    public Toppings(String name, int count, double price) {
        super(name, count, price);
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return count * price;
    }
}
