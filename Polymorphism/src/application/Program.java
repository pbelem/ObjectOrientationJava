package application;

import lists.EmployeeList;
import util.Read;
import util.Write;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Read reader = new Read(scanner);
        Write writer = new Write();

        EmployeeList employeeList = reader.readEmployeeData();

        writer.writeEmployeeData(employeeList);

        scanner.close();
    }
}