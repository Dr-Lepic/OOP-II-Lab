package Lab5;

import Lab1.Book;

import java.util.ArrayList;
import java.util.Comparator;

public class OrderManager {
    public ArrayList<Product>products;
    public OrderManager(ArrayList<Product> products) {
        this.products = products;
        products.sort(Comparator.comparing(Product::getTotalPrice).thenComparing(Product::getName).thenComparing(Product::getStock));
    }

    void printOrderedList(){
        for(Product p : products){
            System.out.println(p);
        }
    }
}
