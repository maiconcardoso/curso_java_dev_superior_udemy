package interfaces.exercicios.compare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfaces.exercicios.compare.entities.Employee;


public class Program {

    public static void main(String[] args) {
        
        List<Employee> list = new ArrayList<>();
        String path = "/home/maicon-cardoso/Documentos/in.txt";

        try (BufferedReader buffer = new BufferedReader(new FileReader(path))) {

            String employeeCsv = buffer.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                String name = fields[0];
                double salary = Double.parseDouble(fields[1]);
                list.add(new Employee(name, salary));

                employeeCsv = buffer.readLine();
            }

            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
            
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
