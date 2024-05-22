package estrutura_repeticao_while.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite alguns valores: ");
        int value;
        int count = 0;
        do {
            value = input.nextInt();
            count += value;
        } while(value != 0);
        System.out.printf("A soma dos números digitados: %d%n", count);
        input.close();
    }
}
