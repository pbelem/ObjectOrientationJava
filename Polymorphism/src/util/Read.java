package util;

import entities.employee.Employee;
import entities.employee.OutsourceEmployee;
import lists.EmployeeList;

import java.util.Scanner;

public class Read {

    private final Scanner input;

    public Read(Scanner input) {
        this.input = input;
    }

    public EmployeeList readEmployeeData() {
        EmployeeList employeeList = new EmployeeList();

        System.out.print("Enter the number of employees: ");
        int x = Integer.parseInt(input.nextLine());

        for (int i = 0; i < x; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Is it an employee(1) or outsourced(2)? ");
            int option = Integer.parseInt(input.nextLine());

            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Hours: ");
            int hours = Integer.parseInt(input.nextLine());
            System.out.print("Value per hour: ");
            double perHour = Double.parseDouble(input.nextLine());

            if (option == 1) {
                Employee employee = new Employee(name, hours, perHour);
                employeeList.addEmployee(employee);
            } else if (option == 2) {
                System.out.print("Additional Charge: ");
                double additionalCharge = Double.parseDouble(input.nextLine());
                Employee employee = new OutsourceEmployee(name, hours, perHour, additionalCharge);
                employeeList.addEmployee(employee);
            } else {
                System.out.println("Invalid option. Please re-enter data for this employee.");
                i--;
            }
        }
        return employeeList;
    }
}