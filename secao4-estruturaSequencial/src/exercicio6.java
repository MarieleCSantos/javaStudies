import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da peça 1: ");
        int codigoPeca1 = sc.nextInt();

        System.out.println("Digite o número de peças 1: ");
        int numeroDePecas1 = sc.nextInt();

        System.out.println("Digite o valor unitário da peça 1: ");
        double valorUnitario1 = sc.nextDouble();

        System.out.println("Digite o código da peça 2: ");
        int codigoPeca2 = sc.nextInt();

        System.out.println("Digite o número de peças 2: ");
        int numeroDePecas2 = sc.nextInt();

        System.out.println("Digite o valor unitário da peça 2: ");
        double valorUnitario2 = sc.nextDouble();

        double valorAPagar = numeroDePecas1 * valorUnitario1 + numeroDePecas2 * valorUnitario2;

        System.out.printf("VALOR A PAGAR = R$ %.2f", valorAPagar);

        sc.close();

    }
}
