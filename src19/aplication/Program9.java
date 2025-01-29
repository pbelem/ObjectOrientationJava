package aplication;

import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nameClient;
        String birthDate;
        String Status;
        int itemsQuantity;
        String productName;
        double productPrice;
        int productQuantity;

        System.out.println("Enter client data: ");
        nameClient = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Birth date: (dd/mm/yyyy): ");
        birthDate = input.nextLine();


        System.out.println("Enter order data: ");
        System.out.print("Product Name: ");
        productName = input.nextLine();
        System.out.print("Product Price: ");
        productPrice = input.nextDouble();
        System.out.print("Product Quantity: ");
        productQuantity = input.nextInt();


    }
}
