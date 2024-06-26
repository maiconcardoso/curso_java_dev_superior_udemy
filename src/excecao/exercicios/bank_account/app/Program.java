package excecao.exercicios.bank_account.app;

import java.util.Locale;
import java.util.Scanner;

import excecao.exercicios.bank_account.model.entities.Account;
import excecao.exercicios.bank_account.model.exceptions.WithdrawLimitException;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the account data: ");
        System.out.print("Number: ");
        int number = input.nextInt();
        System.out.print("Holder: ");
        input.nextLine();
        String holder = input.nextLine();
        System.out.print("Initial balance: ");
        double balance = input.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = input.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        try {
            System.out.print("Enter amount for withdraw: ");
            double amount = input.nextDouble();
            account.withdraw(amount);

            System.out.print("New balance: " + String.format("%.2f%n", account.getBalance()));

        } catch(WithdrawLimitException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        input.close();
    }
}
