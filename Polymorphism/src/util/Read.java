package util;

import entities.employee.Employee;
import entities.employee.OutsourceEmployee;
import lists.EmployeeList;

import java.util.Scanner;

public class Read {

    final static EmployeeList employeeList = new EmployeeList();

    public static void EmployeeData() {
        Scanner input = new Scanner(System.in);

        for (int I = 0, x = 1; I < 1; I++) {
            System.out.println("How many employees?");
            x = Integer.parseInt(input.nextLine());

            for (int II = 0; II < x; II++) {
                System.out.println("Is it an employee(1) or outsourced(2)?");
                int option = Integer.parseInt(input.nextLine());
                System.out.print("Enter the name of the employee : ");
                String name = input.nextLine();
                System.out.println("How many hours?");
                int hours = Integer.parseInt(input.nextLine());
                System.out.println("What is the value per hour?");
                Double perHour = Double.parseDouble(input.nextLine());

                if (option == 1) {
                    Employee employee = new Employee(name, hours, perHour);
                    employeeList.addEmployee(employee);
                } else if (option == 2) {
                    Employee employee = new OutsourceEmployee(name, hours, perHour);
                    employeeList.addEmployee(employee);
                }

            }
        }

    }
}
