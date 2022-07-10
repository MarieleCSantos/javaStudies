import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double A = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double B = sc.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double C = sc.nextDouble();

        double triangulo = A * C / 2;
        double circulo = 3.14159 * Math.pow(C, 2);
        double trapezio = (A + B) * C / 2;
        double quadrado = Math.pow(B, 2);
        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f %nCIRCULO: %.3f %nTRAPEZIO: %.3f %nQUADRADO: %.3f %nRETANGULO: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);

        sc.close();

    }
}
