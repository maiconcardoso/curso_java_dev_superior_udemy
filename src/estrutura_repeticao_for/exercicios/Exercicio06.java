package estrutura_repeticao_for.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i=1; i<=n; i++) {
            if (n%i==0) {
                System.out.printf("%d%n", i);
            }
        }
        input.close();
    }
}
