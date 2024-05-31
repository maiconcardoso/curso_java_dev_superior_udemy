package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de números a digitar: ");
        int n = input.nextInt();

        double[] numbers = new double[n];
        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        average = sum / numbers.length;

        System.out.print("NÚMEROS ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSOMA: " + sum);
        System.out.println("MÉDIA: " + average);

        input.close();
    }
}
