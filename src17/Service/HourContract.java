package Service;

import Enums.WorkerLevel;
import entities.Department;
import entities.Worker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HourContract {

    private static Scanner sc = new Scanner(System.in);
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void totalValue() {

        String departmentName;
        String name;
        WorkerLevel level;
        double baseSalary;
        int contracts;
        LocalDate date = null;
        double valuePerHour;
        int duration;
        String LocalDate1;
        double valuePerHour1;
        int duration1;
        String monthAndYear;
        String name1;
        String departmentName1;


        System.out.println("Enter department's name: ");
        departmentName = sc.next();
        System.out.println("Enter worker data:");
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Level: ");
        level = WorkerLevel.valueOf(sc.next());
        System.out.println("Base salary: ");
        baseSalary = sc.nextDouble();
        System.out.println("How many contracts to this worker? ");
        contracts = sc.nextInt();
        System.out.println("Enter contract data:");

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
        System.out.println("Date (DD/MM/YYYY): ");
        LocalDate1 = sc.next();
        System.out.println("Value per hour: ");
        valuePerHour1 = sc.nextDouble();
        System.out.println("Duration (hours): ");
        duration1 = sc.nextInt();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        monthAndYear = sc.next();
        System.out.println("name: ");
        name1 = sc.next();
        System.out.println("Department: ");
        departmentName1 = sc.next();

        Worker worker = new Worker(name, level, baseSalary);
        Department department = new Department(departmentName);
    }

}
