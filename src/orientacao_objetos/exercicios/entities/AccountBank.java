package orientacao_objetos.exercicios.entities;

public class AccountBank {
    
    private int account;
    private String holder;
    private double initialDepositValue;
    private double balance = 0;
    private static final double TAX = 5.00;

    public AccountBank() {}

    public AccountBank(int account, String holder, double initialDepositValue) {
        this.account = account;
        this.holder = holder;
        this.initialDepositValue = initialDepositValue;
    }

    public AccountBank(int account, String holder) {
        this.account = account;
        this.holder = holder;
        this.initialDepositValue = 0;
    }

    public int getAccount() {
        return this.account;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getInitialDepositValue() {
        return this.initialDepositValue;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double depositValue) {
        this.balance += depositValue + getInitialDepositValue();
    }

    public void whithDraw(double value) {
        this.balance = this.balance - value + TAX;
    }

    @Override
    public String toString() {
        return "Account: "
            + this.account
            + " Holder: "
            + this.holder
            + " Balance: $"
            + String.format("%.2f%n", this.getBalance()); 
    }
}
