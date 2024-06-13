package heranca_polimorfismo.test.bank_account.app;

import heranca_polimorfismo.test.bank_account.entities.Account;
import heranca_polimorfismo.test.bank_account.entities.BusinessAccount;
import heranca_polimorfismo.test.bank_account.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        
        Account account = new Account(1001, "José", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 1000.0);

        // UPCASTING

        Account account2 = businessAccount;
        Account account3 = new BusinessAccount(1003, "Bob", 100.0, 500.0);
        Account account4 = new SavingsAccount(1004, "André", 200.0, 0.01);

        // DOWNCASTING

        BusinessAccount account5 = (BusinessAccount) account3;
        //BusinessAccount account6 = (BusinessAccount) account4;

        if (account4 instanceof BusinessAccount) {
            BusinessAccount account6 = (BusinessAccount) account4;
            account6.loan(100.0);
            System.out.println("Loan!");
        }

        if (account4 instanceof SavingsAccount) {
            SavingsAccount account6 = (SavingsAccount) account4;
            account6.updateBalance();
            System.out.println("Update!");
        }
    }
}   
