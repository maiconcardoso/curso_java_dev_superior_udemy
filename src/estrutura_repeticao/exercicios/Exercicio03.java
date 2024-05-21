package estrutura_repeticao.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int valor = 0;

        while (valor != 4) {
            valor = input.nextInt();
            if (valor == 1) {
                alcool += 1;
            } else if (valor == 2) {
                gasolina += 1;
            } else if (valor == 3) {
                diesel += 1;
            } 
        }
        System.out.println("Muito Obrigado");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        input.close();
    }
}
