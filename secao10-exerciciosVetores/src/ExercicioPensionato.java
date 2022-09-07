import java.util.Locale;
import java.util.Scanner;

public class ExercicioPensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        String[] names = new String[10];
        String[] emails = new String[10];
        int[] room = new int[10];

        String tempName = "";
        String tempEmail = "";
        int tempRoom = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d %n", i+1);
            System.out.print("Name: ");
            sc.nextLine();
            tempName = sc.nextLine();

            System.out.print("Email: ");
            tempEmail = sc.next();

            System.out.print("Room: ");
            tempRoom = sc.nextInt();

            names [tempRoom] = tempName;
            emails [tempRoom] = tempEmail;
            room [tempRoom] = tempRoom;
        }

        System.out.println("Busy rooms: ");

        for (int i = 0; i < 10; i++) {
            if (room [i] != 0) {
                System.out.printf("%d: %s, %s %n", room[i], names[i], emails[i]);
            }
        }

        sc.close();

    }
}
