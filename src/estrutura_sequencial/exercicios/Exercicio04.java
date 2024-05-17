package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        
        int number;
        double workedHours;
        double valueForWorkedHour;
        double salary;
        
        System.out.println("Informe o número do funcionário: ");
        number = input.nextInt();
        System.out.println("Informe o quantidade de horas trabalhadas: ");
        workedHours = input.nextDouble();
        System.out.println("Informe o valor por horas trabalhadas: ");
        valueForWorkedHour = input.nextDouble();

        salary = workedHours * valueForWorkedHour;

        System.out.println("Number: " + number);
        System.out.printf("Salary: U$ %.3f%n", salary);

        input.close();
    }
}
