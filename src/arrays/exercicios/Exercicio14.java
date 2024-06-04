package arrays.exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas: ");
        int l = input.nextInt();
        System.out.print("Informe a quantidade de colunas: ");
        int c = input.nextInt();

        int[][] matriz = new int[l][c];

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Informe um número contido na matriz: ");
        int numero = input.nextInt();
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numero == matriz[i][j]) {
                    System.out.println("Position: " + i + ", " + j);
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        input.close();
    }
}
