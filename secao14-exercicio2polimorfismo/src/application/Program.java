package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported? (c/u/i)? ");
            char typeProduct = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (typeProduct == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            } else if (typeProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String stringDate = sc.next();
                Date date = sdf.parse(stringDate);

                Product product = new UsedProduct(name, price, date);
                list.add(product);
            } else {
                Product product = new Product(name, price);
                list.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : list){
            System.out.println(product.priceTag());
        }


        sc.close();
    }
}
