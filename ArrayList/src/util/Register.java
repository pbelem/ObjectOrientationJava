package util;

import service.HourContract;
import entities.Department;
import entities.Worker;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Register {

    static Scanner sc = new Scanner(System.in);

    public static void WorkerRegister() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String departmentName;
        String workerName;
        String workerLevel;
        double workerBaseSalary;
        int contractsNumber;
        double valuePerHour = 0;
        int duration = 0;

        System.out.print("Enter department's name: ");
        departmentName = sc.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        workerName = sc.next();
        System.out.print("Level: ");
        workerLevel = sc.next();
        System.out.print("Base salary: ");
        workerBaseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, String.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        contractsNumber = sc.nextInt();


        for (int I = 1; I <= contractsNumber; I++) {

            System.out.println("Enter contract #" + I + " data:");
            System.out.print("Date (dd/MM/yyyy):");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Value per hour: ");
            valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            duration = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
            worker.addContract(contract);

        }
        System.out.println();
        System.out.print("Enter month and year to calculate income:");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getDepartmentName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

    }


}