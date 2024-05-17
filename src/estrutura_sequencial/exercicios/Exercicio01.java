package estrutura_sequencial.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value1;
        int value2;
        int sum;

        System.out.println("Informe o primeiro valor: ");
        value1 = input.nextInt();
        System.out.println("Informe o segundo valor: ");
        value2 = input.nextInt();

        sum = value1 + value2;

        System.out.printf("A soma dos números digitados é: %d%n", sum);

        input.close();
    }

}
