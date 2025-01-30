package aplication;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        LocalDateTime ldt = LocalDateTime.now();
        Date date = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());


        String nameClient;
        Date birthDate;
        String Status;
        int itemsQuantity;
        String productName;
        double productPrice;
        int productQuantity;

        System.out.println("Enter client data: ");
        System.out.print("Enter name: ");
        nameClient = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Birth date: (dd/mm/yyyy): ");
        birthDate = sdf.parse(input.next());

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        Status = input.next();
        Order2 order = new Order2(date, String.valueOf(Status), new Client(nameClient, email, birthDate));

        System.out.print("How many items to this order? ");
        itemsQuantity = input.nextInt();
        input.nextLine();
        for (int I = 1; I <= itemsQuantity; I++) {
            System.out.println("Enter item #" + I + ": ");
            System.out.print("Product Name: ");
            productName = input.nextLine();
            System.out.print("Product Price: ");
            productPrice = input.nextDouble();
            input.nextLine();
            System.out.print("Product Quantity: ");
            productQuantity = input.nextInt();
            input.nextLine();

            OrderItem orderItem = new OrderItem(productQuantity, productPrice, new Product2(productName, productPrice));
            order.addItem(orderItem);
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.print(order);


    }
}
