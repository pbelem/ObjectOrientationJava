package entities.product;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(String nameProduct, Double priceProduct, Double customsFeeProduct) {
        super(nameProduct, priceProduct);
        this.customsFee = customsFeeProduct;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return getPriceProduct() + getCustomsFee();
    }

    @Override
    public String priceTag() {
        return getNameProduct()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";
    }
}
