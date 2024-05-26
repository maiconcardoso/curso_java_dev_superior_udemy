package estrutura_repeticao_for.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int fatorial = 1;

        for (int i=1; i<=n; i++) {
            fatorial =  fatorial * i;
        }
        System.out.printf("%d%n", fatorial);
        input.close();
    }
}
