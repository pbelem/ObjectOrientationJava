package entities;

public class OrderItem {

    Integer quantity;
    double price;

    Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItem(int productQuantity, double productPrice, Product product) {
        this.quantity = productQuantity;
        this.price = productPrice;
        this.product = product;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double subTotal() {
        return price * quantity;
    }
}