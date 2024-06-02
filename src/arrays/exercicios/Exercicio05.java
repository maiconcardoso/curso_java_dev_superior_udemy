package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Informe quantos números irá digitar: ");
        int number = input.nextInt();

        double[] numbers = new double[number];
        double maiorNumero = 0;
        int position = -1;
        for (int i=0; i<numbers.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            numbers[i] = input.nextDouble();
            if (numbers[i] > maiorNumero) {
                maiorNumero = numbers[i];
                position = i;
            }
        }

        System.out.println("\nMaior número: " + maiorNumero);
        System.out.println("Posição do maior número: " + position);

        input.close();
    }
}
