package com00.first.java.poo.bytebank_inheritance.model;

import poo.bytebank_inheritance.exception.InsufficientBalanceException;
import poo.bytebank_inheritance.inheritance_multiple.account.Tributation;

//Cuenta corriente
public class CheckingAccount extends Account implements Tributation {

    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(Double balance) {
        this.balance += balance;
    }

    //Sobre-escritura
    @Override
    public void withdrawAccountBalance(Double balance) throws InsufficientBalanceException {
        double commission = balance + 0.2;
        super.withdrawAccountBalance(commission);
    }

    @Override
    public double getTaxValue() {
        return super.balance * 0.01;
    }

    @Override
    public String toString() {
        return "Checking Account (Cuenta corriente), " + super.toString();
    }
}
