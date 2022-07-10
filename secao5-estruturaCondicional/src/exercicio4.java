import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicial >= horaFinal){
            duracao = 24 - horaInicial + horaFinal;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        } else {
            duracao = horaFinal - horaInicial;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        }
        sc.close();
    }
}
