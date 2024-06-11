package enumeracao.exercicios.exercicio01.program;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import enumeracao.exercicios.exercicio01.entities.Department;
import enumeracao.exercicios.exercicio01.entities.HourContract;
import enumeracao.exercicios.exercicio01.entities.Worker;
import enumeracao.exercicios.exercicio01.entities.enums.WorkLevel;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = input.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = input.nextLine();
        System.out.print("Level: ");
        String workerLevel = input.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = input.nextDouble();

        Worker worker = new Worker(workerName, WorkLevel.valueOf(workerLevel), baseSalary,
                new Department(departmentName));

        System.out.print("How name contracts this is worker? ");
        int qtdContracts = input.nextInt();

        for (int i=0; i<qtdContracts; i++) {
            System.out.println("Enter contract # " + (i+1)  + " data: ");
            System.out.print("Date: (DD/MM/YYYY) ");
            LocalDate contractDate = LocalDate.parse(input.next(), dtf); 
            System.out.print("value per hour: ");
            double valuePerHour = input.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = input.nextInt();    
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income: MM/yyyy: ");
        String monthAndYear = input.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3, 7));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f" ,worker.income(year, month)));

        input.close();
    }
}
