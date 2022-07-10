import java.util.Locale;
import java.util.Scanner;

public class exercicioResolvido1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        double nota = n1 + n2;
        System.out.printf("NOTA FINAL = %.1f %n", nota);

        if (nota < 60.00)
            System.out.println("REPROVADO");
    }
}
