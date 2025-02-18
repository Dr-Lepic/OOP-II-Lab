package Lab9;

public class ServeType extends Item{
    public ServeType(String name, int count, double price){
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
        return count*price;
    }
}
