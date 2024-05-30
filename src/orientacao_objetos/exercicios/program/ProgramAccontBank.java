package orientacao_objetos.exercicios.program;

import java.util.Locale;
import java.util.Scanner;

import orientacao_objetos.exercicios.entities.AccountBank;

public class ProgramAccontBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        AccountBank accountBank;

        System.out.print("Enter account number: ");
        int account = input.nextInt();
        System.out.print("Enter account holder: ");
        input.nextLine();
        String holder = input.nextLine();
        
        double initialDepositValue;
        System.out.print("Is there an initial deposit? (y/n): ");
        char option = input.next().charAt(0);
        if (option == 'y') {
            System.out.print("Enter initial deposit value: ");
            initialDepositValue = input.nextDouble();
            accountBank = new AccountBank(account, holder, initialDepositValue);
        } else {
            initialDepositValue = 0.0;
            accountBank = new AccountBank(account, holder);
        }
        accountBank.deposit(initialDepositValue);
        System.out.println(accountBank);

        System.out.print("Enter a deposit value: ");
        double depositValue = input.nextDouble();
        accountBank.deposit(depositValue);
        System.out.println(accountBank);

        System.out.print("Enter a withdraw value: ");
        double withDrawValue = input.nextDouble();
        accountBank.whithDraw(withDrawValue);
        System.out.println(accountBank);


        input.close();
    }
}
