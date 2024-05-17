package estrutura_condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Informe na tela o primeiro número: ");
        number1 = input.nextInt();
        System.out.print("Informe na tela o segundo número: ");
        number2 = input.nextInt();

        if (number1 > number2) {
            if (number1 % number2 == 0) {
                System.out.println("São Multiplos");
            } else {
                System.out.println("Não São Multiplos");
            }
        } else {
            if (number2 % number1 == 0) {
                System.out.println("São Multiplos");
            } else {
                System.out.println("Nao São Multiplos");
            }
        }


        input.close();
    }
}
