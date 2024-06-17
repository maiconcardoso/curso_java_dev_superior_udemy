package heranca_polimorfismo.exercicios.taxs.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_polimorfismo.exercicios.taxs.entities.Company;
import heranca_polimorfismo.exercicios.taxs.entities.Individual;
import heranca_polimorfismo.exercicios.taxs.entities.TaxPayer;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int number = input.nextInt();

        for (int i=0; i<number; i++) {
            System.out.println("Tax payer # " + (i+1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char response = input.next().charAt(0);
            if(response == 'i'){
                input.nextLine();
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Anual income: ");
                Double anualIncome = input.nextDouble();
                System.out.print("Health expenditures: ");
                Double healthExpenditures = input.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                input.nextLine();
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Anual income: ");
                Double anualIncome = input.nextDouble();
                System.out.print("Number Of Imployees: ");
                Integer numberOfImployees = input.nextInt();
                list.add(new Company(name, anualIncome, numberOfImployees));
            }
        }
        System.out.println();
        double sum = 0.0;
        for (TaxPayer taxPayer : list) {
            sum += taxPayer.tax();
            System.out.println(taxPayer);
        }
        System.out.println("Total taxes: $ " + sum);

        input.close();
    }

}
