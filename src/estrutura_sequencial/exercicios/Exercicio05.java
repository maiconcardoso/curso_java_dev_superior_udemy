package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int codigoPrimeiraPeca, codigoSegundaPeca;
        int qtdPrimeiraPeca, qtdSegundaPeca;
        double valorPrimeiraPeca, valorSegundaPeca;
        double  totalApagar;

        System.out.println("Informe o código da primeira peça, quantidade e valor: ");
        codigoPrimeiraPeca = input.nextInt();
        qtdPrimeiraPeca = input.nextInt();
        valorPrimeiraPeca = input.nextDouble();
        System.out.println("Informe o código da segunda peça, quantidade e valor: ");
        codigoSegundaPeca = input.nextInt();
        qtdSegundaPeca = input.nextInt();
        valorSegundaPeca = input.nextDouble();

        totalApagar = (qtdPrimeiraPeca * valorPrimeiraPeca) + (qtdSegundaPeca * valorSegundaPeca);

        System.out.printf("O valor a ser pago: %.2f%n",  totalApagar);

        input.close();
    }
}
