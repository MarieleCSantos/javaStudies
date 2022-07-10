import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int A = sc.nextInt();

        System.out.println("Digite o primeiro valor: ");
        int B = sc.nextInt();

        System.out.println("Digite o primeiro valor: ");
        int C = sc.nextInt();

        System.out.println("Digite o primeiro valor: ");
        int D = sc.nextInt();

        int diferenca = (A * B - C * D);

        System.out.printf("DIFERENCA = %d", diferenca);

        sc.close();

    }
}
