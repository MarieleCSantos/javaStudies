import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor1 = sc.nextDouble();
        double valor2 = sc.nextDouble();

        if (valor1 == 0 && valor2 == 0){
            System.out.print("Origem");
        } else if (valor1 == 0){
            System.out.print("Eixo y");
        } else if (valor2 == 0){
            System.out.print("Eixo x");
        } else if (valor1 > 0 && valor2 > 0){
            System.out.print("Q1");
        } else if (valor1 < 0 && valor2 > 0){
            System.out.print("Q2");
        } else if (valor1 < 0 && valor2 < 0){
            System.out.print("Q3");
        } else {
            System.out.print("Q4");
        }

        sc.close();
    }
}
