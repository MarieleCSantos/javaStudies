import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double x, y, z, media = 0;

        for (int i = 1; i <= N; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            media = ((2 * x) + (y * 3) + (z * 5))/10;

            System.out.printf("%.1f %n", media);
        }

        sc.close();
    }
}
