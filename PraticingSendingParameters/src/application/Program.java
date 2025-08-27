package application;

import java.util.Locale;
import java.util.Scanner;

import utils.converter.Multiplication;

//src8
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double dollarPrice, dollarValues;

        System.out.println("What is the Dollar price?");
        dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        dollarValues = sc.nextDouble();

        System.out.println("Amount to be paid in reais = " + (Multiplication.currentConverter(dollarPrice, dollarValues)
                + (Multiplication.currentConverter(dollarPrice, dollarValues) * 0.06)));

        sc.close();
    }

}
