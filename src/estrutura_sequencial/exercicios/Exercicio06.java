package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double  A, B,C;
        double areaTrianguloRetangulo, areaDoCirculo, areaDoTrapezio, areaDoQuadrado, areaDoRetangulo;

        System.out.println("Informe o valores abaixo: ");
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        areaTrianguloRetangulo = (A * C) / 2;
        areaDoCirculo = 3.14159 * Math.pow(C, 2);
        areaDoTrapezio = ((A + B) * C) / 2;
        areaDoQuadrado = Math.pow(B, 2);
        areaDoRetangulo = A * B;

        System.out.printf("Área do Triângulo Retângulo %.3f%n", areaTrianguloRetangulo);
        System.out.printf("Área do Círculo %.3f%n", areaDoCirculo);
        System.out.printf("Área do Trapézio %.3f%n", areaDoTrapezio);
        System.out.printf("Área do Quadrado %.3f%n", areaDoQuadrado);
        System.out.printf("Área do Retângulo %.3f%n", areaDoRetangulo);

        input.close();
    }
}
