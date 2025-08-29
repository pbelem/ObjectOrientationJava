package util;

import entities.product.ImportedProduct;
import entities.product.Product;
import entities.product.UsedProduct;
import lists.ProductList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Read {

    Scanner scanner;

    public Read(Scanner scanner) {
        this.scanner = scanner;
    }

    public ProductList productData() {
        ProductList productList = new ProductList();
        System.out.print("Enter the number of products: ");
        int numProducts = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Product #" + (i + 1) + " data");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Name: ");
            String nameProduct = scanner.nextLine();
            System.out.print("Price: ");
            double priceProduct = Double.parseDouble(scanner.nextLine());

            switch (ch) {
                case 'c':
                    productList.addProduct(new Product(nameProduct, priceProduct));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = Double.parseDouble(scanner.nextLine());
                    productList.addProduct(new ImportedProduct(nameProduct, priceProduct, customsFee));
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate manufactureDate = LocalDate.parse(scanner.nextLine(), formatter);
                    productList.addProduct(new UsedProduct(nameProduct, priceProduct, manufactureDate));
                    break;
                default:
                    System.out.println("Invalid choice");
                    i--;
            }
        }
        return productList;
    }
}