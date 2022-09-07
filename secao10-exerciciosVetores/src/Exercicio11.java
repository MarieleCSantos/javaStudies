import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitados? ");
        int n = sc.nextInt();

        char[] gender = new char[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i+1);
            height[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            gender[i] = sc.next().charAt(0);
        }


        double minorHeight = height[0];
        double majorHeight = height[0];
        double sumHeightWomen = 0.0;
        int contWomen = 0;
        int contMen = 0;
        for (int i = 0; i < n; i++) {
            if (minorHeight > height [i]){
                minorHeight = height[i];
            }
            if(majorHeight < height[i]){
                majorHeight = height[i];
            }
            if(gender[i] == 'F'){
                sumHeightWomen += height[i];
                contWomen++;
            } else {
                contMen++;
            }
        }

        System.out.printf("Menor altura = %.2f %n", minorHeight);
        System.out.printf("Maior altura = %.2f %n", majorHeight);
        System.out.printf("Media das alturas das mulheres = %.2f %n", sumHeightWomen/contWomen);
        System.out.printf("Numero de homens = %d %n", contMen);
        sc.close();

    }
}
