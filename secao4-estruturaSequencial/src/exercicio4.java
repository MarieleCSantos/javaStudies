import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor que recebe por hora: ");
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d %nSALARY = U$ %.2f", numeroFuncionario, salario);

        sc.close();

    }
}
