package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de pessoas: ");
        int n = input.nextInt();

        String[] name = new String[3];
        int[] age = new int[n];
        double[] height = new double[n];
        double sumHeight = 0.0; 
        double averageHeight = 0.0;
        double percentUnderAge;
        int sum = 0;


        int[] pessoas = new int[n];
        String[] nomeDasPessoas = new String[n];

        for (int i=0; i<pessoas.length; i++) {
            System.out.printf("Dados da %dº pessoa: %n", i+1);
            System.out.print("Nome: ");
            name[i] = input.next();
            System.out.print("Idade: ");
            age[i] = input.nextInt();
            System.out.print("Altura: ");
            height[i] = input.nextDouble();

            sumHeight += height[i];

            if (age[i] < 16) {
                sum++;
                nomeDasPessoas[i] = name[i];
            }
        }
        averageHeight = sumHeight / pessoas.length;
        percentUnderAge = (sum * 100) / pessoas.length;
        System.out.println("Altura média: " + String.format("%.2f", averageHeight));
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percentUnderAge) + "%");
        
        for (int i=0; i<pessoas.length; i++) {
            if (age[i] < 16)
            System.out.println(nomeDasPessoas[i]);
        }

        input.close();
    }
}
