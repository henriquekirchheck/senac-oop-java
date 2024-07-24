package br.dev.henriquekh.senacCourse;

import java.util.UUID;

public class BankAccount {
    private UUID id;
    private double balance;

    public BankAccount(double balance) {
        this.id = UUID.randomUUID();
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public UUID getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
