package excecao.test;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] vect = input.nextLine().split(" ");
        int position = input.nextInt();

        System.out.println(vect[position]);

        input.close();
    }
}
