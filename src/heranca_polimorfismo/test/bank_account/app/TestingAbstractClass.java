package heranca_polimorfismo.test.bank_account.app;

import java.util.ArrayList;
import java.util.List;

import heranca_polimorfismo.test.bank_account.entities.Account;
import heranca_polimorfismo.test.bank_account.entities.BusinessAccount;
import heranca_polimorfismo.test.bank_account.entities.SavingsAccount;

public class TestingAbstractClass {

    public static void main(String[] args) {
        
        // Lista de contas
        List<Account> accounts = new ArrayList<>();

        //Account account = new Account(1001, "Maria", 1000.00);
        accounts.add(new BusinessAccount(1002, "Alex Green", 1500.00, 800.00));
        accounts.add(new SavingsAccount(1003, "Bob Burniquist", 1500.00, 0.01));
        accounts.add(new BusinessAccount(1004, "Sandra San", 1000.00, 600.00));
        accounts.add(new SavingsAccount(1005, "Maria", 1200.00, 0.01));

        for(Account acc : accounts) {
            acc.deposit(50);
            System.out.printf("Name: %s , $ %.2f%n", acc.getHolder(), acc.getBalance() );
        }

        System.out.println();
        for(Account acc : accounts) {
            acc.withdraw(30);
            System.out.printf("Name: %s , $ %.2f%n", acc.getHolder(), acc.getBalance() );
        }
    }
}
