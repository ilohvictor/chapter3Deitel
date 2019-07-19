package Chapter3Deitel;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double pricePerItem;
    private double invoiceAmount;;

    public Invoice (String partNumber, String partDescription , int quantityPurchased, double pricePerItem){

        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if(pricePerItem > 0)
        this.pricePerItem = pricePerItem;

        if(quantityPurchased > 0.0)
        this.quantityPurchased = quantityPurchased;

    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public String getPartNumber(){
        return partNumber;
    }
    public void setPartDescription(String partDescription){
        this.partDescription= partDescription;
    }
    public String getPartDescription(){
        return partDescription;
    }
    public void setQuantityPurchased(int quantityPurchased){
        this.quantityPurchased = quantityPurchased;
    }
    public int getQuantityPurchased(){
        return quantityPurchased;
    }
    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }

    public double invoiceAmount(){
        this.invoiceAmount = pricePerItem * quantityPurchased;
        return invoiceAmount;
    }
    public double getInvoiceAmount(){
        return invoiceAmount();
    }
}
