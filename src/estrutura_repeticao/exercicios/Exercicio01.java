package estrutura_repeticao.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password = 0;
        while(password != 2002) {
            System.out.print("Digite a senha: ");
            password = input.nextInt();
            if (password == 2002) {
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Senha incorreta.");
            }
        }

        input.close();
    }
}
