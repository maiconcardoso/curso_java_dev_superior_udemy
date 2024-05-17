package estrutura_condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.println("Informe a hora inicial do jogo: ");
        horaInicial = input.nextInt();
        System.out.println("Informe a hora final do jogo: ");
        horaFinal = input.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORAS");

        input.close();
    }
}
