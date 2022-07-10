import java.util.Scanner;

public class exercicioResolvido2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int somaIdades = 0;
        int idade = sc.nextInt();

        while (idade >= 0){
            somaIdades += idade;
            contador ++;
            idade = sc.nextInt();
        }

        if(contador > 0){
            double media = (double) somaIdades / contador;
            System.out.printf("%.2f", media);
        } else {
            System.out.println("Impossível calcular");
        }

        sc.close();
    }
}
