package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Account account;
		
		System.out.print("Enter account number:");
		int number = sc.nextInt();
		System.out.print("Enter account holder:");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit:");
		char response = sc.next().charAt(0);
		if (response == 'y' || response == 'Y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value");
		Double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value");
		Double withdrawValue = sc.nextDouble();
		account.withDrawn(withdrawValue);
		System.out.println("Updated account data");
		System.out.println(account);
		
		sc.close();
	}

}
