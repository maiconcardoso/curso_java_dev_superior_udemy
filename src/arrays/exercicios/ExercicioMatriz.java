package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of rows and colums: ");
        int n = input.nextInt();

        int[][] mat = new int[n][n];

        System.out.println();
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = input.nextInt();
            }
        }

        System.out.print("Diagonal main: " );

        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        int count = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }   

        System.out.println("Negative Numbers: " + count);

        input.close();
    }
}
