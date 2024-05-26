package estrutura_repeticao_for.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double media = 0;

        int N = input.nextInt();
        for (int i=0; i<N; i++) {

            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            media = (a * 2 + b * 3 + c * 5) / 10;
            System.out.printf("%.1f%n", media);
        }


        input.close();
    }
}
