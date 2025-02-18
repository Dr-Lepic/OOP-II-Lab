package Lab9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextInvoice extends Invoice{
    public TextInvoice(Order order){
        super(order);
    }

    @Override
    public void generateInvoice() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ice Cream Shop Invoice").append(System.lineSeparator());
        for(Item fl: order.flavours){
            builder.append(fl.getName()).append(" - ").append(fl.getCount()).append(" Scoop: $").append(fl.getPrice()).append(System.lineSeparator());
        }
        for(Item tp: order.toppings){
            builder.append(tp.getName()).append(" - ").append(tp.getCount()).append(" Times: $").append(tp.getPrice()).append(System.lineSeparator());
        }

        builder.append("SubTotal: $").append(order.amount).append(System.lineSeparator());
        builder.append("Tax : $").append(order.tax).append(System.lineSeparator());
        builder.append("Total Amount due: $").append(order.totalPrice).append(System.lineSeparator());


        try{

            BufferedWriter out = new BufferedWriter(new FileWriter("src/Lab9/invoice.txt"));
            out.write(builder.toString());
            out.flush();
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
