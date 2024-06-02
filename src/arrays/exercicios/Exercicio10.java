package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de Alunos: ");
        int qtd = input.nextInt();

        String[] nomes = new String[qtd];
        double[] primeiraNota = new double[qtd];
        double[] segundaNota = new double[qtd];
        double[] media = new double[qtd];
        String[] alunosAprovados = new String[qtd];

        for (int i=0; i<nomes.length; i++) {
            System.out.printf("Digite o nome, a primeira e a segunda nota(1 a 10) do %dº aluno:%n", i+1);
            nomes[i] = input.next();
            primeiraNota[i] = input.nextDouble();
            segundaNota[i] = input.nextDouble();
            media[i] = (primeiraNota[i] + segundaNota[i]) / 2;
            if (media[i] > 6.0) {
                alunosAprovados[i] = nomes[i];
            }
        }
        System.out.println("Lista de Alunos aprovados: ");
        for (int i=0; i<media.length; i++) {
            if (media[i] > 6.0) System.out.println(alunosAprovados[i]);
        }
        
        input.close();
    }
}
