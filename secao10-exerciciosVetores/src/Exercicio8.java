import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        int sum = 0;
        int cont = 0;
        double avg = 0.0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                sum += vect[i];
                cont++;
            }
            avg = (double) sum / cont;
        }
        if (sum == 0) {
            System.out.print("NENHUM NÚMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES %.1f", avg);
        }
        sc.close();

    }
}
