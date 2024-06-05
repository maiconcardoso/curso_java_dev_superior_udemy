package arrays.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import arrays.entities.Employee;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int quantity = input.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            System.out.println();
            System.out.println("Employee #" + i+1);
            System.out.print("Id: ");
            Integer id = input.nextInt();
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Salary: ");
            Double salary = input.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        Integer id = input.nextInt();
        Integer pos = position(employees, id);
        if (pos == null) {
            System.out.println("This id does not exist!");
        } else  {
            System.out.print("Enter the percentage: ");
            double percentage = input.nextDouble();
            employees.get(pos).increaseSalary(percentage);
        }
        
        System.out.println();
        
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        input.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i=0; i<list.size(); i++) {
            if (id == list.get(i).getId()) {
                return i;
            }
        }
        return null;
    }
}
