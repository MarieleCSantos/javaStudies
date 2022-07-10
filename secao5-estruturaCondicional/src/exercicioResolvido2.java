import java.util.Locale;
import java.util.Scanner;

public class exercicioResolvido2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double A = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double B = sc.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double C = sc.nextDouble();

        double delta = Math.pow(B, 2) - 4 * A * C;

        if (delta < 0.0 || A == 0){
            System.out.println("Impossível calcular");
        } else {
            double r1 = (- B + Math.sqrt(delta)) / (2 * A);
            double r2 = (- B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f %nR2 = %.5f", r1, r2);
        }
    }
}
