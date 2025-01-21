package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.SalaryService;
import service.BrazilTaxService;
import service.PensionService;
import service.TaxService;

//injeção de dependencias

public class Program6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary);
		
		TaxService taxService = new BrazilTaxService();
		PensionService pensionService = new PensionService();
		SalaryService salaryService = new SalaryService(taxService, pensionService);
		
		double netSalary = salaryService.netSalary(employee);
		System.out.printf("Net salary + %.2f%n", netSalary);

		
		
		
		
	}

}
