package estrutura_repeticao_for.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i=0; i<n; i++) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            
            if (b == 0) {
                System.out.print("Divisão impossível%n");
            }
            else {
                System.out.println(a / b);
            }   
        }
        input.close();
    }
}
