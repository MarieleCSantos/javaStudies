import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();
        int [] numbers = new int[n];

        for (int i=0; i< numbers.length; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        int amountEven = 0;
        System.out.println("NUMEROS PARES: ");
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] %2 == 0){
                System.out.printf("%d  ", numbers[i]);
                amountEven ++;
            }
        }

        System.out.printf("%nQUANTIDADE DE PARES = %d", amountEven);



        sc.close();
    }
}
