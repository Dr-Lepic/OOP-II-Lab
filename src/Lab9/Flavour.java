package Lab9;

public class Flavour extends Item {

    public Flavour(String name, int count, double price) {
        super(name, count, price);
    }

    public int getCount(){
        return count;
    }
    public double getPrice(){
        return price;
    }

    public double getCost(){
        return price * count;
    }

    public String getName() {
        return name;
    }
}
