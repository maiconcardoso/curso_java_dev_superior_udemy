package arrays.exercicios;

import java.util.Locale;
import java.util.Scanner;

import arrays.entities.Rent;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("How many rooms will be rentend? ");
        int quantity = input.nextInt();

        Rent[] rents = new Rent[10];

        for (int i=1; i<=quantity; i++) {
            System.out.println();
            System.out.println("Rent #" + i);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.next();
            System.out.print("Room: ");
            int room = input.nextInt();

            rents[room] = new Rent(name, email);
        }
        System.out.println();
        for (int i=0; i<rents.length; i++) {
            if (rents[i] != null) {
                System.out.println(i + ": " + rents[i]);
            }
        }

        input.close();
    }
}
