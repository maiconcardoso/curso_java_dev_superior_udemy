package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos: ");
        int qtd = input.nextInt();

        double[] numbers = new double[qtd];
        double media = 0.0;
        double sum = 0.0;
        int qtdNumerosPares = 0;

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = input.nextDouble();
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
                qtdNumerosPares++;
            }
        }

        if (qtdNumerosPares != 0) {
            media = sum / qtdNumerosPares;
            System.out.printf("Média dos números pares: %.2f%n", media);
        } else {
            System.out.println("Não há números pares.");
        }
        
        input.close();
    }
}
