package estrutura_sequencial.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B, C, D;
        int diferenca;
        System.out.println("Informe os quatro valores: ");
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("A diferença do produto de A e B pelo produto de C e D: é " + diferenca);

        input.close();


    }
}
