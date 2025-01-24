package util;

import enums.WorkerLevel;
import service.HourContract;
import entities.Department;
import entities.Worker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Register {

    static Scanner sc = new Scanner(System.in);
    static Department department;
    static Worker worker;
    static HourContract contract;

    public static void Department() {

        String departmentName;

        System.out.println("Enter department data:");
        System.out.println("Enter department's name: ");
        departmentName = sc.next();

        department = new Department(departmentName);

    }

    public static void Worker() {

        String name;
        WorkerLevel level;
        double baseSalary;


        System.out.println("Enter worker data:");
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Level: ");
        level = WorkerLevel.valueOf(sc.next());
        System.out.println("Base salary: ");
        baseSalary = sc.nextDouble();

        worker = new Worker(name, level, baseSalary);


    }


    public static void Contract() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        int contractsNumber;
        LocalDate date = null;
        double valuePerHour = 0;
        int duration = 0;

        System.out.println("How many contractsNumber to this worker? ");
        contractsNumber = sc.nextInt();

        int i = 0;
        while (i < contractsNumber) {

            System.out.println("Enter contract #" + contractsNumber + " data:");

            while (date == null) {
                System.out.println("Enter contract date: (DD/MM/YYYY): ");
                String dateString = sc.next();

                try {
                    date = LocalDate.parse(dateString, dtf);
                } catch (Exception e) {
                    System.out.println("Invalid date format. Please try again.");
                }
            }

            System.out.println("Value per hour: ");
            valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            duration = sc.nextInt();

            contract = new HourContract(date, valuePerHour, duration);
            worker.addContract(contract);

            i++;
        }

    }

}