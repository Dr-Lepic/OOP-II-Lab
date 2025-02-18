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
        for(Flavour fl: order.flavours){
            builder.append(fl.getName()).append(",").append(fl.getCount()).append(",").append(fl.getPrice()).append(System.lineSeparator());
        }
        for(Toppings tp: order.toppings){
            builder.append(tp.getName()).append(",").append(tp.getCount()).append(",").append(tp.getPrice()).append(System.lineSeparator());
        }

        builder.append("SubTotal,").append("-,").append(order.amount).append(System.lineSeparator());
        builder.append("Tax,").append("-,").append(order.tax).append(System.lineSeparator());
        builder.append("Total Amount due,").append("-,").append(order.totalPrice).append(System.lineSeparator());


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
