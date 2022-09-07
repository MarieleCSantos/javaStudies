import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double [] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++){
            System.out.printf("%.1f ", vect[i]);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++){
            sum += vect[i];
        }
        System.out.printf("%nSOMA = %.2f %n", sum);

        double avg = sum / vect.length;

        System.out.printf("MEDIA = %.2f %n", avg);


        sc.close();
    }
}
