package programacao_funcional.exercicios.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import programacao_funcional.exercicios.entities.Employee;

public class EmployeeDemo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = input.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> employees = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                Double salary = Double.parseDouble(fields[2]);
                employees.add(new Employee(name, email, salary));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = input.nextDouble();

            List<String> emails = employees.stream()
                .filter(e -> e.getSalary() > salary)
                .map(e -> e.getEmail())
                .sorted()
                .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
            emails.forEach(System.out::println);

            double sum = employees.stream()
                .filter(x -> x.getName().charAt(0) == 'M')
                .map(x -> x.getSalary())
                .reduce(0.0, (x, y) -> x +y);

            System.out.println("Sum of salary from people whose name starts with 'M': " + sum);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}
