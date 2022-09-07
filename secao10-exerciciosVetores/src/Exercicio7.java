import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        double avg = sum / numbers.length;

        System.out.printf("MEDIA DO VETOR = %.3f %n" , avg);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < numbers.length; i++){
            if (numbers [i] < avg){
                System.out.println(numbers[i]);
            }
        }

    }
}
