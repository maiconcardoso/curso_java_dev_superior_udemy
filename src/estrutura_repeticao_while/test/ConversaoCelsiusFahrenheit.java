package estrutura_repeticao_while.test;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoCelsiusFahrenheit {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String sair;
        double temperaturaCelsius;
        double temperaturaFahrenheit;
        
        do{
            System.out.println("Informe a temperatura em Celsius: ");
            temperaturaCelsius = input.nextDouble();
            temperaturaFahrenheit = temperaturaCelsius*9.0 / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", temperaturaFahrenheit);
            
            System.out.print("Deseja repetir? (s/n): ");
            sair = input.next();
        }while(!sair.equals("n"));

        
        input.close();
    }
}
