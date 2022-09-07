package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char typeOfPerson = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (typeOfPerson == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                Pessoa pessoa = new PessoaFisica(name, anualIncome, healthExpenditures);
                list.add(pessoa);

            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                Pessoa pessoa = new PessoaJuridica(name, anualIncome, numberOfEmployees);
                list.add(pessoa);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        double totalImposto = 0.0;
        for (Pessoa pessoa : list){
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", pessoa.valorImposto()));
            totalImposto += pessoa.valorImposto();
        }

        System.out.println("TOTAL TAXES: " + String.format("%.2f", totalImposto));

        sc.close();
    }
}
