package lists;

import entities.product.Product;

import java.util.ArrayList;

public class ProductList {

    private final ArrayList<Product> products =  new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

    }
}
