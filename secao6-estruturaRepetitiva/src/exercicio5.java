import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x;
        int in = 0, out = 0;

        for (int i = 1; i <= N; i++) {
            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in ++;
            } else {
                out ++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
