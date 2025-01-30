package entities;

public class Product2 {

    String nameProduct;
    double price;

    Product2 product;

    public Product2() {
    }

    public Product2(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public Product2 getProduct() {
        return product;
    }

    public void setProduct(Product2 product) {
        this.product = product;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
