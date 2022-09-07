import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String [] name = new String[n];
        int [] age = new int[n];
        double [] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            name [i] = sc.next();
            System.out.print("Idade: ");
            age [i] = sc.nextInt();
            System.out.print("Altura: ");
            height [i] = sc.nextDouble();
        }

        double sum = 0.0;
        int minor16 = 0;
        for (int i = 0; i < n; i++){
            if(age[i] < 16){
                minor16 ++;
            }
            sum += height[i];
        }

        double avg = sum / n;
        System.out.printf("%nAltura media: %.2f %n", avg);

        double percentage = (double) minor16 * 100 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percentage);

        for (int i = 0; i < n; i++){
            if(age[i] < 16){
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}
