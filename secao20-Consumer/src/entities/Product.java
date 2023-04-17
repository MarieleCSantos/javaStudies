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

    //    Exemplo de metodo estatico que funciona como consumer
    public static void staticPriceUpdate (Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    //    Exemplo de metodo nao estatico que funciona como consumer
    public void nonStaticPriceUpdate () {
        price = price * 1.1;
    }
}
