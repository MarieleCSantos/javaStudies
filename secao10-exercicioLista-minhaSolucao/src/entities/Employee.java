package entities;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salario;

    public Employee(int id, String name, double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static boolean containsId(List<Employee> list, int id) {
        for (Employee employee : list) {
            if (employee.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void increaseSalary(List<Employee> list, int idToIncrease, double percentage){
        for (Employee employee : list) {
            if (employee.getId() == idToIncrease) {
                employee.setSalario(employee.salario * (1 + (percentage/100)));
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", id, name, salario);
    }
}
