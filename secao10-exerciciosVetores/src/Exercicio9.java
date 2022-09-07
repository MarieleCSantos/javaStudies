import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Dados da %da pessoa: %n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maiorIdade = idades[0];
        int posicaoMaior = 0;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades [i];
                posicaoMaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", nomes[posicaoMaior]);


        sc.close();

    }
}
