package estrutura_condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Informe um valor na tela: ");
        number = input.nextInt();
        if (number > 0) {
           System.out.println("Número Positivo");
        } else {
            System.out.println("Número Negativo");
        }

        input.close();
    }
}
