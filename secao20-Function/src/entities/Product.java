package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private String name;
    private Double price;

    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }

    //    Exemplo de metodo estatico que funciona como function
    public static String staticUpperCaseName (Product p) {
        return p.getName().toUpperCase();
    }

    //    Exemplo de metodo nao estatico que funciona como function
    public String nonStaticUpperCaseName () {
        return name.toUpperCase();
    }
}
