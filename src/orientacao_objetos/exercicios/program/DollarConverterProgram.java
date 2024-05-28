package orientacao_objetos.exercicios.program;

import java.util.Locale;
import java.util.Scanner;

import orientacao_objetos.exercicios.entities.CurrencyConverter;

public class DollarConverterProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the dollar price? ");
        CurrencyConverter.priceDolar = input.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.value = input.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.converter());
        
        input.close();
    }
}
