import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int entrada = sc.nextInt();

        while (entrada != senha){
            System.out.println("Senha inválida");
            entrada = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
