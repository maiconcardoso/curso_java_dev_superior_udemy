package estrutura_repeticao_for.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Forneça um valor: ");
        int X = input.nextInt();
        if (X >=1 || X <=1000) {
            for (int i=0; i<=X; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Por Favor digite um valor entre 1 a 1000");
        }

        input.close();
    }
}
