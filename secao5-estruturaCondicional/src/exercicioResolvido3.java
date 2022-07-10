import java.util.Locale;
import java.util.Scanner;

public class exercicioResolvido3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 < num2 && num1 < num3){
            System.out.printf("MENOR = %d", num1);
        } else if (num2 < num3){
            System.out.printf("MENOR = %d", num2);
        } else System.out.printf("MENOR = %d", num3);
    }
}
