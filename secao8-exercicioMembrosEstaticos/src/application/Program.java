package application;

import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollar = sc.nextDouble();

        double reais = CurrencyConverter.converter(dollarPrice, dollar);
        System.out.printf("Amount to be paid in reais = %.2f ", reais);

        sc.close();
    }
}
