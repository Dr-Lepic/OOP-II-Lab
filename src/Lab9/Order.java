package Lab9;

import java.util.ArrayList;

public class Order {
    ArrayList<Item> flavours;
    ArrayList<Item> toppings;
    Item serveType;
    double amount;
    double tax;
    double totalPrice;


    public Order() {
        flavours = new ArrayList<>();
        toppings = new ArrayList<>();
        serveType = null;
        amount = 0;
        tax = 0;
    }

    public void addFlavour(Flavour flavour) {
        flavours.add(flavour);
    }
    public void addTopping(Toppings topping) {
        toppings.add(topping);
    }
    public void setServeType(ServeType serveType) {
        this.serveType = serveType;
    }
    void calculateAmount() {
        // if(amount > 0){return;}
        for (Item flavour : flavours) {
            amount += flavour.getCost();
        }
        for (Item topping : toppings) {
            amount += topping.getCost();
        }
        amount += serveType.getCost();
    }
    public void calculateTax() {
        tax = amount* 0.08;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public double getTax(){
        return tax;
    }

    public double getAmount(){
        return amount;
    }

    public void calculate(){
        calculateAmount();
        calculateTax();
        totalPrice = amount + tax;
    }

    public void checkOut(){
        InvoiceFactory invoiceFactory = new InvoiceFactory();
        invoiceFactory.getInvoice(this);
    }


}
