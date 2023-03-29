package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Circle implements Shape{

    private double radius;

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

}
