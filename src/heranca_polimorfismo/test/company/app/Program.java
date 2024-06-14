package heranca_polimorfismo.test.company.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_polimorfismo.test.company.entities.Employee;
import heranca_polimorfismo.test.company.entities.OutsourceEmployee;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of employees: ");
        int numbersOfEmployees = input.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i=1; i<=numbersOfEmployees; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced? (y/n): ");
            char response = input.next().charAt(0);

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Hours: ");
            Integer hours = input.nextInt();
            System.out.print("Value Per Hour: ");
            Double valuePerHour = input.nextDouble();

            if (response == 'y') {
                System.out.print("Additional Charge: ");
                Double additionalCharge = input.nextDouble();
                OutsourceEmployee employee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
        }
        
        System.out.println();
        for (Employee emp: employees) {
            System.out.println(emp.getName() + ", $ " + String.format("%.2f", emp.payment()));
        }
        input.close();
    }
}
