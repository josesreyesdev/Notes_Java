package com00.first.java.poo.bytebank_inheritance.model;

//Cuenta de Ahorro
public class SavingsAccount extends Account{

    public SavingsAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(Double balance) {
        this.balance += balance;
    }

    @Override
    public String toString() {
        return "Savings Account (Cuenta de Ahorro), " + super.toString();
    }
}
