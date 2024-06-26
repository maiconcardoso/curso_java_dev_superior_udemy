package excecao.exercicios.bank_account.model.entities;

import excecao.exercicios.bank_account.model.exceptions.WithdrawLimitException;

public class Account {

    public Integer number;
    public String holder;
    public Double balance;
    public Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > withdrawLimit) {
            throw new WithdrawLimitException("The amount exceeds withdraw limit!");
        }
        if (amount > balance) {
            throw new WithdrawLimitException("Not enough balance!");
        }
        this.balance -= amount;
    }
}
