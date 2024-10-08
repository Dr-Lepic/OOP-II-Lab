package Lab5;

import java.util.ArrayList;

public class MakeProduct {
    ArrayList<Product> createdProducts;
    public MakeProduct() {
        createdProducts = new ArrayList<>();
        generateProducts();


    }

    void generateProducts() {
        createdProducts.add(new Electronics("Mouse", 20, 2.00));
        createdProducts.add(new Electronics("Mouse", 10, 3.00));
        createdProducts.add(new Electronics("Keyboard", 50, 2.00));
        createdProducts.add(new Clothing("T-shirt", 10, 1.00));
        createdProducts.add(new Clothing("T-shirt-2", 20, 1.00));
        createdProducts.add(new Clothing("T-shirt-2", 10, 1.00));
        createdProducts.add(new Furniture("Table", 20, 200.00));
        createdProducts.add(new Furniture("Chair", 10, 140.00));
        createdProducts.add(new Furniture("Chair-2", 20, 130.00));
    }

    ArrayList<Product> getCreatedProducts() {
        return createdProducts;
    }
}
