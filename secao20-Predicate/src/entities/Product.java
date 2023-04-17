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

//    Exemplo de metodo estatico que funciona como predicado
    public static boolean staticProductPredicate (Product p) {
        return p.getPrice() >= 100.0;
    }

    //    Exemplo de nao metodo estatico que funciona como predicado
    public boolean nonStaticProductPredicate () {
        return price >= 100.0;
    }

    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
