package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de Pessoas: ");
        int qtd = input.nextInt();

        int[] idades = new int[qtd];
        String[] nomes = new String[qtd];

        int idadePessoaMaisVelha = 0;
        String nomeDaPessoaMaisVelha = "";

        for (int i=0; i<idades.length; i++) {
            System.out.printf("%nDados da %dº pessoa:%n", i+1);
            System.out.print("Nome: ");
            nomes[i] = input.next();
            System.out.print("Idade: ");
            idades[i] = input.nextInt();
            if (idades[i] > idadePessoaMaisVelha) {
                nomeDaPessoaMaisVelha = nomes[i];
                idadePessoaMaisVelha = idades[i];
            }
        }

        System.out.println("Nome da Pessoa mais velha: " + nomeDaPessoaMaisVelha);
        
        input.close();
    }
}
