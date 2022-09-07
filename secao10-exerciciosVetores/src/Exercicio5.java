import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
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

        double greaterValue = numbers[0];
        int positionGreaterValue = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers [i] > greaterValue){
                greaterValue = numbers [i];
                positionGreaterValue = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f %n", greaterValue);
        System.out.printf("POSICAO DO MAIOR VALOR = %d", positionGreaterValue);/**/
    }
}
