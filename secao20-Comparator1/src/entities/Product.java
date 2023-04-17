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
        return "Product [name=" + name + ", price=" + price + "]";
    }
}
