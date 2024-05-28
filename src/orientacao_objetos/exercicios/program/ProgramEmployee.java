package orientacao_objetos.exercicios.program;

import java.util.Locale;
import java.util.Scanner;

import orientacao_objetos.exercicios.entities.Employee;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = input.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = input.nextDouble();
        System.out.print("Tax: ");
        employee.tax = input.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("Which percentage to increase salary: ");
        double percentage = input.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Update data: " + employee);

        input.close();
    }
}
