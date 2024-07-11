package generics.test.introducao.app;

import java.util.Scanner;

import generics.test.introducao.service.PrintService;

public class Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("How many Values? ");
        int n = input.nextInt();

        PrintService<Integer> printService = new PrintService<>();

        for (int i=0; i<n; i++) {
            int numero = input.nextInt();
            printService.addValue(numero);
        }

        printService.print();
        System.out.println("First: " + printService.first());


        input.close();
    }
}
