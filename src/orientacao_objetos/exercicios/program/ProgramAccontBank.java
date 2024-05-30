package orientacao_objetos.exercicios.program;

import java.util.Locale;
import java.util.Scanner;

import orientacao_objetos.exercicios.entities.AccountBank;

public class ProgramAccontBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double value;

        System.out.print("Enter account number: ");
        int account = input.nextInt();
        System.out.print("Enter account holder: ");
        String holder = input.nextLine();
        holder = input.nextLine();
        
        double initialDepositValue;
        System.out.print("Is there an initial deposit? (y/n): ");
        String option = input.next();
        if (option.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            initialDepositValue = input.nextDouble();
        } else {
            initialDepositValue = 0.0;
        }
        AccountBank accountBank = new AccountBank(account, holder);
        accountBank.deposit(initialDepositValue);
        System.out.println(accountBank);

        System.out.print("Enter a deposit value: ");
        value = input.nextDouble();
        accountBank.deposit(value);
        System.out.println(accountBank);

        System.out.print("Enter a withdraw value: ");
        value = input.nextDouble();
        accountBank.whithDraw(value);
        System.out.println(accountBank);


        input.close();
    }
}
