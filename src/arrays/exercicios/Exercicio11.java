package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        int qtd = input.nextInt();

        char[] genero = new char[qtd];
        double[] altura = new double[qtd];
        double mediaAlturaDasMulhers = 0;
        double menorAltura = 4.00;
        double maiorAltura = 0;
        int numeroDeHomens = 0;
        int numeroDeMulheres = 0;
        double somaDasAlturasDasMulhers = 0;

        for (int i=0; i<altura.length; i++) {
            System.out.printf("Altura da %dº pessoa:%n", i+1);
            altura[i] = input.nextDouble();
            System.out.printf("Gênero da %dº pessoa:%n", i+1);
            genero[i] = input.next().charAt(0);
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            } else if(altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
            if (genero[i] == 'M') {
                numeroDeHomens++; 
            }
        }
        for (int i=0; i<altura.length; i++) {
            if (genero[i] == 'F') {
                numeroDeMulheres++;
                somaDasAlturasDasMulhers += altura[i];
            }
        }

        mediaAlturaDasMulhers = somaDasAlturasDasMulhers / numeroDeMulheres;

        System.out.println("Menor Altura: " + menorAltura);
        System.out.println("Maior Altura: " + maiorAltura);
        System.out.println("Media das alturas das mulheres " + String.format("%.2f" ,mediaAlturaDasMulhers));
        System.out.println("Número de Homens: " + numeroDeHomens);
        
        input.close();
    }
}
