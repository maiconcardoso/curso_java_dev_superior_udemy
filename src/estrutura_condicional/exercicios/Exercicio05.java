package estrutura_condicional.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o código e a quantidade do seu pedido: ");

        int codigo;
        int quantidade;
        double total = 0;

        codigo = input.nextInt();
        quantidade = input.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.00;
        }
        else if (codigo == 2) {
            total = quantidade * 4.50;
        }
        else if (codigo == 3) {
            total = quantidade * 5.00;
        }
        else if (codigo == 4) {
            total = quantidade * 2.00;
        }
        else if (codigo == 5) {
            total = quantidade * 1.50;
        }

        System.out.printf("TOTAL R$ %.2f%n", total);


        input.close();
    }
}
