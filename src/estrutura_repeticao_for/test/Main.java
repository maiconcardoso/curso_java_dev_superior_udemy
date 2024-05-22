package estrutura_repeticao_for.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int soma = 0;
        for (int i=0; i<N; i+=1) {
            int x = input.nextInt();
            soma += x;
        }

        System.out.println("SOMA DOS NÚMEROS: " + soma);

        input.close();
    }
}
