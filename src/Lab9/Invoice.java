package Lab9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Invoice {
    Order order;

    public Invoice(Order order) {
        this.order = order;
        order.calculate();
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    public abstract void generateInvoice();
}
