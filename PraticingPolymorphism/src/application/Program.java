package application;

import lists.ProductList;
import util.Read;
import util.Write;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Read reader = new Read(scanner);
        Write write = new Write();

        ProductList productList = reader.productData();
        write.productData(productList);

        scanner.close();
    }
}
