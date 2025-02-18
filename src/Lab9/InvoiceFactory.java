package Lab9;

import java.util.Scanner;

public class InvoiceFactory {

    public void getInvoice(Order order){
        System.out.println("1. CSV Invoice");
        System.out.println("2. Text Invoice");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Invoice invoice = new CSVInvoice(order);
                invoice.generateInvoice();
                System.out.println("Invoice Generated Successfully");
                break;
            case 2:
                Invoice invoiceText = new TextInvoice(order);
                invoiceText.generateInvoice();
                System.out.println("Invoice Generated Successfully");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }


    }
}
