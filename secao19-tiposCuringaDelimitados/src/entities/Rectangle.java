package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Rectangle implements Shape {

    private double width;
    private double height;

    @Override
    public double area() {
        return width * height;
    }
}
