package estrutura_repeticao_while.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;

        x = input.nextInt();
        y = input.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segunda");
            }
            x = input.nextInt();
            y = input.nextInt();
        }

        input.close();
    }
}
