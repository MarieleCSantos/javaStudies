package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Enter the width: ");
        rect.width = sc.nextDouble();
        System.out.print("Enter the height: ");
        rect.height = sc.nextDouble();

        System.out.println(rect);


        sc.close();
    }
}
