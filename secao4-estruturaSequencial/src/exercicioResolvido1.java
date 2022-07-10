import java.util.Locale;
import java.util.Scanner;

public class exercicioResolvido1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.println("Digite o valor do metro quadrado: ");
        double valorMetroQuadrado = sc.nextDouble();

        double areaTerreno = largura * comprimento;
        double precoTerreno = areaTerreno * valorMetroQuadrado;

        System.out.printf("AREA = %.2f %nPRECO =  %.2f", areaTerreno, precoTerreno);

        sc.close();

    }
}
