package orientacao_objetos.exercicios.entities;

public class AccountBank {
    
    private int account;
    private String holder;
    private double balance = 0;
    private static final double TAX = 5.00;

    public AccountBank() {}

    public AccountBank(int account, String holder, double initialDeposit) {
        this.account = account;
        this.holder = holder;
        this.deposit(initialDeposit);
    }

    public AccountBank(int account, String holder) {
        this.account = account;
        this.holder = holder;
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

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void whithDraw(double amount) {
        this.balance -= amount + TAX;
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
