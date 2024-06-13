package heranca_polimorfismo.test.bank_account.app;

import java.util.Locale;

import heranca_polimorfismo.test.bank_account.entities.Account;
import heranca_polimorfismo.test.bank_account.entities.BusinessAccount;
import heranca_polimorfismo.test.bank_account.entities.SavingsAccount;

public class TestingOverride {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Account account = new Account(1001, "Maria", 1000.0);
        account.withdraw(200.0);
        System.out.println(account.getBalance());

        Account account2 = new SavingsAccount(
            1002, "Alex", 1000.0, 0.01
        );
        account2.withdraw(200);
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        account3.withdraw(200.0);
        System.out.println(account3.getBalance());
    }
}
