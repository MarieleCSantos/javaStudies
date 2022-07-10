import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fatorial = 1;
        int numeroDeExecucoes = N - 1;

        if (N != 0){
            for (int i = 1; i <= numeroDeExecucoes; i++) {
                fatorial *= N;
                N--;
            }
        }

        System.out.println(fatorial);

        sc.close();
    }
}
