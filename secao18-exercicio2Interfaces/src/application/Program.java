package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), dtf);

        System.out.print("Valor do contrato: ");
        double value = sc.nextDouble();

        System.out.print("Entre com o número de parcelas: ");
        int numberOfInstallments = sc.nextInt();

        Contract contract = new Contract(number, date, value);

        ContractService contractService = new ContractService();
        contractService.processContract(contract, numberOfInstallments);

        System.out.println("Parcelas:");

        int i = 0;
        while (i < numberOfInstallments) {
            List<Installment> list = contract.getInstallments();

            System.out.println(list.get(i).toString());

            i++;
        }
    }
}