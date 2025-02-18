package Lab9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVInvoice extends Invoice{
    public CSVInvoice(Order order){
        super(order);
    }

    @Override
    public void generateInvoice() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ingredients, Amount, Price").append(System.lineSeparator());
        for(Item fl: order.flavours){
            builder.append(fl.getName()).append(",").append(fl.getCount()).append(",").append(String.format("%.2f", fl.getPrice())).append(System.lineSeparator());
        }
        for(Item tp: order.toppings){
            builder.append(tp.getName()).append(",").append(tp.getCount()).append(",").append(String.format("%.2f", tp.getPrice())).append(System.lineSeparator());
        }

        builder.append("SubTotal,").append("-,").append(String.format("%.2f",order.amount)).append(System.lineSeparator());
        builder.append("Tax,").append("-,").append(String.format("%.2f",order.tax)).append(System.lineSeparator());
        builder.append("Total Amount due,").append("-,").append(String.format("%.2f",order.totalPrice)).append(System.lineSeparator());


        try{

            BufferedWriter out = new BufferedWriter(new FileWriter("src/Lab9/invoice.CSV"));
            out.write(builder.toString());
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
