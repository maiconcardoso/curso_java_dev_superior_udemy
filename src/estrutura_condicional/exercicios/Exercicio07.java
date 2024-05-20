package estrutura_condicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double y;
        double x;
        
        System.out.print("Informe o valores das coordenadas x e y: ");

        x = input.nextDouble();
        y = input.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x == 0 && y == 0) {
            System.out.println("Origem");
        }

        input.close();
    }
}
