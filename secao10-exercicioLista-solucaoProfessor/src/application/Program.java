package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Employee #" + (i+1));

            System.out.print("Id: ");
            Integer tempId = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String tempName = sc.nextLine();

            System.out.print("Salary: ");
            Double tempSalary = sc.nextDouble();

            Employee emp = new Employee(tempId, tempName, tempSalary);
            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idToIncrease = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idToIncrease).findFirst().orElse(null);

        //Integer pos = positionId(list, idToIncrease);
        //if (pos == null){
        if (emp == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
            //list.get(pos).increaseSalary(percent);
        }

        System.out.printf("%nList of employees: %n");

        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer positionId(List<Employee> list, int idToIncrease){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == idToIncrease){
                return i;
            }
        }
        return null;
    }

}
