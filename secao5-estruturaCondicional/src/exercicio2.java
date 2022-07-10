import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        if (A % 2 == 0){
            System.out.print("PAR");
        } else System.out.print("IMPAR");

        sc.close();
    }
}
