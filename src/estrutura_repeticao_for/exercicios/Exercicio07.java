package estrutura_repeticao_for.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); 

        for (int i=1; i<=N; i++) {
            double quadrado = Math.pow(i, 2);
            double cubo = Math.pow(i, 3);
            System.out.printf("%d %.0f %.0f%n", i, quadrado, cubo);
        }
        input.close();
    }
}
