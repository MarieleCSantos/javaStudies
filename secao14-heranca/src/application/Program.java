package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);


        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //Essa vai dar erro pois acc3 é uma SavingsAccount
        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }



        //SOBREPOSIÇAO
        Account acc6 = new Account(1001, "Alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1002, "Anna", 1000.0, 0.03);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        //A PALAVRA SUPER
        Account acc8 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());

        //POLIMORFISMO
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());


        //POLIMORFISMO E CLASSES ABSTRATAS
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

        double sum = 0.0;
        for (Account account : list){
            sum += account.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);


    }
}
