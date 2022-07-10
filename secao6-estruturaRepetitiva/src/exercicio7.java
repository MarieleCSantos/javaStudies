import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x, y;

        for (int i = 1; i <= N; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            if (y != 0){
                double divisao = (double) x / y;
                System.out.printf("%.1f %n", divisao);
            } else {
                System.out.println("divisao impossivel");
            }

        }

        sc.close();
    }
}
