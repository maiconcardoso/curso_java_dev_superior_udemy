package estrutura_repeticao_for.exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        int in = 0;
        int out = 0;
        System.out.print("Informe a quantidade números impressos: ");
        N = input.nextInt();
        System.out.println("Informe o valores abaixo: ");
        for (int i=0; i<N; i++) {
            int x = input.nextInt();
            if (x >=10 && x <=20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println("IN " + in);
        System.out.println("OUT " + out);
        input.close();
    }

}
