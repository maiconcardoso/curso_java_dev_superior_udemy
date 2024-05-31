package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade de números: ");
        int quantidade = input.nextInt();

        int[] numeros = new int[quantidade];
        int[] pares = new int[quantidade];
        int[] impares = new int[quantidade];
        int somaPares = 0;

        for (int i=0; i<numeros.length; i++) {
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[i] = numeros[i];
                somaPares++;
            } else {
                impares[i] = numeros[i];
            }
        }

        System.out.println("Números Pares: ");
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(pares[i] + " ");
            }
        }
        System.out.println("\nQuantidade de Pares: " + somaPares);
        input.close();
    }
}
