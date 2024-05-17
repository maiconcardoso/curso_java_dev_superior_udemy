package estrutura_condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Informe o valor na tela e verifique se é par ou ímpar: ");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Número Par");
        } else {
            System.out.println("Número Ímpar");
        }

        input.close();
    }
}
