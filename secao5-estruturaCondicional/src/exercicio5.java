import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double valor;

        if (codigo == 1){
            valor = quantidade * 4.00;
            System.out.printf("Total: R$ %.2f", valor);
        } else if (codigo == 2){
            valor = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f", valor);
        } else if (codigo == 3){
            valor = quantidade * 5.00;
            System.out.printf("Total: R$ %.2f", valor);
        } else if (codigo == 4){
            valor = quantidade * 2.50;
            System.out.printf("Total: R$ %.2f", valor);
        } else if (codigo == 5){
            valor = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f", valor);
        }
        sc.close();
    }
}
