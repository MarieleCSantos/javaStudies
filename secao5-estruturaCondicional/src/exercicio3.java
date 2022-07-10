import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.print("Sao multiplos");
        } else System.out.print("Nao sao multiplos");

        sc.close();
    }
}
