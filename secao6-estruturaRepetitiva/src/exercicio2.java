import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.print("Q1");
            } else if (x < 0 && y > 0){
                System.out.print("Q2");
            } else if (x < 0){
                System.out.print("Q3");
            } else {
                System.out.print("Q4");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
