package application;

import util.Operation;

import java.util.Locale;

//src10, 11 and 12
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Operation.Register();

        Operation.manageAccount();

    }

}