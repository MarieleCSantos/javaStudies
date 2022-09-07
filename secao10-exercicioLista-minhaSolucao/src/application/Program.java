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

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1));

            System.out.print("Id: ");
            int tempId = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String tempName = sc.nextLine();

            System.out.print("Salary: ");
            double tempSalary = sc.nextDouble();

            list.add(new Employee(tempId, tempName, tempSalary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idToIncrease = sc.nextInt();


        double percentage = 0.0;
        boolean hasId = Employee.containsId(list, idToIncrease);
        if (hasId){
            System.out.print("Enter the percentage: ");
            percentage = sc.nextDouble();
            Employee.increaseSalary(list, idToIncrease, percentage);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.printf("%nList of employees: %n");
        for(Employee employee : list){
            System.out.println(employee);
        }


        sc.close();
    }
}
