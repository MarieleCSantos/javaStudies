import java.util.Scanner;

public class exercicioResolvido4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int menor, maior;
        int soma = 0;

        if (x < y){
            menor = x;
            maior = y;
        } else {
            menor = y;
            maior = x;
        }

        for (int i = menor+1; i < maior; i++) {
            if (i % 2 != 0){
                soma += i;
            }
        }

        System.out.print(soma);

        sc.close();
    }
}
