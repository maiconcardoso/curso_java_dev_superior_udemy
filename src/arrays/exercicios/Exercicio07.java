package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de elementos: ");
        int qtd = input.nextInt();

        double[] vetor = new double[qtd];
        double media = 0;
        double sum = 0;

        for (int i=0; i<vetor.length; i++) {
            vetor[i] = input.nextDouble();
            sum += vetor[i];
        }
        
        media = sum / vetor.length;
        
        System.out.printf("Média Aritmética: %.3f", media);
        System.out.println("\nElementos abaixo da média: ");
        for (int i=0; i<vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }       

        input.close();
    }
}
