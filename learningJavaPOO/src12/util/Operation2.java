package util;

import java.util.Scanner;

import entities.Accounts;

public class Operation2 {

	private static Scanner sc = new Scanner(System.in);
	private static final Double TAX = 5.0;
	private static Accounts acc;

	public static void Register() {

		Double currentAccountValue = 0.0;
		int accountNum;
		String accountHolder;
		char verific;

		System.out.println("Enter account number: ");
		accountNum = sc.nextInt();
		System.out.println("Enter the account holder: ");
		sc.nextLine();
		accountHolder = sc.nextLine();
		System.out.println("Is there an initial deposit?\ntype yes or not");
		verific = sc.next().charAt(0);
		if (verific == 'y' || verific == 'Y') {
			System.out.println("Enter the inital deposit value: ");
			currentAccountValue = sc.nextDouble();
		}

		acc = new Accounts(accountNum, accountHolder, currentAccountValue);

		System.out.println("Account registered successfully");

	}

	public static void manageAccount() {
		char verific;

		if (acc == null) {
			System.out.println("No account registered. Please register an account first.");
			return;
		}

		for (boolean y = true; y;) {

			for (boolean x = true; x;) {
				Double newValue, currentAccountValue = acc.getCurrentValue();
				String newName;
				System.out.println(
						"Which operation do you need?\n(1)Current Balance\n(2)Deposit value\n(3)Withdraw value\n(4)Change account holder name\n(5)Exit");
				int ope = sc.nextInt();
				switch (ope) {
				case 1:
					System.out.print(acc);
					x = false;
					break;
				case 2:
					System.out.println("Amount to deposit into the account");
					newValue = sc.nextDouble();
					currentAccountValue = depositAccount(currentAccountValue, newValue);
					acc.setCurrentValue(currentAccountValue);
					System.out.print("Updated " + acc);
					x = false;
					break;
				case 3:
					System.out.println("Ammount to withdraw from the account: ");
					newValue = sc.nextDouble();
					if (currentAccountValue - newValue >= 0) {
						currentAccountValue = withDrawAccount(currentAccountValue, newValue);
						acc.setCurrentValue(currentAccountValue);
						System.out.print("Updated " + acc);
						x = false;
					} else if (currentAccountValue - newValue < 0) {
						System.out.print("Insufficient balance, canceling operation\n" + acc);
					}
					break;
				case 4:
					System.out.println("What the new name?");
					sc.nextLine();
					newName = sc.nextLine();
					acc.setNameAccount(newName);
					System.out.print("Updated " + acc);
					x = false;
					break;
				case 5:
					x = false;
					y = false;
					break;
				default:
					System.out.print("Invalid operation, try again\n");
				}
			}
			if (y == true) {
				System.out.println("\nDid you need one more operation?\ntype yes or not");
				verific = sc.next().charAt(0);
				if (verific == 'n' || verific == 'N') {
					y = false;

				}
			}
		}
		System.out.print("Thank you for your preference");
		sc.close();
	}

	public static Double depositAccount(Double x, Double y) {
		x += y;
		return x;
	}

	public static Double withDrawAccount(Double x, Double y) {
		x = x - y - TAX;
		return x;
	}

}