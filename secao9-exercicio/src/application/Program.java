package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;
        double amount;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char hasInitialDeposit = sc.next().charAt(0);


        if (hasInitialDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            amount = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, amount);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.print(account);
        System.out.println();
        System.out.println();
        System.out.print("Enter a deposit value: ");
        amount = sc.nextDouble();
        account.depositing(amount);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdrawing(amount);

        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
