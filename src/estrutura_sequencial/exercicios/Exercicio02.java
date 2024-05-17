package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        double raio;
        double area;
        final double PI = 3.14159;


        System.out.print("Informe o valor do raio do circulo: ");
        raio = input.nextDouble();

        area = PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é: %.3f%n", area);

        input.close();
    }

}
