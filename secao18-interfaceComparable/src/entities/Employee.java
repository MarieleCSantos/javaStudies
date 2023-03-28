package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Employee implements Comparable<Employee>{

    private String name;
    private Double salary;

    @Override
    public int compareTo(Employee other) {
        return salary.compareTo(other.getSalary());
    }
}
