package application;

import entities.account.Account;
import entities.account.BusinessAccount;
import entities.account.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account account = new Account(1001, "Mark", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Bob", 500.0);

//        UPCASTING
        Account acc1 = bacc;
        acc1.getHolder();

        Account acc2 = new BusinessAccount(1003, "John", 200.0);
//        how the businesss account is also an account, this operation is possible

        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

//        DOWNCASTING
//        BusinessAccount businessAccount2 = new Account(1005, "Alex", 0.0);
//        Error by incompatible types

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

//        BusinessAccount acc404 = (BusinessAccount) acc3;
        //not possible when run

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance(200.0);
            System.out.println("Balance after update!");
        } else {
            System.out.println("Savings account is not equal");
        }

//        without override
        Account account1 = new Account(1005, "Jorge", 1000.0);
        account1.withdraw(200.0);
        System.out.println(account1.getBalance());

//        with override
        Account account2 = new SavingsAccount(1006, "Maria", 1000.0, 0.01);
        account2.withdraw(200.0);
        System.out.println(account2.getBalance());

//        reusing super method
        Account account3 = new BusinessAccount(1007, "Pablo", 1000.0, 500.0);
        account3.withdraw(200.0);
        System.out.println(account3.getBalance());

    }

}
