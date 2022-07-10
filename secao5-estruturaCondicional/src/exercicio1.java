import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 0){
            System.out.print("NEGATIVO");
        } else System.out.print("NAO NEGATIVO");

        sc.close();
    }
}
