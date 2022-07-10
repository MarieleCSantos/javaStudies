import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipoCombustivel = sc.nextInt();
        int alcool = 0, gasolina = 0, diesel = 0;

        while (tipoCombustivel != 4) {
            if (tipoCombustivel == 1){
                alcool ++;
            } else if (tipoCombustivel == 2){
                gasolina ++;
            } else if (tipoCombustivel == 3){
                diesel ++;
            }

            tipoCombustivel = sc.nextInt();
        }

        System.out.println("Muito obrigado");
        System.out.printf("Alcool: %d %nGasolina: %d %nDiesel: %d", alcool, gasolina, diesel);
        sc.close();
    }
}
