package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe quantos elemento terão cada vetor: ");
        int qtd = input.nextInt();

        double[] A = new double[qtd];
        double[] B = new double[A.length];
        double[] C = new double[A.length];

        System.out.println("Digite os valores do vetor A: ");
        for (int i=0; i<A.length; i++) {
            A[i] = input.nextDouble();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i=0; i<B.length; i++) {
            B[i] = input.nextDouble();
        }

        System.out.println("Vetor Resultante: ");
        for (int i=0; i<C.length; i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }

        input.close();
    }
}
