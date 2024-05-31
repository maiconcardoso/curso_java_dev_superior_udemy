package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
     
        System.out.println("Informe a quantidade de números: ");
        int n = input.nextInt();
        int[] numeros = new int[n];
        int[] numerosNegativos = new int[n];

        for (int i=0; i<numeros.length; i++) {
            numeros[i] = input.nextInt();
            if (numeros[i] < 0) {
                numerosNegativos[i] = numeros[i];
            }
        }
        System.out.println("Números negativos digitados");
        for (int i=0; i<numerosNegativos.length; i++){
            if (numerosNegativos[i] < 0) System.out.println(numerosNegativos[i]);
        }

        input.close();
    }
}
