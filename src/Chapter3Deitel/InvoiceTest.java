package Chapter3Deitel;

import sun.applet.Main;

public class InvoiceTest {

    public static void main(String[] args){

        Invoice invoice = new Invoice("34" ,"roasted yam",34,3.44);
        System.out.printf("%s%n%s%n $%d%n %.2f%n", invoice.getPartDescription(),invoice.getPartNumber(),invoice.getQuantityPurchased(),invoice.getPricePerItem());

        System.out.print("enter part value");
        System.out.println();

        System.out.println(invoice.getInvoiceAmount());

    }
}
